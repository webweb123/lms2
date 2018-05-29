<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
	
	section fieldset{
		width:500px;
		margin:0px auto;
	}
	
	
	section legend{
		margin:0px auto;
	}
	

	
	section ul{
		list-style:none;
	}
	
	section ul li:not(:nth-child(1)){
		margin:5px 15px;
	}
	
	section ul li:nth-child(1){
		margin:10px 10px;
	}
	
	section label{
		width:70px;
		display:inline-block;
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

</style>


</head>
<body>

	<nav id="topMenu">
	<div class="header-inner">
	<ul class="ul_inner">
	<li><a href="/index.bit">HOME&nbsp;</a></li>
	<li><a href="index.jsp">서초센터&nbsp;</a></li>
	<li><a href="index.jsp">강남센터&nbsp;</a></li>
	<li><a href="index.jsp">신촌센터&nbsp;</a></li>
	<li><a href="index.jsp">종로센터</a></li>
	</ul>
	</div>
	<div class="header-login">
	<ul class="ul_inner">
	<li><a href="#">회원가입</a></li>
	<li><a href="login.bit">로그인</a></li>
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
	
	<section>


		<fieldset>
			<legend>회원가입</legend>
			<form method="post" >
			<ul>
				<li>
				<label for="uesr_id">&nbsp;아이디</label>&nbsp;
				<input type="text" id="user_id" name="id">&nbsp;
				<input type="button" value="중복확인" id="ducheck"></input>

				</li>
				<li>
				<label for="uesr_pwd">비밀번호</label>
				<input type="password" id="user_pwd" name="pwd">
				</li>
				<li>
				<label for="uesr_name">이름</label>
				<input type="text" id="user_name" name="name">
				</li>
				<li>
				<label for="uesr_birth">생년월일</label>
				<input type="text" id="user_birth" name="birth">
				</li>
				<li>
				<label for="uesr_addr">주소</label>
				<input type="text" id="user_addr" name="addr">		
				</li>
				<li>
				<label for="uesr_phone">전화번호</label>
				<input type="text" id="user_phone" name="phone">
				</li>			
				<li>
				<label for="uesr_email">email</label>
				<input type="text" id="user_email" name="email">
				</li>
				<li>
				<input type="reset" value="취 소">
				<input type="submit" value="완 료">
				</li>		
					
			</ul>
			</form>
		
		</fieldset>
	
	
	</section>
	
	<br/>

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