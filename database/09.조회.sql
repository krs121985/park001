-- 정렬(order)
-- 데이터를 원하는 순서대로 배치하는 것
-- (ex) 번호순, 이름순, 최신순, 랭킹순, 포인트순, ...
-- 종류는 오름차순(ascending)과 내림차순(descending)이 존재
-- 조회 결과가 여러개라면 반드시 1가지 이상의 정렬을 해야 한다 (가급적 PK를 선호)


-- 포켓몬을 번호순으로 정렬하여 조회
select * from pokemon order by pokemon_no asc;

-- 포켓몬을 최근 등록순으로 정렬하여 조회
select * from pokemon order by pokemon_no desc;

-- 포켓몬을 타입별로 정렬
select * from pokemon order by pokemon_type asc, pokemon_no asc;

-- (Q) 도서를 페이지수가 많은 순으로 정렬
select * from book order by book_pagecount desc, book_no asc;
-- (Q) 강좌를 강의시간이 짧은 순으로 정렬
select * from lecture order by lecture_duration asc, lecture_no asc;

-- (Q) 도서를 1page당 가격이 가장 적은 순으로 정렬
--select * from book order by book_price / book_pagecount asc;
select book.*, book_price / book_pagecount from book 
order by book_price / book_pagecount asc, book_no asc;

-- (Q) 강좌를 시간당 수강료가 가장 저렴한 순으로 정렬
select lecture.*, lecture_price / lecture_duration from lecture
order by lecture_price / lecture_duration asc, lecture_no asc;
