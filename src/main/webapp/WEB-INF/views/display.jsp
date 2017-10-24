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

<table>
    <!-- here should go some titles... -->
    <tr>
        <th>Kiddo Name</th>
    </tr>

<!-- special tag library see maven dependency with JSTL -->
<c:forEach items="${kiddos}" var="kiddo" >

    <tr>
        <td>
            <c:out value="${kiddo}"/>
        </td>
    </tr>
</c:forEach>

</table>
</body>
</html>
