package api.lang.string2;

import java.util.Scanner;

public class Test02아이디와닉네임검사 {
	//사용자에게 아이디와 닉네임을 입력받아, 올바른 형식인지 검사하여 출력
	//아이디형식 : 1. 글자 수 5~20글자 / 2. 시작은 반드시 알파벳 소문자 / 3.시작 글자를 제외한 나머지 글자는 알파벳 소문자 또는 숫자로만 가능 
	//닉네임형식 : 1. 글자 수 2~10글자 / 2. 한글 또는 숫자로만 설정가능 / 3. 한글중에서는 완성된 글자만 가능 'ㅋㅋㅋ 또는 '--'와 같은 글자 사용불가
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디를 입력하세요.");
		String id = sc.next();
		String regex = "^[a-z][a-z0-9]{4,19}$";
		
		if(id.matches(regex)) {System.out.println("올바른 형식의 아이디입니다.");}
		else {System.out.println("아이디는 영문 소문자로 시작하며 숫자를 포함한 5~20자로 작성하세요.");
		return;
		}
		
		
		System.out.print("닉네임을 입력하세요.");
		String nickname = sc.next();
		String regex2 = "^[가-힣0-9]{2,10}$";
		// ^[ㄱ-하-ㅣ가-힣0-9]{2,10}$"; / 자음과 모음 포함
		
		if(nickname.matches(regex2)) {System.out.println("올바른 형식의 닉네임입니다.");}
		else {System.out.println("닉네임은 한글 또는 숫자로만 설정 가능하며 2~10자로 작성하세요.");}
		return;
	}
}
