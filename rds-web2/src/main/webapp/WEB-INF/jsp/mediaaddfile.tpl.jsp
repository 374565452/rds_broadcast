<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<div class="r0 p10 pt0 col-xs-12" ng-controller="detailCtrl">
	<div class="col-xs-12 p0 mt10 C000">
		<form ng-submit="submitForm('/rds/media/detail/adddir');" name="mediaForm" novalidate="novalidate">
			<table class="table table-bordered table-hover">
				<tr>
					<td class="tc w100" colspan="1">选择资源：</td>
					<td class="tc" colspan="3" "><input id="deviceno" name="mediaName" class="form-control" type="text"/>
					</td>
				</tr>
			</table>
			<!-- ng-disabled="deviceForm.$invalid" -->
			<button ng-if="type=='update'" type="submit" class="btn btn-success fr">修改</button>
			<button ng-if="type=='add'" type="submit"  class="btn btn-success fr">添加</button>
			<button ng-if="type=='upload'" type="submit"  class="btn btn-success fr">上传</button>
		</form>
	</div>
</div>
<div class="cb"></div>