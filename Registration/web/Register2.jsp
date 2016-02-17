<%-- 
    Document   : Register2
    Created on : Feb 3, 2016, 6:49:31 PM
    Author     : Emmett
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% String uri = request.getRequestURI(); 
  uri = uri.substring(uri.lastIndexOf("/")+1); %>

<html>
    <jsp:include page ="header.html" />
    <body>
            <form action="Registration" method="post">
                <input type="hidden" name="page" value=<%=uri%>
                <label class="pad_top">Favorite Music Genre:</label>
                <input type="text" name="musicGenre" value=${cookie.musicGenre.value}
                       required><br>
                 <label class="pad_top">Favorite Fiction Genre:</label>
                 <input type="text" name="fictionGenre" value=${cookie.fictionGenre.value}
                        required><br>
                 <label class="pad_top">Favorite Musician:</label>
                 <input type="text" name="musician" value=${cookie.muscian.value}
                        required> <br>
                 <label class="pad_top">Favorite Movie:</label>
                 <input type="text" name="movie" value=${cookie.movie.value}
                        required><br>
                 <label class="pad_top">Favorite TV Show:</label>
                 <input type="text" name="tvshow" value=${cookie.tvshow.value}
                        required><br>
                 <label class="pad_top">Favorite Book:</label>
                 <input type="text" name="book" value=${cookie.book.value}
                        required><br>
                 <label class="pad_top">Favorite Sport:</label>                 
                 <input type="text" name="sport" value=${cookie.sport.value}
                        required><br>
                 <label class="pad_top">Favorite Sports Team:</label>
                 <input type="text" name="team" value=${cookie.sportsteam.value}
                        required><br> 
                 <label class="pad_top">Favorite Athlete:</label>
                 <input type="text" name="athlete" value=${cookie.athlete.value}
                        required><br> 
                 <label class="pad_top">Favorite Artist:</label>
                 <input type="text" name="artist" value=${cookie.artist.value}
                        required><br> 
                 <input type="submit" value="Submit" class="margin_left">
            </form>
    </body>
    <jsp:include page ="footer.html" />
</html>
<%--
    private String favorite_Genre_Music;
    private String favorite_Genre_Fiction;
    private String favorite_Sport;
    private String favorite_Musician;
    private String favorite_Movie;
    private String favorite_TV_Show;
    private String favorite_book;
    private String favorite_Team;
    private String favorite_Athlete;
    private String favorite_Artist;
 --%>