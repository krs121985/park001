<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>캐러셀 컴포넌트</title>

    <!-- google font CDN -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

    <!-- FontAwesome CDN -->
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css">

    <!-- swiper cdn -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/swiper@12/swiper-bundle.min.css"/>

    <link rel="stylesheet" type="text/css" href="../css/commons.css">
    <style>
        
    </style>

    <!-- swiper cdn -->
    <script src="https://cdn.jsdelivr.net/npm/swiper@12/swiper-bundle.min.js"></script>

    <!-- 홈페이지에 영향을 주는 코드를 작성하는 공간 -->
    <script type="text/javascript">
        function app() {
            var swiper01 = new Swiper('.demo-01', {
                // direction: 'vertical',//슬라이드 방향(horizontal / vertical)
                loop: true,//양 끝 슬라이드의 연결 여부

                // autoplay: true,//자동재생 ON (기본옵션)
                autoplay: {//자동재생 ON (상세옵션)
                    delay: 2000,//재생 딜레이(ms)
                    pauseOnMouseEnter:true,//마우스가 있으면 자동재생 일시정지
                },

                // If we need pagination
                pagination: {
                    el: '.swiper-pagination', //적용될 대상 선택자
                },

                // Navigation arrows
                navigation: {
                    nextEl: '.swiper-button-next', //적용될 대상 선택자
                    prevEl: '.swiper-button-prev', //적용될 대상 선택자
                },
            });

            var swiper02 = new Swiper('.demo-02', {
                // direction: 'vertical',//슬라이드 방향(horizontal / vertical)
                loop: true,//양 끝 슬라이드의 연결 여부

                // autoplay: true,//자동재생 ON (기본옵션)
                autoplay: {//자동재생 ON (상세옵션)
                    delay: 2000,//재생 딜레이(ms)
                    pauseOnMouseEnter:true,//마우스가 있으면 자동재생 일시정지
                },

                // 전환 효과(effect)
                //- slide, fade, cube, coverflow, flip, cards
                effect: 'fade',

                // If we need pagination
                pagination: {
                    el: '.swiper-pagination', //적용될 대상 선택자
                },

                // Navigation arrows
                navigation: {
                    nextEl: '.swiper-button-next', //적용될 대상 선택자
                    prevEl: '.swiper-button-prev', //적용될 대상 선택자
                },
            });

            var swiper03 = new Swiper('.demo-03', {
                // direction: 'vertical',//슬라이드 방향(horizontal / vertical)
                loop: true,//양 끝 슬라이드의 연결 여부

                // autoplay: true,//자동재생 ON (기본옵션)
                autoplay: {//자동재생 ON (상세옵션)
                    delay: 2000,//재생 딜레이(ms)
                    pauseOnMouseEnter:true,//마우스가 있으면 자동재생 일시정지
                },

                // 전환 효과(effect)
                //- slide, fade, cube, coverflow, flip, cards
                effect: 'cube',

                // If we need pagination
                pagination: {
                    el: '.swiper-pagination', //적용될 대상 선택자
                },

                // Navigation arrows
                navigation: {
                    nextEl: '.swiper-button-next', //적용될 대상 선택자
                    prevEl: '.swiper-button-prev', //적용될 대상 선택자
                },
            });

            var swiper04 = new Swiper('.demo-04', {
                // direction: 'vertical',//슬라이드 방향(horizontal / vertical)
                loop: true,//양 끝 슬라이드의 연결 여부

                // autoplay: true,//자동재생 ON (기본옵션)
                autoplay: {//자동재생 ON (상세옵션)
                    delay: 2000,//재생 딜레이(ms)
                    pauseOnMouseEnter:true,//마우스가 있으면 자동재생 일시정지
                },

                // 전환 효과(effect)
                //- slide, fade, cube, coverflow, flip, cards
                effect: 'coverflow',

                // If we need pagination
                pagination: {
                    el: '.swiper-pagination', //적용될 대상 선택자
                },

                // Navigation arrows
                navigation: {
                    nextEl: '.swiper-button-next', //적용될 대상 선택자
                    prevEl: '.swiper-button-prev', //적용될 대상 선택자
                },
            });

            var swiper05 = new Swiper('.demo-05', {
                // direction: 'vertical',//슬라이드 방향(horizontal / vertical)
                loop: true,//양 끝 슬라이드의 연결 여부

                // autoplay: true,//자동재생 ON (기본옵션)
                autoplay: {//자동재생 ON (상세옵션)
                    delay: 2000,//재생 딜레이(ms)
                    pauseOnMouseEnter:true,//마우스가 있으면 자동재생 일시정지
                },

                // 전환 효과(effect)
                //- slide, fade, cube, coverflow, flip, cards
                effect: 'flip',

                // If we need pagination
                pagination: {
                    el: '.swiper-pagination', //적용될 대상 선택자
                },

                // Navigation arrows
                navigation: {
                    nextEl: '.swiper-button-next', //적용될 대상 선택자
                    prevEl: '.swiper-button-prev', //적용될 대상 선택자
                },
            });

            var swiper06 = new Swiper('.demo-06', {
                // direction: 'vertical',//슬라이드 방향(horizontal / vertical)
                loop: true,//양 끝 슬라이드의 연결 여부

                // autoplay: true,//자동재생 ON (기본옵션)
                autoplay: {//자동재생 ON (상세옵션)
                    delay: 2000,//재생 딜레이(ms)
                    pauseOnMouseEnter:true,//마우스가 있으면 자동재생 일시정지
                },

                // 전환 효과(effect)
                //- slide, fade, cube, coverflow, flip, cards
                effect: 'cards',

                // If we need pagination
                pagination: {
                    el: '.swiper-pagination', //적용될 대상 선택자
                },

                // Navigation arrows
                navigation: {
                    nextEl: '.swiper-button-next', //적용될 대상 선택자
                    prevEl: '.swiper-button-prev', //적용될 대상 선택자
                },
            });

        }
        //window.onload = app;
    </script>
