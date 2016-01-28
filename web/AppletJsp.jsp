<%@ page language="java" %>
<html>
<head>
<title>Welcome JSP-Applet Page</title>
</head>
<body>
<jsp:plugin type="applet" code="ButtonMoveApplet.class" 
  width="400" height="400">
  <jsp:fallback>
   <p>Unable to load applet</p>
   </jsp:fallback>
</jsp:plugin>
</body>
</html>