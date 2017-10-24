<html>
  <head>
    <title>Login JSP - Title!</title>
  </head>
  <body>
    Please LOGIN!
    The current name is: ${usernameOnJSP} and the password is ${passwordOnJSP}

    <p> <font color="red"> ${errorMessage} </font> </p>
    <form action="login" method="post">
    		Please enter your Name: <input type="text" name="usernameOnJSP"/>
    		Please enter your Password: <input type="text" name="passwordOnJSP" />
    		<input type="submit" value="Login" />
    </form>

    <%
       //System.out.println("Java in JSP");
       System.out.println("The username in login.jsp is: " +request.getParameter("usernameOnJSP"));
    %>

  </body>
</html>



