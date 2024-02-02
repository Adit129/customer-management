package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DB.DBConnect;

public final class updateCust_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <center>\n");
      out.write("    <div style=\"width:800px; height:600px;border:2px solid black; background-color: lightcyan\">\n");
      out.write("        <h2>Update Customer</h2>\n");
      out.write("        <form action=\"updateCust\">\n");
      out.write("            ");

              try{ 
                  
                  String email=request.getParameter("email");
                DBConnect db=new DBConnect();
                db.pstmt=db.con.prepareStatement("select * from customer where email=?");
                db.pstmt.setString(1,email);
                
                db.rst=db.pstmt.executeQuery();
                if(db.rst.next())
                {
                    
                
      out.write("\n");
      out.write("                \n");
      out.write("                <table width=\"500\" height=\"400\" cellspacing=\"30\" >\n");
      out.write("       \n");
      out.write("            <tr><td>Email</td><td><input type=\"email\" name=\"email\" value= ");
      out.print(email );
      out.write("></td></tr> \n");
      out.write("            <tr><td>First Name</td><td><input type=\"text\" name=\"fname\" value=\"");
      out.print(db.rst.getString(1));
      out.write("</td></tr>\n");
      out.write("            <tr><td>Last Name</td><td><input type=\"text\" name=\"last\" value=\"");
      out.print(db.rst.getString(2  ));
      out.write("</td></tr> \n");
      out.write("             <tr><td>Address</td><td><input type=\"text\" name=\"address\" value=\"");
      out.print(db.rst.getString(3));
      out.write("</td></tr> \n");
      out.write("             <tr><td>City</td><td><input type=\"text\" name=\"city\" value=\"");
      out.print(db.rst.getString(4));
      out.write("</td></tr> \n");
      out.write("             <tr><td>State </td><td><input type=\"text\" name=\"state\" value=\"");
      out.print(db.rst.getString(5));
      out.write("</td></tr> \n");
      out.write("             <tr><td>Street</td><td><input type=\"text\" name=\"street\" value=\"");
      out.print(db.rst.getString(6));
      out.write("</td></tr> \n");
      out.write("             <tr><td> Phone</td><td><input type=\"tel\" name=\"phone\" value=\"");
      out.print(db.rst.getString(7));
      out.write("</td></tr> \n");
      out.write("             \n");
      out.write("             <tr><td><input type=\"submit\" value=\"Submit\"></td><td><input type=\"reset\" Value=\"Reset\"></td></tr> \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("                ");

                }}
              catch(Exception e)
              {
                  e.printStackTrace();
              }
                
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</center>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
