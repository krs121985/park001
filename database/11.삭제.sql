-- 데이터 삭제(Delete)
-- 구문 : delete [from] 테이블이름 [조건];
-- 다 지우는 경우는 없으므로 사실상 조건을 무조건 써야 한다
-- from은 select와 혼동되므로 제거하고 사용
-- 기본키(Primary key)를 이용하여 단 하나의 데이터만 삭제하는것이 일반적인 형태

delete pokemon;--전체삭제
delete pokemon where pokemon_no = 22;--하나만삭제
