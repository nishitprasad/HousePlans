
<?php 
session_start();
//connect.php
$server	    = 'localhost';
$username	= 'root';
$password	= '';
$database	= 'placement';
$con=mysql_connect($server, $username, $password);

if(!mysql_connect($server, $username, $password))
{
 	exit('Error: could not establish database connection');
}
if(!mysql_select_db($database))
{
 	exit('Error: could not select the database');
}

?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Untitled Document</title>

</head>

<body>
<?php

$result=mysql_query("SELECT recruiter_name FROM recruiter_profile WHERE recr=1");

while($row=mysql_fetch_array($result))
	{
		print('<table style=\"border-width:thin; border style=solid;cellpadding=1; border width=10px;")');
		print("<tr>");
		print("<td>");echo "Recruiter Name:"; print("</td>");
		print("<td>");echo $row['recruiter_name'];print("</td>");
		print("</tr>");
		print("<tr>");
		print("<td>");echo "Pay Package:"; print("</td>");
		print("<td>");echo $row['package'];print("</td>");
		print("</tr>");
		
	}
	
	
?>

</body>
</html>