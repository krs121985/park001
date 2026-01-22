<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>메뉴</title>

    <!-- google font CDN -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

    <!-- FontAwesome CDN -->
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css">

    <link rel="stylesheet" type="text/css" href="/home/resources/css/commons.css"> <!--href="/home/resources/css/commons.css"-->
    <style>
        
    </style>
</head>
<body>

    <!-- 컨테이너 -->
    <div class="container w-1300">
        <!-- 헤더 -->
        <div class="cell mt-0 mb-0">
            <div class="flex-box">
                <div class="w-25 left flex-box flex-center" style="justify-content: flex-start;">
                    <img src="/home/resources/images/tjoeun_logo.png" width="200" height="50">
                </div>
                <div class="w-50 center">
                    <h1>더조은컴퓨터아카데미 종로지점</h1>
                </div>
                <div class="w-25 right">
                    <h1>
                        <i class="fa-solid fa-phone"></i>
                        <span>(02) 000-0000</span>
                    </h1>
                </div>
            </div>
        </div>

        <!-- 메뉴 -->
        <div class="cell mt-0 mb-0">
            <div class="menu">
            <!-- (중요) 템플릿페이지는 어디서 실행될지 모르므로 경로를 절대경로로 작성해야 한다. -->
                <a href="/home/"><i class="fa-solid fa-house"></i>Home</a>
                <a href=""><i class="fa-solid fa-book"></i>Lecture</a>
                <a href="/home/views/board/list.jsp"><i class="fa-solid fa-list"></i>Board</a>
                <div class="seperator"></div>
                <a href="/home/views/member/join.jsp"><i class="fa-solid fa-user-plus"></i>회원가입</a>
                <a href="#"><i class="fa-solid fa-right-to-bracket"></i>로그인</a>
            </div>
        </div>

        <!-- 사이드바와 컨텐츠 -->
        <div class="cell mt-0 mb-0">
            <div class="flex-box" style="min-height: 450px;">
                <!-- 사이드바-->
                <div style="width: 200px;">사이드바</div>
                <!-- 컨텐츠 영역 -->
                <div class="flex-fill">