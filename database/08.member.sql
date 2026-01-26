--회원테이블에 테이블 제약조건을 적용


create table member (
member_id varchar2(20) primary key,
member_pw varchar2(16) not null,
member_post varchar2(6),
member_address1 varchar2(300),
member_address2 varchar2(300),
--check(아이디는 소문자시작, 숫자와 소문자 합쳐서 5~20),
check(regexp_like(member_id, '^[a-z][a-z0-9]{4,19}$')),
--check(비밀번호는 대소문자, 숫자, 특수문자를 반드시 포함한 8~16자),
check(regexp_like(member_pw, '^[A-Za-z0-9!@#$]{8,16}$')),
check(regexp_like(member_pw, '^[A-Z]+')),
check(regexp_like(member_pw, '^[a-z]+')),
check(regexp_like(member_pw, '^[0-9]+')),
check(regexp_like(member_pw, '^[!@#$]+')),
--check(주소는 다 있거나 다 없거나 둘 중 하나만 가능)
--check((주소가 다 있거나)or(주소가 다 없거나))
check(
		(member_post is not null and member_address1 is not null and member_address2 is not null)
		or
		(member_post is null and member_address1 is null and member_address2 is null)
)
);

drop table member;
