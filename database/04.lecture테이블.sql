-- 강좌 테이블(lecture) 생성 및 시퀀스 생성, 데이터 추가

create table lecture (
lecture_no number,
lecture_subject varchar2(60),
lecture_category char(6),
lecture_duration number,
lecture_price number,
lecture_type varchar2(12)
);

create sequence lecture_seq;

insert into lecture(
	lecture_no, lecture_subject, lecture_category, 
	lecture_duration, lecture_price, lecture_type
)
values(lecture_seq.nextval, '자바 프로그래밍 기초', '이론', 60, 500000, '온라인');

insert into lecture(
	lecture_no, lecture_subject, lecture_category, 
	lecture_duration, lecture_price, lecture_type
)
values(lecture_seq.nextval, '파이썬 프로그래밍 기초', '이론', 90, 1000000, '오프라인');

insert into lecture(
	lecture_no, lecture_subject, lecture_category, 
	lecture_duration, lecture_price, lecture_type
)
values(lecture_seq.nextval, '정보처리기사 필기', '시험', 30, 300000, '혼합');

insert into lecture(
	lecture_no, lecture_subject, lecture_category, 
	lecture_duration, lecture_price, lecture_type
)
values(lecture_seq.nextval, '빅데이터 분석기사 실기', '시험', 120, 850000, '혼합');
