<%-- 
    Document   : feed
    Created on : Mar 25, 2012, 10:28:50 PM
    Author     : NISHIT
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ page import="java.io.*" %>
<%@ page import="java.util.*" %>
<%
    String fd = request.getParameter("fdbck");
    String uname = (String)session.getAttribute("usersession");
%>
<%
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
  Connection con2 = DriverManager.getConnection("jdbc:odbc:hp","","");
  
  Statement s = con2.createStatement();
  
  String sql = "insert into feed(uname,fd) values ('"+uname+"','"+fd+"')";
  
  s.executeUpdate(sql);
  con2.close();
  response.sendRedirect("feedback.jsp");
  
%>