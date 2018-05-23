insert into STAFF values('2222','2222','3333','4444','4444','4444','4444',1,'4444');
insert into FREE_BBS (id) values ('2222');
insert into GRADE_CHECK(edu) values 'test';
commit
select * from staff;
select * from FREE_BBS
select id from STAFF where id='2222'
alter table free_bbs drop constraint fk_id;