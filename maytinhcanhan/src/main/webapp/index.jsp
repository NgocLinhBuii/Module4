<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="calculate" method="get">
    Số thứ nhất: <input type="text" name="num1"/><br/>
    Số thứ hai: <input type="text" name="num2"/><br/>
    <input type="submit" value="Tính toán"/>
</form>
</body>
</html>