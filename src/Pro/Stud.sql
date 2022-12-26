create table StudInfo(sr_no number primary key,Enrollment number,Pc number,Batch varchar(30),Subject varchar(30),sDate timestamp(2),stime timestamp(2)); 

select*from StudInfo;
delete from StudInfo where sr_no=1;
select*from StudInfo;
insert into StudInfo values(2,1713045,12,'Batch A','java',to_Date(sysdate,'dd-mm-yyyy'),localtimestamp(2));
select*from StudInfo;
delete from StudInfo where sr_no=1 and sr_no=2;
 select*from StudInfo;
delete from StudInfo where sr_no=1;
select*from StudInfo;
delete from studinfo where sr_no=2;
select*from StudInfo;
drop table studinfo;
select*from StudInfo;