<%-- 
    Document   : attendees
    Created on : Apr 25, 2016, 8:16:51 PM
    Author     : ghostbob
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Attendees List!</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <table>
        <c:forEach items="${attendees}" var="attendee">
            <tr>
                <td><c:out value="${attendee.personId}"/></td>
                <td><c:out value="${attendee.firstName}"/></td>
                <td><c:out value="${attendee.lastName}"/></td>
                <td><a href="/ConferenceWizard/AttendeeServlet/${attendee.personId}">View Details</a></td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
