<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="/userinfo/outputuserinfo" method="post">

		名前：<input type="text" name="name"><br> 年齢：<input
			type="text" name="age"><br> 住所：<input type="text"
			name="address"><br> <input type="submit" value="送信">
	</form>
</body>
</html>