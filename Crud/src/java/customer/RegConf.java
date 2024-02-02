

package customer;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class RegConf extends HttpServlet {

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
           
    String fname=request.getParameter("fname");
    String lname=request.getParameter("lname");
    String street=request.getParameter("street");
    String address=request.getParameter("address");
    String city=request.getParameter("city");
    String state=request.getParameter("state");
    String email=request.getParameter("email");
    String number=request.getParameter("number");
   
    DB.DBConnect db=new DB.DBConnect();
  
        db.pstmt=db.con.prepareStatement("insert into customer (firstname,lastname,address,city,state,street,email,phone)values(?,?,?,?,?,?,?,?)");
        db.pstmt.setString(1,fname);
        db.pstmt.setString(2,lname);
        db.pstmt.setString(3,address);
        db.pstmt.setString(4,city);
        db.pstmt.setString(5,state);
        db.pstmt.setString(6,street);
        db.pstmt.setString(7,email);
        db.pstmt.setString(8,number);
      
       int i1=db.pstmt.executeUpdate();
      
     if(i1>0)
     {
         response.sendRedirect("custList.jsp?msg=User Registered Succesfully");
     }
     else
         out.println("Error in Registration");
   }
        catch(Exception e)
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
