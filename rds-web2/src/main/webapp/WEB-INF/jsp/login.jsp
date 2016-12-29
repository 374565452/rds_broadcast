<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>

<% 
String path = request.getContextPath(); 
// 获得本项目的地址(例如: http://localhost:8080/MyApp/)赋值给basePath变量 
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path; 

%> 	

<html ng-app="app" ng-controller="preLoginCtrl">
<head>
<meta charset="utf-8" />
<title></title>
<link rel="stylesheet" href="<%=basePath%>/css/bootstrap.min.css" />
<link rel="stylesheet" href="<%=basePath%>/css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="<%=basePath%>/css/base.css"></link>
<link rel="stylesheet" href="<%=basePath%>/css/rds.css" />
<style>
@media ( min-width : 1210px;) {.container {width: 1100px !important;}}
.bt-5 {border-top: 5px solid #407aaa;}
.look-up-content {
	border-top: 3px solid #407aaa;
}

.sk-wave .sk-rect {
	background-color: #407aaa;
}
</style>
</head>
<body class="BGF5">
	<button type="button" class="ndis" id="refresh" ng-click="getData();"></button>
	<div class="container">
		<div class="row p0 m0 mt100  r5">
			<div class="visible-lg-block col-lg-4"></div>
			<div class="col-sm-12 col-lg-4 p50 shadow panel panel-default r5 bt-5">
					<div id="warnMessage" class="text-error mb15 mt10"></div>
					<blockquote>
  						<a href="/" class="pl10 C999">RDS播控管理系统</a>
					</blockquote>
					<input type="hidden" value="[ERROR][LOGINPAGE]"/>
					<form class="form-horizontal p15 mt10" ng-submit="submitForm('/login/doLogin','','FLOAT')">
						<div class="input-wrapper">
							    <input type="text" class="" id="userName"  ng-model="model.userName" placeholder="用户名"  autocomplete="off" required>
						</div>
						<div class="input-wrapper">
								<input type="password"  id="userPassword" ng-model="model.password" placeholder="密码"  autocomplete="off" required>
						</div>
						<div class="input-wrapper" >
								<input type="text" class="" id="verificationCode"  ng-model="model.verificationCode"  autocomplete="off"  placeholder="图形验证码" required>
								
								<div class="imgCode" title="看不清楚？换一张" alt="看不清楚？换一张" data-toggle="tooltip">
									<img id="imgCode" width="80" height="30" onclick="changeimg('imgCode','verificationCode')"
  									 src="/login/getImgCode?p=1">
								</div>
						</div>
						<div class="form-group mt30">
							<button type="submit" class="btn btn-block btn-success">登入<i class="glyphicon glyphicon-log-in"></i></button>
						</div>
						 <!--  
						<div class="form-group mb0 f12 C555 tr" id="remberPwd">
							<div class="btn-group fr" data-toggle="buttons"">
  								<label ng-class="{true: 'active btn btn-default btn-xs active', false: 'btn btn-default btn-xs'}[model.remberPwd != 'NO']" ng-click="changeRadio('YES')">
   			 						<input type="radio" name="remberPwd" ng-model="model.remberPwd" value="YES"> YES
  								</label>
  								<label ng-class="{true: 'active btn btn-default btn-xs active', false: 'btn btn-default btn-xs'}[model.remberPwd == 'NO']" ng-click="changeRadio('NO')">
    								<input type="radio" name="remberPwd" ng-model="model.remberPwd" value="NO"> NO
  								</label>
							</div>
							<div class="fr lab">记住密码?</div>
							<!--  <div class="fl lab"><a href="web.do">首页 →</a></div>
						</div>
						 -->
					</form>
				</div>
				<div class="visible-lg-block col-lg-4"></div>
			</div>
		</div>
	<script type="text/javascript" src="<%=basePath%>/js/jquery-1.12.3.min.js"></script>

	<script type="text/javascript" src="<%=basePath%>/js/angular.min-1.5.5.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/angular-animate.min-1.5.5.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/angular-ui-router-0.2.18.js"></script>
	<script type="text/javascript" src="js/angular-messages.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/app.js?v=200"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/services.js?v=200"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/route.js?v=200"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/controller.js?v=200"></script>


	<script type="text/javascript" src="<%=basePath%>/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/carousel.js"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/core.js?v=200"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/global.js?v=200"></script>
	<script type="text/javascript" src="<%=basePath%>/js/rds/rds.js?v=200"></script>
	<script type="text/javascript">
		
	</script>
	<!-- 异步加载数据 -->
	<div id="lookUp" class="look-up shadow">
		<div id="lookUpContent" class="look-up-content f12 tc">加载中....</div>
		<i class="iconfont i-close" onclick="iClose('lookUp')"></i>
	</div>

	<div id="float" class="folat">
		<div class="sk-wave">
			<div class="sk-rect sk-rect1"></div>
			<div class="sk-rect sk-rect2"></div>
			<div class="sk-rect sk-rect3"></div>
			<div class="sk-rect sk-rect4"></div>
			<div class="sk-rect sk-rect5"></div>
		</div>
	</div>

</body>

</html>