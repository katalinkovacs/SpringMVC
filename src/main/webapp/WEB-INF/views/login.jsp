<html>
  <head>
    <title>Login JSP - Title!</title>
  </head>
  <body>
     LOGIN JSP!!!!!!!!!!!!!!
     <br>
     Please LOGIN!
     <br>
     The current name/userName is - : ${userName} AND the password/password is:  ${password}
     <%--<br>
     The current name/usernameOnJSP is: ${usernameOnJSP} AND the password/passwordOnJSP is:  ${passwordOnJSP}
     <br>--%>

    <p> <font color="red"> ${errorMessage} </font> </p>
    <form action="login" method="post">
    		Please enter your Name: <input type="text" name="userName"/>
    		Please enter your Password: <input type="text" name="password" />
    		<input type="submit" value="Login" />
    </form>

    <%
       System.out.println("Java in LOGIN.JSP");
       System.out.println("The userName is: " +request.getParameter("userName"));
       //System.out.println("The usernameOnJSP is: " +request.getParameter("usernameOnJSP"));

    %>

  </body>
</html>



