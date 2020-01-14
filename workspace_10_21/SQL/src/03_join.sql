--join----------------------------------------

select ename, deptno from emp where ename = 'SMITH';
select * from dept where deptno=20;


select ename, dname, loc
from emp, dept
where emp.deptno = dept.deptno;


select ename, dept.deptno, dname, loc
from emp, dept
where emp.deptno = dept.deptno and sal>2000 and dept.deptno = 10;

select ename, d.deptno, ename, loc
from emp e, dept d             
where e.deptno = d.deptno and e.sal>2000; //별칭 붙이는 순간 부터 별칭으로만 불러야함.

------------------Ansi join 표준------------------
-------Ansi join (,=>join) where =>on---------

select ename, d.deptno, ename, loc
from emp e join dept d             
on e.deptno = d.deptno;

------inner join
select ename, d.deptno, ename, loc
from emp e inner join dept d             
on e.deptno = d.deptno 
where e.sal>2000;                  ///위에 문장 두개 join으로 바꿔준것, 특별한 언급 없으면 다 inner join

-----outer join

----null이 있는 쪽에 (+) 마킹하세요
select ename, d.deptno, ename, loc
from emp e, dept d             
where e.deptno(+) = d.deptno ;

select ename, d.deptno, ename, loc
from emp e, dept d             
where e.deptno = d.deptno(+) ;

select ename, d.deptno, ename, loc
from emp e, dept d             
where e.deptno =(+) d.deptno ;


----ansi join에서 outter join
----right 쪽의 테이블이 마스터 테이블로 인식.처리. 
---
select ename, d.deptno, dname, loc
from emp e right outer join dept d
on e.deptno = d.deptno;


select ename, d.deptno, dname, loc
from emp e left outer join dept d
on e.deptno = d.deptno;


-----non equi join

select *
from salgrade;

select ename, job, sal, grade
from emp, salgrade;

---oracle join
select ename, job, sal, grade
from emp, salgrade
where sal between losal and hisal;

----anci join
select ename, job, sal, grade
from emp join salgrade
on sal between losal and hisal;

#####################################
----n개의 테이블 조인
####################################

select ename, job,dname, loc, sal, grade
from emp, dept, salgrade 
where emp.deptno = dept.deptno 
		and 
sal between losal and hisal;

---oracle join을  anci join으로
select ename, job,dname, loc, sal, grade
from emp
join dept
on emp.deptno = dept.deptno
join salgrade
on sal between losal and hisal
where sal>2000;

-----------self join(oracle)

select e.ename, m.ename 상사명
from emp e, emp m
where e.mgr = m.empno;

----------상사보다 급여가 많은 사원 출력(oracle join)
select e.ename, m.ename 상사명
from emp e, emp m
where e.mgr = m.empno and e.sal>m.sal;

---------anci join으로 ,, 상사가 없는 사장도 목록에 포함 시키기
select e.ename,e.sal, m.ename 상사명, m.sal
from emp e left outer join emp m
on e.mgr = m.empno(+)
where e.sal>m.sal;

-----join을 걸때 가장 기본적인 것은
----from 절에 테이블들을 나타내고
-------where에 조건을 걸어주어라.

------집계함수

select ename,round(sal) from emp;
select avg(sal) from emp;//ename 하면 에러
select round(avg(sal)) as 평균급여 from emp;


select count(empno), count(comm), count(mgr), round(avg(sal),2) from emp;

select count(*) from emp;

select count(job) from emp;
select count(dislike job) from emp;

select sum(sal), round(avg(sal)), sum(sal)/count(*)
from emp;

select round(avg(sal)) as 평균급여 from emp;

select round(avg(sal)) as 평균급여
from emp
where deptno = 10;


-----부서 번호별 평균 급여------
select deptno, round(avg(sal)) as 평균급여
from emp
group by deptno;

--------------
--select
--from
--where
--group by
--having
--order by
---------------

------부서 이름별 평균 급여----
select dept.deptno, dname, round(avg(sal)) as 평균급여
from emp,dept
where emp.deptno =  dept.deptno
group by dname, dept.deptno;

------안시조인
select  loc, round(avg(sal)) as "평균급여"
from emp,dept
where emp.deptno =  dept.deptno
group by loc
order by "평균급여" desc;


select  loc, round(avg(sal)) as "평균급여"
from emp join dept
on emp.deptno =  dept.deptno
group by loc
order by "평균급여" desc;

-----평균 급여가 2000이상인 사람들의 목록

select dept.deptno, dname, round(avg(sal)) as 평균급여
from emp,dept
where emp.deptno =  dept.deptno 
group by dname, dept.deptno
having avg(sal)>2000;
 
select dept.deptno, max(sal), min(sal), count(*), avg(sal) as "평균급여"
from emp, dept
where emp.deptno = dept.deptno
group by dept.deptno;

-----sub query---> 조건식이 필요할때 괄호 안에 다른 select문을 넣어주는 것.
--FORD 보다 급여가 많은 사원 목록;

 select sal
from emp
where ename = 'FORD'


select *
from emp
where sal > (select sal
from emp
where ename = 'FORD' );

----전체 평균 급여보다 적게 받는 사원 목록
select avg(sal)
from emp;


select *
from emp
where sal<(select avg(sal)
from emp);


select *
from emp
where sal=(select min(sal)
from emp);


select *
from emp
where sal=(select min(sal)
from emp group by deptno);
///single-row subquery returns more than one row 오류ㅣㅣㅣㅣㅣ
/// = 기호 다음에 하나의 값만 와야하는데 해당 식은 3개의 값이 목록처리 되기 때문에 비교가 불가능.
해결;;
select *
from emp
where sal in (select min(sal)
from emp group by deptno);


select *
from emp
order by deptno, sal;

---부서별 최고 급여를 받는 사원 목록-----
select *
from emp
where sal in (select max(sal)
from emp group by deptno);

select *
from emp
where (deptno, sal) in (select deptno, max(sal)
from emp group by deptno);

--상관관계 subquery문
--자신이 속한 부서의 평균 급여보다 급여가 적은 사원 목록

select *
from emp outer
where sal<(select avg(sal) from emp where deptno=outer.deptno)
order by deptno;


select deptno, avg(sal)
from emp
group by deptno;

=======================================
--rownum
======================================

select ename, job, sal, deptno from emp;
select rownum, ename, job, sal, deptno from emp;

select rownum, ename, job, sal, deptno from emp order by sal;

select rownum, ename, job, sal, deptno from (select * from emp order by sal);
-----subquery가 먼저 계산되기 때문에 , rownum을 제대로 붙여주고 싶다면 subquery문을..

select rownum, ename, job, sal, deptno 
from (select * from emp order by sal desc)
where rownum<4;


select rownum, ename, job, sal, deptno 
from (select * from emp order by sal desc)
where rownum between 1 and 4;

-------page 처리 구문(짱 중요함!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!)
select *
from(select rownum row#, ename, job, sal, deptno 
from (select * from emp order by sal desc)) 
where row# between 7 and 9;






















