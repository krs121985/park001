package api.lang.string;

import java.util.Scanner;

public class Test03로그인프로그램 {
	public static void main(String[] args) {
//		사용자에게 아이디와 비밀번호를 입력받아 다음과 같이 검사하여 로그인 성공/실패를 판정하세요
//
//		아이디는 대소문자 관계없이 thejoeun 이면 통과
//		비밀번호는 대소문자까지 정확하게 THE1234 이면 통과
		
		Scanner sc = new Scanner(System.in);
		System.out.print("ID입력 : ");
		String id = new String(sc.next());
		System.out.print("PW입력 :");
		String pw = new String(sc.next());
		
		boolean valid = id.equalsIgnoreCase("thejoeun") && pw.equals("THE1234");
		
		if(valid) {System.out.println("로그인 성공");}
		else {System.out.println("로그인 실패");}
	}
}

