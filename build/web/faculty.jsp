<%-- 
    Document   : faculty
    Created on : 28 Mar, 2019, 8:05:38 PM
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
        <title>Faculty-Dashboard</title>
        <link rel="stylesheet" type="text/css" href="css\student.css">

        <!-- DATATABLE EXTENSIONS -->
        <link rel="stylesheet" type="text/css" href="css/jquery.dataTables.css">
        <link rel="stylesheet" type="text/css" href="css/dataTables.responsive.css">
        <script src="js/jquery-3.3.1.js"></script>
        <script charset="utf-8" src="js/jquery.dataTables.js"></script>
        <script charset="utf-8" src="js/dataTables.responsive.js"></script>

        <!-- FONTAWESOME -->
        <link rel="stylesheet" type="text/css" href="css\font-awesome\css\font-awesome.min.css">

    </head>

    <body>
        <div class="main">
            <div class = "left-pane">
                <div class="user-icon"> <img src="img\user-icon.png"> </div>
                <h2 class="client-name"> <%=session.getAttribute("username")%> </h2>
                <form action="LogoutServlet">
                    <button class="logout"> Logout </button>
                </form>
            </div>
            <div class="right-pane">
                <span class="title"> Find buses below to edit or add new schedule </span>
                <input type="text" name="search" placeholder="Search here" id="search">
                <br>

                <button type="submit" name= "add" class="add-new-schedule"><a href="update.jsp" style="text-decoration: none; color: white;"> Add Schedule </a> </button>

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
                                <th>Update</th>
                                <th>Delete</th>

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
                                <td>
                                    <form action="NewInfo" method="get"> 
                                        <button name="route" value="<%=routeNumber%>"> 
                                            <i class="fa fa-edit"></i> 
                                        </button> 
                                    </form>
                                </td>

                                <td> 
                                    <form action="Delete" method="get"> 
                                        <button name="route" value="<%=routeNumber%>"> 
                                            <i class="fa fa-trash-o"></i>
                                        </button>
                                    </form>
                                </td>
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
