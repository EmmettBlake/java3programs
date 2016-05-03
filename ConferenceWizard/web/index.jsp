<%-- 
    Document   : index
    Created on : May 2, 2016, 6:10:08 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <h1>Login Conference Wizard</h1>
        <form action="LoginServlet" method="post"> 
            <label class="pad_top">Email:</label>
            <input type="text" name="email" value="${email}" ><br>
            <label class="pad_top">Password:</label>
            <input type="password" name="password" value="${password}" ><br>
            <input type="submit" value="Submit" class="margin_left"><br>
            <font color="red"> ${message} </font>
            
            
        </form>
    <body>

    </body>
</html>
