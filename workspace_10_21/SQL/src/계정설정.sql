sqlplus system/1234

conn hr/hr;

conn system/1234;

alter user hr identified by hr account unlock;

conn hr/hr;
sqlplus hr/hr

select * from tab; //table list 확인

select *from employees;

TableSPACE
=====================================
conn system/1234

create TABLESPACE mc///만든거
 datafile 'C:\oraclexe\app\oracle\oradata\XE\mc.dbf'
 size 10M
 autoextend on next 1M maxsize UNLIMITED;

 drop TABLESPACE mc  INCLUDING CONTENTS AND Datafiles;//삭제

Select tablespace_name from dba_tablespaces


=====================================
계정생성
==================================

create user test01 identified by 1234    //계정 생성
default tablespace mc;

grant connect,resource,dba to test01; //계정에게 권한 부여 해준거.

revoke dba from test01; //권한 줬다 뺏기;
revoke connect from test01;

drop user test01 cascade//계정 완벽 삭제;/

==========================
SCOTT/TIGER 계정생성
=====================

scottcreate user SCOTT identified by TIGER
default tablespace mc;


scott.sql 파일 준비
@C:\lib\scott.sql;

set linesize 300;
set pagesize 20;

col ename for a14;
col job for a14;
col deptno for 9999;
col sal for 9999;

