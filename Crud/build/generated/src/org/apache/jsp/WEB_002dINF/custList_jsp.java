package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class custList_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Customer List</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <center>\n");
      out.write("    <div style=\"width:1200px;height:600px;overflow:scroll;border:2px solid black;background-color:lightblue\">\n");
      out.write("        <h2>Customer List</h2> \n");
      out.write("        <table width=\"1100\"border=\"1\" cellspacing=\"0\" cellpadding=\"10\">\n");
      out.write("            <tr bgcolor=\"cyan\"><th>First Name</th><th>Last Name</th><th>Address</th>\n");
      out.write("                <th>City</th><th>State</th><th>Street</th><th>Email</th>\n");
      out.write("              <th>Contact</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

             
                DB.DBConnect db=new DB.DBConnect();
                db.pstmt=db.con.prepareStatement("select * from stu_info");
                db.rst=db.pstmt.executeQuery();
                while(db.rst.next())
                {
                   
                // session.setAttribute("user","null");
                 //response.sendRedirect("AdminLogin.html");
                 
                 out.println("<tr><td>"+db.rst.getString(1)+"</td><td>"+db.rst.getString(2)+"</td><td>"+db.rst.getString(3)+"</td><td>"+db.rst.getString(4)+"</td><td>"+db.rst.getString(5)+"</td><td>"+db.rst.getString(6)+"</td><td>"+db.rst.getString(7)+"</td><td>"+db.rst.getString(8)+"</td><td>"+db.rst.getString(9)+"</td><td>"+db.rst.getString(10)+"</td></tr>");
                 
                }
                
              
      out.write("  \n");
      out.write("                \n");
      out.write("        </table>       \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</center>\n");
      out.write("    \n");
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
