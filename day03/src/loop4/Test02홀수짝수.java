package loop4;

import java.util.Scanner;

public class Test02홀수짝수 {
	public static void main(String[] args) {
		//사용자에게 숫자를 지속 입력받아 다음을 구해보세요
		// 1. 입력한 모든 숫자의 합계
		// 2. 입력한 홀수의 개수
		// 3. 입력한 짝수의 개수
		
		// 사용자가 0을 입력하면 프로그램 종료되며, 0은 합계나 개수 카운에서 제외
		
		System.out.println("숫자를 입력하시오");
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int a= 0;
		int b= 0;
		
		while(true) {
			
			System.out.println("입력한 모든 숫자의 합계 :" + total);
			System.out.println("짝수개수 :" +a);
			System.out.println("홀수개수 :"+b);
			int fir = sc.nextInt();
			
			if(fir%2==0) {
				++a;
			}
			if(fir%2!=0) {
				++b;
			}
			
			if(fir == 0) {
				break;
			}
			else {
				total +=fir;
				
			}
		}
	}
}
