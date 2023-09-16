/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import DAO.OwnerDB;
import DAO.VisitorDB;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Account;
import model.Owner;
import model.Visitor;

/**
 *
 * @author tuna
 */
public class addAccount extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet addAccount</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet addAccount at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        request.getRequestDispatcher("registed.jsp").include(request, response);
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
        response.setContentType("text/html;charset=UTF-8");
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String gender = request.getParameter("gender");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String role = request.getParameter("role");

        Account a = new Account(name, age, gender, email, password, address, role);

        if (role.equalsIgnoreCase("visitor")) {
            VisitorDB vdb = new VisitorDB();
            Visitor vCheck = vdb.findVisitor(email, password);
            if (vCheck != null) {
                request.setAttribute("MSG", "Email Available!");
                request.getRequestDispatcher("registed.jsp").include(request, response);
            } else {
                Visitor v = new Visitor(a.getName(), a.getAge(), a.getGender(), a.getEmail(), a.getPassword(), a.getAddress());
                Visitor vNew = vdb.newVisitor(v);
                request.getRequestDispatcher("login").include(request, response);
            }

        } else {
            OwnerDB odb = new OwnerDB();
            Owner oCheck = odb.findOwner(email, password);
            if (oCheck != null) {
                request.setAttribute("MSG", "Email Available!");
                request.getRequestDispatcher("registed.jsp").include(request, response);
            } else {
                Owner o = new Owner(a.getName(), a.getAge(), a.getGender(), a.getEmail(), a.getPassword(), a.getAddress());
                Owner oNew = odb.newOwner(o);
                request.getRequestDispatcher("login").include(request, response);
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
