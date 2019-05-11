package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Routes;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    int routeNumber;
    String fromDest;
    String toDest;
    String arrival; 
    String departure; 

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>  \n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Student-Dashboard</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/student.css\">\n");
      out.write("\n");
      out.write("        <!-- DATATABLE EXTENSIONS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.dataTables.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/dataTables.responsive.css\">\n");
      out.write("        <script src=\"js/jquery-3.3.1.js\"></script>\n");
      out.write("        <script charset=\"utf-8\" src=\"js/jquery.dataTables.js\"></script>\n");
      out.write("        <script charset=\"utf-8\" src=\"js/dataTables.responsive.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"main\">\n");
      out.write("            <div class = \"left-pane\">\n");
      out.write("                <div class=\"user-icon\"> <img src=\"img\\user-icon.png\"> </div>\n");
      out.write("                <h2 class=\"client-name\"> ");
      out.print(session.getAttribute("username"));
      out.write(" </h2>\n");
      out.write("                \n");
      out.write("                <form action=\"LogoutServlet\">\n");
      out.write("                    <input type=\"submit\" class=\"logout\" value=\"Logout\"/> \n");
      out.write("                </form>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-pane\">\n");
      out.write("                <span class=\"title\"> Find buses below </span>\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Search here\" id=\"search\">\n");
      out.write("                <br>\n");
      out.write("                <div class=\"tableData\">\n");
      out.write("                    <table id=\"resultData\" class=\"display\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Route No.</th>\n");
      out.write("                                <th>From</th>\n");
      out.write("                                <th>To</th>\n");
      out.write("                                <th>Departure</th>\n");
      out.write("                                <th>Arrival</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        <tbody>\n");
      out.write("                            ");

                                Configuration cf = null;
                                SessionFactory sf = null;
                                Session session1 = null;

                                cf = new Configuration();
                                cf.configure();

                                sf = cf.buildSessionFactory();
                                session1 = sf.openSession();

                                Query query = session1.createQuery("from Routes");
                                Iterator it = query.iterate();

                                while (it.hasNext()) {
                                    Routes r = (Routes) it.next();
                                    routeNumber = r.getRouteNumber();
                                    fromDest = r.getFromDest();
                                    toDest = r.getToDest();
                                    arrival = r.getArrival();
                                    departure = r.getDeparture();
                               
                            
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td>");
      out.print(routeNumber);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(fromDest);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(toDest);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(arrival);
      out.write("</td>\n");
      out.write("                                <td>");
      out.print(departure);
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                            ");
 session1.close();
      out.write("\n");
      out.write("                        \n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("        <script src=\"js\\table.js\"></script>\n");
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
