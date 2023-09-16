/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import DAO.CommentDB;
import DAO.FeedbackDB;
import DAO.HotelDB;
import DAO.OwnerDB;
import DAO.VisitorDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Comment;
import model.Feedback;
import model.Hotel;
import model.Owner;
import model.Visitor;

/**
 *
 * @author tuna
 */
public class detailServlet extends HttpServlet {

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
        String hotelIdParam = request.getParameter("hID");
        if(hotelIdParam != null) {
            int hotelID = Integer.parseInt(hotelIdParam);
            HotelDB db = new HotelDB();
            Hotel h = db.findById(hotelID);
            request.getSession().setAttribute("hInfo", h);
            
            OwnerDB odb = new OwnerDB();
            Owner oHotel = odb.findOById(h.getOID());
            request.getSession().setAttribute("oHotel", oHotel);
            
            FeedbackDB fdb = new FeedbackDB();
            ArrayList<Feedback> fList = fdb.findById(hotelID);
            request.getSession().setAttribute("fList", fList);
            
            CommentDB cdb = new CommentDB();
            ArrayList<Comment> cList = cdb.findByHId(hotelID);
            request.getSession().setAttribute("cList", cList);
            
            request.getRequestDispatcher("detail.jsp").forward(request, response);
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
