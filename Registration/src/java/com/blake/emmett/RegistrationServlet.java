/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blake.emmett;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Emmett
 */
public class RegistrationServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrationServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet RegistrationServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String page;
        userBean user = new userBean();
        UserInterestsBean interests = new UserInterestsBean();
        
        page = request.getParameter("page");
        
        HttpSession session = request.getSession();
        
        if (page.contentEquals("Register1.jsp")) {
            user.setFirstName(request.getParameter("firstName"));
            user.setLastName(request.getParameter("lastName"));
            user.setEmailAddress(request.getParameter("emailAddress"));

            request.setAttribute("user", user);

            Cookie Fname_cookie = new Cookie("Fname", user.getFirstName());
            Fname_cookie.setPath("/");
            Fname_cookie.setMaxAge(60*60*24);
            //Fname_cookie.setMaxAge(0);
            Cookie Lname_cookie = new Cookie("Lname", user.getLastName());
            Lname_cookie.setPath("/");
            Lname_cookie.setMaxAge(60*60*24);

            Cookie email_cookie = new Cookie("emailAddress", user.getEmailAddress());
            email_cookie.setPath("/");
            email_cookie.setMaxAge(60*60*24);

            response.addCookie(email_cookie);
            response.addCookie(Lname_cookie);
            response.addCookie(Fname_cookie);

            session.setAttribute("user", user);
            
            getServletContext()
                .getRequestDispatcher("/Register2.jsp")
                .forward(request, response);
            
        } else {
            if (page.contentEquals("Register2.jsp")) {
                interests.setFavorite_Genre_Music(request.getParameter("musicGenre"));
                interests.setFavorite_Genre_Fiction(request.getParameter("fictionGenre"));
                interests.setFavorite_Musician(request.getParameter("musician"));
                interests.setFavorite_Movie(request.getParameter("movie"));
                interests.setFavorite_TV_Show(request.getParameter("tvshow"));
                interests.setFavorite_book(request.getParameter("book"));
                interests.setFavorite_Sport(request.getParameter("sport"));
                interests.setFavorite_Team(request.getParameter("team"));
                interests.setFavorite_Athlete(request.getParameter("athlete"));
                interests.setFavorite_Artist(request.getParameter("artist"));
                
                request.setAttribute("interests", interests);
                
                Cookie musicGenre_cookie = new Cookie("musicGenre", interests.getFavorite_Genre_Music());
                musicGenre_cookie.setPath("/");
                musicGenre_cookie.setMaxAge(60*60*24); 
            
                Cookie fictionGenre_cookie = new Cookie("fictionGenre", interests.getFavorite_Genre_Fiction());
                fictionGenre_cookie.setPath("/");
                fictionGenre_cookie.setMaxAge(60*60*24); 
                
                Cookie musician_cookie = new Cookie("musician", interests.getFavorite_Musician());
                musician_cookie.setPath("/");
                musician_cookie.setMaxAge(60*60*24); 
                
                Cookie movie_cookie = new Cookie("movie", interests.getFavorite_Movie());
                movie_cookie.setPath("/");
                movie_cookie.setMaxAge(60*60*24); 
                
                Cookie tvShow_cookie = new Cookie("tvshow", interests.getFavorite_TV_Show());
                tvShow_cookie.setPath("/");
                tvShow_cookie.setMaxAge(60*60*24); 
                
                Cookie book_cookie = new Cookie("book", interests.getFavorite_book());
                book_cookie.setPath("/");
                book_cookie.setMaxAge(60*60*24); 
                
                Cookie sport_cookie = new Cookie("sport", interests.getFavorite_Sport());
                sport_cookie.setPath("/");
                sport_cookie.setMaxAge(60*60*24); 
                
                Cookie sportsTeam_cookie = new Cookie("sportsteam", interests.getFavorite_Team());
                sportsTeam_cookie.setPath("/");
                sportsTeam_cookie.setMaxAge(60*60*24); 
                
                Cookie athlete_cookie = new Cookie("athlete", interests.getFavorite_Athlete());
                athlete_cookie.setPath("/");
                athlete_cookie.setMaxAge(60*60*24); 
                
                Cookie artist_cookie = new Cookie("artist", interests.getFavorite_Artist());
                artist_cookie.setPath("/");
                artist_cookie.setMaxAge(60*60*24); 
                
                response.addCookie(musicGenre_cookie);
                response.addCookie(fictionGenre_cookie);
                response.addCookie(tvShow_cookie);
                response.addCookie(musician_cookie);
                response.addCookie(movie_cookie);
                response.addCookie(tvShow_cookie);
                response.addCookie(book_cookie);
                response.addCookie(sport_cookie);
                response.addCookie(sportsTeam_cookie);
                response.addCookie(athlete_cookie);
                response.addCookie(artist_cookie);
                
                request.setAttribute("interests", interests);
                
                session.setAttribute("interests", interests);
                
                getServletContext()
                    .getRequestDispatcher("/index.jsp")
                    .forward(request, response);
            }
        }

                

        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
