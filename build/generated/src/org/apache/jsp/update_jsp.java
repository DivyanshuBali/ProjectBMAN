package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>  \n");
      out.write("    <head>\n");
      out.write("        <title> Update </title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css\\update.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"main\">\n");
      out.write("\n");
      out.write("            <div class = \"left-pane\">\n");
      out.write("                <div class=\"user-icon\"> <img src=\"img\\user-icon.png\"> </div>\n");
      out.write("                <h2 class=\"client-name\"> ");
      out.print(session.getAttribute("username"));
      out.write(" </h2>\n");
      out.write("                <form action=\"LogoutServlet\">\n");
      out.write("                    <button class=\"logout\"> Logout </button>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("                <div class=\"right-pane\">\n");
      out.write("                <div class=\"update-info\">\n");
      out.write("\n");
      out.write("                    <form name=\"update\" method=\"get\" action=\"UpdateServlet\"> \n");
      out.write("\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <span class=\"title\"> Bus Number </span>\n");
      out.write("                            <input type=\"text\" name=\"busnumber\" id=\"busnumber\" placeholder=\"Bus Number\">  \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <span class=\"title\"> From </span>\n");
      out.write("                            <input type=\"text\" name=\"from\" id=\"from\" placeholder=\"From\"> \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <span class=\"title\"> To </span>\n");
      out.write("                            <input type=\"text\" name=\"to\" id=\"to\" placeholder=\"To\"> \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <span class=\"title\"> Departure </span>\n");
      out.write("                            <input type=\"text\" name=\"departure\" id=\"departure\" placeholder=\"Departure\"> \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <br>\n");
      out.write("                        <div class=\"form-row\">\n");
      out.write("                            <span class=\"title\"> Arrival </span>\n");
      out.write("                            <input type=\"text\" name=\"arrival\" id=\"arrival\" placeholder=\"Arrival\"> \n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-row\" style=\"text-align: center\">\n");
      out.write("                            <button type=\"submit\" value=\"Update\"> Update </button>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
