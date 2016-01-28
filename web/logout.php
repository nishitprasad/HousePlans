<?php
	//Start session
	session_start();
	
	//Unset the variables stored in session
	unset($_SESSION['username']);
	unset($_SESSION['logged']);
	session_destroy();
	//unset($_SESSION['SESS_LAST_NAME']);
?>
<html>
<head>

<title>Home</title>
<link type="text/css" rel="stylesheet" href="Css/style.css">
	
</head>

<body background="bg7.jpg">
<div id="topsearch" >
	<ul id="menu">
		<li> <input type="text" id="search" onFocus="if(this.value == 'Search' ){ this.value=' ';}" value="Search" onBlur="{this.value='Search'}" src="Images/magnifier.png"/>
		<img src="Images/magnifier.png" alt="Search" onClick="alert('You clicked on Search button')" />
	</li>
	</ul>

	<ul id="top_right_list">
		<li ><a href="Login.php">Login</a></li>
		<li ><a href="Help.php">Help</a></li>
		
	</ul>
</div>
<div id="wrapper">

<div id="logo"><img border="0" src="sathish logos/pac1.png" width="150" height="120"/></div>

<br/><br/>



<br/><br/><br/> 

<div id="content">
	<p>
	  <h3> You have been Successfully Logged out ! </h3></br>
      <h3><a href="index.html">Click here</a> to go to Home Page </h3>
	</p>

</div>

</div>
<div id="footer">
&copy;Pacific University 2012
</body>


</html>