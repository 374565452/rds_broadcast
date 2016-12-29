<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<ul id="main-nav" class="main-nav nav nav-tabs nav-stacked" style="">
	 <li ng-repeat="item in frontMenu"> 
	 	<a ng-if="item.ulId == null" href="{{item.sysMenu.menuurl}}">
	 		<i class="{{item.sysMenu.iconremark}}"></i>{{item.sysMenu.menuname}}
		 </a>
		 <div ng-if="item.ulId != null" href="{{item.sysMenu.menuurl}}" class="nav-header collapsed " data-toggle="collapse">
		 	<i class="{{item.sysMenu.iconremark}}"></i>{{item.sysMenu.menuname}}
		 	<span  class="pull-right glyphicon glyphicon-chevron-toggle"></span>
		 </div>
		 <ul  ng-if="item.ulId != null" id="{{item.ulId}}" class="nav nav-list secondmenu collapse in"  >
		 	<li ng-repeat="item2 in item.subMenu" >
		 		<a  class="menu_a" href="#" ng-href="{{item2.menuurl}}" onclick="selectButton(this,'menu-a')"><i class="{{item2.iconremark}}">{{item2.menuname}}</i></a>
		 	</li>
		 </ul>
	 </li>
	 <!--   <li><a href="#/device/list"><i class="glyphicon glyphicon-th-large"></i>首页</a>
	</li>
	<li><a href="#systemSetting" class="nav-header collapsed "
		data-toggle="collapse"> <i class="glyphicon glyphicon-cog"></i>设备管理
			<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
	</a>
		<ul id="systemSetting" class="nav nav-list secondmenu collapse in">
			<li><a href="#" ng-href="#/device/list"><i
					class="glyphicon glyphicon-th-list"></i>&nbsp;&nbsp;设备列表</a></li>
		</ul></li>
	<li><a href="#configSetting" class="nav-header collapsed"
		data-toggle="collapse"> <i class="glyphicon glyphicon-credit-card"></i>播控管理<span
			class="pull-right glyphicon  glyphicon-chevron-toggle"></span>
	</a>
		<ul id="configSetting" class="nav nav-list secondmenu collapse ">
			<li><a href="#" ng-href="#/media/list"><i
					class="glyphicon glyphicon-globe"></i>&nbsp;媒体资源管理</a></li>
		</ul></li>

	<li><a href="#disSetting" class="nav-header collapsed"
		data-toggle="collapse"> <i class="glyphicon glyphicon-globe"></i>分发配置
			<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
	</a>
		<ul id="disSetting" class="nav nav-list secondmenu collapse">
			<li><a href="#"><i class="glyphicon glyphicon-th-list"></i>&nbsp;分发包配置</a>
			</li>
		</ul></li>

	<li><a href="#dicSetting" class="nav-header collapsed"
		data-toggle="collapse"> <i class="glyphicon glyphicon-bold"></i>字典配置
			<span class="pull-right glyphicon glyphicon-chevron-toggle"></span>
	</a>
		<ul id="dicSetting" class="nav nav-list secondmenu collapse">
			<li><a href="#"><i class="glyphicon glyphicon-text-width"></i>&nbsp;关键字配置</a></li>
		</ul></li>
	<li><a href="#"> <i class="glyphicon glyphicon-fire"></i> 关于系统
	</a></li>-->
</ul>

