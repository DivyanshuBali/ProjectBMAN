<%-- 
    Document   : student
    Created on : 28 Mar, 2019, 10:28:48 AM
    Author     : Divyanshu Bali
--%>

<%@page import="Model.Routes"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.hibernate.Query"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%!
    int routeNumber;
    String fromDest;
    String toDest;
    String arrival; 
    String departure; 
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>  

    <head>
        <meta charset="UTF-8">
        <title>Student-Dashboard</title>
        <link rel="stylesheet" type="text/css" href="css/student.css">

        <!-- DATATABLE EXTENSIONS -->
        <link rel="stylesheet" type="text/css" href="css/jquery.dataTables.css">
        <link rel="stylesheet" type="text/css" href="css/dataTables.responsive.css">
        <script src="js/jquery-3.3.1.js"></script>
        <script charset="utf-8" src="js/jquery.dataTables.js"></script>
        <script charset="utf-8" src="js/dataTables.responsive.js"></script>

    </head>
    <body>
        <div class="main">
            <div class = "left-pane">
                <div class="user-icon"> <img src="img\user-icon.png"> </div>
                <h2 class="client-name"> <%=session.getAttribute("username")%> </h2>
                
                <form action="LogoutServlet">
                    <input type="submit" class="logout" value="Logout"/> 
                </form>
                
            </div>
            <div class="right-pane">
                <span class="title"> Find buses below </span>
                <input type="text" name="search" placeholder="Search here" id="search">
                <br>
                <div class="tableData">
                    <table id="resultData" class="display">
                        <thead>
                            <tr>
                                <th>Route No.</th>
                                <th>From</th>
                                <th>To</th>
                                <th>Departure</th>
                                <th>Arrival</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
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
                               
                            %>

                            <tr>
                                <td><%=routeNumber%></td>
                                <td><%=fromDest%></td>
                                <td><%=toDest%></td>
                                <td><%=arrival%></td>
                                <td><%=departure%></td>
                            </tr>
                            <% }%>
                            <% session1.close();%>
                        
                        </tbody>
                    </table>
                </div>
            </div> 
        </div>
        <script src="js\table.js"></script>
    </body>

</html>