/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-01-08 12:39:45 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userdashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/user/userpage.jsp", Long.valueOf(1578475160806L));
    _jspx_dependants.put("/user/../basefooter.jsp", Long.valueOf(1578420294827L));
    _jspx_dependants.put("/user/../basehead.jsp", Long.valueOf(1578420245150L));
    _jspx_dependants.put("/user/../basebody.jsp", Long.valueOf(1578487073466L));
  }

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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<title>\r\n");
      out.write("\t\t\tSociety Hub\r\n");
      out.write("\t\t</title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<meta charset=\"utf-8\"> \r\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\t\t<link rel=\"icon\" href=\"static/assets/images/favicon.png\" type=\"image/png\"/>\r\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"static/assets/images/favicon.png\" type=\"image/png\"/>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Local compiled Bootstrap styling library-->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"static/css/lib/bootstrap.css\" />\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Custom CSS -->\r\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"static/css/base_layout.css\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Local compiled  JQeury library-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/lib/jquery.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Local compiled Bootstrap javascript library-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/lib/bootstrap.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Local compiled CharJS library-->\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"static/js/lib/Chart.bundle.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t$(document).ready(()=>{\r\n");
      out.write("\t\t\t\t$('[data-toggle=\"tooltip\"]').tooltip();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"static/css/userpage_layout.css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"static/css/user_dashboard_layout.css\">\r\n");
      out.write("\t\t\t<script src=\"static/js/userDashboard.js\"></script>\r\n");
      out.write(" ");
      out.write('\n');
      out.write("\n");
      out.write("<!--\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\t\t\t$(window).on(\"load\",function(){\n");
      out.write("\t\t\t\t$('#loginError').modal('show');\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t-->\n");
      out.write('\n');
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("<!-- HEADER -->\n");
      out.write("<header class=\"row\">\n");
      out.write("    <div class=\"col-md-7\">\n");
      out.write("        <h0>\n");
      out.write("            <a id=\"logo\" href=\"/\" data-toggle=\"tooltip\" title=\"Go to Society Hub homepage\">Society Hub</a>\n");
      out.write("        </h0>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <!-- IF THE USER ARGUMENT IS PASSED< A USER NAME AND LOGO WILL APPEAR-->\n");
      out.write("    ");

    String ownerName=(String)session.getAttribute("ownerName");
    if(ownerName != null) {
    
      out.write("\n");
      out.write("    <div class=\"col-md-6\">\n");
      out.write("        <a class=\"btn btn-light float-right\" style=\"margin-bottom: 9px;\" href=\"dashboard\" id=\"userIcon\">Welcome ");
      out.print( ownerName );
      out.write("</a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-2\">\n");
      out.write("        <a class=\"btn btn-dark float-right\" href=\"logout\">Logout</a>\n");
      out.write("    </div>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("</header>\n");
      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid row\" style=\"margin: 0px; padding: 0px;\">\r\n");
      out.write("\t<div class=\"col-md-2 dashboard-navbar\">\r\n");
      out.write("\t<!--\r\n");
      out.write("\t\t<div class=\"navbar-header\">{{ session['societyName'] }}</div>\r\n");
      out.write("\t-->\r\n");
      out.write("\t\t<div class=\"account-tab\">\r\n");
      out.write("\t\t\t<!-- DASHBOARD LINK NOT FUNCTIONAL PROBLEM WITH GET/POST PROBABLY-->\r\n");
      out.write("\t\t\t<hr/><a href=\"dashboard\">Noticeboard</a>\r\n");
      out.write("\t\t\t<hr/><a href=\"issues\">Issues</a>\r\n");
      out.write("\t\t\t<hr/>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"account-dropdown\">\r\n");
      out.write("\t\t\t<h3>Account Settings</h3>\r\n");
      out.write("\t\t\t<div class=\"account-tab\">\r\n");
      out.write("\t\t\t\t<hr/><a href=\"bills\">Bills</a>\r\n");
      out.write("\t\t\t\t<hr/><a href=\"profile\">Profile</a>\r\n");
      out.write("\t\t\t\t<hr/>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"static/css/user_dashboard_layout.css\">\r\n");
      out.write("\t<script src=\"static/js/userDashboard.js\"></script>\r\n");
      out.write("\t\r\n");
      out.write("<div class=\"col-md-4 table-div\">\r\n");
      out.write("\t<div id=\"scrollDiv\">\r\n");
      out.write("\t\t<table class=\"table table-hover table-striped\">\r\n");
      out.write("\t\t\t<thead>\r\n");
      out.write("\t\t\t\t<tr class=\"table-primary text-gray-dark\" style=\"font-size: 1.5em; color: #004d99;\">\r\n");
      out.write("\t\t\t\t\t<th>Subject</th>\r\n");
      out.write("\t\t\t\t\t<th>Date</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody id=\"notifBody\"></tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<button class=\"btn rounded-0 btn-block\" id=\"refreshNotif\">Refresh</button>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"col-md-6\" id=\"notif-div\">\r\n");
      out.write("\t<h1 id=\"notifSub\">SUBJECT</h1>\r\n");
      out.write("\t<h4 id=\"notifDate\">--/--/----</h4>\r\n");
      out.write("\r\n");
      out.write("\t<p id=\"notifContent\"></p>\r\n");
      out.write("</div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- ");
      out.write("\t\t<!-- FOOTER -->\n");
      out.write("\t\t<footer class=\"row\">\n");
      out.write("\t\t\t<div class=\"col-sm-12\">\n");
      out.write("\t\t\t\t<ul class=\"footer-list\">\n");
      out.write("\t\t\t\t\t<li><a href=\"https://www.linkedin.com/in/ameyadaddikar\">Contact us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"https://opensource.org/licenses/MIT\">License</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</footer>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("<div class=\"modal fade\" id=\"loginError\" role=\"dialog\">\n");
      out.write("\t<div class=\"modal-dialog\">\n");
      out.write("\t<!-- Modal content-->\n");
      out.write("\t\t<div class=\"modal-content\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<h4 class=\"modal-title\">Error</h4>\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-body\">\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t\t<!--\n");
      out.write("\t\t\t\t<p style=\"text-align: center;\">{{ error }}</p>\n");
      out.write("\t\t\t\t-->\n");
      out.write("\t\t\t\t");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"modal-footer\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"btn btn-default\" data-dismiss=\"modal\">Close</button>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\t</body>\n");
      out.write("</html>");
      out.write(" -->\r\n");
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