<%--
  Created by IntelliJ IDEA.
  User: BuiNgocLinh
  Date: 12/10/2024
  Time: 9:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Trang thêm mới
<%--@elvariable id="student" type="java"--%>
<form:form action="/save-student" method="post" modelAttribute="student">
    Tên học viên: <form:input type="text" path="name"/>
    Lương: <form:input type="number" path="salary"/>
    Ngày sinh: <form:input type="date" path="dob"/>
    <%--    name - value    --%>
    <input type="submit" name="Thêm mới">
</form:form>
</body>
</html>
