<%-- 
    Document   : update
    Created on : 28 Mar, 2019, 9:01:04 PM
    Author     : Divyanshu Bali
--%>

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
                <form action="LogoutServlet">
                    <button class="logout"> Logout </button>
                </form>
            </div>

                <div class="right-pane">
                <div class="update-info">

                    <form name="update" method="get" action="UpdateServlet" onsubmit="return updateValidate()"> 

                        <div class="form-row">
                            <span class="title"> Bus Number </span>
                            <input type="text" name="busnumber" id="busnumber" placeholder="Bus Number">  
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> From </span>
                            <input type="text" name="from" id="from" placeholder="From"> 
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> To </span>
                            <input type="text" name="to" id="to" placeholder="To"> 
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> Arrival </span>
                            <input type="text" name="departure" id="departure" placeholder="Arrival"> 
                        </div>

                        <br>
                        <div class="form-row">
                            <span class="title"> Departure </span>
                            <input type="text" name="arrival" id="arrival" placeholder="Departure"> 
                        </div>

                        <div class="form-row" style="text-align: center">
                            <button type="submit" value="Update"> Update </button>
                        </div>
                        
                        <script>
                            function updateValidate() {
                                
                            }
                        </script>
                    </form>
                </div>
            </div> 
        </div>
    </body>

</html>