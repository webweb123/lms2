ALTER TABLE jop_af
	DROP
		CONSTRAINT FK_Staff_TO_jop_af
		CASCADE;

ALTER TABLE job_bbs
	DROP
		CONSTRAINT FK_Staff_TO_job_bbs
		CASCADE;

ALTER TABLE free_bbs
	DROP
		CONSTRAINT FK_Staff_TO_free_bbs
		CASCADE;

ALTER TABLE free_bbs
	DROP
		CONSTRAINT FK_Student_TO_free_bbs
		CASCADE;

ALTER TABLE lec_room
	DROP
		CONSTRAINT FK_Staff_TO_lec_room
		CASCADE;

ALTER TABLE FAQ
	DROP
		CONSTRAINT FK_Staff_TO_FAQ
		CASCADE;

ALTER TABLE att_bbs
	DROP
		CONSTRAINT FK_Student_TO_att_bbs
		CASCADE;

ALTER TABLE att_bbs
	DROP
		CONSTRAINT FK_Staff_TO_att_bbs
		CASCADE;

ALTER TABLE grade_check
	DROP
		CONSTRAINT FK_Student_TO_grade_check
		CASCADE;

ALTER TABLE grade_check
	DROP
		CONSTRAINT FK_Staff_TO_grade_check
		CASCADE;

ALTER TABLE cos_notice
	DROP
		CONSTRAINT FK_Staff_TO_cos_notice
		CASCADE;

ALTER TABLE lec_create
	DROP
		CONSTRAINT FK_Staff_TO_lec_create
		CASCADE;

ALTER TABLE lec_after
	DROP
		CONSTRAINT FK_Staff_TO_lec_after
		CASCADE;

ALTER TABLE jop_cs
	DROP
		CONSTRAINT FK_Staff_TO_jop_cs
		CASCADE;

ALTER TABLE notice_bbs
	DROP
		CONSTRAINT FK_Staff_TO_notice_bbs
		CASCADE;

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
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE jop_af IS '취업후기';

COMMENT ON COLUMN jop_af.idx IS '글번호';

COMMENT ON COLUMN jop_af.id IS '아이디';

COMMENT ON COLUMN jop_af.sub IS '제목';

COMMENT ON COLUMN jop_af.content IS '내용';

COMMENT ON COLUMN jop_af.hit IS '조회수';

COMMENT ON COLUMN jop_af.wdate IS '작성일';

ALTER TABLE jop_af
	ADD
		CONSTRAINT PK_jop_af
		PRIMARY KEY (
			idx
		);

/* 취업정보 */
CREATE TABLE job_bbs (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255) NOT NULL, /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE job_bbs IS '취업정보';

COMMENT ON COLUMN job_bbs.idx IS '글번호';

COMMENT ON COLUMN job_bbs.id IS '아이디';

COMMENT ON COLUMN job_bbs.sub IS '제목';

COMMENT ON COLUMN job_bbs.content IS '내용';

COMMENT ON COLUMN job_bbs.hit IS '조회수';

COMMENT ON COLUMN job_bbs.wdate IS '작성일';

ALTER TABLE job_bbs
	ADD
		CONSTRAINT PK_job_bbs
		PRIMARY KEY (
			idx
		);

