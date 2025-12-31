package loop;

import java.util.Scanner;

public class Test02입력반복 {
		public static void main(String[] args) {
			
		
		//사용자에게 숫자를 5번 입력받아 홀수인지 짝수인지 판정하여 출력하는 프로그램
		//(주의) 도구는 반복문 밖에서 1회만 생성
		Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();
            
        if (num % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
  }
}