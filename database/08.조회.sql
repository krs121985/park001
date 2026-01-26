-- 조회(select)
-- 데이터베이스 테이블에 존재하는 데이터를 원하는 목표에 맞게 불러오는 것
-- 구문형식 : select 항목 from 테이블 [조건] [그룹] [정렬];
-- 대괄호 표시한 부분은 생략 가능함
-- 등록과 방향이 반대라는것에 유의해야함

-- pokemon 테이블에서 pokemon_name을 조회하세요
select pokemon_name from pokemon;

-- pokemon 테이블의 모든 항목을 조회하세요
select pokemon_no, pokemon_name, pokemon_type from pokemon;
select pokemon.* from pokemon;
select * from pokemon;

-- pokemon 테이블의 모든 항목과 이름의 글자수를 조회하세요
select pokemon_no, pokemon_name, pokemon_type, length(pokemon_name) from pokemon;
select pokemon.*, length(pokemon_name) from pokemon;
--select *, length(pokemon_name) from pokemon;--불가능

-- (Q) 강좌명과 수강료를 조회하여 출력
select lecture_subject, lecture_price from lecture;

-- (Q) 국가에서 지원금이 20만원이 나온다고 가정했을 때, 
-- 	   수강료에서 실제 본인이 부담하는 비용을 같이 출력
select lecture_subject, lecture_price, lecture_price - 20000 from lecture;
select lecture_subject, lecture_price, greatest(lecture_price - 20000, 0) from lecture;
