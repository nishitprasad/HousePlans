<%-- 
    Document   : feedback
    Created on : Mar 25, 2012, 10:54:39 PM
    Author     : NISHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>FEEDBACK</title>
        
</script>
<link type="text/css" rel="stylesheet" href="Css/style.css"/>
<link rel="stylesheet" type="text/css" href="ostyle.css" />	
</head>

<body style="background-color:#FFFFFF">
       
   <%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %> 
<div id="topsearch" >
	<ul id="menu">
		 
          <FORM method="GET" action="http://www.google.com/search"> 
             <TABLE bgcolor="#FFFFFF">
                <tr><td>
               <INPUT TYPE=text name=q size=31 maxlength=255 value="">
               <INPUT TYPE=hidden name=hl value="en">
                <INPUT type=submit name=btnG VALUE="Search">
                </td></tr>
            </TABLE>
         </FORM>
        </li>
	</ul>

	<ul id="top_right_list" class ="nav">
         <li><a href="index.jsp"><strong>Home</strong></a></li>
		<li ><a href="logout.jsp"><strong>Logout</strong></a></li>
		<li ><a href="reg.jsp"><strong>Register</strong></a></li>
                <li ><a href="feedback.jsp"><strong>Feedback</strong></a></li>
                <li><a href="contct.jsp"><strong>Contact Us</strong></a></li>
	     
	</ul>
</div>
    


   <br/>
   <br/>
   <h1 style="font-family:'Agency FB';color:black">
           <center>
                FEEDBACK
                <br/>
                <br/>
                <img src="http://www.learning3pointzero.com/wp-content/uploads/2010/05/feedbackBox.jpg" width="350" height="300"/>
           </center>
</h1>
   
   
<br/><br/><br/>
   
<center>
   <form name="post" action="feed.jsp" method="post">
       <table border="0">
               <tr>
                   <td style="font-family:'Agency FB'">
                       <strong>Your Feedback</strong>
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                   </td>
                   <td>
                       <textarea name="fdbck" rows="5" columns="10">

                       </textarea>
                   </td>
               </tr>
           </table>
       <br/>
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
       <input type="submit" name="post" style="font-family: 'Agency FB';" value="POST"/>
      </form>
</center>

<br/><br/><br/>
<body>
<center><TABLE cellpadding="15" cellspacing="20" style="font-weight: bold;font-family: 'Agency FB';background-color: black;color:white">
<tr>
    <th>
        USERS
    </th>
    <th>
        THEIR FEEDBACK
    </th>
</tr>
<tr>
    
</tr>
<%

Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
Connection conn2 = DriverManager.getConnection("jdbc:odbc:hp", "root", "root");
Statement st = conn2.createStatement();
ResultSet rs = st.executeQuery("SELECT * from feed");
%>
<%
while (rs.next()) {
%>

<TR>
<TD><%=rs.getString(1)%></TD>
<TD><%=rs.getString(2)%></TD>
</TR></center>

<% } %>
<%
// close all the connections.
rs.close();
st.close();
conn2.close();
%>

</TABLE>
<br/>
<br/>
</font>
</body>
</html>