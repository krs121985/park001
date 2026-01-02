package loop4;

import java.util.Scanner;

public class Test01무한반복 {
	public static void main(String[] args) {
		// 무한반복
		// 영원히 반복하는걸 의미하는것이 아님
		// 횟수나 범위는 모르지만 실행되야 하는 상황이나 종료되어야 하는 상황을 아는 경우에 사용
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 입력 :");
			int number = sc.nextInt();
			
			if(number == 0) {
				break;
			}
		}
	}
}
