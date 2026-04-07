ALTER SESSION SET "_ORACLE_SCRIPT" = true;

CREATE USER spring IDENTIFIED BY java1234;

GRANT CONNECT, CREATE TABLE, CREATE SEQUENCE, CREATE VIEW, CREATE PROCEDURE, CREATE TRIGGER TO spring;

ALTER USER spring DEFAULT TABLESPACE users
               QUOTA UNLIMITED ON users
               TEMPORARY TABLESPACE temp;


-- spring
select * from tabs;

create table tblAddress(
    seq number PRIMARY KEY ,
    name varchar2(30) NOT NULL ,
    age number(3) NOT NULL ,
    address varchar2(300) NOT NULL ,
    gender char(1) NOT NULL
);
create SEQUENCE seqAddress;

insert into TBLADDRESS (seq, name, age, address, gender) VALUES (seqAddress.nextval,'홍길동', 20, '서울시 강남구 대치동', 'm');
insert into TBLADDRESS (seq, name, age, address, gender) VALUES (seqAddress.nextval,'강아지', 3, '서울시 강남구 역삼동', 'm');
insert into TBLADDRESS (seq, name, age, address, gender) VALUES (seqAddress.nextval,'고양이', 2, '서울시 강동구 천호동', 'f');
insert into TBLADDRESS (seq, name, age, address, gender) VALUES (seqAddress.nextval,'병아리', 1, '서울시 강동구 둔촌동', 'm');
insert into TBLADDRESS (seq, name, age, address, gender) VALUES (seqAddress.nextval,'거북이', 100, '서울시 강동구 길동', 'm');

SELECT * FROM TBLADDRESS;
commit;

select * from TBLADDRESS where age < 10;


select * from tblAddress
			where gender = 'm';

select * from tblAddress
			where age < 10
			and gender = 'm'
			and address like '%강남%'