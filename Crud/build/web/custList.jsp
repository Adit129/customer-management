<%-- 
    Document   : custList
    Created on : 2 Feb, 2024, 1:25:49 AM
    Author     : shukl
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer List</title>
    </head>
    <body>
       <center>
           
    <div style="width:1200px;height:600px;overflow:scroll;border:2px solid black;background-color:lightblue">
       
        <h2>Customer List</h2> 
        <a href="Register.html"style="display: flex; margin-left: 3rem; text-decoration: none"><input type=Button value="Add Customer"></a>
        <table width="1100"border="1" cellspacing="0" cellpadding="10">
            <tr bgcolor="cyan"><th>First Name</th><th>Last Name</th><th>Address</th>
                <th>City</th><th>State</th><th>Street</th><th>Email</th>
              <th>Contact</th><th>Update</th><th>Delete</th>
            </tr>
            <%
             
                DB.DBConnect db=new DB.DBConnect();
                db.pstmt=db.con.prepareStatement("select * from customer");
                db.rst=db.pstmt.executeQuery();
                while(db.rst.next())
                {
                   
                // session.setAttribute("user","null");
                 //response.sendRedirect("AdminLogin.html");
                 
                 out.println("<tr><td>"+db.rst.getString(1)+"</td><td>"+db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td><td>"+db.rst.getString(4)+"</td><td>"+db.rst.getString(5)+"</td><td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td><td>"+db.rst.getString(8)+"</td><td><a href=updateCust.jsp?email="+db.rst.getString(7)+"><input type=Button value=Update></a></td>"
                   +"<td><a href=DeleteCust?email="+db.rst.getString(7)+"><input type=Button value=Delete></a></td>");  
       
                 
                }
                
              %>  
                
        </table>       
    </div>
    
</center>
    
    </body>
</html>
