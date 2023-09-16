/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import DAO.OwnerDB;
import DAO.VisitorDB;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Owner;
import model.Visitor;

/**
 *
 * @author tuna
 */
public class loginServlet extends HttpServlet {

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
        request.getRequestDispatcher("login.jsp").forward(request, response);

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
        response.setContentType("text/html;charset=UTF-8");
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        String role = request.getParameter("role");
        String rem = request.getParameter("remember");
        
        //Tao 3 cookies
        Cookie cEmail = new Cookie("ce",email);
        Cookie cPass = new Cookie("cp",pass);
        Cookie cRem = new Cookie("cr",rem);
        if(rem!=null){
            //co chon
            cEmail.setMaxAge(60*60*24*7);//7 ngay
            cPass.setMaxAge(60*60*24*7);
            cRem.setMaxAge(60*60*24*7);
        }else{
            cEmail.setMaxAge(0);//7 ngay
            cPass.setMaxAge(0);
            cRem.setMaxAge(0);
        }
        //add cookies luu vao browser
        response.addCookie(cEmail);
        response.addCookie(cPass);
        response.addCookie(cRem);
        
        HttpSession session = request.getSession();
        session.setAttribute("role", role);
        if (role.equalsIgnoreCase("visitor")) {
            VisitorDB vdb = new VisitorDB();
            Visitor v = vdb.findVisitor(email, pass);
            if (v != null) {
                session.setAttribute("logined", v);
                request.getRequestDispatcher("home.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Login Visitor Fail!");
                processRequest(request,response);
            }
        } else {
            OwnerDB odb = new OwnerDB();
            Owner o = odb.findOwner(email, pass);
            if (o != null) {
                session.setAttribute("logined", o);
                request.getRequestDispatcher("home.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Login Owner Fail!");
                processRequest(request,response);
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
