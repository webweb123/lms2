<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="./js/jquery-1.12.4.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<title>Insert title here</title>
<style type="text/css">
	
	#topMenu{
		height:30px;
		width:850px;
		border-bottom:1px solid gray;
		padding-bottom: 5px;
	}

	.header-inner>ul{
		list-style:none;
		float:left;	
		
	}
	
	.header-inner>ul>li{
		float:left;
		padding: 0 2px;
	}
	
	
	.header-login>ul{
		list-style:none;
		padding: 0 5px;
		float:right;
	}
	
	.header-login>ul>li{
		list-stlye:none;
		float:left;
		padding:0 5px;
	}
	
	.nav_menu{
		align:center;
		margin:0px auto;
	}

	.nav_menu>ul{
		list-style:none;
		margin:0px auto;	
	}

	.nav_menu>ul>li{
		float:left;
	}

	.nav_menu>ul>li>a{
		text-decoration:none;
		color:black;
		padding:0 5px;
		
	}
	
	#main-header{
		width:850px;
		height:100px;
		border-bottom:1px solid gray;
	}
	

</style>
</head>
<body>

	<nav id="topMenu">
	<div class="header-inner">
	<ul>
	<li>HOME|&nbsp;</li>
	<li>서초센터|&nbsp;</li>
	<li>강남센터|&nbsp;</li>
	<li>신촌센터|&nbsp;</li>
	<li>홍대센터</li>
	</ul>
	</div>
	<div class="header-login">
	<ul>
	<li><a href="#">마이페이지</a></li>
	<li><a href="#">로그인</a></li>
	</ul>
	
	</div>
	</nav>
	
	
	<header id="main-header">
	<h1>
	
	<img src="C:\Users\hb\git\lms2\project1\WebContent\WEB-INF\img\logo.jpg"/>
	
	</h1>	
	
	
	</header>
	
	
	
	<nav class="nav_menu">
	<ul>
		<li><a href="#">education</a>|&nbsp;</li>
		<li><a href="#">community</a>|&nbsp;</li>
		<li><a href="#">support</a>|&nbsp;</li>
		<li><a href="#">contact</a>|&nbsp;</li>
		<li><a href="#">about us</a></li>
	</ul>
	</nav>

	<footer>
	</footer>
	
	
</body>
</html>