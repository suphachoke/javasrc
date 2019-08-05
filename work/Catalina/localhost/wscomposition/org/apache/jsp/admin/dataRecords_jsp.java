/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.42
 * Generated at: 2016-01-15 07:37:08 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException;
import com.hp.hpl.jena.sparql.core.Var;
import com.hp.hpl.jena.sparql.engine.binding.Binding;
import java.util.List;
import com.hp.hpl.jena.query.ResultSetFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URLEncoder;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.util.Properties;

public final class dataRecords_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    public String callBigdata(String sparql, String ontons, Properties prop) throws IOException {

        String fullsparql = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\n"
                + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n"
                + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\r\n"
                + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\n"
                + "PREFIX wn: <http://wordnet.princeton.edu/word#> \r\n"
                + "PREFIX wns: <http://wordnet.princeton.edu/schema#> \r\n"
                + "PREFIX wsc: <http://smiil.cs.kku.ac.th/wsc#> \r\n"
                + "PREFIX wse: <" + ontons + "#> \r\n"
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

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/admin/navigator.jsp", Long.valueOf(1448606788294L));
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
      out.write("            .jumbotron{margin-top:50px;}\n");
      out.write("            .navbar{background-color:white;}\n");
      out.write("            .textbox{width:100%;}\n");
      out.write("            .panel-heading a:after {\n");
      out.write("                font-family: 'Glyphicons Halflings';\n");
      out.write("                content: \"\\e114\";\n");
      out.write("                float: right;\n");
      out.write("                color: grey;\n");
      out.write("            }\n");
      out.write("            .panel-heading a.collapsed:after {\n");
      out.write("                content: \"\\e080\";\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    ");

        Properties prop = new Properties();
        prop.load(getServletContext().getResourceAsStream("/WEB-INF/config.properties"));

