/**
 * 
 */
var deviceTimer;
var mainModule = angular.module("mainModule", []);
// 以html形式输出
mainModule.filter("trustHtml", function($sce) {
	return function(input) {
		return $sce.trustAsHtml(input);
	};
});
mainModule.filter("removeLast", function() {
	return function(value) {
		if (!value)
			return "";
		else {
			return value.substring(0, value.length - 1);
		}
	}
});
/*******************************************************************************
 * 设置一个空的Controller，该Controller下的数据直接调用app.js中$rootScope 中的方法 初始化不需要加载数据
 */
mainModule.controller('detailCtrl', function($scope, $http, $state,
		$stateParams, $http, httpService) {

});
/** *****************登陆处理************************************************* */
mainModule.controller('preLoginCtrl', function($rootScope, $scope, $http,
		$state, $stateParams, $http, httpService) {

	$scope.getData = function(page, setPwd) {
		if ($rootScope.model && $rootScope.model.sessionAdminName) {
			window.location.href = "/";
		} else if ($rootScope.model && $rootScope.model.tipMessage) {
			showMessage('warnMessage', $rootScope.model.tipMessage, true, 3);
			// setTimeout(function(){
			// window.location.href="/";
			// },3500);
		} else {
			var params = "iUrl=/login/preLogin|iLoading=FLOAT|iNeed=TRUE";
			httpService.callHttpMethod($http, params).success(function(result) {
				var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
				if (isSuccess.indexOf('LOGIN') >= 0) {
					window.location.href = "/";
				}
				if (!isJson(result) || isSuccess.indexOf('[ERROR]') >= 0) {
					alert("获取菜单出现异常：" + isSuccess.replace('[ERROR]', ''));
				}
				$rootScope.model = result.data.model;

			});
		}
	};

	$scope.changeRadio = function(value) {
		$rootScope.model.remberPwd = value;
	}

	$scope.getData();
});
/** *****************rdsindex--首页信息contorller，加载左边菜单************************************************* */
mainModule.controller('rdsIndex', function($rootScope, $scope, $http, $state,
		$stateParams, $http, httpService) {
	$scope.name = '李四';
	$scope.getData = function(page, setPwd) {
		var params = "iUrl=/rds/menu/list|iLoading=FLOAT|iNeed=FALSE";
		httpService.callHttpMethod($http, params).success(function(result) {
			var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
			if (isSuccess.indexOf('LOGIN') >= 0) {
				window.location.href = "/";
			}
			if (!isJson(result) || isSuccess.indexOf('[ERROR]') >= 0) {
				alert("获取菜单出现异常：" + isSuccess.replace('[ERROR]', ''));
			}
			$rootScope.frontMenu = result.data.menuList;
			$rootScope.sessionAdminName = result.data.sessionAdminName
		});
	};
	$scope.getData();
	// 定时检测授权问题
	// 在做登陆权限时，点击媒体管理后会将登陆界面显示在主菜单的右边。其主要原因在于在访问请求界面进进入权限验证拦截器中
	// 在拦截器中直接返回的时login.jsp界面，所以就将此界面显示在右边
	// 加此定时器作ajax请求的目的是自动的跳转到登陆界面
	setInterval(function() {
		// $scope.getData();
		var params = "iUrl=/rds/menu/auth|iLoading=FLOAT|iNeed=FALSE";
		httpService.callHttpMethod($http, params).success(function(result) {
			var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
			if (isSuccess.indexOf('LOGIN') >= 0) {
				window.location.href = "/";
			}
		});
	}, 5000);

});
/** *****************设备管理界面相关处理************************************************* */
mainModule.controller('deviceController', function($rootScope, $scope, $http,
		$state, $stateParams, $http, httpService) {
	
	/** **************************获取设备列表数据******************************************** */
	$scope.getData = function(page, setPwd) {
		// alert("aaaaaaaaaaaaaaaaa");
		var params = "";
		if (page) {
			params = "iUrl=/rds/device/list/data?page=" + page
					+ "|iLoading=FLOAT|iNeed=FALSE"; // 表示查询所有
		} else {
			params = "iUrl=/rds/device/list/data|iLoading=FLOAT|iNeed=FALSE";
		}

		httpService.callHttpMethod($http, params).success(function(result) {
			// alert(result);
			var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
			if (isSuccess.indexOf('LOGIN') >= 0) {
				window.location.href = "/";
			}
			if (!isJson(result) || isSuccess.indexOf('[ERROR]') >= 0) {
				// alert("系统初始化异常："+isSuccess.replace('[ERROR]', ''));
				b_alert("错误", "" + isSuccess.replace('[ERROR]', ''));
			} else {
				$scope.devices = result.data.devices;
				
				$rootScope.page = result.data.page;
				//撤销被选中事件
				//$scope.isSelectedAll();
			}
		});
	};
	$scope.getData(1);
	deviceTimer=setInterval(function(){
		$scope.getData();
	 },2000);
	
	// alert("deviceController");
	/** **************************批量删除处理******************************************** */
	$scope.deletaAll = function() {
		if (!$scope.devices) {
			b_alert("错误", "没有数据，无法执行删除操作");
			return;
		}
		if ($scope.devices.length != $scope.selected.length) {
			b_alert("错误", "没有全部选中数据");
			return;
		}
		//var b=b_confirm("信息", "您是否确定要删除所有选中的数据？");
		//alert(b);
		
		Modal.confirm({
			msg :"您是否确定要删除所有选中的数据？",
			title:"信息"
		}).on(function(e) {
			if(e==true){
				var params = "iUrl=/rds/device/detail/multdelete?uids=";
				// iUrl=/rds/device/list/data|iLoading=FLOAT|iNeed=FALSE
				for (var i = 0; i < $scope.selected.length; i++) {
					// alert($scope.selected[i]);
					if (i == ($scope.selected.length - 1)) {
						params += $scope.selected[i];
					} else {
						params += $scope.selected[i] + ",";
					}

				}
				params += "|iLoading=FLOAT|iNeed=FALSE";
				//alert(params);
				httpService.callHttpMethod($http, params).success(function(result) {
					// alert(result);
					var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
					if (isSuccess.indexOf('LOGIN') >= 0) {
						window.location.href = "/";
					}
					if (!isJson(result) || isSuccess.indexOf('[ERROR]') >= 0) {
						// alert("系统初始化异常："+isSuccess.replace('[ERROR]', ''));
						b_alert("错误", "" + isSuccess.replace('[ERROR]', ''));
					} else {
						
						Modal.alert({
							msg : "删除成功",
							title : "信息",
							btnok : '确定',
							btncl : '取消'
						}).on(function(e){
							$scope.getData(1);
							$scope.isSelectedAll();
							//window.location.href = "/";
						});
						
						//b_alert(, );
						//$scope.getData(1);
						
						// $scope.devices = result.data.devices;
						// $rootScope.page = result.data.page;
					}
				});
			}

		});			
		
	}
	/** **************************批量删除处理******************************************** */
	
	/*****************************删除单个设备处理************************************************/
	
	$scope.deleteSingle=function(uid){
		if(uid){
			//alert(uid);
			Modal.confirm({
				msg :"您是否确定要删除此数据？",
				title:"信息"
			}).on(function(e){
				if(e==true){
					var params = "iUrl=/rds/device/detail/sigledelete?uid="
						    +uid+"|iLoading=FLOAT|iNeed=FALSE";
					
					httpService.callHttpMethod($http, params).success(function(result) {
						// alert(result);
						var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
						if (isSuccess.indexOf('LOGIN') >= 0) {
							window.location.href = "/";
						}
						if (!isJson(result) || isSuccess.indexOf('[ERROR]') >= 0) {
							// alert("系统初始化异常："+isSuccess.replace('[ERROR]', ''));
							b_alert("错误", "" + isSuccess.replace('[ERROR]', ''));
						} else {
							
							Modal.alert({
								msg : "删除成功",
								title : "信息",
								btnok : '确定',
								btncl : '取消'
							}).on(function(e){
								$scope.getData(1);
								$scope.isSelectedAll();
								//window.location.href = "/";
							});
							
							//b_alert(, );
							//$scope.getData(1);
							
							// $scope.devices = result.data.devices;
							// $rootScope.page = result.data.page;
						}
					});
					
				}
			});
		}else{
			b_alert("错误","没有需要删除的数据");
		}
	}
	
	/*****************************删除单个设备处理************************************************/
	/** ***************************全选处理************************************* */
	$scope.selected = [];
	var updateSelected = function(action, id) {
		if (action == 'add' & $scope.selected.indexOf(id) == -1) {
			$scope.selected.push(id);
		}
		if (action == 'remove' && $scope.selected.indexOf(id) != -1) {
			$scope.selected.splice($scope.selected.indexOf(id), 1);
		}
	}
	$scope.updateSelection = function($event, id) {
		var checkbox = $event.target;
		var action = (checkbox.checked ? 'add' : 'remove');
		updateSelected(action, id);
	};

	$scope.getSelectedClass = function(entity) {
		return $scope.isSelected(entity.uid) ? 'selected' : '';
	};

	$scope.isSelected = function(id) {
		return $scope.selected.indexOf(id) >= 0;
	};

	// something extra I couldn't resist adding :)
	$scope.isSelectedAll = function() {
		if ($scope.devices) {
			return $scope.selected.length === $scope.devices.length;
		}
		return false;
	};

	$scope.selectAll = function($event) {
		var checkbox = $event.target;
		var action = (checkbox.checked ? 'add' : 'remove');
		// alert(action);
		for (var i = 0; i < $scope.devices.length; i++) {
			var entity = $scope.devices[i];
			updateSelected(action, entity.uid);
		}
	}
	/** ***************************全选处理************************************* */
	
});

mainModule.controller('mediaController', function($rootScope, $scope, $http,
		$state, $stateParams, $http, httpService) {
	// alert("mediaController");
	 clearInterval(deviceTimer);
	$scope.getData = function(page, setPwd) {
		var params = "iUrl=/rds/media/list/data|iLoading=FLOAT|iNeed=TRUE"; // 表示查询所有
		httpService.callHttpMethod($http, params).success(function(result) {
			// alert(result);
			var isSuccess = httpSuccess(result, 'iLoading=FLOAT');
			if (isSuccess.indexOf('LOGIN') >= 0) {
				window.location.href = "/";
			}
			if (!isJson(result) || isSuccess.indexOf('[ERROR]') >= 0) {
				//alert("系统初始化异常：" + isSuccess.replace('[ERROR]', ''));
				// b_alert("错误","获取设备列表出现错误："+isSuccess.replace('[ERROR]', ''));
				b_alert("错误", "" + isSuccess.replace('[ERROR]', ''));
			}else{
				$scope.audioResources = result.data.audioResources;
				$rootScope.page = result.data.page;
			}

		});
	};
	$scope.getData();
});
