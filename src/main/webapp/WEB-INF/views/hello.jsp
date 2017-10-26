<html>
  <head>
    <title>Hello JSP - Title!</title>
  </head>
  <body>
     HELLO JSP!!!!!!!!!!!!!!
     <br>

     <p> <font color="red"> ${errorMessage} </font> </p>
     <form action="hello" method="post">
        Please enter your Name: <input type="text" name="Name"/>
        <input type="submit" value="Submit" />
     </form>


    <%
       System.out.println("Java in Hello.JSP");
    %>

  </body>
</html>



