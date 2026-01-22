<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>포켓몬 등록</title>

    <!-- google font CDN -->
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">

    <!-- FontAwesome CDN -->
    <link rel="stylesheet" type="text/css"
        href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/7.0.1/css/all.min.css">

    <link rel="stylesheet" type="text/css" href="../css/commons.css">
    <style>

    </style>
    <!-- 홈페이지에 영향을 주는 코드를 작성하는 공간 -->
    <script type="text/javascript">
        function checkPokemonName() {
            var input = document.querySelector("[name=pokemonName]");
            var regex = /^[가-힣]{2,10}$/;//검사식을 만들고
            var valid = regex.test(input.value);//검사를 한 다음
            input.classList.remove("success", "fail");//기존 클래스 제거
            input.classList.add(valid ? "success" : "fail");//3항 연산자 (if~else 축소판)
            return valid;
        }
        function checkPokemonType() {
            var select = document.querySelector("[name=pokemonType]");
            var pokemonType = select.value;
            var valid = pokemonType.length > 0;//pokemonType != "";
            select.classList.remove("success", "fail");//기존 클래스 제거
            select.classList.add(valid ? "success" : "fail");//3항 연산자 (if~else 축소판)
            return valid;
        }

        function checkForm() {
            var pokemonNameValid = checkPokemonName();
            var pokemonTypeValid = checkPokemonType();
            return pokemonNameValid && pokemonTypeValid;
        }
    </script>
</head>

<body>
    <form action="#" autocomplete="off" onsubmit="return checkForm();">
        <div class="container w-400">
            <div class="cell center">
                <h1>포켓몬 등록</h1>
            </div>

            <div class="cell">
                <label>몬스터등록 <i class="fa-solid fa-asterisk red"></i></label>
                <input type="text" name="pokemonName" placeholder="(ex) 피카츄" class="form-input w-100"
                    onblur="checkPokemonName();">
                <div class="success-feedback">올바른 형식의 이름입니다!</div>
                <div class="fail-feedback">이름은 한글 2~10글자로 설정해야 합니다</div>
            </div>

            <div class="cell">
                <label>몬스터 속성 <i class="fa-solid fa-asterisk red"></i></label>
                <select name="pokemonType" class="form-input w-100" oninput="checkPokemonType();">
                    <option value="">선택하세요</option>
                    <option>땅</option>
                    <option>불</option>
                    <option>바람</option>
                    <option>물</option>
                    <option>풀</option>
                    <option>독</option>
                    <option>비행</option>
                    <option>얼음</option>
                    <option>곤충</option>
                    <option>무속성</option>
                </select>
                <div class="success-feedback">속성 선택이 완료되었습니다</div>
                <div class="fail-feedback">이 항목은 반드시 선택해야 합니다</div>
            </div>

            <div class="cell mt-40">
                <button class="form-btn w-100 positive">
                    <i class="fa-solid fa-floppy-disk"></i>
                    <span class="ms-5">등록</span>
                </button>
            </div>
        </div>
    </form>
</body>

</html>