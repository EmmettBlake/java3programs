<%-- 
    Document   : index
    Created on : Apr 13, 2016, 6:51:37 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Conference Wizard</h1>
        
        <br>
        <br>
        <table>
            <c:forEach items="${conferences}" var="conference">
                <tr>
                    <td><c:out value="${conference.confId}"/></td>
                    <td><c:out value="${conference.confName}"/></td>
                    <td><c:out value="${conference.startDate}"/></td>
                    <td><c:out value="${conference.endDate}"/></td>
                    <td><c:out value="${conference.cost}"/></td>
                <td><a href="/ConferenceWizard/ConfDetailServlet/${conference.confId}">View Details</a></td>
            </tr>
        </c:forEach>
        </table>
        <br>
        <h1> <b>Maintenance</b></h1>
        <a href="ConferenceWizard/PersonServlet">Person</a>&nbsp; 
        <a href="ConferenceWizard/ConferenceServlet">Conference</a>&nbsp;
        <a href="ConferenceWizard/ConfPaperServlet">Paper</a>&nbsp;
        <a href="ConferenceWizard/PresentationServlet">Presentation</a>&nbsp;
        <a href="ConferenceWizard/RoomSevlet">Room</a>
        
        
    </body>
</html>
