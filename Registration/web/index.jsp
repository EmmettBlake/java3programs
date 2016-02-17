<%-- 
    Document   : index
    Created on : Feb 3, 2016, 6:27:36 PM
    Author     : Emmett
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String uri = request.getRequestURI(); 
  uri = uri.substring(uri.lastIndexOf("/")+1); %>
<!DOCTYPE html>
<html>
    <jsp:include page ="header.html" />
    <body>
        <form action="Registration" method="post">
                <input type="hidden" name="page" value=${uri}>
        </form>
        <c:choose>
            <c:when test="${cookie.containsKey('Fname')}">
                <h1> Hello, welcome back ${cookie.Fname.value} ${cookie.Lname.value}</h1> 
                <p> If you are not ${cookie.Fname.value} </p>
                    <a href ="/Registration/Register1.jsp" >Click Here to login </a></p>
                <br>
                <h2>Interests</h2>
                <p><b>Music Genre:</b> ${cookie.musicGenre.value} </p>
                <p><b>Fiction Genre:</b> ${cookie.fictionGenre.value} </p>
                <p><b>Musician:</b> ${cookie.musician.value} </p>
                <p><b>Movie:</b> ${cookie.movie.value} </p>
                <p><b>TV Show:</b> ${cookie.tvshow.value} </p>
                <p><b>Book:</b> ${cookie.book.value} </p>
                <p><b>Sport:</b> ${cookie.sport.value} </p>
                <p><b>Sports Team:</b> ${cookie.sportsteam.value} </p>
                <p><b>Athlete:</b> ${cookie.athlete.value} </p>
                <p><b>Artist:</b> ${cookie.artist.value} </p>
                <a href ="/Registration/Register2.jsp" >Click Here to update interests </a></p>
                
            </c:when>
            <c:otherwise>
                <a href ="/Registration/Register1.jsp" >Click Here to Register </a>
                 
            </c:otherwise>
        </c:choose>
    
 
                  

    </body>
    <jsp:include page ="footer.html" />
</html>
