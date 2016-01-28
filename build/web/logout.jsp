<%-- 
    Document   : logout
    Created on : Mar 25, 2012, 10:19:46 PM
    Author     : NISHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    session.invalidate();
    response.sendRedirect("index.jsp");
%>