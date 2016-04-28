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
        <h1>Paper Maintenance</h1>
        <form action="ConfPaperServlet" method="post">  
        <label class="pad_top">Item Id:</label>
        <input type="text" name="confPaperId" value="${confPaper.confPaperId}" ><br>
        <label class="pad_top">Keywords:</label>
        <input type="text" name="keywords" value="${confPaper.keywords}"<br>
        <label class="pad_top">Subject</label>
        <input type="text" name="subject" value ="${confPaper.subject}"><br>
        <label class="pad_top">Title</label>
        <input type="text" name="title" value ="${confPaper.title}"><br>
        <label class="pad_top">Paper</label>
        <input type="text" name="paper" value ="${confPaper.paper}"><br>
        <label class="pad_top">Description:</label>
        <input type="text" name="itemDesc" value ="${catalog.itemDesc}"><br>   
        <input type="radio" name="function" value="R"> Read &nbsp;
        <input type="radio" name="function" value="A"> Add &nbsp;
        <input type="radio" name="function" value="U"> Change &nbsp;
        <input type="radio" name="function" value="D"> Delete &nbsp; <br>

        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>