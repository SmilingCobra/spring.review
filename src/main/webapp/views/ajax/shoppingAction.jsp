<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">

function sendInfo(){
	var goodsIndex = document.getElementsByName("goodsIndex");
	var a = 0;
	for(var i=0;i<goodsIndex.length;i++){
		var index = i;
		var status = goodsIndex[i].checked;
		var param = "{'index' : "+index+",'status':"+status+"}";
			$.ajax({
				url:"${pageContext.request.contextPath}/shoppingAction/doShoppingAction.action",
				data:param,
				dataType:"json",
				contentType:"application/json;charset=UTF-8",
				type:"post",
				success:function(data){
					alert(data);
				}
			});
		
	}
	
}
function cal(){
	var total = 0.0;
	var goodsIndex = document.getElementsByName("goodsIndex");
	for(var i=0;i<goodsIndex.length;i++){
		if(goodsIndex[i].checked==true){
			total = total +parseFloat(goodsIndex[i].id);
		}
	}
	
	var priceTotal = document.getElementById("priceTotal");
	priceTotal.value = total;
}
</script>
<title>ShoppingAction</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/shoppingAction/finishSettlement.action">
<c:forEach items="${goodsList }" var="goods" varStatus="status">
${status.index +1}<input onclick="cal()" onchange="sendInfo()" id=${goods.goodsPrice } name="goodsIndex" type="checkbox" value="${status.index }" >${goods.goodsName }&nbsp;&nbsp;${goods.goodsPrice }<br>
</c:forEach>
<input type="submit" value="确认清算" "><br>
总价<input type="text" name="priceTotal" id="priceTotal">
</form>
</body>
</html>