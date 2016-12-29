<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<div class="r0 p10 pt0 col-xs-12" ng-controller="detailCtrl">
	<div class="col-xs-12 p0 mt10 C000">
		<form ng-submit="submitForm('/rds/media/detail/adddir');" name="mediaForm" novalidate="novalidate">
			<table class="table table-bordered table-hover">
				<tr>
					<td class="tc w100" colspan="1">目录名称：</td>
					<td class="tc" colspan="3" ng-class="{ 'has-error' : deviceForm.deviceNo.$invalid }"><input id="deviceno"
						name="mediaName" class="form-control" type="text"
						ng-model="model.name"  required />
					</td>
				</tr>
			</table>
			<!-- ng-disabled="deviceForm.$invalid" -->
			<button ng-if="type=='update'" type="submit" ng-disabled="mediaForm.$invalid"
				class="btn btn-success fr">修改</button>
			<button ng-if="type=='add'" type="submit" ng-disabled="mediaForm.$invalid" class="btn btn-success fr">添加</button>
		</form>
		<!--  
		<div ng-show="deviceForm.deviceNo.$error.required " class="help-block">设备编号不能为空</div>
		<div ng-show="deviceForm.deviceNo.$error.minlength " class="help-block">设备编号不符合要求，必须是16位有效字符</div>
		<div ng-show="deviceForm.deviceNo.$error.maxlength " class="help-block">设备编号不符合要求，必须是16位有效字符</div>
		-->
		
		<div  ng-messages="mediaForm.mediaName.$error">
			<div class="help-block" style="color:red;" ng-message="required">目录名称不能为空</div>
		</div>
		
	</div>
</div>
<div class="cb"></div>