/* 자유게시판 */
CREATE TABLE free_bbs (
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE free_bbs IS '자유게시판';

COMMENT ON COLUMN free_bbs.id IS '아이디';

COMMENT ON COLUMN free_bbs.sub IS '제목';

COMMENT ON COLUMN free_bbs.content IS '내용';

COMMENT ON COLUMN free_bbs.hit IS '조회수';

COMMENT ON COLUMN free_bbs.wdate IS '작성일';

ALTER TABLE free_bbs
	ADD
		CONSTRAINT PK_free_bbs
		PRIMARY KEY (
			id
		);

/* 수업자료실 */
CREATE TABLE lec_room (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE lec_room IS '수업자료실';

COMMENT ON COLUMN lec_room.idx IS '글번호';

COMMENT ON COLUMN lec_room.id IS '아이디';

COMMENT ON COLUMN lec_room.sub IS '제목';

COMMENT ON COLUMN lec_room.content IS '내용';

COMMENT ON COLUMN lec_room.hit IS '조회수';

COMMENT ON COLUMN lec_room.wdate IS '작성일';

ALTER TABLE lec_room
	ADD
		CONSTRAINT PK_lec_room
		PRIMARY KEY (
			idx
		);

/* FAQ */
CREATE TABLE FAQ (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE FAQ IS 'FAQ';

COMMENT ON COLUMN FAQ.idx IS '글번호';

COMMENT ON COLUMN FAQ.id IS '아이디';

COMMENT ON COLUMN FAQ.sub IS '제목';

COMMENT ON COLUMN FAQ.content IS '내용';

COMMENT ON COLUMN FAQ.hit IS '조회수';

COMMENT ON COLUMN FAQ.wdate IS '작성일';

ALTER TABLE FAQ
	ADD
		CONSTRAINT PK_FAQ
		PRIMARY KEY (
			idx
		);

/* 출결 */
CREATE TABLE att_bbs (
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sts NUMBER NOT NULL, /* 출결 상태 */
	att VARCHAR2(255) NOT NULL /* 출결 */
);

COMMENT ON TABLE att_bbs IS '출결';

COMMENT ON COLUMN att_bbs.id IS '아이디';

COMMENT ON COLUMN att_bbs.sts IS '출결 상태';

COMMENT ON COLUMN att_bbs.att IS '출결';

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

COMMENT ON TABLE online_test IS '온라인테스트';

COMMENT ON COLUMN online_test.qnum IS '문제번호';

COMMENT ON COLUMN online_test.question IS '문제';

COMMENT ON COLUMN online_test.example IS '보기';

COMMENT ON COLUMN online_test.answer IS '정답';

COMMENT ON COLUMN online_test.edu IS '과목';

ALTER TABLE online_test
	ADD
		CONSTRAINT PK_online_test
		PRIMARY KEY (
			qnum
		);

/* 성적확인게시판 */
CREATE TABLE grade_check (
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	edu VARCHAR2(255) NOT NULL, /* 과목1 */
	COL VARCHAR2(255), /* 과목2 */
	COL2 VARCHAR2(255), /* 과목3 */
	grade NUMBER NOT NULL /* 성적 */
);

COMMENT ON TABLE grade_check IS '성적확인게시판';

COMMENT ON COLUMN grade_check.id IS '아이디';

COMMENT ON COLUMN grade_check.edu IS '과목1';

COMMENT ON COLUMN grade_check.COL IS '과목2';

COMMENT ON COLUMN grade_check.COL2 IS '과목3';

COMMENT ON COLUMN grade_check.grade IS '성적';

ALTER TABLE grade_check
	ADD
		CONSTRAINT PK_grade_check
		PRIMARY KEY (
			id
		);

/* 고객센터 공지사항 */
CREATE TABLE cos_notice (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE cos_notice IS '고객센터 공지사항';

COMMENT ON COLUMN cos_notice.idx IS '글번호';

COMMENT ON COLUMN cos_notice.id IS '아이디';

COMMENT ON COLUMN cos_notice.sub IS '제목';

COMMENT ON COLUMN cos_notice.content IS '내용';

COMMENT ON COLUMN cos_notice.hit IS '조회수';

COMMENT ON COLUMN cos_notice.wdate IS '작성일';

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
	id VARCHAR2(255) /* 이름 */
);

COMMENT ON TABLE lec_create IS '강의개설';

COMMENT ON COLUMN lec_create.lname IS '강의명';

COMMENT ON COLUMN lec_create.sday IS '시작일';

COMMENT ON COLUMN lec_create.eday IS '종료일';

COMMENT ON COLUMN lec_create.edu IS '과목';

COMMENT ON COLUMN lec_create.tot IS '총원';

COMMENT ON COLUMN lec_create.id IS '이름';

/* 교육후기 */
CREATE TABLE lec_after (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE lec_after IS '교육후기';

COMMENT ON COLUMN lec_after.idx IS '글번호';

COMMENT ON COLUMN lec_after.id IS '아이디';

COMMENT ON COLUMN lec_after.sub IS '제목';

COMMENT ON COLUMN lec_after.content IS '내용';

COMMENT ON COLUMN lec_after.hit IS '조회수';

COMMENT ON COLUMN lec_after.wdate IS '작성일';

ALTER TABLE lec_after
	ADD
		CONSTRAINT PK_lec_after
		PRIMARY KEY (
			idx
		);

/* 수강생 */
CREATE TABLE Student (
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 비밀번호 */
	name VARCHAR2(255) NOT NULL, /* 이름 */
	phone VARCHAR2(30), /* 전화번호 */
	email VARCHAR2(40), /* 이메일 */
	birth VARCHAR2(13), /* 생년월일 */
	address VARCHAR2(255) /* 주소 */
);

COMMENT ON TABLE Student IS '수강생';

COMMENT ON COLUMN Student.id IS '아이디';

COMMENT ON COLUMN Student.pw IS '비밀번호';

COMMENT ON COLUMN Student.name IS '이름';

COMMENT ON COLUMN Student.phone IS '전화번호';

COMMENT ON COLUMN Student.email IS '이메일';

COMMENT ON COLUMN Student.birth IS '생년월일';

COMMENT ON COLUMN Student.address IS '주소';

ALTER TABLE Student
	ADD
		CONSTRAINT PK_Student
		PRIMARY KEY (
			id
		);

/* 취업현황 */
CREATE TABLE jop_cs (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	eduCurri VARCHAR2(255), /* 교육과정 */
	company VARCHAR2(255), /* 취업업체명 */
	field VARCHAR2(255) /* 취업분야 */
);

COMMENT ON TABLE jop_cs IS '취업현황';

COMMENT ON COLUMN jop_cs.idx IS '글번호';

COMMENT ON COLUMN jop_cs.id IS '아이디';

COMMENT ON COLUMN jop_cs.eduCurri IS '교육과정';

COMMENT ON COLUMN jop_cs.company IS '취업업체명';

COMMENT ON COLUMN jop_cs.field IS '취업분야';

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

COMMENT ON TABLE app_bbs IS '승인게시판';

COMMENT ON COLUMN app_bbs.idx IS '글번호';

COMMENT ON COLUMN app_bbs.wdate IS '작성일';

ALTER TABLE app_bbs
	ADD
		CONSTRAINT PK_app_bbs
		PRIMARY KEY (
			idx
		);

/* 직원 */
CREATE TABLE Staff (
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	pw VARCHAR2(255) NOT NULL, /* 패스워드 */
	name VARCHAR2(255) NOT NULL, /* 이름 */
	phone VARCHAR2(30) NOT NULL, /* 전화번호 */
	email VARCHAR2(40), /* 이메일 */
	birth VARCHAR2(13), /* 생년월일 */
	address VARCHAR2(255), /* 주소 */
	emp_num NUMBER, /* 사번 */
	affiliation VARCHAR2(255) /* 소속 */
);

COMMENT ON TABLE Staff IS '직원';

COMMENT ON COLUMN Staff.id IS '아이디';

COMMENT ON COLUMN Staff.pw IS '패스워드';

COMMENT ON COLUMN Staff.name IS '이름';

COMMENT ON COLUMN Staff.phone IS '전화번호';

COMMENT ON COLUMN Staff.email IS '이메일';

COMMENT ON COLUMN Staff.birth IS '생년월일';

COMMENT ON COLUMN Staff.address IS '주소';

COMMENT ON COLUMN Staff.emp_num IS '사번';

COMMENT ON COLUMN Staff.affiliation IS '소속';

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

COMMENT ON TABLE member IS '회원';

COMMENT ON COLUMN member.id IS '아이디';

COMMENT ON COLUMN member.pw IS '비밀번호';

COMMENT ON COLUMN member.name IS '이름';

COMMENT ON COLUMN member.phone IS '전화번호';

COMMENT ON COLUMN member.email IS '이메일';

COMMENT ON COLUMN member.birth IS '생년월일';

COMMENT ON COLUMN member.address IS '주소';

ALTER TABLE member
	ADD
		CONSTRAINT PK_member
		PRIMARY KEY (
			id
		);

/* 공지사항 */
CREATE TABLE notice_bbs (
	idx NUMBER NOT NULL, /* 글번호 */
	id VARCHAR2(255) NOT NULL, /* 아이디 */
	sub VARCHAR2(255) NOT NULL, /* 제목 */
	content VARCHAR2(255), /* 내용 */
	hit NUMBER, /* 조회수 */
	wdate DATE /* 작성일 */
);

COMMENT ON TABLE notice_bbs IS '공지사항';

COMMENT ON COLUMN notice_bbs.idx IS '글번호';

COMMENT ON COLUMN notice_bbs.id IS '아이디';

COMMENT ON COLUMN notice_bbs.sub IS '제목';

COMMENT ON COLUMN notice_bbs.content IS '내용';

COMMENT ON COLUMN notice_bbs.hit IS '조회수';

COMMENT ON COLUMN notice_bbs.wdate IS '작성일';

ALTER TABLE notice_bbs
	ADD
		CONSTRAINT PK_notice_bbs
		PRIMARY KEY (
			idx
		);

ALTER TABLE jop_af
	ADD
		CONSTRAINT FK_Staff_TO_jop_af
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE job_bbs
	ADD
		CONSTRAINT FK_Staff_TO_job_bbs
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE free_bbs
	ADD
		CONSTRAINT FK_Staff_TO_free_bbs
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE free_bbs
	ADD
		CONSTRAINT FK_Student_TO_free_bbs
		FOREIGN KEY (
			id
		)
		REFERENCES Student (
			id
		);

ALTER TABLE lec_room
	ADD
		CONSTRAINT FK_Staff_TO_lec_room
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE FAQ
	ADD
		CONSTRAINT FK_Staff_TO_FAQ
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE att_bbs
	ADD
		CONSTRAINT FK_Student_TO_att_bbs
		FOREIGN KEY (
			id
		)
		REFERENCES Student (
			id
		);

ALTER TABLE att_bbs
	ADD
		CONSTRAINT FK_Staff_TO_att_bbs
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE grade_check
	ADD
		CONSTRAINT FK_Student_TO_grade_check
		FOREIGN KEY (
			id
		)
		REFERENCES Student (
			id
		);

ALTER TABLE grade_check
	ADD
		CONSTRAINT FK_Staff_TO_grade_check
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE cos_notice
	ADD
		CONSTRAINT FK_Staff_TO_cos_notice
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE lec_create
	ADD
		CONSTRAINT FK_Staff_TO_lec_create
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE lec_after
	ADD
		CONSTRAINT FK_Staff_TO_lec_after
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE jop_cs
	ADD
		CONSTRAINT FK_Staff_TO_jop_cs
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);

ALTER TABLE notice_bbs
	ADD
		CONSTRAINT FK_Staff_TO_notice_bbs
		FOREIGN KEY (
			id
		)
		REFERENCES Staff (
			id
		);