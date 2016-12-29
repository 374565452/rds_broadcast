<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html ng-app="app" ng-controller="rdsIndex">
<head>
<meta charset="utf-8" />
<title>{{name}}</title>
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-theme.min.css" />
<link rel="stylesheet" href="css/base.css"></link>
<link rel="stylesheet" href="css/rds.css" />
<style>
.look-up-content {
	border-top: 3px solid #407aaa;
}

.sk-wave .sk-rect {
	background-color: #407aaa;
}

html {
	-ms-text-size-adjust: 100%;
	-webkit-text-size-adjust: 100%;
}

body {
	font-family: 'Microsoft Yahei', '微软雅黑', '宋体', \5b8b\4f53, Tahoma, Arial,
		Helvetica, STHeiti;
	margin: 0;
}

.main-nav {
	margin-left: 1px;
	margin-top: 8px;
}

.main-nav.nav-tabs.nav-stacked>li {
	
}
.main-nav.nav-tabs.nav-stacked>li>a {
	padding: 10px 8px;
	font-size: 12px;
	font-weight: 600;
	color: #1E90FF;
	background: #E9E9E9;
	/*background: -moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #FAFAFA), color-stop(100%, #E9E9E9));
				background: -webkit-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: -o-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: -ms-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				filter: progid: DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9');
				-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9')";*/
	border: 1px solid #D5D5D5;
	border-radius: 1px;
}


.main-nav.nav-tabs.nav-stacked>li>div {
	padding: 10px 8px;
	font-size: 12px;
	font-weight: 600;
	color: #1E90FF;
	background: #E9E9E9;
	/*background: -moz-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #FAFAFA), color-stop(100%, #E9E9E9));
				background: -webkit-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: -o-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: -ms-linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				background: linear-gradient(top, #FAFAFA 0%, #E9E9E9 100%);
				filter: progid: DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9');
				-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#FAFAFA', endColorstr='#E9E9E9')";*/
	border: 1px solid #D5D5D5;
	border-radius: 1px;
}

.main-nav.nav-tabs.nav-stacked>li>a>span {
	color: #4A515B;
}


.main-nav.nav-tabs.nav-stacked>li>div>span {
	color: #4A515B;
}

.main-nav.nav-tabs.nav-stacked>li.active>a, #main-nav.nav-tabs.nav-stacked>li>a:hover
	{
	color: #FFF;
	background: #3C4049;
	/*background: -moz-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #4A515B), color-stop(100%, #3C4049));
				background: -webkit-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: -o-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: -ms-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: linear-gradient(top, #4A515B 0%, #3C4049 100%);
				filter: progid: DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049');
				-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049')";*/
	border-color: #2B2E33;
}

.main-nav.nav-tabs.nav-stacked>li.active>div, #main-nav.nav-tabs.nav-stacked>li>div:hover
	{
	color: #FFF;
	background: #3C4049;
	/*background: -moz-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: -webkit-gradient(linear, left top, left bottom, color-stop(0%, #4A515B), color-stop(100%, #3C4049));
				background: -webkit-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: -o-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: -ms-linear-gradient(top, #4A515B 0%, #3C4049 100%);
				background: linear-gradient(top, #4A515B 0%, #3C4049 100%);
				filter: progid: DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049');
				-ms-filter: "progid:DXImageTransform.Microsoft.gradient(startColorstr='#4A515B', endColorstr='#3C4049')";*/
	border-color: #2B2E33;
}
#main-nav.nav-tabs.nav-stacked>li.active>a, #main-nav.nav-tabs.nav-stacked>li>a:hover>span
	{
	color: #FFF;
}
#main-nav.nav-tabs.nav-stacked>li.active>div, #main-nav.nav-tabs.nav-stacked>li>div:hover>span
	{
	color: #FFF;
}

.main-nav.nav-tabs.nav-stacked>li {
	margin-bottom: 4px;
}

.nav-header.collapsed>span.glyphicon-chevron-toggle:before {
	content: "\e114";
}

.nav-header>span.glyphicon-chevron-toggle:before {
	content: "\e113";
}

footer.duomi-page-footer {
	background-color: white;
}

footer.duomi-page-footer .beta-message {
	color: #a4a4a4;
}

footer.duomi-page-footer .beta-message a {
	color: #53a2e4;
}

footer.duomi-page-footer .list-inline a, footer.authenticated-footer .list-inline li
	{
	color: #a4a4a4;
	padding-bottom: 30px;
}

footer.duomi-page-footer {
	background-color: white;
}

footer.duomi-page-footer .beta-message {
	color: #a4a4a4;
}

footer.duomi-page-footer .beta-message a {
	color: #53a2e4;
}

footer.duomi-page-footer .list-inline a, footer.authenticated-footer .list-inline li
	{
	color: #a4a4a4;
	padding-bottom: 30px;
}
/*********************************************自定义部分*********************************************/
.secondmenu a {
	font-size: 12px;
	color: #000;
	text-align: center;
	border-radius: 1px;
	background-color: #DCDCDC;
}

.secondmenu>li {
	padding-bottom: 1px;
}

.secondmenu>li>a {
	background-color: #E0E0E0;
	border-color: #428bca;
	color: #000;
}

.secondmenu>li>a:hover {
	background-color: #6f7782;
	border-color: #428bca;
	color: #fff;
}

.secondmenu li.active {
	background-color: #6f7782;
	border-color: #428bca;
	border-radius: 4px;
}

.secondmenu li.active>a {
	color: #ffffff;
}

.navbar-static-top {
	background-color: #000000;
	margin-bottom: 5px;
}

.navbar-brand {
	background: url('') no-repeat 10px 8px;
	display: inline-block;
	vertical-align: middle;
	padding-left: 50px;
	color: #fff;
}

