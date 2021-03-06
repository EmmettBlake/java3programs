/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author CELEDONIO
 */
public class ConfPaperServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ConfPaperServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConfPaperServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

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
        String function = request.getParameter("function");
        String strPaperId;
        ConfPaper confPaper= new ConfPaper();
        confPaper.setDescription(request.getParameter("description"));
        confPaper.setKeywords(request.getParameter("keywords"));
        confPaper.setTitle(request.getParameter("title"));
        confPaper.setSubject(request.getParameter("subject"));
        confPaper.setPaper(request.getParameter("paper"));
         switch (function) {
            case "A":
                confPaper.add();
                break;
            case "U":
                strPaperId = request.getParameter("confPaperId");
                confPaper.setConfPaperId(Long.parseLong(strPaperId));
                confPaper.change();
                break;
            case "D":
                strPaperId = request.getParameter("confPaperId");
               confPaper.setConfPaperId(Long.parseLong(strPaperId));
               confPaper.delete();
                break;
            case "R":
                String strId = request.getParameter("confPaperId");
                
                confPaper.setConfPaperId(Long.parseLong(strId));
                confPaper = ConfPaper.read(confPaper.getConfPaperId());
                
                break;
        }
        request.setAttribute("confPaper", confPaper);
        getServletContext().getRequestDispatcher("/PaperMaint.jsp").forward(request, response);
        
         
        
        processRequest(request, response);
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
