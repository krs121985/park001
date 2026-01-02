package loop4;

import java.util.Scanner;

public class Test05잘안쓰는반복 {
	public static void main(String[] args) {
		// do-while 반복문
		// - 문법이 까다롭기 때문에 사람들이 잘 사용하지 않는다.
		// - do(선 실행) while(후 반복)의 구조를 가짐
		
		//(ex) 0을 입력하면 종료하는 반복문
		Scanner sc = new Scanner(System.in);
		
		int user;
	do {
		System.out.println("숫자 입력(0입력 시 종료) : ");
		user = sc.nextInt();
		if(user ==0) {
			break;
		}
	
		}
		while(true);
	}
}
