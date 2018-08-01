<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>注册界面</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/doRegister.action">
学生姓名:<input type="text" name="stuName"><br>
学生性别<input type="text" name="gender"><br>
学生年龄<input type="text" name="age"><br>
密&nbsp;&nbsp;码<input type="password" name="password"><br>
爱好:  <input type="checkbox" value="篮球" name="hobby">篮球
<input type="checkbox" value="足球" name="hobby">足球
<input type="submit" value="提交">
</form>
</body>
</html>