<%-- 
    Document   : CatMaint
    Created on : Mar 23, 2016, 10:13:05 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<fmt:formatDate value="${conference.startDate}" var="formattedStartDate" 
                type="date" pattern="MM-dd-yyyy" />
<fmt:formatDate value="${conference.startDate}" var="formattedEndDate" 
                type="date" pattern="MM-dd-yyyy" />

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Catalog Maintenance</h1>
        <form action="ConfPaperServlet" method="post">  
        <label class="pad_top">Conference Id:</label>
        <input type="text" name="confId" value="${conference.confId}" ><br><br>
        <label class="pad_top">Conference Name:</label>
        <input type="text" name="confName" value="${conference.confName}"><br><br>
        <label class="pad_top">Cost:</label>
        <input type="text" name="cost" value ="${conference.cost}"><br><br>
        <label class="pad_top">Start Date:</label>
        <input id="startdate" name="stardate" type="date"><br><br>
        <label class="pad_top">End Date:</label>
        <input id="endate" name="endDate" type="date" ><br><br>
        <input type="radio" name="function" value="R"> Read &nbsp;
        <input type="radio" name="function" value="A"> Add &nbsp 
        <input type="radio" name="function" value="U"> Change &nbsp;
        <input type="radio" name="function" value="D"> Delete &nbsp; <br><br>
        
        div
        <label>&nbsp;</label>
        <input type="submit" value="Submit" class="margin_left">
    </form>
    </body>
</html>
