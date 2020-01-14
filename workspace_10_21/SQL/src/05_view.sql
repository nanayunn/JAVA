--각 부서에서 최대 급여를 받는 사원의 목록
select *
from emp
where 
(deptno, sal) in (select deptno, max(sal) from emp group by deptno);

create view max_sal_dept
as 
select *
from emp
where 
(deptno, sal) in (select deptno, max(sal) from emp group by deptno);


select deptno, ename, sal from max_sal_dept;


create or replace view max_sal_dept
as 
select *
from emp
where 
(deptno, sal) in (select deptno, max(sal) from emp group by deptno);



==================================================
---시퀀스
=========================================

delete from emp2;
delete from dept2;

create sequence dept_seq;

insert into dept2 (deptno, dname, loc) values(dept_seq.nextval, 'EDU', 'SEOUL');


select dept_seq.currval from dual;
select dept_seq.nextval from dual;

drop sequence dept_seq;
create sequence dept_seq start with 10 increment by 10;

delete from dept2;
commit;


insert into dept2 (deptno, dname, loc) 
values((select nvl(MAX(deptno),0)+10 from dept2), 'EDU', 'SEOUL');


select nvl(MAX(deptno),0)+10 from dept2;


=================================

delete from dept where deptno=10;
select * from emp;

alter table emp drop CONSTRAINT FK_DEPTNO;

alter table emp
add CONSTRAINT FK_DEPTNO
foreign key(deptno) REFERENCES dept on delete set null; 

alter table emp
add CONSTRAINT FK_DEPTNO
foreign key(deptno) REFERENCES dept on delete cascade; 

----on delete set null; //


delete from dept where deptno=10;



.;c:\lib\o
















