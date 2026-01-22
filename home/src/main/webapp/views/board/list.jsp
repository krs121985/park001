<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/views/template/header.jsp"></jsp:include>

<h1>자유 게시판</h1>
<div class="container w-1000 mt-50 mb-50">
        <div class="cell center">
            <h1>자유 게시판</h1>
        </div>
        <div class="cell center">자유로운 일상생활 이야기를 나눠보세요!</div>
        <div class="cell mt-40">
            <!-- 테이블은 사용자의 편의를 위해 내용에 따라 폭을 조정을 하므로 이를 제거해야 말줄임표 처리가 가능 -->
            <table class="grid hover" style="table-layout: fixed;">
                <thead>
                    <tr>
                        <th>번호</th>
                        <th width="50%">제목</th>
                        <th>작성자</th>
                        <th>작성일</th>
                        <th>조회수</th>
                    </tr>
                </thead>
                <tbody class="center">
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sed congue nunc. Praesent ullamcorper eu purus ut aliquet. Vivamus vel arcu pharetra, tempor tellus sit amet, vestibulum ligula. Vivamus ultrices odio id augue convallis, vel porta orci lobortis. In hac habitasse platea dictumst. Cras vulputate tempor augue, in volutpat arcu varius eget. Sed ipsum tortor, ultricies vel vehicula et, ullamcorper ut massa. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos.</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                    <tr>
                        <td>N</td>
                        <td class="left ellipsis">어쩌구저쩌구 얼씨구절씨구...</td>
                        <td>아무개</td>
                        <td>YYYY-MM-DD</td>
                        <td>000</td>
                    </tr>
                </tbody>
            </table>
        </div>
        <div class="cell center">
            <!-- 페이지 네비게이터(page navigator)혹은 페이지네이션(pagination) -->
            <div class="pagination">
                <a href="#">&lt;</a>
                <a href="#">1</a>
                <a href="#" class="on">2</a>
                <a href="#">3</a>
                <a href="#">4</a>
                <a href="#">5</a>
                <a href="#">6</a>
                <a href="#">7</a>
                <a href="#">8</a>
                <a href="#">9</a>
                <a href="#">10</a>
                <a href="#">&gt;</a>
            </div>
        </div>
        <div class="cell center">
            <form action="#" autocomplete="off">
                <select name="column" class="form-input">
                    <option>제목</option>
                    <option>작성자</option>
                    <option>제목+내용</option>
                </select>
                <input type="text" name="keyword" placeholder="검색어 입력" class="form-input">
                <button type="submit" class="form-btn positive">검색</button>
            </form>
        </div>
    </div>

<jsp:include page="/views/template/footer.jsp"></jsp:include>