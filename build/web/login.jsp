<%-- 
    Document   : login
    Created on : 26 Mar, 2019, 2:09:20 PM
    Author     : Divyanshu Bali
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <link rel="stylesheet" type="text/css" href="css/animate.css">
    </head>
    <body>


        <!-- NAVBAR -->
        <div class = "nav">
            <img src="img\bus_icon.png"> 
            Bus Management
        </div>

        <br><br>

        <!-- MAIN DIV -->
        <div class="container"> 
            <form name="loginForm" method="post" action="LoginServlet" onsubmit="return loginValidate()">

                <div class="form-title-row"> 
                    <h1> Sign in to your account </h1> 
                </div>

                <br>
                <div class="form-row">
                    <span id="uname"> Username </span>
                    <input type="text" name="username" id="username" placeholder="Username"> 
                </div>

                <br>
                <div class="form-row">
                    <span id="pass"> Password </span>
                    <input type="password" name="password" id="password"  placeholder="Password"> 
                </div>

                <br>
                <div class="form-row">
                    <span id="acc-type"> Account Type </span>
                    <select name="type" class="select-box" id="select-type">
                        <option value="student" default> Student </option>
                        <option value="faculty"> Faculty </option>
                        <option value="staff"> Staff</option>
                    </select> 
                </div>

                <br><br>
                <div class="form-row">
                    <button type="submit" name="submit" value="Submit"> Login </button> 
                </div>
                <script>
                    function loginValidate() {
                        var username_value = document.forms["loginForm"]["username"].value;
                        var password_value = document.forms["loginForm"]["password"].value;
                        var flag = true;

                        if (username_value == "") {
                            document.getElementById("uname").classList.add('animated', 'shake');
                            document.getElementById("uname").style.color = "rgb(200, 0, 0)";
                            document.getElementById("username").style.borderColor = "rgb(200, 0, 0)";
                            document.getElementById("username").style.color = "rgb(200, 0, 0)";  
                            document.getElementById("username").classList.add('animated', 'shake');
                            document.getElementById("username").placeholder = "Cannot be empty";
                            
                            setTimeout(function () {
                                document.getElementById("uname").classList.remove('animated', 'shake');
                                document.getElementById("username").classList.remove('animated', 'shake');
                            }, 1000)
                            flag = false;
                        }
                        if (password_value == "") {
                            document.getElementById("pass").style.color = "rgb(200, 0, 0)";
                            document.getElementById("password").style.borderColor = "rgb(200, 0, 0)";
                            document.getElementById("password").style.color = "rgb(200, 0, 0)";
                            document.getElementById("pass").classList.add('animated', 'shake');
                            document.getElementById("password").classList.add('animated', 'shake');
                            document.getElementById("password").placeholder = "Cannot be empty";
                            
                            setTimeout(function () {
                                document.getElementById("password").classList.remove('animated', 'shake');
                                document.getElementById("pass").classList.remove('animated', 'shake');
                            }, 1000)
                            
                            flag = false;
                        }
                        return flag;
                    }

                </script>
            </form>
        </div>



    </body>

</html>
