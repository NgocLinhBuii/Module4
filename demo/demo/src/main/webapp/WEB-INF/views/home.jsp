<%--
  Created by IntelliJ IDEA.
  User: BuiNgocLinh
  Date: 12/10/2024
  Time: 9:18 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
Trang chủ
<h1>Danh sách học viên</h1>
<a href="show-create-form">Thêm mới học viên</a>
<p>${msg}</p>
<table border="1px">
    <tr>
        <th>STT</th>
        <th>ID</th>
        <th>Tên</th>
        <th>Lương</th>
        <th>Ngày sinh</th>
        <th>Tác vụ</th>
    </tr>
    <c:forEach varStatus = "loop" var="s" items="${list}">
        <tr>
            <td>${loop.count}</td>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td>${s.salary}</td>
            <td>${s.dob}</td>
            <td>
                <a href="show-update-form/${s.id}">Sửa</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
