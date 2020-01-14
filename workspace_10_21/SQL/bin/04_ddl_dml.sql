
drop table book;
commit;   ----완료//rollback 안먹혀욥


> create table book(
bookno number(5),
title varchar2(40),
author varchar2(30),
pubdate date
);
commit;   ----완료//rollback 안먹혀욥


rollback; ----취소
commit;   ----완료//rollback 안먹혀욥

select * from book;
	

---DML 구문을 다루어 봅싀다---
---insert, update, delete----

insert into book values(1, '야호', '초코머핀', sysdate);

insert into book values(2, '아메리카노', '레몬파운드', '2019/11/05');

insert into book values(2, '아메리카노', '레몬파운드', '2019/11/05');

insert into book values(3, '베게', '이불', '2018/11/15');

insert into book values(4, 'db', null, null);

insert into book values(4, 'db', null);---not enough value 오류 뜸

insert into book(bookno, title, author, pubdate) values(5, '텀블러', '펜', '18/03/23');


insert into book(bookno, author,pubdate , title) values(5, '텀블러', null, null);

insert into book(bookno, title) values(6, 'Spring');


delete from book;
rollack;

delete from book where bookno = 3;

select * from book;

delete from book where title is null;

update book set title = '~~~' where bookno = 5;

update book set title = '~~~', author = 'kim' where bookno = 5;


desc book;----테이블 구조를 보는 코드

alter table book add(price number(7));

update book set price = 0;
update book set price = 99.99;---자동 반올림, 정수 처리됨, 


alter table book modify(price number(7,2));---소수점 둘째 자리까지 표시하겠다는 뜻.
--------------------------------------------이미 값을 지정해준 상태에서는 수정 불가.. 
update book set price = null;


alter table book drop column price;

rename book to book2;
select * from book2;
rename book2 to book;
select * from book;

insert into book values (3, 'qkq', 'asdf', 18/02/04, 0);

delete from book;-----rollback 가능

truncate table book; ---rollback 불가능...........데이터만 삭제, 테이블 구조는 남아있음.

drop table book;------rollback 불가능...


select * from emp;
select * from dept;

create table emp2 as select * from emp;----emp 테이블의 결과를 기반으로 새로운 테이블을 만들어라..
create table dept2 as select * from dept;----

insert into dept (deptno, dname, loc) values(50, 'EDU', 'SEOUL');
insert into dept2 (deptno, dname, loc) values(50, 'EDU', 'SEOUL');


insert into dept (deptno, dname, loc) values(10, 'EDU', 'SEOUL');
insert into dept2 (deptno, dname, loc) values(10, 'EDU', 'SEOUL');


insert into emp(empno, ename, sal, deptno) 
			values(999, 'nayun', 10000, 90);
			--integrity constraint (SCOTT.FK_DEPTNO) violated - parent key not found
			
insert into emp(empno, ename, sal, deptno) 
			values(999, 'nayun', 4000, 50);


------제약조건 설정 방법---------
---CONSTRAINT PK_DEPT PRIMARY KEY,... 이런식으로.. 제약쓰
			
drop table book;
create table book(
		bookno number(5) PRIMARY KEY,
		title varchar2(40) unique,
		author varchar2(30),
		price number(7,2) 
							check(price>0),				
		pubdate date default sysdate
		);
			
insert into book(bookno, title, author, price)
values(1, 'java','홍길동', 900 );
commit;


insert into book(bookno, title, author, price)
values(1, 'java','홍길동', -900 );


drop table book;
create table book(
		bookno number(5) CONSTRAINT scott_book_PK PRIMARY KEY,
		title varchar2(40) unique,
		author varchar2(30),
		price number(7,2) 
		CONSTRAINT scott_book_price_check check(price>0),
		pubdate date default sysdate
		);
		
		
drop table book;
create table book(
		bookno number(5) ,
		title varchar2(40) unique ,
		author varchar2(30),
		price number(7,2) check(price>0),
		pubdate date default sysdate
		);		
		
alter table book add CONSTRAINT book_PK PRIMARY KEY(bookno);	
alter table book drop CONSTRAINT book_PK;		
		
	truncate table book;

===========================================================
emp2 dept2
============================================================


drop table emp2;
---------삭제하는 순서 무시하고 무조건 지우려고 할때 : cascade CONSTRAINT; 덧붙이면 됨..

create table emp2 as select * from emp;

drop table dept2;
create table dept2 as select * from dept;	
		
alter table emp2 add CONSTRAINT emp2_PK PRIMARY KEY(empno);		
alter table dept2 add CONSTRAINT dept2_PK PRIMARY KEY(deptno);		
		

alter table emp2 add CONSTRAINT empt2_FK_DEPTNO foreign key(deptno) REFERENCES dept2;		
		
alter table emp2 add CONSTRAINT emp2_PK_mgr foreign key(mgr) REFERENCES emp2  (


        ---------delete 조건 걸어줘야함 구글 검색 해볼것.);		



insert into emp2(empno, ename, sal, deptno, mgr)
values(1, 'java',900, 40,7902 );

insert into emp2(empno, ename, sal, deptno, mgr)
values(1, 'java',900, 40,7 );


-----TRANSACTION-----
-----트렌젝션--------
delete from emp where empno = 7902;

update emp set comm = 0 where empno=7902;




