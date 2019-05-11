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

public final class faculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html>  \r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <title>Faculty-Dashboard</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css\\student.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- DATATABLE EXTENSIONS -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.dataTables.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/dataTables.responsive.css\">\r\n");
      out.write("        <script src=\"js/jquery-3.3.1.js\"></script>\r\n");
      out.write("        <script charset=\"utf-8\" src=\"js/jquery.dataTables.js\"></script>\r\n");
      out.write("        <script charset=\"utf-8\" src=\"js/dataTables.responsive.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <!-- FONTAWESOME -->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css\\font-awesome\\css\\font-awesome.min.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("        <div class=\"main\">\r\n");
      out.write("            <div class = \"left-pane\">\r\n");
      out.write("                <div class=\"user-icon\"> <img src=\"img\\user-icon.png\"> </div>\r\n");
      out.write("                <h2 class=\"client-name\"> ");
      out.print(session.getAttribute("username"));
      out.write(" </h2>\r\n");
      out.write("                <form action=\"LogoutServlet\">\r\n");
      out.write("                    <button class=\"logout\"> Logout </button>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"right-pane\">\r\n");
      out.write("                <span class=\"title\"> Find buses below to edit or add new schedule </span>\r\n");
      out.write("                <input type=\"text\" name=\"search\" placeholder=\"Search here\" id=\"search\">\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("                <button type=\"submit\" name= \"add\" class=\"add-new-schedule\"><a href=\"update.jsp\" style=\"text-decoration: none; color: white;\"> Add Schedule </a> </button>\r\n");
      out.write("\r\n");
      out.write("                <br>\r\n");
      out.write("                <div class=\"tableData\">\r\n");
      out.write("                    <table id=\"resultData\" class=\"display\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>Route No.</th>\r\n");
      out.write("                                <th>From</th>\r\n");
      out.write("                                <th>To</th>\r\n");
      out.write("                                <th>Departure</th>\r\n");
      out.write("                                <th>Arrival</th>\r\n");
      out.write("                                <th>Update</th>\r\n");
      out.write("                                <th>Delete</th>\r\n");
      out.write("\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        <tbody>\r\n");
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
                            
      out.write("\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <td>");
      out.print(routeNumber);
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(fromDest);
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(toDest);
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(arrival);
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(departure);
      out.write("</td>\r\n");
      out.write("                                <td>\r\n");
      out.write("                                    <form action=\"NewInfo\" method=\"get\"> \r\n");
      out.write("                                        <button name=\"route\" value=\"");
      out.print(routeNumber);
      out.write("\"> \r\n");
      out.write("                                            <i class=\"fa fa-edit\"></i> \r\n");
      out.write("                                        </button> \r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </td>\r\n");
      out.write("\r\n");
      out.write("                                <td> \r\n");
      out.write("                                    <form action=\"Delete\" method=\"get\"> \r\n");
      out.write("                                        <button name=\"route\" value=\"");
      out.print(routeNumber);
      out.write("\"> \r\n");
      out.write("                                            <i class=\"fa fa-trash-o\"></i>\r\n");
      out.write("                                        </button>\r\n");
      out.write("                                    </form>\r\n");
      out.write("                                </td>\r\n");
      out.write("                            </tr>\r\n");
      out.write("\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                            ");
 session1.close();
      out.write("\r\n");
      out.write("                        </tbody>   \r\n");
      out.write("                    </table>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div> \r\n");
      out.write("        </div>\r\n");
      out.write("        <script src=\"js\\table.js\"></script>\r\n");
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
