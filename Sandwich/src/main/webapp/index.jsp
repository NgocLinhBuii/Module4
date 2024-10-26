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
<form action="save" method="get">
    <h3>Chọn các gia vị bạn thích:</h3>
    <input type="checkbox" name="condiment" value="Muối"/> Muối<br/>
    <input type="checkbox" name="condiment" value="Tiêu"/> Tiêu<br/>
    <input type="checkbox" name="condiment" value="Mù tạt"/> Mù tạt<br/>
    <input type="checkbox" name="condiment" value="Tương ớt"/> Tương ớt<br/>
    <input type="submit" value="Lưu"/>
</form>
</body>
</html>