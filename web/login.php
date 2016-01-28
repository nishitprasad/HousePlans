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
	<h3 align="left">LOGIN</h3>
    <table border="0">
    <form action="verify.php" method="post" >
 	<tr>
    <td>UserName :</td><td><input type="text" name="username" value="" /></td></tr>
    <tr>
 	<td>Password:</td><td><input type="password" name="password" value="" /></td></tr>
 	<tr><td /><td><input type="submit" name="login" value="Login" /></td></tr>
	</form>
    </table>
	</p>

</div>

</div>
<div id="footer">
&copy;Pacific University 2012
</body>


</html>