.navbar-brand:hover {
	color: #fff;
}

.collapse .glyphicon-chevron-toggle, .glyphicon-chevron-toggle:before {
	content: "\e113";
}

.collapsed .glyphicon-chevron-toggle:before {
	content: "\e114";
}

.navbar-nav>li>a {
	color: #407AAA;
}

.col-xs-2 {
	height: 720px;
	background-color: #eee;
}

.m0 {
	margin-top: 0px;
}
</style>
</head>
<body>
	<div class="navbar navbar-duomi navbar-static-top" role="navigation"
		style="margin: 0px;">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#" id="logo">RDS播控平台管理</a>
			</div>

			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<!-- 是否需要下拉菜单（下拉菜单操作）
						<li ng-repeat="item in fontMenus" ng-if="item.menu.type=='TOP'&&item.subMenu.length==0">
							<a ng-href="{{item.menu.menuUrl}}" ng-bind="item.menu.menuName" class="menu-a" onclick="selectButton(this,'menu-a')"></a>
						</li>
						
						<li class="dropdown" ng-repeat="item in fontMenus" ng-if="item.menu.type=='TOP'&&item.subMenu.length>0">
							<a href="javascript:void(0)" class="dropdown-toggle menu-a" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false" onclick="selectButton(this,'menu-a')">
								<span ng-bind="item.menu.menuName"></span> <span class="caret"></span></a>
							<ul class="dropdown-menu">
								<li ng-repeat="subItem in item.subMenu">
									<a ng-href="{{subItem.menuUrl}}" ng-bind="subItem.menuName"></a>
								</li>
							</ul>
						</li>
						-->
					<li ng-if="sessionAdminName==null"><a
						href="/login"><i
							class="glyphicon glyphicon-log-in"></i>&nbsp;登录</a></li>
					<li ng-if="sessionAdminName!=null"><a href="/"
						target="_blank"><i class="glyphicon glyphicon-user">&nbsp;</i><span
							ng-bind="sessionAdminName"></span></a></li>
					<li ng-if="sessionAdminName!=null">
					<!-- 这里退出登陆不需要再做一个loginOut函数，直接访问一个链接
					<a href="javascript:void(0)" ng-click="loginOut()"><i
							class="glyphicon glyphicon-log-out"></i>注销</a></li> -->
					<a href="/login/logout" ><i
							class="glyphicon glyphicon-log-out"></i>注销</a></li>
				</ul>
			</div>

		</div>
	</div>

	<div class="container-fluid">
		<div class="row">
			<!-- ng-include可以支持动态加载jps。访问controller来加载页面 -->
			<div class="col-xs-2" ng-include="'/rds/left'"></div>
			<div class="col-xs-10" ui-view="main"></div>
		</div>
	</div>
	<script type="text/javascript" src="js/jquery-1.12.3.min.js"></script>

	<script type="text/javascript" src="js/angular.min-1.5.5.js"></script>
	<script type="text/javascript" src="js/angular-animate.min-1.5.5.js"></script>
	<script type="text/javascript" src="js/angular-ui-router-0.2.18.js"></script>
	<script type="text/javascript" src="js/angular-messages.min.js"></script>
	<script type="text/javascript" src="js/rds/app.js?v=200"></script>
	<script type="text/javascript" src="js/rds/services.js?v=200"></script>
	<script type="text/javascript" src="js/rds/route.js?v=200"></script>
	<script type="text/javascript" src="js/rds/controller.js?v=200"></script>


	<script type="text/javascript" src="js/bootstrap.min.js"></script>
	<script type="text/javascript" src="js/carousel.js"></script>
	<script type="text/javascript" src="js/rds/core.js?v=200"></script>
	<script type="text/javascript" src="js/rds/global.js?v=200"></script>
	<script type="text/javascript" src="js/rds/rds.js?v=200"></script>
	<script type="text/javascript" src="js/rds/bootstrap_dialog.js?v=200"></script>
	<script type="text/javascript">
		
	</script>

	<div id="lookUp" class="look-up shadow">
		<div id="lookUpContent" class="look-up-content f12 tc">加载中....</div>
		<i class="iconfont i-close" onclick="iClose('lookUp')"></i>
	</div>
<div id="fade"></div>
	<!-- 弹出对话框式加载数据 -->
	<div id="myDialog" class="look-up  r2 bottom-radius pt30">
		<div id="myDialog-title" class="CFFF f14" style="margin-top:-27px;line-height:30px;padding-left:20px;height:30px;">
		</div>
		<div id="myDialogContent" class="look-up-content b0 f12 tl p10 BGFFF bottom-radius">
			<button type="button" class="btn btn-danger btn-xs break-word ml10" ng-if="error">
					<span class="glyphicon glyphicon-remove"></span>
					<span ng-bind="error"></span>
			</button>
			<div ui-view="detail"></div>
		</div>
		<i class=" glyphicon glyphicon-remove tc i-close CFFF " onclick="closeMyDialog('myDialog')"></i>
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

	<!-- bootstrap model对话框 -->
	<div id="ycf-alert" class="modal" style="z-index:99999;">
		<div class="modal-dialog modal-sm">
			<div class="modal-content">
				<div class="modal-header " >
					<button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">×</span><span class="sr-only">Close</span></button>
					<h6 class="modal-title"><i class="glyphicon glyphicon-info-sign"></i> [Title]</h6>
				</div>
				<div class="modal-body small">
					<p>[Message]</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary ok" data-dismiss="modal">[BtnOk]</button>
					<button type="button" class="btn btn-default cancel" data-dismiss="modal">[BtnCancel]</button>
				</div>
			</div>
		</div>
	</div>

</body>

</html>