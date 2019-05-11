package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Login</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate.css\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- NAVBAR -->\r\n");
      out.write("        <div class = \"nav\">\r\n");
      out.write("            <img src=\"img\\bus_icon.png\"> \r\n");
      out.write("            Bus Management\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <br><br>\r\n");
      out.write("\r\n");
      out.write("        <!-- MAIN DIV -->\r\n");
      out.write("        <div class=\"container\"> \r\n");
      out.write("            <form name=\"loginForm\" method=\"post\" action=\"LoginServlet\" onsubmit=\"return loginValidate()\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"form-title-row\"> \r\n");
      out.write("                    <h1> Sign in to your account </h1> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <span id=\"uname\"> Username </span>\r\n");
      out.write("                    <input type=\"text\" name=\"username\" id=\"username\" placeholder=\"Username\"> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <span id=\"pass\"> Password </span>\r\n");
      out.write("                    <input type=\"password\" name=\"password\" id=\"password\"  placeholder=\"Password\"> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <span id=\"acc-type\"> Account Type </span>\r\n");
      out.write("                    <select name=\"type\" class=\"select-box\" id=\"select-type\">\r\n");
      out.write("                        <option value=\"student\" default> Student </option>\r\n");
      out.write("                        <option value=\"faculty\"> Faculty </option>\r\n");
      out.write("                        <option value=\"staff\"> Staff</option>\r\n");
      out.write("                    </select> \r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("                <br><br>\r\n");
      out.write("                <div class=\"form-row\">\r\n");
      out.write("                    <button type=\"submit\" name=\"submit\" value=\"Submit\"> Login </button> \r\n");
      out.write("                </div>\r\n");
      out.write("                <script>\r\n");
      out.write("                    function loginValidate() {\r\n");
      out.write("                        var username_value = document.forms[\"loginForm\"][\"username\"].value;\r\n");
      out.write("                        var password_value = document.forms[\"loginForm\"][\"password\"].value;\r\n");
      out.write("                        var flag = true;\r\n");
      out.write("\r\n");
      out.write("                        if (username_value == \"\") {\r\n");
      out.write("                            document.getElementById(\"uname\").classList.add('animated', 'shake');\r\n");
      out.write("                            document.getElementById(\"uname\").style.color = \"rgb(200, 0, 0)\";\r\n");
      out.write("                            document.getElementById(\"username\").style.borderColor = \"rgb(200, 0, 0)\";\r\n");
      out.write("                            document.getElementById(\"username\").style.color = \"rgb(200, 0, 0)\";  \r\n");
      out.write("                            document.getElementById(\"username\").classList.add('animated', 'shake');\r\n");
      out.write("                            document.getElementById(\"username\").placeholder = \"Cannot be empty\";\r\n");
      out.write("                            \r\n");
      out.write("                            setTimeout(function () {\r\n");
      out.write("                                document.getElementById(\"uname\").classList.remove('animated', 'shake');\r\n");
      out.write("                                document.getElementById(\"username\").classList.remove('animated', 'shake');\r\n");
      out.write("                            }, 1000)\r\n");
      out.write("                            flag = false;\r\n");
      out.write("                        }\r\n");
      out.write("                        if (password_value == \"\") {\r\n");
      out.write("                            document.getElementById(\"pass\").style.color = \"rgb(200, 0, 0)\";\r\n");
      out.write("                            document.getElementById(\"password\").style.borderColor = \"rgb(200, 0, 0)\";\r\n");
      out.write("                            document.getElementById(\"password\").style.color = \"rgb(200, 0, 0)\";\r\n");
      out.write("                            document.getElementById(\"pass\").classList.add('animated', 'shake');\r\n");
      out.write("                            document.getElementById(\"password\").classList.add('animated', 'shake');\r\n");
      out.write("                            document.getElementById(\"password\").placeholder = \"Cannot be empty\";\r\n");
      out.write("                            \r\n");
      out.write("                            setTimeout(function () {\r\n");
      out.write("                                document.getElementById(\"password\").classList.remove('animated', 'shake');\r\n");
      out.write("                                document.getElementById(\"pass\").classList.remove('animated', 'shake');\r\n");
      out.write("                            }, 1000)\r\n");
      out.write("                            \r\n");
      out.write("                            flag = false;\r\n");
      out.write("                        }\r\n");
      out.write("                        return flag;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                </script>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
