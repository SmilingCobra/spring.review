<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.1.1.min.js"></script>
<script type="text/javascript">
function sendJsonData(){
	
	var param = '{"gender":"男","stuName":"小强123","age":18}';
	$.ajax({url:"${pageContext.request.contextPath }/ajax/ajaxTest.action",
		data:param,
		contentType : "application/json;charset=UTF-8",
		type : "post",
		dataType : "json",
		success : function(data){
			alert(data.gender);
		}});
	
	
}
function doSum(){
	var addend01 = document.getElementById("addend01").value;
	
	var addend02 = document.getElementById("addend02").value;
	if(addend01 ==''){
		addend01 = 0;
	}
	if(addend02 ==''){
		addend02 = 0;
	}
	var param = "{'addend01':"+addend01+",'addend02':"+addend02+"}";
	//alert(param);
	//alert(addend01+"<----->"+addend02);
	$.ajax({
		url: "${pageContext.request.contextPath }/ajax/doSum.action",
		data: param,
		dataType: "text",//数据接收方式
		contentType: "application/json;charset=UTF-8",//主要设置你发送给服务器的格式
		type: "post",//传输方式
		success: function(data){
			var sum = document.getElementById("sum");
			sum.value = data;
		}
		
	});
}
</script>
<title>AJAX测试</title>
</head>
<body>
<a href="#" onclick="sendJsonData()">ajax测试</a>
<h1>ajax实现加减乘除</h1>
<input type="text" value="0" id="addend01" name="addend01"  onkeyup="doSum()">
+
<input type="text" value="0" id="addend02" name="addend02"  onkeyup="doSum()">
=
<input type="text" id="sum" name="sum"  readonly="readonly">
</body>
</html>