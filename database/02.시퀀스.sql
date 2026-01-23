-- 시퀀스(sequence) : 설정한 범위에서 자동으로 번호가 부여되는 번호 발급기 (테이블처럼 객체의 한 종류)
create sequence pokemon_seq;
drop sequence pokemon_seq;

-- 번호를 시퀀스에게 맡기고 {이상해씨, 풀} 을 등록
insert into pokemon(pokemon_no, pokemon_name, pokemon_type) 
values(pokemon_seq.nextval, '이상해씨', '풀');

-- 번호를 시퀀스에게 맡기고 {피카츄, 전기} 을 등록
insert into pokemon(pokemon_no, pokemon_name, pokemon_type)
values(pokemon_seq.nextval, '피카츄', '전기');

-- 번호를 시퀀스에게 맡기고 {라이츄, 전기} 을 등록
insert into pokemon(pokemon_no, pokemon_name, pokemon_type)
values(pokemon_seq.nextval, '라이츄', '전기');
