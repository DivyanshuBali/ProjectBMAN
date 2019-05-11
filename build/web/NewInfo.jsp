<%-- 
    Document   : NewInfo
    Created on : Mar 31, 2019, 12:21:55 PM
    Author     : Divyanshu
--%>

<%@page import="Model.Routes"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>  
    <head>
        <title> Update </title>
        <link rel="stylesheet" type="text/css" href="css\update.css">

    </head>
    <body>

        <div class="main">

            <div class = "left-pane">
                <div class="user-icon"> <img src="img\user-icon.png"> </div>

                <h2 class="client-name"> <%=session.getAttribute("username")%> </h2>

                <form action="logout">
                    <button class="logout"> Logout </button>
                </form>

            </div>

            <div class="right-pane">

                <div class="update-info">

                    <form name="update" method="post" action="NewData"> 

                        <div class="form-row">
                            <span class="title"> Bus Number </span>
                            <input type="text" name="busnumber" id="busnumber" value="<%= ((Routes) request.getAttribute("obj")).getRouteNumber()%>" placeholder="Bus Number">  
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> From </span>
                            <input type="text" name="from" id="from" value="<%= ((Routes) request.getAttribute("obj")).getFromDest()%>" placeholder="From"> 
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> To </span>
                            <input type="text" name="to" id="to" value="<%= ((Routes) request.getAttribute("obj")).getToDest()%>" placeholder="To"> 
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> Arrival </span>
                            <input type="text" name="departure" id="departure" value="<%= ((Routes) request.getAttribute("obj")).getDeparture()%>" placeholder="Arrival"> 
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> Departure </span>
                            <input type="text" name="arrival" id="arrival"  value="<%= ((Routes) request.getAttribute("obj")).getArrival()%>" placeholder="Departure"> 
                        </div>

                        <div class="form-row" style="text-align: center">
                            <button type="submit" value="Update"> Update </button>
                        </div>
                    </form>
                </div>
            </div> 
        </div>
    </body>

</html>