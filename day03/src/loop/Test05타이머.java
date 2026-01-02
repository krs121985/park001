package loop;

import java.util.Scanner;

public class Test05타이머 {
	public static void main(String[] args) {
		//다음과 같이 구현되는 타이머 프로그램을 만드세요
		//분입력, 초입력 2 / 25
		
		Scanner sc = new Scanner(System.in);
		System.out.print("분 입력:");
		int min = sc.nextInt();
		System.out.print("초 입력:");
		int sec = sc.nextInt();
		
		int mint = min*60+sec;
		
		for(int i = mint; i>=0; i--) {
			
			int c = i/60;
			int d = i%60;
			System.out.println(c + "분"+ d + "초 후 알림이 울립니다 !");
		}
	}
}
 