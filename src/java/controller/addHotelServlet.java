/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import DAO.HotelDB;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.Hotel;
import model.Owner;

/**
 *
 * @author vohuy
 */
@MultipartConfig(maxFileSize = 1024 * 1024 * 5, maxRequestSize = 1024 * 1024 * 20)
public class addHotelServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("name");
        String describe = request.getParameter("describe");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");
        int pricemax = Integer.parseInt(request.getParameter("pricemax"));
        int pricemin = Integer.parseInt(request.getParameter("pricemin"));
        String restaurant = request.getParameter("restaurant") == null ? "n" : "y";
        String gym = request.getParameter("gym") == null ? "n" : "y";
        String pool = request.getParameter("pool") == null ? "n" : "y";
        String pet = request.getParameter("pet") == null ? "n" : "y";
        String bar = request.getParameter("bar") == null ? "n" : "y";
        String sauna = request.getParameter("sauna") == null ? "n" : "y";
        Owner owner = (Owner) request.getSession().getAttribute("logined");
        HotelDB hoteldb = new HotelDB();

//        String directoryPath =  ++ "/";
//        File directory = new File(directoryPath);
//        directory.mkdirs();
        String applicationPath = request.getServletContext().getRealPath("");
        String directoryPath = applicationPath + "style\\img\\" + hoteldb.getPlace() + "\\";
        System.out.println(directoryPath);
        File fileSaveDir = new File(directoryPath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdirs();
        }
        saveImage(request.getPart("background"), "background", directoryPath);
        saveImage(request.getPart("image1"), "image1", directoryPath);
        saveImage(request.getPart("image2"), "image2", directoryPath);
        saveImage(request.getPart("image3"), "image3", directoryPath);
        saveImage(request.getPart("image4"), "image4", directoryPath);

        Hotel hotel = new Hotel(0, owner.getOID(), name, describe, address, phone, pricemax, pricemin, restaurant, gym, pool, pet, bar, sauna,
                "background.jpg", "image1.jpg", "image2.jpg", "image3.jpg", "image4.jpg");

        hoteldb.addHotel(hotel);
        response.sendRedirect("add.jsp");
    }

    private void saveImage(Part part, String fileName, String IMAGE_DIRECTORY) throws IOException {
        if (part != null && part.getSize() > 0 && part.getContentType().startsWith("image/")) {
            String originalFileName = part.getSubmittedFileName();
            String extension = originalFileName.substring(originalFileName.lastIndexOf("."));
            String newFileName = fileName + extension;
            part.write(IMAGE_DIRECTORY + newFileName);
        }
    }

}
