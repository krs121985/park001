-- 공지사항만 조회할일이 앞으로도 다양하게 있을 것 같다면...  (ex : 검색 등)
-- `뷰(view)`라는 것을 생성하여 이 구문을 테이블처럼 저장해둘 수 있다
-- (중요) view는 create view라는 권한이 있어야 만들 수 있다 (connect, resource에 미포함)
-- 관리자로 로그인하여 `grant create view to the01`을 실행하여 권한을 부여한다

-- board_notice라는 이름으로 공지사항만 조회하는 뷰를 생성
create view board_notice as
select 
	board_no, board_head, board_title, board_writer, 
	board_read, board_reply, board_like, board_wtime, board_etime 
from board
where board_head = '공지';

-- 조회를 뷰 이름으로 할 수 있다
select * from board_notice;
