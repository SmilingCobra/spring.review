<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>学生信息列表</title>
</head>
<body>
<table>
<tr><td>学生姓名</td><td>学生性别</td><td>性别</td></tr>
<c:forEach var="stu" items="${stuList }">
<tr><td>${stu.stuName }</td><td>${stu.gender }</td><td>${stu.age }</td></tr>
</c:forEach>
</table>
<a href="${pageContext.request.contextPath }/rest/stuManager/0371.action">查看</a>
<form action="${pageContext.request.contextPath }/rest/stuManager/0371.action" method="post">
<input type="hidden" name="_method" value="PUT">
<input type="submit" value="修改">
</form>
<form action="${pageContext.request.contextPath }/rest/stuManager/0371.action" method="post">
<input type="hidden" name="_method" value="DELETE">
<input type="submit" value="删除">
</form>
<form action="${pageContext.request.contextPath }/rest/stuManager/0371.action" method="post">
<input type="submit" value="添加">
</form>
</body>
</html>