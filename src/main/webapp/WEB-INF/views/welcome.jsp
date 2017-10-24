<html>
  <head>
    <title>Welcome JSP - Title!</title>
  </head>
  <body>
    WELCOME MY FRIEND ${usernameOnJSP}
    <!-- The name is: ${usernameOnJSP} and the password is ${passwordOnJSP} -->

    <%
       System.out.println("The username in welcome.jsp is: " +request.getParameter("usernameOnJSP"));
    %>

  </body>
</html>



<!-- Valid user Go to welcome page -->
<!-- NOT Valid user Go to login page -->