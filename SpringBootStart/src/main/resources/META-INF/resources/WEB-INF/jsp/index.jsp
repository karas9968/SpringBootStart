<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>index</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="<c:url value='/js/jquery-latest.min.js' />" ></script>
<link type='text/css' rel='stylesheet' href="<c:url value='/css/common.css' />" />
<script>
	$(document).ready(function(){
		$("#itemsListBtn").click(function(){
			alert("中獎名單")
		});
		
		$("#bjgoBtn").click(function(){
			alert("開始抽獎")
		});
	});
</script>
</head>
<body>
	<div id="indexPage">
		<div id="insideDiv">
			<div>
				<img id="itemsListBtn" src="<c:url value='/images/btn1.png'/>" />
			</div>
			<div>
				<img id="bjgoBtn" src="<c:url value='/images/btn2.png'/>" />
			</div>
		</div>
	</div>
</body>
</html>