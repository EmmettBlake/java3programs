<%-- 
    Document   : index
    Created on : Feb 3, 2016, 6:27:36 PM
    Author     : Emmett
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page ="header.html" />
    <body>
        <c:choose>
            <c:when test="${cookie.containsKey('Fname')}">
                <h1> Hello ${cookie.Fname.value} </h1> 
                <p> If you are not ${cookie.Fname.value} </p>
                <a href ="/Registration/Register1.jsp" >Click Here to login </a>
            </c:when>
            <c:otherwise>
                <a href ="/Register1.jsp" >Click Here to Register </a>
                 
            </c:otherwise>
        </c:choose>
    
 
                  

    </body>
    <jsp:include page ="footer.html" />
</html>
