/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2015-08-19 03:32:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.io.IOException;
import java.net.URLEncoder;
import com.hp.hpl.jena.sparql.core.Var;
import com.hp.hpl.jena.sparql.engine.binding.Binding;
import java.util.List;
import com.hp.hpl.jena.query.ResultSetFactory;
import java.util.Properties;

public final class linkedData_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public String callBigdata(String sparql, Properties prop) throws IOException {

        String fullsparql = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\r\n"
                + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\n"
                + "PREFIX wn: <http://wordnet.princeton.edu/word#> \r\n"
                + "PREFIX wns: <http://wordnet.princeton.edu/schema#> \r\n"
                + "PREFIX wsc: <http://smiil.cs.kku.ac.th/wsc#> \r\n"
                + sparql
                + "\r\n";

        String fullmsg = "query=" + URLEncoder.encode(fullsparql, "UTF-8") + "&namespace=&xhtml=false";
        Socket sock = new Socket(prop.getProperty("rdf_host"), Integer.parseInt(prop.getProperty("rdf_port")));
        String msg = "POST /bigdata/sparql HTTP/1.0\r\n"
                + "Host: " + prop.getProperty("rdf_host") + ":" + prop.getProperty("rdf_port") + "\r\n"
                + "Content-Length: " + fullmsg.length() + "\r\n"
                + "Content-Type: application/x-www-form-urlencoded\r\n"
                + "\r\n"
                + fullmsg;
        PrintWriter os = new PrintWriter(sock.getOutputStream());
        os.println(msg);
        os.flush();

        InputStreamReader is = new InputStreamReader(sock.getInputStream(), "UTF-8");
        BufferedReader br = new BufferedReader(is);
        String outmsg = "";
        String line;
        while ((line = br.readLine()) != null) {
            outmsg += line;
        }

        os.close();
        is.close();
        sock.close();

        return outmsg;
    }

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=devicd-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"../js/libs/bootstrap-3.2.0-dist/css/bootstrap.min.css\"/>\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .navbar{background-color:white;}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    ");

        Properties prop = new Properties();
        prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));

        String report = "";
        String out2 = callBigdata("SELECT * WHERE {?Subject ?Predicate ?Object. FILTER(?Subject=<" + request.getParameter("id") + ">).}\r\n", prop);
        //monitor = "<textarea col='20' rows='20'>" + out2 + "</textarea>";
        com.hp.hpl.jena.query.ResultSet jres = ResultSetFactory.fromXML("<?xml version=" + out2.split("<?xml version=")[1]);
        List<String> vars = jres.getResultVars();
        report += "<tr><th>#</th>";
        for (String v : vars) {
            String colname = v;
            report += "<th>" + colname + "</th>";
        }
        report += "<th></th></tr>";
        int rcount = 1;
        while (jres.hasNext()) {
            Binding bi = jres.nextBinding();
            String restCols = "";
			String stmt = "";
            for (String v : vars) {
                com.hp.hpl.jena.graph.Node n = bi.get(Var.alloc(v));
				stmt += (n.isLiteral())?"\""+n.getLiteral().getValue()+"\" ":"<"+n.getURI()+"> ";
                Object obj = (n.isLiteral()) ? n.getLiteral().getValue() : n;
                String objStr = (obj != null) ? obj.toString() : "-";
				int chkIdx = (objStr.lastIndexOf("/")>0)?objStr.lastIndexOf("/"):0;
                String objStrSh = (objStr.contains("#")) ? objStr.split("#")[1] : objStr.substring(chkIdx);
                if (v.equals("Subject")) {
                    restCols += "<td><a href='javascript: void(0);' onclick=\"window.open('linkedData.jsp?id=" + URLEncoder.encode(objStr) + "');\">" + objStrSh + "</a></td>";
                } else {
                    restCols += (n.isURI()) ? "<td><a href='javascript: void(0);' onclick=\"window.open('linkedData.jsp?id=" + URLEncoder.encode(objStr) + "');\">" + objStrSh + "</a></td>" : "<td>" + objStrSh + "</td>";
                }
            }
            report += "<tr><td>" + rcount + "</td>";
            report += restCols + "<td><form action='execQuery.jsp' method='post'><input type='hidden' name='redirect' value='linkedData.jsp?id=" + URLEncoder.encode(request.getParameter("id")) + "'/><textarea name='sparql' style='display:none;'>DELETE WHERE {"+stmt+"}</textarea><a class='btn btn-sm btn-success' href='javascript:void(0);' onclick=\"if(confirm('Are you sure?')){this.parentNode.submit();}\">Del</a></form></td></tr>";
            rcount++;
        }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"panel panel-default\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3 class=\"panel-title\"><b>Resource Info.</b> &lt;");
      out.print(request.getParameter("id"));
      out.write("&gt;</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body\">\n");
      out.write("                    <table class=\"table table-striped\">");
      out.print(report);
      out.write("</table>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/libs/jquery/jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"../js/libs/bootstrap-3.2.0-dist/js/bootstrap.min.js\"></script>\n");
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
