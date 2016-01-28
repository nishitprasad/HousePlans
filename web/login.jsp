<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ page contentType="text/html; charset=iso-8859-1" language="java" import="java.sql.*" errorPage="" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@page import="java.sql.*"%>;

<%public class Con
{
	public static void main(String[] args)
	{
		try
		{
			String user = request.getParameter("user");
			String pwd = request.getParameter("pwd");
			Class.forName('sun.jdbc.odbc.JdbcOdbcDriver).newInstance();
			
			Connection con = DriverManager.getConnection('jdbc:odbc:hp','','');

			Statement s = con.createStatement();

			s.executeQuery("select * from login where uname='"+user+"' and pass='"+pwd+"'");

			ResultSet rs = s.getResultSet();
			int count=0;

			while(rs.next())
			{
				count++;
			}
			if(count>0)
			{
				response.sendRedirect("start.html");
			}
			else
			{
				response.sendRedirect("log.htm?msg=Invalid Username or Password");
			}
		}
		catch(ClassNotFoundException exp)
		{
			System.err.println(exp);
		}
		catch(SQLException exp)
		{
			System.err.println(exp);
		}
	}
}
%>
