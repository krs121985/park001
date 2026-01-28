--데이터 수정(update)
--이미 등록된 데이터 중 원하는 항목을 변경하기 위한 구문
--구문형식 : update 테이블명 set 항목1=값1, 항목2=값2 [조건];
--조건이 없으면 모두 수정되기 때문에 사실상 조건을 무조건 써야함
--조건이 안맞으면 실행은 되는데 적용이 안되므로 성공과 실패에 대한 추가 판정이 필요(=삭제와 동일)

--(ex) 1번 몬스터의 이름을 '바보'로 변경
update pokemon set pokemon_name='바보' where pokemon_no=1;

--(Q) 1번 도서의 이름을 '테스트도서', 장르를 '교양', 가격을 100으로 변경
update book set book_title='테스트도서', book_genre='교양',book_price=100 where book_no=1;

--(Q) 2번 도서의 가격을 10% 인상
update book set book_price=book_price+book_price/100*10 where book_no=2;
update book set book_price=book_price*1.1 where book_no=2;

--(Q) 3번 강의에 대한 수강료를 20% 할인
update lecture set lecture_price=lecture_price - lecture_price/100*20 where lecture_no=4;
update lecture set lecture_price=lecture_price *0.8 where lecture_no=4;

--(ex) 포켓몬 수정 구문 (PK를 이용해서 나머지 정보를 변경)
update pokemon set pokemon_name=?, pokemon_type=? where pokemon_no=?;
--(ex) 도서 정보 수정 구문 (PK를 이용해서 나머지 정보를 변경)
update book set book_title=?, book_genre=?, book_pagecount=?, book_price=?, book_status=? where book_no=?;
--(ex) 강의 정보 수정 구문 (PK를 이용해서 나머지 정보를 변경)
update lecture set lecture_subject=?, lecture_category=?, lecture_duration=?, lecture_price=?, lecture_type=? where lecture_no=?;
