
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
<script type="text/javascript" language = "JavaScript">
var loadedobjects=""
			var rootdomain="http://"+window.location.hostname

			function ajaxpage(url, containerid){
				
				var page_request = false
				if (window.XMLHttpRequest) // if Mozilla, Safari etc
					page_request = new XMLHttpRequest()

				else if (window.ActiveXObject){ // if IE
			
					try {
						page_request = new ActiveXObject("Msxml2.XMLHTTP")
					} 
					catch (e){
				
						try{
							page_request = new ActiveXObject("Microsoft.XMLHTTP")
						}
						catch (e){}
					}
				}

				else

					return false

				page_request.onreadystatechange=function(){

					loadpage(page_request, containerid)
				}
				
				page_request.open('GET', url, true)
				page_request.send(null)
				
			}


			function loadpage(page_request, containerid){

				if (page_request.readyState == 4 && (page_request.status==200 || window.location.href.indexOf("http")==-1))
				document.getElementById(containerid).innerHTML=page_request.responseText
			}

		</script>
</head>

<body>
<?php
$result=mysql_query("SELECT recruiter_name FROM recruiter_profile WHERE job_validate=1");

while($row=mysql_fetch_array($result))
	{
		echo "<li";
		echo "><a href=\"javascript:ajaxpage('Ajax Pages/job_openings2.php', 'ajax_display_info')" .
					"\">{$row['recruiter_name']}</a></li>"; 
					
	}
	
	
?>

</body>
</html>