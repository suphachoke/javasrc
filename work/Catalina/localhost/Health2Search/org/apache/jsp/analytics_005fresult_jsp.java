/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2556-10-08 04:02:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javafx.stage.Stage;
import h2s.chart.Chart;;

public final class analytics_005fresult_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/header.html", Long.valueOf(1381204862000L));
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

    Chart ct = new Chart();
    ct.draw();

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/1999/xhtml\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:dis=\"http://202.28.94.50/disp\">\n");
      out.write("    <head>\n");
      out.write("        <title>Nongbuarawae Hospital Healthcare Information Center - Information search portal</title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <script type=\"text/javascript\" src=\"script1.js\"></script>\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/fav.ico\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"style1.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<!--\r\n");
      out.write("To change this template, choose Tools | Templates\r\n");
      out.write("and open the template in the editor.\r\n");
      out.write("-->\r\n");
      out.write("<dis:input class=\"right\">\r\n");
      out.write("    <input id=\"global_search\" type=\"text\" placeholder=\"Search site\"/>\r\n");
      out.write("    <input id=\"global_search_button\" type=\"button\"/>\r\n");
      out.write("</dis:input>\r\n");
      out.write("<dis:title>Nongbuarawae Hospital</dis:title>\r\n");
      out.write("<dis:subtitle>Healthcare Information Center</dis:subtitle>\r\n");
      out.write("<dis:menubar>\r\n");
      out.write("    <dis:menu><a href=\"#\">Home</a></dis:menu>\r\n");
      out.write("    <dis:menu><a href=\"search_main.jsp\">Search</a></dis:menu>\r\n");
      out.write("    <dis:menu><a href=\"analytics_main.jsp\">Analytics</a></dis:menu>\r\n");
      out.write("    <dis:menu><a href=\"#\">Setting</a></dis:menu>\r\n");
      out.write("</dis:menubar>\r\n");
      out.write("\n");
      out.write("        ");
//@include file="analytics/result.html" 
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
