--데이터베이스 외래키(Foreign Key, FK)
--다른 테이블과 연결되는 항목
--테이블 생성 시 references 키워드를 이용해서 대상 테이블과 항목을 지정
--지정하는 항목은 반드시 unique여야하며, 일반적으로 primary key를 지정
--(장점)연결된 대상에 존재하는 데이터만 등록이 가능하도록 자동검사가 수행
--(단점)history에 데이터가 있으면 member 데이터 삭제가 안됨
--단점을 해결하려면 삭제 조건을 작성해야한다
-- 'on delete cascade' : 연결된 항목 삭제되면 현재 항목도 같이 삭제
-- 'on delete set null' : 연결된 항목이 삭제되면 현재 칸만 null로 변경

create table history (
history_no number primary key,
history_time date default sysdate not null,
--history_member
history_member references member(member_id) on delete cascade not null,
history_origin varchar2(45),
history_agent varchar2(512)
);

create sequence history_seq;

select * from history;

select * from member;
