package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("<script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://jquery-itechcolumn.googlecode.com/files/jquery.kwicks-1.5.1.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $().ready(function() { \n");
      out.write("    $('#accordion-slider').kwicks({ \n");
      out.write("        max : 500, \n");
      out.write("        spacing : 2\n");
      out.write("    }); \n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("<title>Home</title>\n");
      out.write("<link type=\"text/css\" rel=\"stylesheet\" href=\"Css/style.css\">\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"ostyle.css\" />\t\n");
      out.write("</head>\n");
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
      out.write("\t<ul id=\"top_right_list\" class =\"nav\">\n");
      out.write("        <li ><a href=\"index.jsp\"><strong>Home</strong></a></li>\n");
      out.write("\t\t<li ><a href=\"log.htm\"><strong>Login</strong></a></li>\n");
      out.write("\t\t<li ><a href=\"reg.jsp\"><strong>Register</strong></a></li>\n");
      out.write("                <li><a href=\"contct.jsp\"><strong>Contact Us</strong></a></li>\n");
      out.write("         \n");
      out.write("\t     \n");
      out.write("\t</ul>\n");
      out.write("</div>\n");
      out.write("      \n");
      out.write("\n");
      out.write(" \n");
      out.write("   \n");
      out.write("   <p>&nbsp;</p>\n");
      out.write("   <p>&nbsp;</p>\n");
      out.write("   <p>&nbsp;</p>\n");
      out.write("   <h1 style=\"font-family:'Agency FB';color:black\">\n");
      out.write("           <center class=\"style2\">\n");
      out.write("             WELCOME TO HOUSE PLANS\n");
      out.write("           </center>\n");
      out.write("</h1>\n");
      out.write("\n");
      out.write("<div id=\"accordion-slider-wrap\">\n");
      out.write("<ul id=\"accordion-slider\">\n");
      out.write("<li><img src=\"1.jpg\" width=\"500\" height=\"300\" alt=\"Image Title\"/></li>\n");
      out.write("<li><img src=\"3.jpg\" width=\"500\" height=\"300\" alt=\"Image Title\"/></li>\n");
      out.write("<li><img src=\"4.jpg\" width=\"500\" height=\"300\" alt=\"Image Title\"/></li>\n");
      out.write("<li><img src=\"8.jpg\" width=\"500\" height=\"300\" alt=\"Image Title\"/></li>\n");
      out.write("<li><img src=\"5.jpg\" width=\"500\" height=\"300\" alt=\"Image Title\"/></li>\n");
      out.write("<li><img src=\"10.jpg\" width=\"500\" height=\"300\" alt=\"Image Title\"/></li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("       \n");
      out.write(" \n");
      out.write(" \n");
      out.write("<p class=\"style8\"><span class=\"style9\">WHY HousePlans ??</span> </p>\n");
      out.write("<p class=\"style6\"><span class=\"blueBoldType style10\"><strong>OUR GOAL</strong></span><span class=\"style17\" face=\"\"><span class=\"style15\"> is to make quality home design affordable by using the power of the Web to showcase and deliver world class house plans and floor plans. What was once a complex process of designing a home from the ground up is now a streamlined, easy to use method of searching award-winning architect designed home plans and floor plans. It's the smart alternative to designing a house from scratch. An original custom home plan can cost 15% or more of the construction budget, but we can save you thousands because the cost of each stock home plan is amortized over many sales and house plan customization is simplified. <span class=\"style18\">Houseplans.com</span> offers complete resources for your home building project including home plans, customized house plans, exclusive architect's house plans, land purchase, and financing.</span></span></p>\n");
      out.write("<p class=\"style12\"><span face=\"\"><span class=\"blueBoldType style10\"><strong>SEARCH</strong></span> our databank of <span class=\"style18\">thousands</span> of house plans - the largest inventory of home plans and floor plans on the Internet. Gather ideas for the custom home you want to build. We make it easy by grouping our home plans into floor plan collections and architectural styles.</span></p>\n");
      out.write("<p class=\"style12\"><span face=\"\"><span class=\"blueBoldType style10\"><strong>SAVE</strong></span> entire home plans or just the parts of house plansthat appeal and inspire your custom home design. For example, you may like the kitchen from one floor plan and the master bathroom from another floor plan, with HousePlans.com you can keep both in your account for easy reference.</span></p>\n");
      out.write("<p class=\"style12\"><span face=\"\"><span class=\"style10 blueBoldType\"><strong>REFINE</strong></span> your list of home design favorites and select the one home plan that best fits your criteria. Speak with one of our project advisors for additional advice on designing your custom home.</span></p>\n");
      out.write("\n");
      out.write("<p class=\"style12\"><span face=\"\"><span class=\"style10 blueBoldType\"><strong>CUSTOMIZE</strong></span> a home plan to suit your own situation and needs by adding the refinements you have gleaned from other house plans. Take advantage of <span class=\"style18\">Our Plan Customization Service</span> -- it makes customizing floor plans to your exact needs easy and affordable. We'll present you a fast and efficient Customizer Quote with thecost of your desired custom home designs. Our <span class=\"style18\">Instant Cost-to-Build&trade;</span> Reports make it easy to decide which house plan fits your budget. You'll have your customized pre-drawn floor plans in a few days, not the months you have to wait for original home plans. HousePlans.com is the easiest, most affordable way to get the custom house designs you're looking for.</span>\n");
      out.write("</p>\n");
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
