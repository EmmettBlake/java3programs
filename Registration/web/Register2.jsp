<%-- 
    Document   : Register2
    Created on : Feb 3, 2016, 6:49:31 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page ="header.html" />
    <body>
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
    <jsp:include page ="footer.html" />
</html>
