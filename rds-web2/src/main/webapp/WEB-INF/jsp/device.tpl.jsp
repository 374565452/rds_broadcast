<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div class="container-fluid BGFFF r5" ng-controller="deviceController">
	<div class="col-xs-6 f16 fb p0 mb5 mt20">设备管理&gt;&gt;设备列表</div>
	<div class="col-xs-18 f14 p0 mb5 mt15 text-right">
		<a type="button" class="btn btn-primary btn-sm" id="refresh"
			ng-click="getData(page.currentPage);"> <i
			class="glyphicon glyphicon-refresh">&nbsp;</i>刷新
		</a> <a type="button" class="btn btn-purple btn-sm"
			onclick="history.back(-1);"> <i
			class="glyphicon glyphicon-step-backward">&nbsp;</i>后退
		</a>
	</div>
	<hr class="divider"></hr>

	<div class="form-inline text-left">
		<div class="form-group ">
			<label class="sr-only" for="">设备ID</label>
			<div class="input-group">
				<div class="input-group-addon">设备ID</div>
				<input type="text" class="form-control input-xs dis-in-blo w120"
					placeholder="设备ID" id="deviceId">
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
			ng-href="#/device/list/add"
			ng-click="detail('新增设备',700,'/rds/device/detail/preadd','add')">
			<i class="glyphicon glyphicon-plus"></i>&nbsp;新增设备
		</button>
		<button type="button" class="ml5 mt1 btn btn-danger btn-sm "
			ng-click="deletaAll();">
			<i class="glyphicon glyphicon-remove"></i>&nbsp;批量删除
		</button>
	</div>
	<div class="col-xs-24 p0 mt10">
		<table class="table table-bordered table-hover">
			<thead>
				<tr class="">
					<th class="tc"><input type="checkbox" id="deviceAllCheck"
						ng-click="selectAll($event)" ng-checked="isSelectedAll()"></th>
					<th class="tc">设备ID</th>
					<!-- 一级菜单不显示超链接，二级菜单不显示类型 -->
					<th class="tc">设备类型</th>
					<th class="tc">设备状态</th>
					<td class="tc">音量</td>
					<th class="tc">操作</th>
				</tr>
			</thead>
			<tbody>
				<tr ng-if="devices != null " ng-repeat="item in devices">
					<td class="tc"><input type="checkbox" name="checkItem"
						ng-checked="isSelected(item.uid)"
						ng-click="updateSelection($event, item.uid)"></td>
					<td class="tc"><a class="f14 text-primary mr10 cursor"
						ng-click="detail('修改设备',700,'/rds/device/detail/preupdate?uid='+item.uid,'')"
						href="#" ng-href="#/device/list/update">{{item.deviceNo}}</a></td>
					<!-- ng-if="$stateParams.parentId!='0'"
										ng-if="$stateParams.parentId=='0'"
									 -->
					<td class="tc">{{item.deviceType}}</td>

					<td class="tc" ng-if="item.uStatus=='u_connected'">{{item.deviceStatus}}</td>
					<td class="tc" ng-if="item.uStatus=='connected'"
						style="color: blue;">{{item.deviceStatus}}</td>
					<td class="tc" ng-if="item.uStatus=='u_connected'">{{item.deviceVol}}</td>
					<td class="tc" ng-if="item.uStatus=='connected'"><a href="#"
						ng-click="">{{item.deviceVol}}</a></td>
					<td class="tc"><a class="f14 text-primary mr10 cursor "
						href="#"
						ng-click="detail('修改设备',700,'/rds/device/detail/preupdate?uid='+item.uid,'update')"
						ng-href="#/device/list/update"> <i
							class="glyphicon glyphicon-edit"></i>修改
					</a> <a class="f14 text-danger mr10  cursor" href="#"
						ng-click="deleteSingle(item.uid)"><i
							class="glyphicon glyphicon-remove"></i>删除</a></td>
				</tr>

			</tbody>
		</table>
		<div class="text-right p0" ui-view="page"></div>
	</div>

</div>
