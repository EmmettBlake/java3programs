<%-- 
    Document   : Display
    Created on : Jan 24, 2016, 9:52:40 PM
    Author     : Emmett
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display JSP Page</title>
    </head>
    <body>
        <h1>Display</h1>
            <label>Last Name:</label>
            <span>${user.lastName}</span><br> 
            <br>
            
            <label>First Name:</label>
            <span>${user.firstName}</span><br> 
            <br>
            <label>Email:</label>
            <span>${user.emailAddress}</span><br> 
            <br>
            

            
    </body>
</html>
