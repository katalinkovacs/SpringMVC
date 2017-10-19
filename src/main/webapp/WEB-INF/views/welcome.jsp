<html>
  <head>
    <title>Welcome from JSP - Title!</title>
  </head>
  <body>
    <!-- The name is: ${nameToForward} and the password is ${password} -->
    <!-- Katis First JSP!!! ${nameToForward} -->

    <form action="/welcome" method="POST">
    		Enter your Name: <input type="text" name="username"/> <input type="submit" value="Login" />
    </form>

    <%
       System.out.println("Java in JSP");
       System.out.println(request.getParameter("username"));
    %>

  </body>
</html>



