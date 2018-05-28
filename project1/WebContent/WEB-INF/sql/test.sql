CREATE SEQUENCE free_bbs_sequ;
insert into STU_MEMBER values(1,'test1','test1','test1','test1','test1','test1','test1');
insert into APP_BBS_STU values(1,'test1','test1',sysdate,'test1','test1','test1','test1','test1',1);
insert into LEC_CREATE values(1,1,1,'test1',sysdate,sysdate,'test1',1);
insert into STUDENT values(1,1,'test1','test1','test1','test1','test1','test1','test1',1);


insert into FREE_BBS values(free_bbs_sequ.nextval,1,'test1','test1','test1',0,sysdate);