</head>
<body onload="app();">
    
    <div class="container w-600">
        <div class="cell center">
            <h1>Carousel</h1>
        </div>

        <div class="cell">기본 구성</div>
        <div class="cell">
            <div class="swiper demo-01">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                    <!-- Slides -->
                    <div class="swiper-slide"><img src="https://picsum.photos/id/1/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/2/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/3/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/4/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/5/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/6/600/300"></div>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>

                <!-- If we need navigation buttons -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>

        <div class="cell">fade 효과</div>
        <div class="cell">
            <div class="swiper demo-02">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                    <!-- Slides -->
                    <div class="swiper-slide"><img src="https://picsum.photos/id/1/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/2/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/3/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/4/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/5/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/6/600/300"></div>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>

                <!-- If we need navigation buttons -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>

        <div class="cell">cube 효과</div>
        <div class="cell">
            <div class="swiper demo-03">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                    <!-- Slides -->
                    <div class="swiper-slide"><img src="https://picsum.photos/id/1/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/2/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/3/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/4/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/5/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/6/600/300"></div>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>

                <!-- If we need navigation buttons -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>

        <div class="cell">coverflow 효과</div>
        <div class="cell">
            <div class="swiper demo-04">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                    <!-- Slides -->
                    <div class="swiper-slide"><img src="https://picsum.photos/id/1/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/2/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/3/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/4/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/5/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/6/600/300"></div>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>

                <!-- If we need navigation buttons -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>

        <div class="cell">flip 효과</div>
        <div class="cell">
            <div class="swiper demo-05">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                    <!-- Slides -->
                    <div class="swiper-slide"><img src="https://picsum.photos/id/1/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/2/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/3/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/4/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/5/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/6/600/300"></div>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>

                <!-- If we need navigation buttons -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>

        <div class="cell">cards 효과</div>
        <div class="cell">
            <div class="swiper demo-06">
                <!-- Additional required wrapper -->
                <div class="swiper-wrapper">
                    <!-- Slides -->
                    <div class="swiper-slide"><img src="https://picsum.photos/id/1/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/2/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/3/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/4/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/5/600/300"></div>
                    <div class="swiper-slide"><img src="https://picsum.photos/id/6/600/300"></div>
                </div>
                <!-- If we need pagination -->
                <div class="swiper-pagination"></div>

                <!-- If we need navigation buttons -->
                <div class="swiper-button-prev"></div>
                <div class="swiper-button-next"></div>
            </div>
        </div>
    </div>

</body>
</html>