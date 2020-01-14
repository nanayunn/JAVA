문제1. Query 문장을 작성하십시오.
select e.employee_id, e.first_name, d.department_name, m.first_name
from employees e, departments d, employees m
where e.department_id = d.department_id and e.manager_id = m.employee_id;

----------------------------------------------------------------------------------
문제2. 자신의 매니저보다 연봉(salary)을 많이 받는 직원들의 성(last_name)과 연봉(salary)을 출력하시오. 

select e.last_name, e.salary, m.last_name as 상사이름, m.salary as 상사연봉
from employees e, employees m
where e.manager_id = m.employee_id
and e.salary>m.salary;
----------------------------------------------------------------------------------

문제3. 회원 관리를 위한 users 테이블을 생성합니다.
로그인에 필요한 id 정보와 pw 정보는 필수입니다.

테이블 생성문
create table users( 
id varchar2(12) CONSTRAINT scott_id_PK PRIMARY KEY, 
password varchar2(12) CONSTRAINT scott_pw not null, 
name varchar2(10) not null);

회원 등록 sql 구문
insert into users(id, password, name, date_of_birth) 
values('commi3010', '1234', '김나윤');

로그인 sql 구문
select * from users where id =? and pw =?;

