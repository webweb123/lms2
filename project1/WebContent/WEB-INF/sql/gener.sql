ALTER TABLE jop_af
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE job_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE free_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE lec_room
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE FAQ
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE att_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE online_test
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE grade_check
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE cos_notice
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE lec_after
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE Student
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE jop_cs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE app_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE Staff
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE member
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE notice_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

/* 취업후기 */
DROP TABLE jop_af 
	CASCADE CONSTRAINTS;

/* 취업정보 */
DROP TABLE job_bbs 
	CASCADE CONSTRAINTS;

/* 자유게시판 */
DROP TABLE free_bbs 
	CASCADE CONSTRAINTS;

/* 수업자료실 */
DROP TABLE lec_room 
	CASCADE CONSTRAINTS;

/* FAQ */
DROP TABLE FAQ 
	CASCADE CONSTRAINTS;

/* 출결 */
DROP TABLE att_bbs 
	CASCADE CONSTRAINTS;

/* 온라인테스트 */
DROP TABLE online_test 
	CASCADE CONSTRAINTS;

/* 성적확인게시판 */
DROP TABLE grade_check 
	CASCADE CONSTRAINTS;

/* 고객센터 공지사항 */
DROP TABLE cos_notice 
	CASCADE CONSTRAINTS;

/* 강의개설 */
DROP TABLE lec_create 
	CASCADE CONSTRAINTS;

/* 교육후기 */
DROP TABLE lec_after 
	CASCADE CONSTRAINTS;

/* 수강생 */
DROP TABLE Student 
	CASCADE CONSTRAINTS;

/* 취업현황 */
DROP TABLE jop_cs 
	CASCADE CONSTRAINTS;

/* 승인게시판 */
DROP TABLE app_bbs 
	CASCADE CONSTRAINTS;

/* 직원 */
DROP TABLE Staff 
	CASCADE CONSTRAINTS;

/* 회원 */
DROP TABLE member 
	CASCADE CONSTRAINTS;

/* 공지사항 */
DROP TABLE notice_bbs 
	CASCADE CONSTRAINTS;

/* 취업후기 */
CREATE TABLE jop_af (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE jop_af
	ADD
		CONSTRAINT PK_jop_af
		PRIMARY KEY (
			idx
		);

/* 취업정보 */
CREATE TABLE job_bbs (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255) NOT NULL, /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE job_bbs
	ADD
		CONSTRAINT PK_job_bbs
		PRIMARY KEY (
			idx
		);

/* 자유게시판 */
CREATE TABLE free_bbs (
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255), /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE free_bbs
	ADD
		CONSTRAINT PK_free_bbs
		PRIMARY KEY (
			id
		);

/* 수업자료실 */
CREATE TABLE lec_room (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE lec_room
	ADD
		CONSTRAINT PK_lec_room
		PRIMARY KEY (
			idx
		);

/* FAQ */
CREATE TABLE FAQ (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE FAQ
	ADD
		CONSTRAINT PK_FAQ
		PRIMARY KEY (
			idx
		);

/* 출결 */
CREATE TABLE att_bbs (
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sts NUMBER NOT NULL, /* 출결 상태 */
	att VARCHAR2(255) NOT NULL /* 출결 */
);

ALTER TABLE att_bbs
	ADD
		CONSTRAINT PK_att_bbs
		PRIMARY KEY (
			id
		);

/* 온라인테스트 */
CREATE TABLE online_test (
	qnum NUMBER NOT NULL, /* 문제번호 */
	question VARCHAR2(255) NOT NULL, /* 문제 */
	example VARCHAR2(255) NOT NULL, /* 보기 */
	answer NUMBER NOT NULL, /* 정답 */
	edu VARCHAR2(255) NOT NULL /* 과목 */
);

ALTER TABLE online_test
	ADD
		CONSTRAINT PK_online_test
		PRIMARY KEY (
			qnum
		);

/* 성적확인게시판 */
CREATE TABLE grade_check (
	id VARCHAR(50) NOT NULL, /* 아이디 */
	edu VARCHAR2(255) NOT NULL, /* 과목1 */
	COL VARCHAR2(255), /* 과목2 */
	COL2 VARCHAR2(255), /* 과목3 */
	grade NUMBER NOT NULL /* 성적 */
);

ALTER TABLE grade_check
	ADD
		CONSTRAINT PK_grade_check
		PRIMARY KEY (
			id
		);

/* 고객센터 공지사항 */
CREATE TABLE cos_notice (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE cos_notice
	ADD
		CONSTRAINT PK_cos_notice
		PRIMARY KEY (
			idx
		);

/* 강의개설 */
CREATE TABLE lec_create (
	lname VARCHAR2(255) NOT NULL, /* 강의명 */
	sday DATE, /* 시작일 */
	eday DATE, /* 종료일 */
	edu VARCHAR2(255) NOT NULL, /* 과목 */
	tot NUMBER NOT NULL, /* 총원 */
	id VARCHAR(50) /* 이름 */
);

/* 교육후기 */
CREATE TABLE lec_after (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE lec_after
	ADD
		CONSTRAINT PK_lec_after
		PRIMARY KEY (
			idx
		);

/* 수강생 */
CREATE TABLE Student (
	id VARCHAR(50) NOT NULL, /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 비밀번호 */
	name VARCHAR2(255) NOT NULL, /* 이름 */
	phone VARCHAR2(30), /* 전화번호 */
	email VARCHAR2(40), /* 이메일 */
	birth VARCHAR2(13), /* 생년월일 */
	address VARCHAR2(255) /* 주소 */
);

ALTER TABLE Student
	ADD
		CONSTRAINT PK_Student
		PRIMARY KEY (
			id
		);

/* 취업현황 */
CREATE TABLE jop_cs (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	eduCurri VARCHAR2(255), /* 교육과정 */
	company VARCHAR2(255), /* 취업업체명 */
	field VARCHAR2(255) /* 취업분야 */
);

ALTER TABLE jop_cs
	ADD
		CONSTRAINT PK_jop_cs
		PRIMARY KEY (
			idx
		);

/* 승인게시판 */
CREATE TABLE app_bbs (
	idx NUMBER NOT NULL, /* 글번호 */
	wdate DATE /* 작성일 */
);

ALTER TABLE app_bbs
	ADD
		CONSTRAINT PK_app_bbs
		PRIMARY KEY (
			idx
		);

/* 직원 */
CREATE TABLE Staff (
	id VARCHAR(50) NOT NULL, /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 패스워드 */
	name VARCHAR2(255) NOT NULL, /* 이름 */
	phone VARCHAR2(30) NOT NULL, /* 전화번호 */
	email VARCHAR2(40), /* 이메일 */
	birth VARCHAR2(13), /* 생년월일 */
	address VARCHAR2(255), /* 주소 */
	emp_num NUMBER, /* 사번 */
	affiliation VARCHAR2(255) /* 소속 */
);

ALTER TABLE Staff
	ADD
		CONSTRAINT PK_Staff
		PRIMARY KEY (
			id
		);

/* 회원 */
CREATE TABLE member (
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 비밀번호 */
	name VARCHAR2(50) NOT NULL, /* 이름 */
	phone VARCHAR2(30), /* 전화번호 */
	email VARCHAR2(40), /* 이메일 */
	birth VARCHAR2(13), /* 생년월일 */
	address VARCHAR2(255) /* 주소 */
);

ALTER TABLE member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			id
		);

/* 공지사항 */
CREATE TABLE notice_bbs (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE notice_bbs
	ADD
		CONSTRAINT PK_notice_bbs
		PRIMARY KEY (
			idx
		);