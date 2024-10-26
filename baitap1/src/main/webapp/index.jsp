<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<!-- index.jsp -->
<form action="convert" method="get">
  Tỉ giá (1 USD = VND): <input type="text" name="rate"/><br/>
  Số lượng USD: <input type="text" name="usd"/><br/>
  <input type="submit" value="Convert"/>
</form>
<!-- result.jsp -->
<p>Result: ${vnd} VND</p>
</body>
</html>