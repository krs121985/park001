-- 조건(condition)
-- 테이블에서 원하는 조건에 맞는 데이터만 필터링하는 기법
-- (주의) 정렬보다 반드시 앞에 작성되어야 함


-- 21번 포켓몬만 조회
-- 비교연산 6가지중에서 딱 한가지인 같다(=)가 자바(==)의 같다와 다르다. 나머지는 동일
select * from pokemon where pokemon_no = 21;

-- 전기 속성의 포켓몬만 조회
select * from pokemon where pokemon_type = '전기' order by pokemon_no asc;

-- 전기 속성의 라이츄 이름의 몬스터 조회 (AND)
select * from pokemon where pokemon_type = '전기' and pokemon_name = '라이츄' order by pokemon_no asc;

-- 전기 또는 불 속성의 몬스터 조회 (OR)
select * from pokemon where pokemon_type = '전기' or pokemon_type = '불'
order by pokemon_type asc, pokemon_no asc;
