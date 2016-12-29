<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div class="container-fluid BGFFF r5" ng-controller="mediaController">
	<div class="col-xs-6 f16 fb p0 mb5 mt20">媒体资源管理&gt;&gt;资源列表</div>
	<div class="col-xs-18 f14 p0 mb5 mt15 text-right">
		<a type="button" class="btn btn-primary btn-sm" id="refresh"
			ng-click="getData(page.currentPage);"> 
		<i class="glyphicon glyphicon-refresh">&nbsp;</i>刷新
		</a> <a type="button" class="btn btn-purple btn-sm"
			onclick="history.back(-1);"> <i
			class="glyphicon glyphicon-step-backward">&nbsp;</i>后退
		</a>
	</div>
	<hr class="divider"></hr>

	<div class="form-inline text-left">
		<div class="form-group ">
			<label class="sr-only" for="">资源名称</label>
			<div class="input-group">
				<div class="input-group-addon">资源名称</div>
				<input type="text" class="form-control input-xs dis-in-blo w120"
					placeholder="资源名称" id="deviceId">
			</div>
		</div>
		&nbsp;&nbsp;
		<!--
							<div class="form-group ">
								<label class="sr-only" for="">设备类型</label>
								<div class="input-group">
									<div class="input-group-addon">设备类型</div>
									<input type="text" class="form-control input-xs dis-in-blo w120" placeholder="设备类型" id="url">
								</div>
							</div>
							-->
		<button type="button" class="ml5 mt1 btn btn-success btn-sm ">
			<i class="glyphicon glyphicon-search"></i>&nbsp;查询
		</button>
	</div>
	<hr class="divider"></hr>
	<div class="text-left">
		<button type="button" class="ml5 mt1 btn btn-success btn-sm "
			ng-href="#/media/list/addfile"
			ng-click="detail('上传文件',500,'/rds/media/detail/preaddfile','upload')">
			<i class="glyphicon glyphicon-plus"></i>&nbsp;上传资源
		</button>
		<button type="button" class="ml5 mt1 btn btn-danger btn-sm ">
			<i class="glyphicon glyphicon-remove"></i>&nbsp;批量删除
		</button>
		<!--  
		<button type="button" class="ml5 mt1 btn btn-success btn-sm " 
				ng-href="#/media/list/adddir"
				ng-click="detail('新增目录',500,'/rds/media/detail/preadddir','add')">
			<i class="glyphicon glyphicon-plus"></i>&nbsp;新建目录
		</button>
		-->
	</div>
	<div class="col-xs-24 p0 mt10">
		<table class="table table-bordered table-hover">
			<thead>
				<tr class="">
					<th class="tc"><input type="checkbox"></th>
					<th class="tc">名称</th>
					<!-- 一级菜单不显示超链接，二级菜单不显示类型 -->
					<th class="tc">类型</th>
					<th class="tc">审核状态</th>
					<th class="tc">操作</th>
				</tr>
			</thead>
			<tbody>
			
				<tr ng-if="audioResources != null" ng-repeat="item in audioResources">
					<td class="tc"><input type="checkbox" ng-if="item.parentId != 0"></td>
					<td class="tc">{{item.name}}</td>
					<!-- ng-if="$stateParams.parentId!='0'"
										ng-if="$stateParams.parentId=='0'"
									 -->
					<td class="tc">{{item.type}}</td>
					<td class="tc" ng-if="item.status==0">未审核</td>
					<td class="tc" ng-if="item.status==1">审核通过</td>
					<td class="tc">
						<a class="f14 text-primary mr10 cursor " href="#" ng-if="item.parentId !=0"> 
							<i class="glyphicon glyphicon-edit"></i>修改</a> 
						<a class="f14 text-danger mr10  cursor" href="#" ng-if="item.parentId !=0">
							<i class="glyphicon glyphicon-remove"></i>删除</a>
						<a class="f14 text-primary mr10  cursor" href="#" ng-if="item.parentId !=0 && item.status==0" ng-click="">
							<i class="	glyphicon glyphicon-ok"></i>通过</a>
							<a class="f14 text-primary mr10  cursor" href="#" ng-if="item.parentId !=0 item.status==0">
							<i class="glyphicon glyphicon-remove"></i>驳回</a>
					</td>
				</tr>

			</tbody>
		</table>
		<div class="text-right p0" ui-view="page">
			
		</div>
	</div>

</div>