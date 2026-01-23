-- 데이터를 추가하는 방법
-- insert into 테이블이름(데이터형식) values(실제데이터);

--1번, 이상해씨, 풀 데이터를 추가
insert into pokemon(pokemon_no, pokemon_name, pokemon_type) values(1, '이상해씨', '풀');

insert into pokemon(pokemon_no, pokemon_name, pokemon_type) values(25, '피카츄', '전기');
-- insert into pokemon(pokemon_no, pokemon_type, pokemon_name) values(25, '전기', '피카츄'); --가능

insert into pokemon(pokemon_no, pokemon_name, pokemon_type) values(26, '라이츄', '전기');
-- insert into pokemon values(25, '전기', '피카츄'); --가능하지만 권장하지 않음
