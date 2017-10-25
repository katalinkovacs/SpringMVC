<html>
  <head>
    <title>Welcome JSP - Title!</title>
  </head>
  <body>
    WELCOME JSP!!!!!!
    <br>
    WELCOME MY FRIEND - userName is:   ${userName}
    <br>

    The password is:  ${password}
    <br>


    <%
       System.out.println("Java in WELCOME.JSP");
       //System.out.println("The userName in welcome.jsp is: " +request.getParameter("userName"));
      // System.out.println("The usernameOnJSP in welcome.jsp is: " +request.getParameter("usernameOnJSP"));

    %>

  </body>
</html>

