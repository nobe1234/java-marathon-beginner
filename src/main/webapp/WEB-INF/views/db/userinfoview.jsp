<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>詳細情報</h1>

名前：<c:out value="${info.name }"></c:out><br>様
年齢：<c:out value="${info.age }"></c:out><br>歳
住所：<c:out value="${info.address }"></c:out><br>

</body>
</html>