/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-13 04:00:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/navbar.jsp", Long.valueOf(1560327092234L));
    _jspx_dependants.put("/leftMenu.jsp", Long.valueOf(1560329973060L));
    _jspx_dependants.put("/javascript.jsp", Long.valueOf(1560326991452L));
    _jspx_dependants.put("/link.jsp", Long.valueOf(1560327035792L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.release();
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <title>Home</title>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0\">\r\n");
      out.write("\t<!-- VENDOR CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/font-awesome/css/font-awesome.min.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/linearicons/style.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/chartist/css/chartist-custom.css\">\r\n");
      out.write("\t<!-- MAIN CSS -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/main.css\">\r\n");
      out.write("\t<!-- FOR DEMO PURPOSES ONLY. You should remove this in your project -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/css/demo.css\">\r\n");
      out.write("\t<!-- GOOGLE FONTS -->\r\n");
      out.write("\t<link href=\"https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700\" rel=\"stylesheet\">\r\n");
      out.write("\t<!-- ICONS -->\r\n");
      out.write("\t<link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/apple-icon.png\">\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" sizes=\"96x96\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/favicon.png\">");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<!-- WRAPPER -->\r\n");
      out.write("\t<div id=\"wrapper\">\r\n");
      out.write("\t\t<!-- NAVBAR -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t\t<div class=\"brand\">\r\n");
      out.write("\t\t\t\t<a href=\"index.html\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/logo-dark.png\" alt=\"Klorofil Logo\" class=\"img-responsive logo\"></a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"navbar-btn\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn-toggle-fullwidth\"><i class=\"lnr lnr-arrow-left-circle\"></i></button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<form class=\"navbar-form navbar-left\">\r\n");
      out.write("\t\t\t\t\t<div class=\"input-group\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"text\" value=\"\" class=\"form-control\" placeholder=\"Search dashboard...\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"input-group-btn\"><button type=\"button\" class=\"btn btn-primary\">Go</button></span>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div id=\"navbar-menu\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle icon-menu\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<i class=\"lnr lnr-alarm\"></i>\r\n");
      out.write("\t\t\t\t\t\t\t\t<span class=\"badge bg-danger\">5</span>\r\n");
      out.write("\t\t\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu notifications\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"notification-item\"><span class=\"dot bg-warning\"></span>System space is almost full</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"notification-item\"><span class=\"dot bg-danger\"></span>You have 9 unfinished tasks</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"notification-item\"><span class=\"dot bg-success\"></span>Monthly report is available</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"notification-item\"><span class=\"dot bg-warning\"></span>Weekly meeting in 1 hour</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"notification-item\"><span class=\"dot bg-success\"></span>Your request has been approved</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\" class=\"more\">See all notifications</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"lnr lnr-question-circle\"></i> <span>Help</span> <i class=\"icon-submenu lnr lnr-chevron-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Basic Use</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Working With Data</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Security</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\">Troubleshooting</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li class=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/img/user.png\" class=\"img-circle\" alt=\"Avatar\"> <span>Samuel</span> <i class=\"icon-submenu lnr lnr-chevron-down\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"lnr lnr-user\"></i> <span>My Profile</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"lnr lnr-envelope\"></i> <span>Message</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"lnr lnr-cog\"></i> <span>Settings</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"#\"><i class=\"lnr lnr-exit\"></i> <span>Logout</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</nav>");
      out.write("\r\n");
      out.write("\t\t<!-- END NAVBAR -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- LEFT SIDEBAR -->\r\n");
      out.write("\t\t");
      out.write("\r\n");
      out.write("<div id=\"sidebar-nav\" class=\"sidebar\">\r\n");
      out.write("\t\t\t<div class=\"sidebar-scroll\">\r\n");
      out.write("\t\t\t\t<nav>\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Home.jsp\" class=");
      out.print(request.getRequestURI().indexOf("Home.jsp")!=-1?"active":"" );
      out.write("><i class=\"lnr lnr-home\"></i> <span>首页</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ShowUser.do\" class=");
      out.print(request.getRequestURI().indexOf("userList.jsp")!=-1?"active":"" );
      out.write("><i class=\"lnr lnr-code\"></i> <span>用户信息</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"charts.html\" class=\"\"><i class=\"lnr lnr-chart-bars\"></i> <span>图表</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"panels.html\" class=\"\"><i class=\"lnr lnr-cog\"></i>. <span>Panels</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"notifications.html\" class=\"\"><i class=\"lnr lnr-alarm\"></i> <span>Notifications</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<!-- <li>\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"#subPages\" data-toggle=\"collapse\" class=\"collapsed\"><i class=\"lnr lnr-file-empty\"></i> <span>Pages</span> <i class=\"icon-submenu lnr lnr-chevron-left\"></i></a>\r\n");
      out.write("\t\t\t\t\t\t\t<div id=\"subPages\" class=\"collapse \">\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"nav\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page-profile.html\" class=\"\">Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page-login.html\" class=\"\">Login</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a href=\"page-lockscreen.html\" class=\"\">Lockscreen</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</li> -->\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"tables.html\" class=\"\"><i class=\"lnr lnr-dice\"></i> <span>Tables</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"typography.html\" class=\"\"><i class=\"lnr lnr-text-format\"></i> <span>Typography</span></a></li>\r\n");
      out.write("\t\t\t\t\t\t<li><a href=\"icons.html\" class=\"\"><i class=\"lnr lnr-linearicons\"></i> <span>Icons</span></a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</nav>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>");
      out.write("\r\n");
      out.write("\t\t<!-- END LEFT SIDEBAR -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- MAIN -->\r\n");
      out.write("\t\t<div class=\"main\">\r\n");
      out.write("\t\t\t<!-- MAIN CONTENT -->\r\n");
      out.write("\t\t\t<div class=\"main-content\">\r\n");
      out.write("\t\t\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t<!-- TABLE HOVER -->\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-heading\" style=\"padding-bottom: 0;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"breadcrumb\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Home信息管理系统</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t    <li class=\"active\">用户信息</li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">添加</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">全选</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#\" class=\"btn btn-primary\">全不选</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"panel-body\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"table table-hover\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t    <th width=\"10%\"><input type=\"checkbox\" name=\"aaa\"/>选择</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\">编号</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"20%\">姓名</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"20%\">年龄</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"10%\">性别</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<th width=\"30%\">操作</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("                                            ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<!-- END TABLE HOVER -->\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<!-- END MAIN CONTENT -->\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- END MAIN -->\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- END WRAPPER -->\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- Javascript -->\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/vendor/jquery-slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("<script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/assets/scripts/klorofil-common.js\"></script>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /view/userList.jsp(51,44) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("user");
    // /view/userList.jsp(51,44) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/view/userList.jsp(51,44) '${users }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${users }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /view/userList.jsp(51,44) name = varStatus type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVarStatus("status");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t    <td><input type=\"checkbox\" name=\"bbb\"/></td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.age}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.sex}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t<td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"btn btn-primary\">删除</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t <a href=\"#\" class=\"btn btn-primary\">更新</a>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t\t</td>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvarStatus_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
