-- OpenAPITest > script.sql

-- 마커 테이블(좌표)
create table tblMarker (
    seq number primary key,     --PK
    lat number not null,        --위도(Latitude)
    lng number not null         --경도(Longitude)
);

create sequence seqMarker;

/*
한독빌딩 : 37.499330, 127.033181
역삼역 : 37.500089, 127.035399
롯데리아 : 37.498556, 127.030443
국민은행 : 37.499707, 127.032141
신한은행 : 37.499944, 127.035494
파리바게뜨 : 37.499378, 127.034302
뚜레쥬르 : 37.499097, 127.034532
세븐일레븐 : 37.499028, 127.033160
CU : 37.498798, 127.033485
세븐스프링스 : 37.498982, 127.032267
*/

insert into tblMarker values (seqMarker.nextVal, 37.499330, 127.033181);
insert into tblMarker values (seqMarker.nextVal, 37.500089, 127.035399);
insert into tblMarker values (seqMarker.nextVal, 37.498556, 127.030443);
insert into tblMarker values (seqMarker.nextVal, 37.499707, 127.032141);
insert into tblMarker values (seqMarker.nextVal, 37.499944, 127.035494);
insert into tblMarker values (seqMarker.nextVal, 37.499378, 127.034302);
insert into tblMarker values (seqMarker.nextVal, 37.499097, 127.034532);
insert into tblMarker values (seqMarker.nextVal, 37.499028, 127.033160);
insert into tblMarker values (seqMarker.nextVal, 37.498798, 127.033485);
insert into tblMarker values (seqMarker.nextVal, 37.498982, 127.032267);

select * from tblMarker;
commit;



create table tblUser(
    id varchar2(30) PRIMARY KEY ,
    pw varchar2(30) not null,
    name varchar2(30) not null


);


INSERT INTO tblUser values ('hong', '1111', '홍길동');
INSERT INTO tblUser values ('dog', '1111', '강아지');
INSERT INTO tblUser values ('cat', '1111', '고양이');

commit;

drop table TBLPROJECT;
drop table tblpoint;

select * from tbladdress;


select a.* from (select * from tblAddress order by seq desc) a
            where rownum  <=5;

select * from
            (select a.*, rownum as rnum from
                (select * from tblAddress order by seq desc) a)
        where rnum between 6 and 10;






