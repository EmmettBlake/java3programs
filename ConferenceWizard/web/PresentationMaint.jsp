<%-- 
    Document   : CatMaint
    Created on : Mar 23, 2016, 10:13:05 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Presentation Maintenance</h1>
        <form action="PresentationServlet" method="post">  
        <label class="pad_top">Presentation Id:</label>
        <input type="text" name="presentationId" value="${presentation.presentationId}" ><br>
        <label class="pad_top">Start Time:</label>
        <input type="text" name="startTime" value="${prettyStart}"<br>
        <label class="pad_top">End Time:</label>
        <input type="text" name="endTime" value ="${prettyEnd}"><br>
        <label class="pad_top">Title:</label>
        <input type="text" name="title" value ="${presentation.title}"><br>   
        <input type="radio" name="function" value="R"> Read &nbsp;
        <input type="radio" name="function" value="A"> Add &nbsp;
        <input type="radio" name="function" value="U"> Change &nbsp;
        <input type="radio" name="function" value="D"> Delete &nbsp; <br>

        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
