<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
	<tr>
			<td>idx</td>
			<td>stu_code</td>
			<td>id</td>
			<td>sub</td>
			<td>content</td>
			<td>hit</td>
			<td>wdate</td>
		</tr>
		<c:forEach items="${alist }" var="bean">
		<tr>
			<td><a href="free_bbs.bit"></a> ${bean.idx }</td>
			<td>${bean.stu_code }</td>
			<td>${bean.id }</td>
			<td>${bean.sub }</td>
			<td>${bean.content }</td>
			<td>${bean.hit }</td>
			<td>${bean.wdate }</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>