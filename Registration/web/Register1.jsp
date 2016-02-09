<%-- 
    Document   : Register1
    Created on : Feb 3, 2016, 6:47:50 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page ="header.html" />
    <body>
            <form action="Registration" method="post">
                <label class="pad_top">First Name:</label>
                <input type="text" name="firstName" required><br>
                 <label class="pad_top">Last Name:</label>
                 <input type="text" name="lastName" required><br>
                 <label class="pad_top">Email Address:</label>
                <input type="email" name="emailAddress" required><br>
                <input type="submit" value="Submit" class="margin_left">
            </form>
    </body>
    <jsp:include page ="footer.html" />
</html>
