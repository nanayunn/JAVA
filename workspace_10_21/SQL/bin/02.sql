select * from tab;
select * from emp;
select * from dept;
select ename,sal from emp;
select ename, hiredate from emp;
select ename, sal, sal*12 from emp;
select ename, sal, sal*12 as 연봉 from emp;
select ename, sal, sal*12 as 연 봉 from emp;//오류남
select ename, sal, sal*12 as "연 봉" from emp;//띄어쓰기 하고싶으면 따옴표 두개

rem//주의사항 : 오라클의 문자열은 ''입니다.

rem//jdbc:oracle:thin:@70.12.113.206:1521:xe
rem//SCOTT

select ename, sal, comm from emp;
select ename, sal, comm,nvl(comm,0) ,sal+comm as 총급여
from emp;
select ename, sal,comm ,sal+nvl(comm,0) as 총급여
from emp;


select empno, ename, job, nvl(to_char(mgr),'<TOP>') from EMP;

##문자열 연산자  :  ||

select empno || '  ' || ename || '   ' || job from EMP;

rem//select A(목록) from B(table)

select 20*20*3 from emp;//emp 테이블의 row의 갯수만큼 실행됨.

select 20*20*3 from dual;
rem// dual = 가상의 테이블

select  sysdate from dual;


distinct//중복제거 키워

----row의 제한을 걸어주는 WHERE 절 --------
select *
from emp
where deptno = 10;


select ename, job, hiredate
from emp
where deptno = 10;

select ename, job, hiredate, deptno 부서번호
from emp
where deptno = 10;


select ename, job, hiredate
from emp
where job = 'CLERK';

select ename, job, hiredate
from emp
where lower(job) = lower('manager');


select ename, job, hiredate
from emp
where hiredate = '81/05/01';


desc emp;

--between and 하한값 먼저 쓰세용---

select ename, job, sal
from emp
where sal >=2000 and sal<=3000;

select ename, job, sal
from emp
where sal not between 2000 and 3000;


select ename, job, sal
from emp
where deptno in(10,20);



select ename, job, sal
from emp
where (deptno, loc) in((10,'DALLAS'),(20,'CHICAGO'));//에러;;


select *
from dept
where (deptno, loc) in((20,'DALLAS'),(30,'CHICAGO'));

----------Like 연산자---------
select *
from emp
where ename like '%A%';


select *
from emp
where upper(ename) like upper('%Al%');

--81년도 입사한 사원의 목록 --
select ename, job, hiredate
from emp
where hiredate like '81%';


---이름이 A또는 B또는 C로 시작하는 사원의 목록(정규식)

select ename, job
from emp
where ename between 'A%' and 'F%';


select ename, job
from emp
where ename like 'A%' or ename like 'B%';
or ename like 'C%' or ename liek 'D%';


---------정규 표현식-----------
select *
from emp
where regexp_like(ename, A|B|C|D);//A나 B나 C나 D가 이름에 포함된.

select *
from emp
where regexp_like(ename,'[A-D]');//위에랑 똑같게.


select *
from emp
where regexp_like(ename,'^[A-D]');//시작하는


select *
from emp
where regexp_like(ename,'[A-D]$');//끝나는


----where 절에서 null 체크-------------------------

select *
from emp
where comm is null;//null표현은  is로 받아줘야함.

select *
from emp
where comm is not null;


select ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp;

--------where 절에서는 별칭 사용 안됨.
select ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
where sal+nvl(comm, 0)>=2000;

-----정렬-----------------

select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
order by deptno;//오름차순

select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
order by deptno desc;//내림차순


select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
order by 총급여 desc;//별칭 쓸수 있음!!!!!!!!!!!!!!!!!!!


select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
order by 5 desc;//선택한 5가지 중 5번째에 해당하는 것을 기준으로 정렬.

select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
order by deptno, 총급여;//1차 2차 기준도 설정 가능함. 

select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여
from emp
order by deptno desc, 총급여;//따로 내림, 오름차순 설정도 가능!!

----순서쓰-------------
#select 
#from
#where
#order by
---------------------------------------------------------------------

select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여 
from emp 
where deptno in (10,20) 
order by 총급여;


select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여 
from emp 
where deptno =any (10,20) 
order by 총급여;


select deptno,ename,sal, comm, sal+nvl(comm, 0) as 총급여 
from emp 
where deptno <> all(10,20) 
order by 총급여;

------------단일형 함수--------

select * from DEPT;

select dname, lower(dname), loc, lower(loc) from DEPT;

select round(45.567,3), trunc(45.567) from dual;

select sysdate, sysdate+30 from dual;

select ename, hiredate, substr(hiredate,1,2) 입사년도
from emp;


select sysdate, to_char(sysdate,'YYYY') from dual;
select sysdate, to_char(sysdate,'YY') from dual;
select sysdate, to_char(sysdate,'MM') from dual;
select sysdate, to_char(sysdate,'DD') from dual;
select sysdate, to_char(sysdate,'day') from dual;

-----------emp에서 사원들의 입사월 출력-------

select ename, hiredate, to_char(hiredate,'MM') 입사월 
from emp
order by 입사월;

select sysdate, to_date('2019/11/05') from dual;
select sysdate, to_date('2019 11 05') from dual;
select sysdate, to_date('2019_11_05') from dual;
select sysdate, to_date('19/11/05') from dual;
select sysdate, to_date('19/11/05', 'YY/MM/DD') from dual;//날짜정보 필수


select ename, nvl(comm,'_') from emp;//이건 오류남
select ename, nvl(to_char(comm),'_') from emp;//문자열로 바꾸어주어서 실행됨. null을 언더바 처리


------decode 함수

select ename, sal, deptno, sal*1.2 from emp;

select ename, sal, deptno, sal*1.3
from emp
where deptno = 20;
select ename, sal, deptno, sal*1.2
from emp
where deptno = 10;

-----------위에 두개를 decode함수로 한문장으로.

select ename, sal, deptno, decode(deptno, 10, sal*1.2, 
                                          20, sal*1.3,
                                              sal) as 인상급여
from emp
order by deptno;

















