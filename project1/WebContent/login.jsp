<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="C:\Users\hb\git\lms2\project1\WebContent\WEB-INF\lib\jquery-1.12.4.js"></script>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<title>Insert title here</title>

<style type="text/css">
	
	#topMenu{
		height:40px;
		width:100%;
		border-top:1px solid #cccccc;
		border-bottom:1px solid #cccccc;
	}

	.header-inner>ul{
		list-style:none;
		float:left;	
	}
	
	.ul_inner>li{
		float:left;
		padding: 0 2px;
	}
	
	.ul_inner>li>a{
		text-decoration:none;
		color:black;
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
	

	#main-header{
		width:100%;
		height:70px;
		margin-top:10px;
		border-bottom:1px solid #cccccc;
		
	}
	#main-header img{
		margin-left:450px;
		width:200px;
	}
	
	
	#nav_menu{
		list-style:none;
		margin:0;
		padding:0;
		text-align:center;
		
	}
	#nav_menu ul{
		display:inline-block;
	}
	#nav_menu li{
		display:inline;
	}
	#nav_menu a{
		display:inline-block;
		padding:10px;
		padding-left:30px;
		color:gray;
	}
	
	.main-img{
	
		width:100%;
	}
	
	
	#main-section a{
		text-decoration:none;
		color:white;
	}
	
	
	
	.main-section-img{
		align:center;
		margin:10px 150px;
		
	}
	
	.main-section-menu{
	
		display:inline-block;
		font-size:10pt;
		text-align:left;
	
	}
	
	.main-section-img img{
		margin:10px 10px;
		align:center;
		
	}
	
	
	.footer_div{
		background-color:#860000;
		border:1px solid #860000;
		width:100%;
		height:80px;
		color:white;
		font-size:10pt;
		
	}
	
	.footer_content{
		margin:10px 30px;
		
	}
	
	.footer_img{
		float:right;
		display:inline-block;
		margin-right:10px;
	}
	
	
	#login-section h1,#login{
		margin-left:480px;
		
	}
	#login-section table{
		margin:0px auto;
	}
	

</style>




</head>
<body>

	<nav id="topMenu">
	<div class="header-inner">
	<ul class="ul_inner">
	<li><a href="#">HOME&nbsp;</a></li>
	<li><a href="#">서초센터&nbsp;</a></li>
	<li><a href="#">강남센터&nbsp;</a></li>
	<li><a href="#">신촌센터&nbsp;</a></li>
	<li><a href="#">종로센터</a></li>
	</ul>
	</div>
	<div class="header-login">
	<ul class="ul_inner">
	<li><a href="#">회원가입</a></li>
	<li><a href="#">로그인</a></li>
	</ul>
	
	</div>
	</nav>
	
	
	<header id="main-header">

	<img src="../img/logo.jpg"/>

	</header>
	
	<nav id="nav_menu">
	<ul class="ul_inner">
		<li><a href="home/education.jsp">EDUCATION</a></li>
		<li><a href="home/community.jsp">COMMUNITY</a></li>
		<li><a href="home/support_ap.jsp">SUPPORT</a></li>
		<li><a href="home/contact_es.jsp">CONTACT</a></li>
		<li><a href="home/about_intro.jsp">ABOUT US</a></li>
	</ul>
	</nav>
	
	<section id="login-section">
	
		
			<h1 >로그인</h1>
			<div >
			
			<form method="post">
			<table>
				<tr>
				<td>아이디</td>
				<td><input type="text"/></td>
				</tr>
				<tr>
				<td>비밀번호</td>
				<td><input type="password"/></td>
				</tr>
			</table>
			<input type="submit" value="로그인" id="login"></input>
			</form>
			
			</div>
			
			<br/>
			<br/>
	
	</section>

	<footer id="main-footer">
	
	<div class="footer_div">
	<div class="footer_content">
	
	<div class="footer_img">
	
	<img src="../img/bottom01.jpg"/>
	<img src="../img/bottom02.jpg"/>
	</div>
	
	비트캠프 서울특별시 구로구 구로동 810-10 비트아카데미 | 사업자 등록번호: 214-85-24928 <br/>
	(주)비트컴퓨터 구로지점 대표이사: 조현정/ 문의: 02-3486-9600 /팩스: 02-6007-1245 <br/>
	통신판매업 신고번호: 제 구로-05902호/ 개인정보 관리 책임자: 송승현<br/>
	Copyright (c) 비트캠프 All rights reserved.<br/>
	</div>
	</div>

	</footer>
	
	
</body>
</html>
