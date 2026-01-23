drop table book;
create table book (
--book_no number not null unique,
book_no number primary key,
book_title varchar2(90) not null,
book_genre varchar2(12) not null,
book_pagecount number not null,
book_price number not null,
--book_status varchar2(12) not null,
book_status varchar2(12) default '대여불가' not null,
check(book_genre in ('기술','교양','시사','동화','미스터리','정치','경제')),
check(book_pagecount > 0),
check(book_price >= 0),
check(book_status in ('대여가능', '대여중', '대여불가'))
);

insert into book(book_no, book_title, book_genre, book_pagecount, book_price, book_status)
values(book_seq.nextval, '어린왕자', '동화', 500, 15000, '대여가능');

insert into book(book_no, book_title, book_genre, book_pagecount, book_price)
values(book_seq.nextval, '전산세무 2급', '기술', 720, 27000);
