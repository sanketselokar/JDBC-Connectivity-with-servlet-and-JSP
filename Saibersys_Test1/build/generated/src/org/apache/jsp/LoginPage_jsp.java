package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import javax.sql.*;

public final class LoginPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <form method=\"post\" action=\"LoginPageLogicServlet\">  \n");
      out.write("        \n");
      out.write("            Username: <input type=\"text\" name=\"name\" required=\"\">\n");
      out.write("            <br> Password: <input type=\"password\" name=\"pwd\" required=\"\">\n");
      out.write("           \n");
      out.write("<!--            Go to JSP page-->\n");
      out.write("            <!-- <br> <input type=\"button\" value=\"Login\" name=\"LoginButton\" onclick=\"openPage('ListOfStudent.jsp')\">-->\n");
      out.write("            <br> <input type=\"submit\" value=\"Login\" name=\"loginButton\" onclick=\"return callservlet();\">\n");
      out.write("            <br> <input type=\"submit\" value=\"Cancel\" name=\"cancelButton\" onclick=\"return cancelFieldMethod();\">\n");
      out.write("        </form>\n");
      out.write("        </body>\n");
      out.write("        \n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function callservlet() {\n");
      out.write("\n");
      out.write("    var servletname=document.getdata.loginButton.value;\n");
      out.write("\n");
      out.write("//    if(servletname== \"\")\n");
      out.write("//        {\n");
      out.write("//        alert(\"NO value..\");\n");
      out.write("//        return false;\n");
      out.write("//        }\n");
      out.write("//    else\n");
      out.write("//        {\n");
      out.write("//        alert(\"value\"+servletname);\n");
      out.write("        \n");
      out.write("        document.forms[0].action = \"LoginPageLogicServlet\";\n");
      out.write("            document.forms[0].submit();\n");
      out.write("//        return false;\n");
      out.write("//        }\n");
      out.write("}\n");
      out.write("function cancelFieldMethod()\n");
      out.write("{\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    document.getElementById(\"text\").value= \"\";\n");
      out.write("    document.getElementById(\"pwd\").value= \"\";\n");
      out.write("}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("// function openPage(pageURL)\n");
      out.write("// {\n");
      out.write("// window.location.href = pageURL;\n");
      out.write("// }\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("</html>\n");
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
