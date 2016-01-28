package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class aftlog_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <Title>Welcome !</title>\t\n");
      out.write("</head>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"Css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"ostyle.css\" />\t\n");
      out.write("\n");
      out.write("<body style=\"background-color:#FFFFFF\">\n");
      out.write("<div id=\"topsearch\" >\n");
      out.write("\t<ul id=\"menu\">\n");
      out.write("\t\t \n");
      out.write("          <FORM method=\"GET\" action=\"http://www.google.com/search\"> \n");
      out.write("             <TABLE bgcolor=\"#FFFFFF\">\n");
      out.write("                <tr><td>\n");
      out.write("               <INPUT TYPE=text name=q size=31 maxlength=255 value=\"\">\n");
      out.write("               <INPUT TYPE=hidden name=hl value=\"en\">\n");
      out.write("                <INPUT type=submit name=btnG VALUE=\"Search\">\n");
      out.write("                </td></tr>\n");
      out.write("            </TABLE>\n");
      out.write("         </FORM>\n");
      out.write("        </li>\n");
      out.write("\t</ul>\n");
      out.write("\n");
      out.write("\t<ul id=\"top_right_list\" class=\"nav\">\n");
      out.write("        <li><a href=\"index.jsp\"><strong>Home</strong></a></li>\n");
      out.write("\t\t<li ><a href=\"logout.jsp\"><strong>Logout</strong></a></li>\n");
      out.write("\t\t<li ><a href=\"feedback.jsp\"><strong>Give Feedback</strong></a></li>\n");
      out.write("                <li><a href=\"contct.jsp\"><strong>Contact Us</strong></a></li>\n");
      out.write("                <li><a href=\"AppletJsp.jsp\"><strong>App</strong></a></li>\n");
      out.write("\t     \n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("   <p>&nbsp;</p>\n");
      out.write("   <p>&nbsp;</p>\n");
      out.write("   <p>&nbsp;</p>\n");
      out.write("  <h2 align=\"center\" style=\"font-family:'Agency FB';color:black\">\n");
      out.write("           \n");
      out.write("           Welcome To House Plans<br/> ");
      out.print((String)session.getAttribute("usersession"));
      out.write("\n");
      out.write("           \n");
      out.write("</h2>\n");
      out.write("\n");
      out.write("           <br/><br/><br/><br/>\n");
      out.write("           <h3 align=\"center\" style=\"font-family:'Agency FB';color:black\">\n");
      out.write("               ---  Sorted By Categories  ---\n");
      out.write("           </h3>\n");
      out.write("           <br/><br/>\n");
      out.write("<center>\n");
      out.write("    <table border=\"0\" cellpadding=\"2\" style=\"font-family:'Agency FB'\">\n");
      out.write("        <tr >\n");
      out.write("        <center>   <th>\n");
      out.write("                Architectural Styles\n");
      out.write("            </th>\n");
      out.write("            <th>\n");
      out.write("                House Plans By Size\n");
      out.write("            </th>\n");
      out.write("            <th>\n");
      out.write("                Special Collections\n");
      out.write("            </th>\n");
      out.write("        </center>\n");
      out.write("        </tr>\n");
      out.write("        <tr style=\"font-family: 'Agency FB';font-weight: bold\">\n");
      out.write("            <td>\n");
      out.write("        <center>\n");
      out.write("            <a href=\"tide.html\"><img src=\"http://content.secondspace.com/p/hmp/1.0/c/img/CHA156-140px.jpg\"\twidth=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"tide.html\">Tidewater House Plans</a><br/>\n");
      out.write("                <a href=\"a-frame.html\"><img src=\"http://content.secondspace.com/p/hmp/1.0/c/img/SEA093-140px.jpg\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("                <a href=\"a-frame.html\">A-Frame House Plans</a><br/>\n");
      out.write("                <a href=\"bungalow.html\"><img src=\"http://content.secondspace.com/p/hmp/1.0/c/img/COR337-140px.jpg\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("                <a href=\"bungalow.html\">Bungalow House Plans</a><br/>\n");
      out.write("                <a href=\"capecod.html\"><img src=\"http://content.secondspace.com/p/hmp/1.0/c/img/FBA858-140px.jpg\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"capecod.html\">Cape Cod House Plans</a><br/>\n");
      out.write("                <a href=\"chalet.html\"><img src=\"http://content.secondspace.com/p/hmp/1.0/c/img/SEA012-140px.jpg\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"chalet.html\">Chalet Home Plans</a>\n");
      out.write("        </center>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            <center>\n");
      out.write("                <a href=\"onebed.html\"><img src=\"http://content.secondspace.com/p/hmp/1.0/c/img/AMA676-FR-RE-CO.jpg\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"onebed.html\">One Bedroom House Plans</a><br/>\n");
      out.write("                <a href=\"twobed.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/COR0/COR342/COR342-FR-RE-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("                <a href=\"twobed.html\">Two Bedroom House Plans</a><br/>\n");
      out.write("                <a href=\"threebed.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/HGA0/HGA128/HGA128-FR-RE-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("                <a href=\"three.html\">Three Bedroom House Plans</a><br/>\n");
      out.write("                <a href=\"fourbed.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/DGG5/DGG736/DGG736-FR-PH-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"fourbed.html\">Four Bedroom House Plans</a><br/>\n");
      out.write("                <a href=\"luxury.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/DSA0/DSA414/DSA414-FR-PH-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"luxury.html\">Luxury House Plans</a>\n");
      out.write("            </center>\n");
      out.write("            </td>\n");
      out.write("            <td>\n");
      out.write("            <center>\n");
      out.write("                <a href=\"master.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/FBA5/FBA514/FBA514-FR-RE-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"master.html\">Master Suite On Main Level House Plans</a><br/>\n");
      out.write("                <a href=\"green.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/SKA0/SKA008/SKA008-FR-PH-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("                <a href=\"green.html\">Green House Plans</a><br/>\n");
      out.write("                <a href=\"vacation.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/SEA0/SEA225/SEA225-FR-RE-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("                <a href=\"vacation.html\">Vacation House Plans</a><br/>\n");
      out.write("                <a href=\"southl.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/SLA0/SLA383/SLA383-FR-RE-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"southl.html\">Southern Living House Plans</a><br/>\n");
      out.write("                <a href=\"victorian.html\"><img src=\"http://images.builderhouseplans.com/common/plans/images/COR0/COR024/COR024-FR-PH-CO-LG.JPG\" width=\"150\" height=\"100\" alt=\"\"></a><br/>\n");
      out.write("\t\t<a href=\"victorian.html\">Victorian House Plans</a>\n");
      out.write("            </center>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("    </table>\n");
      out.write("</center>\n");
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>");
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
