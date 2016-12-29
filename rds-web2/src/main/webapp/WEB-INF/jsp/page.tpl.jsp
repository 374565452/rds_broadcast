<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<nav class="p0">
				<ul class="pagination fr mt0 ">
					<li class="cursor"><a ng-click="getData(1)"
						aria-label="Previous"> <span aria-hidden="true">&laquo;</span></a></li>
					<li class="cursor"><a ng-click="getData(page.currentPage-1)"
						ng-if="page.currentPage>1">上一页</a></li>
					<!-- 当前页为第一页则不显示上一页 -->
					<li class="cursor"><a ng-click="getData(page.currentPage-2)"
						ng-if="page.currentPage-2>0">{{page.currentPage*1-2}}</a></li>
					<li class="cursor"><a ng-click="getData(page.currentPage-1)"
						ng-if="page.currentPage-1>0">{{page.currentPage*1-1}}</a></li>
					<li class="active"><a>{{page.currentPage}}</a></li>
					<li class="cursor"><a ng-click="getData(page.currentPage+1)"
						ng-if="page.currentPage<page.totalPage">{{page.currentPage*1+1}}</a></li>
					<li class="cursor"><a ng-click="getData(page.currentPage+2)"
						ng-if="page.currentPage+1<page.totalPage">{{page.currentPage*1+2}}</a></li>
					<li class="cursor"><a ng-click="getData(page.currentPage+1)"
						ng-if="page.currentPage<page.totalPage">下一页</a></li>
					<li class="cursor"><a ng-click="getData(page.totalPage)"
						aria-label="Next"> <span aria-hidden="true">&raquo;</span></a></li>
				</ul>

			</nav>
			<div class="mt10 C999 p0 mr10  fr">共:{{page.totalPage}}页&nbsp;&nbsp;
				{{page.currentPage}}/{{page.totalPage}}&nbsp;&nbsp;</div>
			<input type="hidden" id="PageTotalPage" value="{{page.totalPage}}" />
			<input type="hidden" id="PageAllRow" value="{{page.allRow}}" />
				
					