/**
 * 
 */

var app = angular.module("app", ['ui.router','mainModule','ngMessages']);

app.run(function($rootScope, $state, $stateParams, $http, $timeout,httpService){
	
	$rootScope.loadPickByName = function loadPick(params,event,iCallBack,iCallBackParam) { 
		var iwidth = getValue(params,'iwidth');
		var iheight = getValue(params,'iheight');
		var radio = getValue(params,'radio');
		var tag = getValue(params,'tag');
		var code = getValue(params,'code');
		var type = getValue(params,'type');
		var iparams = getValue(params,'params');
		var showType = getValue(params,'showType');
		var def = getValue(params,'def');
		var tagName = getValue(params,'tagName');
		//alert("ababababababababababababababababbabab");
		$rootScope.loadPick(event,iwidth,iheight,radio,tag,code,type,def,iparams,showType,iCallBack,iCallBackParam,tagName);
	}
	$rootScope.loadPick = function loadPick(event,iwidth,iheight,radio,tag,code,type,def,params,showType,iCallBack,iCallBackParam,tagName) { 
		/***********加载选择对话框********************/
		if(!params)
			params='';
		if(!tagName)
			tagName='';
		if(showType!='0'){
			if(!showType||showType=='')
				showType=5;
		}
			
		//事件，宽度，高度，是否为单选，html元素id，查询的code，查询的type，默认值，其他参数，回调函数，回调参数
		callAjaxByName("iUrl=pick.do|isHowMethod=updateDiv|iParams=&type="
				+type+"&radio="+radio+"&code="+code+"&tag="+tag+"&tagName="+tagName+"&def="+def+params,iCallBack,iCallBackParam);
		if(tagName)
			lookUp('lookUp', event, iheight, iwidth ,showType,tagName);
		else
			lookUp('lookUp', event, iheight, iwidth ,showType,tag);
		showMessage('lookUp','false',false,-1);
	}
	
	
	$rootScope.submitForm = function(iurl,callBack,myLoading){
		
		/*if(isValid == undefined || isValid.indexOf('login')<0){
			if( !isValid){
				$rootScope.submitted=true;
				return;
			}
		}*/
		
		if(callBack){
			callBack();
		}
		iLoading = "PROPUPFLOAT";
		if(myLoading){
			iLoading = myLoading;
		}
		/**
		 * $.param是jquery中的一个方法，主要功能是将对象进行序列化操作，转换成参数列表
		 */
		var params = "iUrl="+iurl+"|iLoading="+iLoading+"|iPost=POST|iParams=&"+$.param($rootScope.model);
		httpService.callHttpMethod($http,params).success(function(result) {
			var isSuccess = httpSuccess(result,'iLoading='+iLoading);
			if(isSuccess.indexOf('LOGIN')>=0){
				window.location.href = "/";
			}
			if(!isJson(result)||isSuccess.indexOf('[ERROR]') >= 0){
				 //$rootScope.error = isSuccess.replace('[ERROR]', '');
				b_alert("错误",""+isSuccess.replace('[ERROR]', ''));
			 }else if(result.success==1){
				 $rootScope.error = null;
				 //一直没有调试出来的原因在于，服务端程序是用returnMap来返回数据的。
				 //所以model应该写成result.data.model
				 $rootScope.model = result.data.model;
				 //关闭编辑对话框
				 closeMyDialog('myDialog');
				 $timeout(function() {
					 $("#refresh").click();
                 })
			 }
		});
	};
	
	$rootScope.detail = function(title,iwidth,iurl,type,iParams,callBack) {
		//alert(iurl);
		//打开编辑对话框
		openMyDialog(title,iwidth);
		var params = "iUrl="+iurl+"|iLoading=FLOAT";
		if(iParams)
			params += "|iParams="+iParams;
		httpService.callHttpMethod($http,params).success(function(result) {
			var isSuccess = httpSuccess(result,'iLoading=FLOAT');
			if(isSuccess.indexOf('LOGIN')>=0){
				window.location.href = "/";
			}
			if(!isJson(result)||isSuccess.indexOf('[ERROR]') >= 0){
				 $rootScope.error = isSuccess.replace('[ERROR]', '');
				 $rootScope.model = null;
			 }else{
				 $rootScope.model = result.data.model;
				 if(result.data.types != null){
					 $rootScope.types=result.data.types;
				 }else{
					 $rootScope.types=null;
				 }
				 $rootScope.error = null;
				 if(callBack)
					 callBack();
			 }
			$rootScope.type=type;
		});
	};
	
});

