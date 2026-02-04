-- count 구하기
-- 오라클에서 제공하는 함수를 사용
-- 비슷한 유형으로 min, max, sum, avg 등이 존재
-- 어떤 테이블에 사용해도 결과는 1개만 나옴
-- 와일드카드 사용 가능

select count(history_no) from history;
select min(history_no) from history;
select max(history_no) from history;

select count(member_id) from member;
select count(book_no) from book;
select count(pokemon_no) from pokemon;

select count(*) cnt  from history;
select count(*) cnt  from member;
select count(*) cnt  from book;
select count(*) cnt  from pokemon;

select count(*) cnt from history where instr(history_member, 'testuser001') > 0;
select count(*) cnt from history where history_time BETWEEN 
to_date('2026-02-01 10:00:00',' YYYY-MM-DD HH24:MI:SS')
and
to_date('2026-02-04 10:00:00',' YYYY-MM-DD HH24:MI:SS')
