<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div class="r0 p10 pt0 col-xs-12" ng-controller="detailCtrl">
	<div class="col-xs-12 p0 mt10 C000">
		<form ng-submit="submitForm('/rds/device/detail/update');" name="deviceForm" novalidate="novalidate">
			<table class="table table-bordered table-hover">
				<tr>
					<td class="tc w100" colspan="1">设备编号</td>
					<td class="tc" colspan="3" ng-class="{ 'has-error' : deviceForm.deviceNo.$invalid }"><input id="deviceno"
						name="deviceNo" class="form-control" type="text"
						ng-model="model.deviceno" ng-minlength=26 ng-maxlength=26 required />
					</td>
					<!--  
					<td class="tc"  colspan="1">
						<span  ng-messages="deviceForm.deviceNo.$error">
							<span style="color:red;" ng-message="required">设备编号不能为空</span>
							<span style="color:red;" ng-message="minlength">设备编号不符合要求，必须是16位有效字符</span>
							<span style="color:red;" ng-message="maxlength">设备编号不符合要求，必须是16位有效字符</span>
						</span>
					</td>
					-->
				</tr>
				<tr>
					<td class="tc">设备类型</td>
					<td class="tc" colspan="3" ng-class="{ 'has-error' : deviceForm.deviceTypeuid.$invalid}">
						<div class="form-group">
							<select class="form-control" name="deviceTypeuid"
								ng-model="model.devicetypeuid" required>
								<option value="">默认选择</option>
								<option ng-if="types != null" ng-repeat="item in types"
									value="{{item.uid}}" >{{item.devicetypename}}</option>
							</select>
						</div>
					</td>
				</tr>
				<tr>
					<td class="tc">经度</td>
					<td class="tc"><input id="longitude" name="deviceLognitude"
						class="form-control" type="text" ng-model="model.longitude" /></td>
					<td class="tc">纬度</td>
					<td class="tc"><input id="latitude" name="deviceLatitude"
						class="form-control" type="text" ng-model="model.latitude" /></td>
				</tr>
				<tr>
					<td class="tc">输出频率</td>
					<td class="tc"><input id="devicefmout" class="form-control"
						type="text" ng-model="model.devicefmout" /></td>
					<td class="tc">输入频率</td>
					<td class="tc"><input id="devicefmrecv" class="form-control"
						type="text" ng-model="model.devicefmrecv" /></td>
				</tr>

				<tr>
					<td class="tc">默认音量</td>
					<td class="tc" colspan="3"><input id="devicevol"
						class="form-control" type="text" ng-model="model.devicevol" /></td>
				</tr>

			</table>
			<!-- ng-disabled="deviceForm.$invalid" -->
			<button ng-if="type=='update'" type="submit" ng-disabled="deviceForm.$invalid"
				class="btn btn-success fr">修改</button>
			<button ng-if="type=='add'" type="submit" ng-disabled="deviceForm.$invalid" class="btn btn-success fr">添加</button>
			<input class="form-control" type="hidden" ng-model="model.uid" />
		</form>
		<!--  
		<div ng-show="deviceForm.deviceNo.$error.required " class="help-block">设备编号不能为空</div>
		<div ng-show="deviceForm.deviceNo.$error.minlength " class="help-block">设备编号不符合要求，必须是16位有效字符</div>
		<div ng-show="deviceForm.deviceNo.$error.maxlength " class="help-block">设备编号不符合要求，必须是16位有效字符</div>
		-->
		
		<div  ng-messages="deviceForm.deviceNo.$error">
			<div class="help-block" style="color:red;" ng-message="required">设备编号不能为空</div>
			<div class="help-block" style="color:red;" ng-message="minlength">设备编号不符合要求，必须是26位有效字符</div>
			<div class="help-block" style="color:red;" ng-message="maxlength">设备编号不符合要求，必须是26位有效字符</div>
		</div>
		<div  ng-messages="deviceForm.deviceTypeuid.$error">
			<div class="help-block" style="color:red;" ng-message="required">设备类型不能为空</div>
		</div>
		
	</div>
</div>
<div class="cb"></div>