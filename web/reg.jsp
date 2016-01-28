<%-- 
    Document   : reg
    Created on : Mar 25, 2012, 8:06:37 PM
    Author     : NISHIT
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>
<script type="text/javascript" src="http://jquery-itechcolumn.googlecode.com/files/jquery.kwicks-1.5.1.js"></script>
<script type="text/javascript">
    $().ready(function() { 
    $('#accordion-slides').kwicks({ 
        max : 500, 
        spacing : 2
    }); 
});
</script>
<title>Home</title>
<link type="text/css" rel="stylesheet" href="Css/style.css">
<link rel="stylesheet" type="text/css" href="ostyle.css" />	
</head>

<body style="background-color:#FFFFFF">
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
        
		<img src="Images/magnifier.png"  />
        
	</li>
	</ul>

	<ul id="top_right_list" class ="nav">
        <li ><a href="index.jsp"><strong>Home</strong></a></li>
		<li ><a href="log.htm"><strong>Login</strong></a></li>
		<li ><a href="reg.jsp"><strong>Register</strong></a></li>
         <li><a href="Contact.php"><strong>Contact Us</strong></a></li>
         
	     
	</ul>
</div>
      

   
   <p>&nbsp;</p>
   <p>&nbsp;</p>
   <p>&nbsp;</p>
   <h2 style="font-family:'Agency FB';color:black">
           <center class="style2">
             PLEASE REGISTER
           </center>
    </h2>
  
<div id="accordion-slides-wrap">
<ul id="accordion-slides">
<li><img src="1.jpg" width="500" height="300" alt="Image Title"/></li>
<li><img src="3.jpg" width="500" height="300" alt="Image Title"/></li>
<li><img src="4.jpg" width="500" height="300" alt="Image Title"/></li>
<li><img src="8.jpg" width="500" height="300" alt="Image Title"/></li>
<li><img src="5.jpg" width="500" height="300" alt="Image Title"/></li>
<li><img src="10.jpg" width="500" height="300" alt="Image Title"/></li>
</ul>
</div>


 


    <div id="content" class="rar">
	<form action="reginsert.jsp" method="post"  >
            <center><h2 style="font-family: 'Agency FB'">HOUSE PLANS</h2></center>
            <br/><br/>
        <center>
	<table cellpadding="5">
	
        <tr>
	<td>Your Full Name</td>
        <td><input type="text" value="" name="name" /></td>
	</tr>
        
        <tr>
	<td>Your Desired User Name(for login)</td>
        <td><input type="text" value="" name="uname" /></td>
	</tr>
        
        <tr>
	<td>Password</td>
        <td><input type="password" value="" name="pwd1" /></td>
	</tr>
        
        <tr>
	<td>Retype Password</td>
        <td><input type="password" value="" name="pwd2" /></td>
	</tr>
        
        <tr>
	<td>Email</td>
        <td><input type="text" value="" name="email1" /></td>
	</tr>
        
        <tr>
	<td>Contact Number</td>
        <td><input type="" value="" name="contact" /></td>
	</tr>
        
        <tr>
	<td>Contact Address</td>
	<td><textarea rows="5" cols="15" name="address"></textarea></td>
        </tr>
	
       	<tr>
	<td><input type="submit" value="Register" id="submit" /></td>
	</tr>
	</table>
        </center>
</form>


</div>


</body>


</html>