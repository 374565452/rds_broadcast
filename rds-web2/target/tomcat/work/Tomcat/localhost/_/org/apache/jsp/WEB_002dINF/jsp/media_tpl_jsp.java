/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-09-07 09:22:31 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class media_tpl_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<div class=\"container-fluid BGFFF r5\" ng-controller=\"mediaController\">\r\n");
      out.write("\t<div class=\"col-xs-6 f16 fb p0 mb5 mt20\">媒体资源管理&gt;&gt;资源列表</div>\r\n");
      out.write("\t<div class=\"col-xs-18 f14 p0 mb5 mt15 text-right\">\r\n");
      out.write("\t\t<a type=\"button\" class=\"btn btn-primary btn-sm\" id=\"refresh\"\r\n");
      out.write("\t\t\tng-click=\"getData(page.currentPage);\"> \r\n");
      out.write("\t\t<i class=\"glyphicon glyphicon-refresh\">&nbsp;</i>刷新\r\n");
      out.write("\t\t</a> <a type=\"button\" class=\"btn btn-purple btn-sm\"\r\n");
      out.write("\t\t\tonclick=\"history.back(-1);\"> <i\r\n");
      out.write("\t\t\tclass=\"glyphicon glyphicon-step-backward\">&nbsp;</i>后退\r\n");
      out.write("\t\t</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr class=\"divider\"></hr>\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"form-inline text-left\">\r\n");
      out.write("\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t<label class=\"sr-only\" for=\"\">资源名称</label>\r\n");
      out.write("\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t<div class=\"input-group-addon\">资源名称</div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control input-xs dis-in-blo w120\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"资源名称\" id=\"deviceId\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t<!--\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"form-group \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label class=\"sr-only\" for=\"\">设备类型</label>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"input-group-addon\">设备类型</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control input-xs dis-in-blo w120\" placeholder=\"设备类型\" id=\"url\">\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t-->\r\n");
      out.write("\t\t<button type=\"button\" class=\"ml5 mt1 btn btn-success btn-sm \">\r\n");
      out.write("\t\t\t<i class=\"glyphicon glyphicon-search\"></i>&nbsp;查询\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<hr class=\"divider\"></hr>\r\n");
      out.write("\t<div class=\"text-left\">\r\n");
      out.write("\t\t<button type=\"button\" class=\"ml5 mt1 btn btn-success btn-sm \"\r\n");
      out.write("\t\t\tng-href=\"#/media/list/addfile\"\r\n");
      out.write("\t\t\tng-click=\"detail('上传文件',500,'/rds/media/detail/preaddfile','upload')\">\r\n");
      out.write("\t\t\t<i class=\"glyphicon glyphicon-plus\"></i>&nbsp;上传资源\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<button type=\"button\" class=\"ml5 mt1 btn btn-danger btn-sm \">\r\n");
      out.write("\t\t\t<i class=\"glyphicon glyphicon-remove\"></i>&nbsp;批量删除\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t<!--  \r\n");
      out.write("\t\t<button type=\"button\" class=\"ml5 mt1 btn btn-success btn-sm \" \r\n");
      out.write("\t\t\t\tng-href=\"#/media/list/adddir\"\r\n");
      out.write("\t\t\t\tng-click=\"detail('新增目录',500,'/rds/media/detail/preadddir','add')\">\r\n");
      out.write("\t\t\t<i class=\"glyphicon glyphicon-plus\"></i>&nbsp;新建目录\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t-->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div class=\"col-xs-24 p0 mt10\">\r\n");
      out.write("\t\t<table class=\"table table-bordered table-hover\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr class=\"\">\r\n");
      out.write("\t\t\t\t\t<th class=\"tc\"><input type=\"checkbox\"></th>\r\n");
      out.write("\t\t\t\t\t<th class=\"tc\">名称</th>\r\n");
      out.write("\t\t\t\t\t<!-- 一级菜单不显示超链接，二级菜单不显示类型 -->\r\n");
      out.write("\t\t\t\t\t<th class=\"tc\">类型</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"tc\">审核状态</th>\r\n");
      out.write("\t\t\t\t\t<th class=\"tc\">操作</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<tr ng-if=\"audioResources != null\" ng-repeat=\"item in audioResources\">\r\n");
      out.write("\t\t\t\t\t<td class=\"tc\"><input type=\"checkbox\" ng-if=\"item.parentId != 0\"></td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tc\">{{item.name}}</td>\r\n");
      out.write("\t\t\t\t\t<!-- ng-if=\"$stateParams.parentId!='0'\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tng-if=\"$stateParams.parentId=='0'\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t -->\r\n");
      out.write("\t\t\t\t\t<td class=\"tc\">{{item.type}}</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tc\" ng-if=\"item.status==0\">未审核</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tc\" ng-if=\"item.status==1\">审核通过</td>\r\n");
      out.write("\t\t\t\t\t<td class=\"tc\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"f14 text-primary mr10 cursor \" href=\"#\" ng-if=\"item.parentId !=0\"> \r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-edit\"></i>修改</a> \r\n");
      out.write("\t\t\t\t\t\t<a class=\"f14 text-danger mr10  cursor\" href=\"#\" ng-if=\"item.parentId !=0\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-remove\"></i>删除</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"f14 text-primary mr10  cursor\" href=\"#\" ng-if=\"item.parentId !=0 && item.status==0\" ng-click=\"\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"\tglyphicon glyphicon-ok\"></i>通过</a>\r\n");
      out.write("\t\t\t\t\t\t\t<a class=\"f14 text-primary mr10  cursor\" href=\"#\" ng-if=\"item.parentId !=0 item.status==0\">\r\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-remove\"></i>驳回</a>\r\n");
      out.write("\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"text-right p0\" ui-view=\"page\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}