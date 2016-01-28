<%-- 
    Document   : reginsert
    Created on : Mar 25, 2012, 6:50:34 PM
    Author     : NISHIT
--%>

<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<html>
    
<%
   String name=request.getParameter("name");
   String uname=request.getParameter("uname");
   String pwd1=request.getParameter("pwd1");
   String pwd2=request.getParameter("pwd2");
   String email1=request.getParameter("email");
   String contact1=request.getParameter("contact");
   String address=request.getParameter("address");
   //String image1=request.getParameter("image");
   %>
   <%
  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection conn=DriverManager.getConnection("jdbc:odbc:hp","","");
   Connection conn1=DriverManager.getConnection("jdbc:odbc:hp","","");

Statement st=conn.createStatement();
Statement st1=conn1.createStatement();

String sql=("insert into reg(name,email,contact,address) values('"+name+"','"+email1+"','"+contact1+"','"+address+"')");
String sql1=("insert into login(uname,pass) values('"+uname+"','"+pwd1+"')");
  

st.executeUpdate(sql);
st1.executeUpdate(sql1);
conn.close();
conn1.close();

response.sendRedirect("index.jsp");
%>
    </body>
</html>
