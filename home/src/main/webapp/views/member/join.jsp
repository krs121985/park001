<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/views/template/header.jsp"></jsp:include>

<script type="text/javascript">
	function checkMemberId() {
	    var target = document.querySelector("[name=memberId]");
	    var regex = /^[a-z][a-z0-9]{4,19}$/;
	    var valid = regex.test(target.value);
	    target.classList.remove("success", "fail");
	    target.classList.add(valid ? "success" : "fail");
	    return valid;
	}
	function checkMemberPw() {
	    //비밀번호 검사
	    var target = document.querySelector("[name=memberPw]");
	    var regex = /^(?=.*?[A-Z]+)(?=.*?[a-z]+)(?=.*?[0-9]+)(?=.*?[!@#$]+)[A-Za-z0-9!@#$]{8,16}$/;
	    var valid = regex.test(target.value);
	    target.classList.remove("success", "fail");
	    target.classList.add(valid ? "success" : "fail");
	
	    //비밀번호 확인과 일치하는지 검사
	    var target2 = document.querySelector(".password-checker");
	
	    //var valid = 비밀번호가 입력되어 있고 비밀번호와 확인값이 같아야 함;
	    var valid2 = target.value.length > 0 && target.value == target2.value;
	
	    target2.classList.remove("success", "fail");
	    target2.classList.add(valid2 ? "success" : "fail");
	    
	    return valid && valid2;
	}
	
	function checkForm() {
	    var memberIdValid = checkMemberId();
	    var memberPwValid = checkMemberPw();
	    return memberIdValid && memberPwValid;
	}
</script>


<form action="#" autocomplete="off" onsubmit="return checkForm();">

<div class="container w-500">
    <div class="cell center">
        <h1>회원 가입</h1>
    </div>

    <div class="cell">
        <label>아이디<i class="fa-solid fa-asterisk red"></i></label>
        <input type="text" name="memberId" class="form-input w-100" onblur="checkMemberId();">
        <div class="success-feedback">멋진 아이디네요!</div>
        <div class="fail-feedback">영문 소문자로 시작하며 소문자와 숫자를 합쳐 5~20자로 작성하세요</div>
    </div>

    <div class="cell">
        <label>비밀번호<i class="fa-solid fa-asterisk red"></i></label>
        <input type="password" name="memberPw" class="form-input w-100" onblur="checkMemberPw();">
        <div class="success-feedback">올바른 형식의 비밀번호입니다</div>
        <div class="fail-feedback">대문자, 소문자, 숫자, 특수문자 1글자 이상 포함하여 8~16자로 작성하세요</div>
    </div>

    <div class="cell">
        <label>비밀번호 확인<i class="fa-solid fa-asterisk red"></i></label>
        <input type="password" class="form-input w-100 password-checker" onblur="checkMemberPw();">
        <div class="success-feedback">비밀번호가 일치합니다</div>
        <div class="fail-feedback">비밀번호가 없거나 일치하지 않습니다</div>
    </div>

    <div class="cell mt-40">
        <button type="submit" class="form-btn positive w-100">
            <i class="fa-solid fa-user-plus"></i>
            <span>회원 가입</span>
        </button>
    </div>

</div>

</form>

<jsp:include page="/views/template/footer.jsp"></jsp:include>