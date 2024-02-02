<%-- 
    Document   : updateCust
    Created on : 3 Feb, 2024, 12:25:39 AM
    Author     : shukl
--%>

<%@page import="DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
    <div style="width:800px; height:600px;border:2px solid black; background-color: lightcyan">
        <h2>Update Customer</h2>
        <form action="updateCust">
            <%
              try{ 
                  
                  String email=request.getParameter("email");
                DBConnect db=new DBConnect();
                db.pstmt=db.con.prepareStatement("select * from customer where email=?");
                db.pstmt.setString(1,email);
                
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    
                %>
                
                <table width="500" height="400" cellspacing="30" >
       
            <tr><td>Email</td><td><input type="email" name="email" value= "<%=email %>"</td></tr> 
            <tr><td>First Name</td><td><input type="text" name="fname" value="<%=db.rst.getString(1)%>"</td></tr>
            <tr><td>Last Name</td><td><input type="text" name="last" value="<%=db.rst.getString(2)%>"</td></tr> 
             <tr><td>Address</td><td><input type="text" name="address" value="<%=db.rst.getString(3)%>"</td></tr> 
             <tr><td>City</td><td><input type="text" name="city" value="<%=db.rst.getString(4)%>"</td></tr> 
             <tr><td>State </td><td><input type="text" name="state" value="<%=db.rst.getString(5)%>"</td></tr> 
             <tr><td>Street</td><td><input type="text" name="street" value="<%=db.rst.getString(6)%>"</td></tr> 
             <tr><td> Phone</td><td><input type="tel" name="phone" value="<%=db.rst.getString(8)%>"</td></tr> 
             
             <tr><td><input type="submit" value="Submit"></td><td><input type="reset" Value="Reset"></td></tr> 
            
            
        </table>
                <%
                }}
              catch(Exception e)
              {
                  e.printStackTrace();
              }
                %>
        </form>
    </div>
</center>
    </body>
</html>
