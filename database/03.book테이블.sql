-- 도서 테이블, 시퀀스, 샘플데이터 3개 추가
create table book (
book_no number,
book_title varchar2(90),
book_genre varchar2(12),
book_pagecount number,
book_price number,
book_status varchar2(12)
);

create sequence book_seq;
create sequence book_seq minvalue 1 maxvalue 9999999999999999999999999999 increment by 1 start with 1 nocycle cache 20;

truncate table book;

insert into book(book_no, book_title, book_genre, book_pagecount, book_price, book_status)
values(book_seq.nextval, '어린왕자', '동화', 500, 15000, '대여불가');
insert into book(book_no, book_title, book_genre, book_pagecount, book_price, book_status)
values(book_seq.nextval, '조선왕조실록', '교양', 777, 50000, '대여가능');
insert into book(book_no, book_title, book_genre, book_pagecount, book_price, book_status)
values(book_seq.nextval, '자바의정석', '기술', 450, 35000, '대여중');
