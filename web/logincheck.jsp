<%-- 
    Document   : logincheck
    Created on : Mar 25, 2012, 6:19:56 PM
    Author     : NISHIT
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.sql.*"%>

<%
String user=request.getParameter("username");
session.setAttribute( "usersession", user );
String pwd=request.getParameter("password");
 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
    Connection con=DriverManager.getConnection("jdbc:odbc:hp", "", ""); 
     Connection con1=DriverManager.getConnection("jdbc:odbc:hp", "", ""); 
           Statement st=con.createStatement();
            Statement st1=con.createStatement();
           ResultSet rs=st.executeQuery("select * from login where uname='"+user+"' and pass='"+pwd+"'");
int count=0;
                        
          while(rs.next())
          {

                   count++;
          }

                    if(count>0)
          {
            response.sendRedirect("aftlog.jsp");
          }
          else
          {
                       response.sendRedirect("log.htm?msg=Invalid Username or Password");
                       out.println("Invalid Username or Password");
          }

%>