/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javaee.conferencewizard.db;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Emmett
 */
public class ConferenceServlet extends HttpServlet {

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
            out.println("<title>Servlet ConferenceServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ConferenceServlet at " + request.getContextPath() + "</h1>");
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
                getServletContext().getRequestDispatcher("/ConfMaint.jsp").forward(request, response);

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
        String strCost;
        String strStartDate;
        String strEndDate;
        String strConfId;
        
        SimpleDateFormat mdyFormat = new SimpleDateFormat("MM-dd-yyyy");

        Conference conference = new Conference();
        
        conference.setConfName(request.getParameter("confName"));
        strCost = request.getParameter("cost");
        if ((strCost.matches(".\\d\\.\\d\\d"))) {
            conference.setCost(Double.parseDouble(strCost));
        } else {
            conference.setCost(0.0d);
        }
        
        strStartDate = request.getParameter("startDate");
        if (!strStartDate.isEmpty()) {
            try {
                conference.setStartDate(mdyFormat.parse(strStartDate));
            }catch (ParseException PE) {
                System.out.println("Bad Start Date Format " + PE.getMessage());
                return;
            }
        }

        strEndDate = request.getParameter("endDate");
        if (!strEndDate.isEmpty()){
            try {
                conference.setEndDate(mdyFormat.parse(strEndDate));
            }catch (ParseException PE) {
                System.out.println("Bad End Date Format " + PE.getMessage());
                return;
            }
        }
        
        switch(function.toUpperCase()){
            case "A":
                conference.add();
                break;
            case "C":
                strConfId = request.getParameter("confId");
                if (!strConfId.isEmpty()){
                    conference.setConfId(Long.parseLong(strConfId));
                }
                conference.change();
                break;
            case "D":
                strConfId = request.getParameter("confId");
                if (!strConfId.isEmpty()){
                    conference.setConfId(Long.parseLong(strConfId));
                }
                conference.delete();
                break;
            case "R":
                conference = Conference.read(conference.getConfName());
                break;
            
        }
        request.setAttribute("conference", conference);
        //processRequest(request, response);
        getServletContext().getRequestDispatcher("/ConfMaint.jsp").forward(request, response);
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
