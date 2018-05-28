ALTER TABLE job_info_bbs
	DROP
		CONSTRAINT FK_Staff_TO_job_info_bbs
		CASCADE;

ALTER TABLE jop_cs
	DROP
		CONSTRAINT FK_Staff_TO_jop_cs
		CASCADE;

ALTER TABLE Student
	DROP
		CONSTRAINT FK_lec_create_TO_Student
		CASCADE;

ALTER TABLE Student
	DROP
		CONSTRAINT FK_app_bbs_stu_TO_Student
		CASCADE;

ALTER TABLE att_bbs
	DROP
		CONSTRAINT FK_Student_TO_att_bbs
		CASCADE;

ALTER TABLE app_bbs_stu
	DROP
		CONSTRAINT FK_stu_member_TO_app_bbs_stu
		CASCADE;

ALTER TABLE stu_notice_bbs
	DROP
		CONSTRAINT FK_Staff_TO_stu_notice_bbs
		CASCADE;

ALTER TABLE cs_notice
	DROP
		CONSTRAINT FK_Staff_TO_cs_notice
		CASCADE;

ALTER TABLE app_bbs_emp
	DROP
		CONSTRAINT FK_emp_member_TO_app_bbs_emp
		CASCADE;

ALTER TABLE lec_create
	DROP
		CONSTRAINT FK_Staff_TO_lec_create
		CASCADE;

ALTER TABLE grade_check
	DROP
		CONSTRAINT FK_Student_TO_grade_check
		CASCADE;

ALTER TABLE free_bbs
	DROP
		CONSTRAINT FK_Student_TO_free_bbs
		CASCADE;

ALTER TABLE FAQ
	DROP
		CONSTRAINT FK_Staff_TO_FAQ
		CASCADE;

ALTER TABLE lec_after
	DROP
		CONSTRAINT FK_Student_TO_lec_after
		CASCADE;

ALTER TABLE lec_data
	DROP
		CONSTRAINT FK_Staff_TO_lec_data
		CASCADE;

ALTER TABLE Staff
	DROP
		CONSTRAINT FK_app_bbs_emp_TO_Staff
		CASCADE;

ALTER TABLE jop_af
	DROP
		CONSTRAINT FK_Student_TO_jop_af
		CASCADE;

ALTER TABLE job_info_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE jop_cs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE Student
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE att_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE app_bbs_stu
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE stu_notice_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE stu_member
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE online_test
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE cs_notice
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE app_bbs_emp
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE lec_create
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE grade_check
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE online_cs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE emp_member
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE free_bbs
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE FAQ
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE lec_after
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE lec_data
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE Staff
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

ALTER TABLE jop_af
	DROP
		PRIMARY KEY
		CASCADE
		KEEP INDEX;

/* 취업정보 */
DROP TABLE job_info_bbs 
	CASCADE CONSTRAINTS;

/* 취업현황 */
DROP TABLE jop_cs 
	CASCADE CONSTRAINTS;

/* 수강생 */
DROP TABLE Student 
	CASCADE CONSTRAINTS;

/* 출결 */
DROP TABLE att_bbs 
	CASCADE CONSTRAINTS;

/* 수강생승인게시판 */
DROP TABLE app_bbs_stu 
	CASCADE CONSTRAINTS;

/* 수강생 공지사항 */
DROP TABLE stu_notice_bbs 
	CASCADE CONSTRAINTS;

/* 예비수강생 */
DROP TABLE stu_member 
	CASCADE CONSTRAINTS;

/* 온라인테스트 */
DROP TABLE online_test 
	CASCADE CONSTRAINTS;

/* 고객센터 공지사항 */
DROP TABLE cs_notice 
	CASCADE CONSTRAINTS;

/* 직원승인게시판 */
DROP TABLE app_bbs_emp 
	CASCADE CONSTRAINTS;

/* 강의개설 */
DROP TABLE lec_create 
	CASCADE CONSTRAINTS;

/* 성적확인게시판 */
DROP TABLE grade_check 
	CASCADE CONSTRAINTS;

/* 온라인 상담 */
DROP TABLE online_cs 
	CASCADE CONSTRAINTS;

