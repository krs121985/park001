-- 날짜 데이터
-- 데이터베이스 정보는 기록이기 때문에 시간과 같이 저장하는 경우가 많다
-- 생년월일과 혼동하면 안됨 (날짜만 있는 데이터가 아니라 시간까지 같이 있어야 함)
-- 일반적으로 현재시각 정보로 설정되는 경우가 많음 (ex : 등록일, 제조일, 인증시각, ...)
-- 오라클에서 날짜데이터는 두 가지가 존재
--		1. date 
--		- 기존의 시간 저장방식
--		- 초까지만 저장 가능
--		- 자바에서는 java.sql.Date로 읽거나 쓰기 처리가 가능 (↔ java.time.LocalDate로 변환 가능)
--		- 현재시각은 sysdate라고 불러올 수 있다
--		2. timestamp
--		- 신규 시간 저장방식 
--		- 밀리초까지 저장 가능
--		- 자바에서는 java.sql.Timestamp로 읽거나 쓰기 처리가 가능 (↔ java.time.LocalDateTime으로 변환 가능)
--		- 현재시각은 systimestamp라고 불러올 수 있다

-- 샘플 상품 테이블
create table product (
product_code number primary key,
product_name varchar2(60) not null,
product_category varchar2(30) not null,
product_price number default 0 not null,
product_event char(1) default 'N' not null,
product_reg date default sysdate not null,
product_create date not NULL 
);

create sequence product_seq;

-- 데이터 등록 : 등록일은 현재시각으로, 제조일은 입력된 문자열을 날짜로 변경해서 처리
insert into product(
	product_code, product_name, product_category, 
	product_price, product_reg, product_create
)
values(
	product_seq.nextval, '게이밍 키보드', '가전', 
	200000, sysdate, to_date('2026-01-27 10:20:30', 'YYYY-MM-DD HH24:MI:SS')
);

-- 더미데이터 추가
INSERT INTO product VALUES (101, '게이밍 노트북', '가전', 1500000, 'Y', SYSDATE, TO_DATE('2025-12-01 09:30:21', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (102, '무선 마우스', '가전', 35000, 'N', SYSDATE, TO_DATE('2025-12-05 10:15:45', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (103, '기계식 키보드', '가전', 89000, 'N', SYSDATE, TO_DATE('2025-12-10 14:20:10', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (104, '4K 모니터', '가전', 450000, 'Y', SYSDATE, TO_DATE('2025-12-15 11:05:33', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (201, '기모 후드티', '의류', 59000, 'N', SYSDATE, TO_DATE('2025-12-20 16:40:55', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (202, '데님 팬츠', '의류', 49000, 'Y', SYSDATE, TO_DATE('2025-12-24 09:12:18', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (203, '캐시미어 코트', '의류', 290000, 'N', SYSDATE, TO_DATE('2025-12-25 13:55:01', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (301, '유기농 사과', '식품', 15000, 'Y', SYSDATE, TO_DATE('2026-01-01 08:30:00', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (302, '원두 500g', '식품', 22000, 'N', SYSDATE, TO_DATE('2026-01-03 10:45:22', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (303, '닭가슴살', '식품', 12000, 'Y', SYSDATE, TO_DATE('2026-01-05 17:10:40', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (401, '거실 조명', '가구', 125000, 'N', SYSDATE, TO_DATE('2026-01-07 11:25:15', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (402, '원목 식탁', '가구', 85000, 'N', SYSDATE, TO_DATE('2026-01-10 15:30:50', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (501, '보습 크림', '뷰티', 28000, 'Y', SYSDATE, TO_DATE('2026-01-12 09:05:11', 'YYYY-MM-DD HH24:MI:SS'));
INSERT INTO product VALUES (502, '클렌징 폼', '뷰티', 15000, 'N', SYSDATE, TO_DATE('2026-01-15 14:45:30', 'YYYY-MM-DD HH24:MI:SS'));


-- 조회
select * from product;

-- 조건을 통한 검색

-- 숫자
--1번 상품 검색
select * from product where product_code=1;

--10만원이상 상품검색
select * from product where product_price >= 100000;

--(Q) 10만원이상 100만원이하 상품검색
select * from product where product_price >= 100000 and product_price <= 1000000;
select * from product where product_price between 100000 and 1000000;

-- 문자
-- (Q) 가전제품 조회
select * from product where product_category = '가전' order by product_code asc;
-- (Q) 게이밍 제품 조회 : 시작검색은 like가 압도적으로 빠르고 나머진 instr()이 빠름
select * from product where instr(product_name, '게이밍') > 0 order by product_code asc;
select * from product where product_name like '게이밍%' order by product_code asc;
-- (Q) 행사 상품 조회
select * from product where product_event='Y' order by product_code asc;

-- 날짜 
-- to_char()를 이용하면 문자열로 바꿀 수 있다
-- extract()를 이용하면 원하는 부분을 숫자로 추출할 수 있다
-- 날짜 자체도 크기를 가지고 있다 (어제 < 오늘)

-- (ex) 2025년에 제조한 상품을 조회 - extract(추출항목 from 컬럼이름)
select * from product where extract(year from product_create) = 2025 order by product_code asc;
select * from product where to_char(product_create, 'YYYY-MM-DD') like '2025%' order by product_code asc;
select * from product 
where product_create 
	between to_date('2025-01-01 00:00:00', 'YYYY-MM-DD HH24:MI:SS') 
			and 
			to_date('2025-12-31 23:59:59', 'YYYY-MM-DD HH24:MI:SS')
order by product_code asc;
-- 날짜만 입력해서 검색하려고 하는 경우 처리할 수 있는 구문
select * from product 
where product_create 
	between to_date('2025-01-01'||' 00:00:00', 'YYYY-MM-DD HH24:MI:SS') 
			and 
			to_date('2025-12-31'||' 23:59:59', 'YYYY-MM-DD HH24:MI:SS')
order by product_code asc;

select * from product;
