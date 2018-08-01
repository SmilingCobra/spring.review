<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>判断钱数</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/exception/exTest.action" method="post">
请输入钱数 :  <input type="text" name="money"></br>
<input type="submit" value="提交">
</form>
</body>
</html>