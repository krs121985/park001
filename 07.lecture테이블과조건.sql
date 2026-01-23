drop table lecture;
create table lecture (
--lecture_no number not null unique,
lecture_no number primary key,
lecture_subject varchar2(60) not null,
lecture_category char(6) not null,
lecture_duration number not null,
lecture_price number not null,
lecture_type varchar2(12) default '오프라인' not null,
check(lecture_category in ('이론', '실습', '시험')),
check(lecture_duration > 0 and mod(lecture_duration, 30) = 0),
check(lecture_type in ('온라인','오프라인','혼합'))
);
