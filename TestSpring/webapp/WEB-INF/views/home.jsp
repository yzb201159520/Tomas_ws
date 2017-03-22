<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<%-- <link type="text/css" rel="stylesheet" href="<c:url value="/resources/css/home.css" />"> --%>
		<%-- 下面的写法也是可以的，为什么要采用上面的写法呢？ 
			经验证，上下两种写法，在开启静态资源访问的时候都是可以访问的
		--%>
		<link type="text/css" rel="stylesheet" href="/TestSpring/resources/css/home.css">
		<title>TestSpring Home Page</title>
	</head>
	<body>
		<div class="firstDiv">
			WelCome My Spring Page
		</div>
	</body>
</html>