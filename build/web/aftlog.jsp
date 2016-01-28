<html>
<head>
    <Title>Welcome !</title>	
</head>
<link type="text/css" rel="stylesheet" href="Css/style.css">
<link rel="stylesheet" type="text/css" href="ostyle.css" />	

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
        </li>
	</ul>

	<ul id="top_right_list" class="nav">
        <li><a href="index.jsp"><strong>Home</strong></a></li>
		<li ><a href="logout.jsp"><strong>Logout</strong></a></li>
		<li ><a href="feedback.jsp"><strong>Give Feedback</strong></a></li>
                <li><a href="contct.jsp"><strong>Contact Us</strong></a></li>
                <li><a href="AppletJsp.jsp"><strong>App</strong></a></li>
	     
	</ul>
</div>
      
   <p>&nbsp;</p>
   <p>&nbsp;</p>
   <p>&nbsp;</p>
  <h2 align="center" style="font-family:'Agency FB';color:black">
           
           Welcome To House Plans<br/> <%=(String)session.getAttribute("usersession")%>
           
</h2>

           <br/><br/><br/><br/>
           <h3 align="center" style="font-family:'Agency FB';color:black">
               ---  Sorted By Categories  ---
           </h3>
           <br/><br/>
<center>
    <table border="0" cellspacing="10" cellpadding="2" style="font-family:'Agency FB'">
        <tr >
        <center>   <th>
                Architectural Styles
            </th>
            <th>
                House Plans By Size
            </th>
            <th>
                Special Collections
            </th>
        </center>
        </tr>
        <tr style="font-family: 'Agency FB';font-weight: bold">
            <td>
        <center>
            <a href="tide.html"><img src="http://content.secondspace.com/p/hmp/1.0/c/img/CHA156-140px.jpg"	width="150" height="100" alt=""></a><br/>
		<a href="tide.html">Tidewater House Plans</a><br/>
                <a href="a-frame.html"><img src="http://content.secondspace.com/p/hmp/1.0/c/img/SEA093-140px.jpg" width="150" height="100" alt=""></a><br/>
                <a href="a-frame.html">A-Frame House Plans</a><br/>
                <a href="bungalow.html"><img src="http://content.secondspace.com/p/hmp/1.0/c/img/COR337-140px.jpg" width="150" height="100" alt=""></a><br/>
                <a href="bungalow.html">Bungalow House Plans</a><br/>
                <a href="capecod.html"><img src="http://content.secondspace.com/p/hmp/1.0/c/img/FBA858-140px.jpg" width="150" height="100" alt=""></a><br/>
		<a href="capecod.html">Cape Cod House Plans</a><br/>
                <a href="chalet.html"><img src="http://content.secondspace.com/p/hmp/1.0/c/img/SEA012-140px.jpg" width="150" height="100" alt=""></a><br/>
		<a href="chalet.html">Chalet Home Plans</a>
        </center>
            </td>
            <td>
            <center>
                <a href="onebed.html"><img src="http://content.secondspace.com/p/hmp/1.0/c/img/AMA676-FR-RE-CO.jpg" width="150" height="100" alt=""></a><br/>
		<a href="onebed.html">One Bedroom House Plans</a><br/>
                <a href="twobed.html"><img src="http://images.builderhouseplans.com/common/plans/images/COR0/COR342/COR342-FR-RE-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
                <a href="twobed.html">Two Bedroom House Plans</a><br/>
                <a href="threebed.html"><img src="http://images.builderhouseplans.com/common/plans/images/HGA0/HGA128/HGA128-FR-RE-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
                <a href="three.html">Three Bedroom House Plans</a><br/>
                <a href="fourbed.html"><img src="http://images.builderhouseplans.com/common/plans/images/DGG5/DGG736/DGG736-FR-PH-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
		<a href="fourbed.html">Four Bedroom House Plans</a><br/>
                <a href="luxury.html"><img src="http://images.builderhouseplans.com/common/plans/images/DSA0/DSA414/DSA414-FR-PH-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
		<a href="luxury.html">Luxury House Plans</a>
            </center>
            </td>
            <td>
            <center>
                <a href="master.html"><img src="http://images.builderhouseplans.com/common/plans/images/FBA5/FBA514/FBA514-FR-RE-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
		<a href="master.html">Master Suite On Main Level House Plans</a><br/>
                <a href="green.html"><img src="http://images.builderhouseplans.com/common/plans/images/SKA0/SKA008/SKA008-FR-PH-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
                <a href="green.html">Green House Plans</a><br/>
                <a href="vacation.html"><img src="http://images.builderhouseplans.com/common/plans/images/SEA0/SEA225/SEA225-FR-RE-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
                <a href="vacation.html">Vacation House Plans</a><br/>
                <a href="southl.html"><img src="http://images.builderhouseplans.com/common/plans/images/SLA0/SLA383/SLA383-FR-RE-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
		<a href="southl.html">Southern Living House Plans</a><br/>
                <a href="victorian.html"><img src="http://images.builderhouseplans.com/common/plans/images/COR0/COR024/COR024-FR-PH-CO-LG.JPG" width="150" height="100" alt=""></a><br/>
		<a href="victorian.html">Victorian House Plans</a>
            </center>
            </td>
        </tr>
    </table>
</center>
 


</body>


</html>