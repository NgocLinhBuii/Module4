<%--
  Created by IntelliJ IDEA.
  User: BuiNgocLinh
  Date: 24/10/2024
  Time: 9:26 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>Bạn đã chọn:</h3>
<ul>
    <c:forEach items="${condiments}" var="condiment">
        <li>${condiment}</li>
    </c:forEach>
</ul>
</body>
</html>