        String selectNS = "";
        String selectClsIns = "";
        String clearIns = "";
		String rdfStatement = "";
		int cStmt = 0;
		if (request.getParameter("ontons") != null){
			session.setAttribute("ontons",request.getParameter("ontons"));
		}
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://" + prop.getProperty("db_host") + ":" + prop.getProperty("db_port") + "/" + prop.getProperty("db_name"), prop.getProperty("db_user"), prop.getProperty("db_pass"));
            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery("select uri from namespace");
            while (res.next()) {
                String sel = (res.getString("uri").equals(session.getAttribute("ontons"))) ? "selected" : "";
                selectNS += "<option name='ontons' value='" + res.getString("uri") + "' " + sel + ">" + res.getString("uri") + "</option>";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        String monitor = "";
        String selectPage = "";
        String selectLimit = "";
        String report = "";
        String OntoClass = (request.getParameter("class") != null) ? request.getParameter("class") : "AtomicProcess";
        if (session.getAttribute("ontons") != null && !session.getAttribute("ontons").equals("none")) {
            double p = (request.getParameter("pg") != null) ? Double.parseDouble(request.getParameter("pg")) : 1;
            double limit = (request.getParameter("limit") != null) ? Double.parseDouble(request.getParameter("limit")) : 10;
            double cc = 0;
            String out1 = callBigdata("SELECT (COUNT(?s) AS ?count) WHERE {?s rdf:type wse:" + OntoClass + ".}\r\n", session.getAttribute("ontons").toString(), prop);
            //monitor = "<textarea col='20' rows='20'>"+out1+"</textarea>";
            com.hp.hpl.jena.query.ResultSet cres = ResultSetFactory.fromXML("<?xml version=" + out1.split("<?xml version=")[1]);
            if (cres.hasNext()) {
                cc = Double.parseDouble(cres.nextBinding().get(Var.alloc("count")).getLiteralValue().toString());
            }
            double pp = Math.ceil(cc / limit);
            for (int i = 0; i < pp; i++) {
                String sel = ((i + 1) == p) ? "selected" : "";
                selectPage += "<option name='pg' value='" + (i + 1) + "' " + sel + ">" + (i + 1) + "</option>";
            }

            String out2 = callBigdata("SELECT * WHERE {?" + OntoClass + " rdf:type wse:" + OntoClass + ".} LIMIT " + (int) limit + " OFFSET " + (int) ((p - 1) * limit) + "\r\n", session.getAttribute("ontons").toString(), prop);
            //monitor = "<textarea col='20' rows='20'>" + out2 + "</textarea>";
            com.hp.hpl.jena.query.ResultSet jres = ResultSetFactory.fromXML("<?xml version=" + out2.split("<?xml version=")[1]);
            List<String> vars = jres.getResultVars();
            report += "<tr><th>#</th>";
            for (String v : vars) {
                String colname = v;
                report += "<th>" + colname + "</th>";
            }
            report += "</tr>";
            int rcount = ((int) ((p - 1) * limit)) + 1;
            while (jres.hasNext()) {
                Binding bi = jres.nextBinding();
                String pid = "";
                String restCols = "";
                for (String v : vars) {
                    com.hp.hpl.jena.graph.Node n = bi.get(Var.alloc(v));
                    Object obj = (n.isLiteral()) ? n.getLiteral().getValue() : n;
                    String objStr = (obj != null) ? obj.toString() : "-";
                    if (v.equals(OntoClass)) {
                        pid = objStr;
                        restCols += "<td><a href='javascript: void(0);' onclick=\"window.open('linkedData.jsp?id=" + URLEncoder.encode(pid) + "');\">" + pid + "</a></td>";
                    } else {
                        restCols += "<td>" + objStr + "</td>";
                    }
					//get a statement of an instance
					/*String out3 = callBigdata("SELECT * WHERE {<" + objStr + "> ?p ?o.}\r\n", session.getAttribute("ontons").toString(), prop);
					com.hp.hpl.jena.query.ResultSet ires = ResultSetFactory.fromXML("<?xml version=" + out3.split("<?xml version=")[1]);
					while (ires.hasNext()){
						rdfStatement += "<"+objStr+"> ";
						Binding bii = ires.nextBinding();
						for (String vv: ires.getResultVars()){
							com.hp.hpl.jena.graph.Node nn = bii.get(Var.alloc(vv));
							rdfStatement += (nn.isLiteral())?"\""+nn.getLiteral().getValue()+"\" ":"<"+nn.toString()+"> ";
						}
						rdfStatement += ".\r\n";
						cStmt++;
					}*/
                }
                report += "<tr><td>" + rcount + "</td>";
                report += restCols + "</tr>";
                rcount++;
            }

            selectPage = "<form style='float:left' id='formSelectPage' method='post' action=''><input type='hidden' name='ontons' value='" + session.getAttribute("ontons") + "'/><input type='hidden' name='limit' value='"+limit+"'/><select name='pg' onchange='javascript:this.parentNode.submit();'>" + selectPage + "</select></form>";
			for(int j=1;j<=20;j++){
				selectLimit += ((j*10)==limit)?"<option value='"+(j*10)+"' selected>"+(j*10)+"</option>":"<option value='"+(j*10)+"'>"+(j*10)+"</option>";
			}
			selectLimit = "<form style='float:left' id='formSelectLimit' method='post' action=''><input type='hidden' name='ontons' value='" + session.getAttribute("ontons") + "'/><input type='hidden' name='pg' value='" + p + "'/><select name='limit' onchange='javascript:this.parentNode.submit();'>"+selectLimit+"</select></form>";

            //String[] cls = new String[]{"AtomicProcess", "Parameter", "Arc", "Vertex", "SyntacticMatching", "Exact", "Subsume", "Sibling"};
			String[] cls = new String[]{"AtomicProcess", "Parameter", "Arc", "Vertex", "Exact", "Subsume"};
			String clearInsCls = "";
            for (String c : cls) {
				clearInsCls += (clearInsCls.equals(""))?"{?s ?p ?o. ?s rdf:type wse:"+c+"}":" UNION {?s ?p ?o. ?s rdf:type wse:"+c+"}";
                String ret = callBigdata("SELECT (COUNT(?s) AS ?count) WHERE {?s rdf:type wse:" + c + ".}\r\n", session.getAttribute("ontons").toString(), prop);
                //monitor = "<textarea col='20' rows='20'>"+out1+"</textarea>";
                com.hp.hpl.jena.query.ResultSet res = ResultSetFactory.fromXML("<?xml version=" + ret.split("<?xml version=")[1]);
                int ct = 0;
                if (res.hasNext()) {
                    ct = Integer.parseInt(res.nextBinding().get(Var.alloc("count")).getLiteralValue().toString());
                }
                selectClsIns += "<li class='list-group-item'><a href='?class=" + c + "'>" + c + " (" + ct + " instances)</a></li>";
            }

            String sparqlHead = "PREFIX rdf: <http://www.w3.org/1999/02/22-rdf-syntax-ns#> \r\n"
                    + "PREFIX rdfs: <http://www.w3.org/2000/01/rdf-schema#>\r\n"
                    + "PREFIX owl: <http://www.w3.org/2002/07/owl#>\r\n"
                    + "PREFIX xsd: <http://www.w3.org/2001/XMLSchema#>\r\n"
                    + "PREFIX wn: <http://wordnet.princeton.edu/word#> \r\n"
                    + "PREFIX wns: <http://wordnet.princeton.edu/schema#> \r\n"
                    + "PREFIX wsc: <http://smiil.cs.kku.ac.th/wsc#> \r\n"
                    + "PREFIX wse: <" + session.getAttribute("ontons") + "#> \r\n ";

            clearIns = "<form action='submitService.jsp' method='post'>"
                    + "<input type='hidden' name='sparql' value='" + sparqlHead + "DELETE {?s ?p ?o.} WHERE{"+clearInsCls+"}'/>"
                    + "<input type='hidden' name='ontons' value='" + session.getAttribute("ontons") + "'/>"
                    + "<input type='hidden' name='action' value='update'/>"
                    + "<a class='btn btn-sm btn-success' href='javascript:void(0);' onclick=\"if(confirm('Are you sure?')){this.parentNode.submit();}\">DeleteInstances</a>"
                    + "</form>";
        }
    
      out.write("\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<div class=\"navbar navbar-fixed-top\" role=\"navigation\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"navbar-header\">\n");
      out.write("            <div class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\n");
      out.write("                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                <span class=\"icon-bar\" style=\"background-color:black;\"></span>\n");
      out.write("                <span class=\"icon-bar\" style=\"background-color:black;\"></span>\n");
      out.write("                <span class=\"icon-bar\" style=\"background-color:black;\"></span>\n");
      out.write("            </div>\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">WS Management System</a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"collapse navbar-collapse\">\n");
      out.write("            <ul class=\"nav navbar-nav\">\n");
      out.write("                <li class=\"active\"><a href=\"index.jsp\">Import Services</a></li>\n");
      out.write("                <li><a href=\"graphGeneration.jsp\">Graph Preparation</a></li>\n");
      out.write("                <li><a href=\"dataRecords.jsp\">Service & Graph Records</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"jumbotron\">\n");
      out.write("                <h2>WS & Graph Records</h2>\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">Dataset Namespace</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-body\">\n");
      out.write("                        <form id=\"form1\" method=\"post\" action=\"dataRecords.jsp\">\n");
      out.write("                            <select name=\"ontons\" onchange=\"javascript:this.parentNode.submit();\">\n");
      out.write("                                <option value=\"none\" selected>---Choose Namespace---</option>\n");
      out.write("                                ");
      out.print(selectNS);
      out.write("\n");
      out.write("                            </select>\n");
      out.write("                        </form>\n");
      out.write("                        ");
      out.print(clearIns);
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel panel-default\">\n");
      out.write("                    <div class=\"panel-heading\">\n");
      out.write("                        <h3 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"javascript:void(0);\" data-toggle=\"collapse\" data-target=\"#ClassesPan\">Classes</a>\n");
      out.write("\t\t\t\t\t\t</h3>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"panel-collapse collapse in\" id=\"ClassesPan\">\n");
      out.write("                        <ul class=\"list-group\">");
      out.print(selectClsIns);
      out.write("</ul>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t<a href=\"javascript:void(0);\" data-toggle=\"collapse\" data-target=\"#RecordsPan\">Instances</a>\n");
      out.write("\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"RecordsPan\" class=\"panel-collapse collapse in\">\n");
      out.write("\t\t\t\t\t");
      out.print((!report.equals("")) ? "<span style='float:left'>Page: </span>"+selectPage+"&nbsp;<span style='float:left'>Show: </span>"+selectLimit : "");
      out.write("\n");
      out.write("\t\t\t\t\t<table class=\"table-striped table-responsive\">\n");
      out.write("\t\t\t\t\t\t");
      out.print(report);
      out.write("\n");
      out.write("\t\t\t\t\t</table>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("        </div>\n");
      out.write("\t\t<!--<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t<div class=\"panel-heading\">\n");
      out.write("\t\t\t\t\t<h3 class=\"panel-title\">\n");
      out.write("\t\t\t\t\t\t<a class=\"collapsed\" href=\"javascript:void(0);\" data-toggle=\"collapse\" data-target=\"#RDFStmtPan\">RDF Statements</a>\n");
      out.write("\t\t\t\t\t</h3>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div id=\"RDFStmtPan\" class=\"panel-collapse collapse in\">\n");
      out.write("\t\t\t\t\t<textarea style=\"width:100%;height:");
      out.print((cStmt*22));
      out.write("px;\">");
      out.print(rdfStatement);
      out.write("</textarea>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>-->\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/libs/jquery/jquery.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"../js/libs/bootstrap-3.2.0-dist/js/bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("\t\t\t$('#RDFStmtPan').collapse();\n");
      out.write("\t\t</script>\n");
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
