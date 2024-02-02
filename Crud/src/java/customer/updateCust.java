/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shukl
 */
public class updateCust extends HttpServlet {

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
           String email=request.getParameter("email");
           String fname=request.getParameter("fname");
           String lname=request.getParameter("last");
           String address=request.getParameter("address");
           String city=request.getParameter("city");
           String state=request.getParameter("state");
           String street=request.getParameter("street");
             String phone=request.getParameter("phone");
           DB.DBConnect db= new DB.DBConnect();
           db.pstmt=db.con.prepareStatement("update customer set firstname=?,lastname =?, address=?, city=?, state=?, street =?, phone=? where email=? ");
           db.pstmt.setString(1,fname);
           db.pstmt.setString(2,lname);
           db.pstmt.setString(3,address);
           db.pstmt.setString(4,city);
           db.pstmt.setString(5,state);
           db.pstmt.setString(6,street);
         db.pstmt.setString(7,phone);
         db.pstmt.setString(8, email);
         int i=db.pstmt.executeUpdate();
         if(i>0)
         {
             response.sendRedirect("custList.jsp");
         }
           
        }catch(Exception e)
        {
            e.printStackTrace();
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
