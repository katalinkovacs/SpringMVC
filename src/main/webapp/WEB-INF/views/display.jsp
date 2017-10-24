<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Zoli
  Date: 25/10/2017
  Time: 7:07 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<!-- special tag library see maven dependency with JSTL -->
<c:forEach items="${kiddos}" var="kiddo" >


    <c:out value="${kiddo}"/>

</c:forEach>
</body>
</html>