/* 예비직원 */
DROP TABLE emp_member 
	CASCADE CONSTRAINTS;

/* 자유게시판 */
DROP TABLE free_bbs 
	CASCADE CONSTRAINTS;

/* FAQ */
DROP TABLE FAQ 
	CASCADE CONSTRAINTS;

/* 교육후기 */
DROP TABLE lec_after 
	CASCADE CONSTRAINTS;

/* 수업자료실 */
DROP TABLE lec_data 
	CASCADE CONSTRAINTS;

/* 구인의뢰 */
DROP TABLE job_ad 
	CASCADE CONSTRAINTS;

/* 직원 */
DROP TABLE Staff 
	CASCADE CONSTRAINTS;

/* 취업후기 */
DROP TABLE jop_af 
	CASCADE CONSTRAINTS;

/* 취업정보 */
CREATE TABLE job_info_bbs (
	idx NUMBER(4) NOT NULL, /* idx */
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255) NOT NULL, /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE job_info_bbs
	ADD
		CONSTRAINT PK_job_info_bbs
		PRIMARY KEY (
			idx
		);

/* 취업현황 */
CREATE TABLE jop_cs (
	idx NUMBER NOT NULL, /* idx */
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
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

/* 수강생 */
CREATE TABLE Student (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	season NUMBER NOT NULL, /* 기수 */
	id VARCHAR2(50), /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 비밀번호 */
	name VARCHAR2(10) NOT NULL, /* 이름 */
	phone VARCHAR2(13), /* 전화번호 */
	email VARCHAR2(50), /* 이메일 */
	birth VARCHAR2(13), /* 생년월일 */
	address VARCHAR2(255), /* 주소 */
	room NUMBER(1) /* 강의실 */
);

ALTER TABLE Student
	ADD
		CONSTRAINT PK_Student
		PRIMARY KEY (
			stu_code
		);

/* 출결 */
CREATE TABLE att_bbs (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	cdate DATE NOT NULL, /* cdate */
	att VARCHAR2(60) NOT NULL /* 출결 */
);

ALTER TABLE att_bbs
	ADD
		CONSTRAINT PK_att_bbs
		PRIMARY KEY (
			stu_code
		);

/* 수강생승인게시판 */
CREATE TABLE app_bbs_stu (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	idx VARCHAR2(50) NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	wdate DATE, /* 작성일 */
	name VARCHAR2(10), /* 이름 */
	phone VARCHAR2(15), /* 전화번호 */
	email VARCHAR2(50), /* 이메일 */
	birth VARCHAR2(6), /* 생년월일 */
	address VARCHAR2(100), /* 주소 */
	class NUMBER(1) /* 강의실 */
);

ALTER TABLE app_bbs_stu
	ADD
		CONSTRAINT PK_app_bbs_stu
		PRIMARY KEY (
			stu_code
		);

/* 수강생 공지사항 */
CREATE TABLE stu_notice_bbs (
	idx NUMBER NOT NULL, /* idx */
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE stu_notice_bbs
	ADD
		CONSTRAINT PK_stu_notice_bbs
		PRIMARY KEY (
			idx
		);

/* 예비수강생 */
CREATE TABLE stu_member (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	pw VARCHAR2(13) NOT NULL, /* 비밀번호 */
	name VARCHAR2(10) NOT NULL, /* 이름 */
	phone VARCHAR2(11), /* 전화번호 */
	email VARCHAR2(50), /* 이메일 */
	birth VARCHAR2(6), /* 생년월일 */
	address VARCHAR2(255) /* 주소 */
);

ALTER TABLE stu_member
	ADD
		CONSTRAINT PK_stu_member
		PRIMARY KEY (
			stu_code
		);

/* 온라인테스트 */
CREATE TABLE online_test (
	qnum NUMBER(2) NOT NULL, /* 문제번호 */
	question VARCHAR2(255) NOT NULL, /* 문제 */
	example VARCHAR2(255) NOT NULL, /* 보기 */
	answer NUMBER(1) NOT NULL, /* 정답 */
	room NUMBER(1) /* 강의실 */
);

ALTER TABLE online_test
	ADD
		CONSTRAINT PK_online_test
		PRIMARY KEY (
			qnum
		);

/* 고객센터 공지사항 */
CREATE TABLE cs_notice (
	idx NUMBER NOT NULL, /* idx */
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE cs_notice
	ADD
		CONSTRAINT PK_cs_notice
		PRIMARY KEY (
			idx
		);

/* 직원승인게시판 */
CREATE TABLE app_bbs_emp (
	emp_num NUMBER NOT NULL, /* 사번 */
	idx VARCHAR2(50) NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	wdate DATE, /* 작성일 */
	name VARCHAR2(10), /* 이름 */
	phone VARCHAR2(15), /* 전화번호 */
	email VARCHAR2(50), /* 이메일 */
	birth VARCHAR2(6), /* 생년월일 */
	address VARCHAR2(100) /* 주소 */
);

ALTER TABLE app_bbs_emp
	ADD
		CONSTRAINT PK_app_bbs_emp
		PRIMARY KEY (
			emp_num
		);

/* 강의개설 */
CREATE TABLE lec_create (
	season NUMBER NOT NULL, /* 기수 */
	emp_code NUMBER NOT NULL, /* 사번 */
	class NUMBER(1) NOT NULL, /* 강의실 */
	id VARCHAR2(50) NOT NULL, /* 이름 */
	sday DATE, /* 시작일 */
	eday DATE, /* 종료일 */
	edu VARCHAR2(10) NOT NULL, /* 과목 */
	tot NUMBER NOT NULL /* 총원 */
);

ALTER TABLE lec_create
	ADD
		CONSTRAINT PK_lec_create
		PRIMARY KEY (
			season
		);

/* 성적확인게시판 */
CREATE TABLE grade_check (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	java NUMBER(3), /* java */
	web NUMBER(3), /* web */
	db NUMBER(3) /* db */
);

ALTER TABLE grade_check
	ADD
		CONSTRAINT PK_grade_check
		PRIMARY KEY (
			stu_code
		);

/* 온라인 상담 */
CREATE TABLE online_cs (
	idx NUMBER NOT NULL, /* idx */
	name VARCHAR2(10), /* 이름 */
	sub VARCHAR2(255), /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	email VARCHAR2(100), /* 이메일 */
	phone NUMBER, /* 전화번호 */
	wdate DATE, /* 날짜 */
	yn NUMBER(1) /* yn */
);

ALTER TABLE online_cs
	ADD
		CONSTRAINT PK_online_cs
		PRIMARY KEY (
			idx
		);

/* 예비직원 */
CREATE TABLE emp_member (
	mem_num NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	pw VARCHAR2(13) NOT NULL, /* 비밀번호 */
	name VARCHAR2(10) NOT NULL, /* 이름 */
	phone VARCHAR2(11), /* 전화번호 */
	email VARCHAR2(50), /* 이메일 */
	birth VARCHAR2(6), /* 생년월일 */
	address VARCHAR2(255) /* 주소 */
);

ALTER TABLE emp_member
	ADD
		CONSTRAINT PK_emp_member
		PRIMARY KEY (
			mem_num
		);

/* 자유게시판 */
CREATE TABLE free_bbs (
	idx NUMBER NOT NULL, /* idx */
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000) NOT NULL, /* 내용 */
	hit NUMBER NOT NULL, /* 조회수 */
	wdate DATE NOT NULL /* 작성일 */
);

ALTER TABLE free_bbs
	ADD
		CONSTRAINT PK_free_bbs
		PRIMARY KEY (
			idx
		);

/* FAQ */
CREATE TABLE FAQ (
	idx NUMBER(4) NOT NULL, /* idx */
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE FAQ
	ADD
		CONSTRAINT PK_FAQ
		PRIMARY KEY (
			idx
		);

/* 교육후기 */
CREATE TABLE lec_after (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE lec_after
	ADD
		CONSTRAINT PK_lec_after
		PRIMARY KEY (
			stu_code
		);

/* 수업자료실 */
CREATE TABLE lec_data (
	idx NUMBER NOT NULL, /* idx */
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE lec_data
	ADD
		CONSTRAINT PK_lec_data
		PRIMARY KEY (
			idx
		);

/* 구인의뢰 */
CREATE TABLE job_ad (
	company VARCHAR2(100), /* 업체명 */
	phone NUMBER, /* 전화번호 */
	field VARCHAR2(100), /* 모집분야 */
	email VARCHAR2(100), /* 이메일 */
	pay NUMBER /* 연봉 */
);

/* 직원 */
CREATE TABLE Staff (
	emp_code NUMBER NOT NULL, /* 사번 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 패스워드 */
	name VARCHAR2(10) NOT NULL, /* 이름 */
	phone VARCHAR2(50) NOT NULL, /* 전화번호 */
	email VARCHAR2(50), /* 이메일 */
	birth VARCHAR2(6), /* 생년월일 */
	address VARCHAR2(255) /* 주소 */
);

ALTER TABLE Staff
	ADD
		CONSTRAINT PK_Staff
		PRIMARY KEY (
			emp_code
		);

/* 취업후기 */
CREATE TABLE jop_af (
	stu_code NUMBER(4) NOT NULL, /* 학번 */
	season NUMBER NOT NULL, /* 기수 */
	id VARCHAR2(50) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(4000), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

ALTER TABLE jop_af
	ADD
		CONSTRAINT PK_jop_af
		PRIMARY KEY (
			stu_code
		);

ALTER TABLE job_info_bbs
	ADD
		CONSTRAINT FK_Staff_TO_job_info_bbs
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE jop_cs
	ADD
		CONSTRAINT FK_Staff_TO_jop_cs
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE Student
	ADD
		CONSTRAINT FK_lec_create_TO_Student
		FOREIGN KEY (
			season
		)
		REFERENCES lec_create (
			season
		);

ALTER TABLE Student
	ADD
		CONSTRAINT FK_app_bbs_stu_TO_Student
		FOREIGN KEY (
			stu_code
		)
		REFERENCES app_bbs_stu (
			stu_code
		);

ALTER TABLE att_bbs
	ADD
		CONSTRAINT FK_Student_TO_att_bbs
		FOREIGN KEY (
			stu_code
		)
		REFERENCES Student (
			stu_code
		);

ALTER TABLE app_bbs_stu
	ADD
		CONSTRAINT FK_stu_member_TO_app_bbs_stu
		FOREIGN KEY (
			stu_code
		)
		REFERENCES stu_member (
			stu_code
		);

ALTER TABLE stu_notice_bbs
	ADD
		CONSTRAINT FK_Staff_TO_stu_notice_bbs
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE cs_notice
	ADD
		CONSTRAINT FK_Staff_TO_cs_notice
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE app_bbs_emp
	ADD
		CONSTRAINT FK_emp_member_TO_app_bbs_emp
		FOREIGN KEY (
			emp_num
		)
		REFERENCES emp_member (
			mem_num
		);

ALTER TABLE lec_create
	ADD
		CONSTRAINT FK_Staff_TO_lec_create
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE grade_check
	ADD
		CONSTRAINT FK_Student_TO_grade_check
		FOREIGN KEY (
			stu_code
		)
		REFERENCES Student (
			stu_code
		);

ALTER TABLE free_bbs
	ADD
		CONSTRAINT FK_Student_TO_free_bbs
		FOREIGN KEY (
			stu_code
		)
		REFERENCES Student (
			stu_code
		);

ALTER TABLE FAQ
	ADD
		CONSTRAINT FK_Staff_TO_FAQ
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE lec_after
	ADD
		CONSTRAINT FK_Student_TO_lec_after
		FOREIGN KEY (
			stu_code
		)
		REFERENCES Student (
			stu_code
		);

ALTER TABLE lec_data
	ADD
		CONSTRAINT FK_Staff_TO_lec_data
		FOREIGN KEY (
			emp_code
		)
		REFERENCES Staff (
			emp_code
		);

ALTER TABLE Staff
	ADD
		CONSTRAINT FK_app_bbs_emp_TO_Staff
		FOREIGN KEY (
			emp_code
		)
		REFERENCES app_bbs_emp (
			emp_num
		);

ALTER TABLE jop_af
	ADD
		CONSTRAINT FK_Student_TO_jop_af
		FOREIGN KEY (
			stu_code
		)
		REFERENCES Student (
			stu_code
		);