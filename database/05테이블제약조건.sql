--테이블 제약조건(table constraint)
--테이블에 부적합한 데이터가 들어가는것을 방지(유효한 데이터만 저장, 무결성 보장)
--[1] 필수항목 조건 : not null
--[2] 중복방지 조건 : unique
--[3] 특수상황 조건 : check
--[4] 미지정값 조건 : default
--[5] 기본키 조건 : primary key
--[6] 외래키 조건 : foreign key

drop table pokemon;
create table pokemon(
pokemon_no number not null unique,
pokemon_name varchar2(30) not null,
pokemon_type varchar2(30) not null,
--check(pokemon_type이 땅, 불, 물, 바람, 전기, 풀, 독, 비행 중 하나)
check(pokemon_type in ('땅', '불', '물', '바람', '전기', '풀', '독', '비행'))
);

drop sequence pokemon_seq;
create sequence pokemon_seq;

insert into pokemon(pokemon_no, pokemon_name, pokemon_type) 
values(pokemon_seq.nextval, '이상해씨', '풀');

insert into pokemon(pokemon_no, pokemon_name, pokemon_type) 
values(pokemon_seq.nextval, '디그다', '무속성');

--DELETE FROM POKEMON WHERE POKEMON_NO = 3;
