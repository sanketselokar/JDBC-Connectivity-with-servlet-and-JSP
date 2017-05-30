package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class NewStudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

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
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form method=\"post\" action=\"NewStudentServlet\">       \n");
      out.write("        \n");
      out.write("            First Name: <input type=\"text\" name=\"fname\">\n");
      out.write("            \n");
      out.write("            <br> Last Name: <input type=\"text\" name=\"lname\">\n");
      out.write("           <br> DOB: <input type=\"date\" name=\"dob\" id=\"dob\"> \n");
      out.write("            <br> <input type=\"submit\" value=\"Save\" name=\"saveButton\" onclick=\"return callservlet();\" >\n");
      out.write("        <br> <input type=\"submit\" value=\"Cancel\">\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("         </body>\n");
      out.write("         <script type=\"text/javascript\">\n");
      out.write("            function callservlet() \n");
      out.write("            {\n");
      out.write("                var x = document.getElementById('dob').value;\n");
      out.write("                document.getElementById(\"dob\").value = x;\n");
      out.write("                //document.forms.submit();\n");
      out.write("                //document.form1.hiddenValue.value = x; \n");
      out.write("                \n");
      out.write("                //<input type=\"submit\" value=\"Save\" name=\"saveButton\" onclick=\"return callservlet();\" >\n");
      out.write("                \n");
      out.write("              //  document.forms[0].action = \"NewStudentServlet\";\n");
      out.write("            document.forms[0].submit();\n");
      out.write("            }\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
