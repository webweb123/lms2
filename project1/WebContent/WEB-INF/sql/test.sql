CREATE SEQUENCE free_bbs_sequ;
insert into STU_MEMBER values(1,'test1','test1','test1','test1','test1','test1','test1');
insert into APP_BBS_STU values(1,'test1','test1',sysdate,'test1','test1','test1','test1','test1',1);
insert into LEC_CREATE values(1,1,1,'test1',sysdate,sysdate,'test1',1);
insert into STUDENT values(1,1,'test1','test1','test1','test1','test1','test1','test1',1);
insert into FREE_BBS values(free_bbs_sequ.nextval,1,'test1','test1','test1',0,sysdate);


drop sequence stu_seq;
create sequence stu_seq start with 1001 maxvalue 1999;

create sequence t_seq start with 2001 maxvalue 2999;

create sequence a_seq start with 3001 maxvalue 3999;

create sequence j_seq start with 4001 maxvalue 4999;

create sequence c_seq start with 5001 maxvalue 5999;



select * from STU_MEMBER;

select * from EMP_MEMBER;
