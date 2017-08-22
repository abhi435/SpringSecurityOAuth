<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
   <head>
      <title>Spring Security Demo - jCombat</title>
   </head>
   <body>
      <c:url value="/j_spring_security_logout" var="logoutUrl" />
      <center>
         <h2>Hello ADMIN, you are now logged in!</h2>
         <h3><a href="${logoutUrl}">Logout</a></h3>
      </center>
   </body>
</html>