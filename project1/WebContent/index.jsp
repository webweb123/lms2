<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-1.12.4.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
</head>
<body>
	<h1>main</h1>
	<a href="./">main</a>
	<a href="./">회원가입</a>
	
	<table>

		<c:forEach items="${alist }" var="bean">
		<tr>
			<td>${bean.id }</td>
			<td>hi</td>
			<td>잼잼</td>
		</tr>
		</c:forEach>

	</table>
</body>
</html>