--Top N Query
--oracle11이전과 12이후가 다소 차이가 나는 문법
--Top10, Top100과 같이 원하는 구간만큼을 잘라서 조회하는 법
--일반 구문인데, 이름이 붙어있는 유일무이 존재

--1. 데이터를 내가 원하는 형태로 검색 및 정렬
select * from history order by history_no desc;

--2 1번데이터에 줄번호를 추가 (rownum이라는 오라클에서 제공하는 줄번호 도우미를 이용)
--select rownum, TMP.*from(1번코드)TMP;
SELECT rownum, TMP.* FROM (
	SELECT * FROM history ORDER BY history_no DESC
) TMP;

--3. 2번데이터의 결과에서 rownum으로 원하는 구간 검색
--select * from(2번코드) where rownum between 1 and 10;
select * from(
SELECT rownum rn, TMP.* FROM (
	SELECT * FROM history ORDER BY history_no DESC
) TMP
) where rn between 11 and 20;
