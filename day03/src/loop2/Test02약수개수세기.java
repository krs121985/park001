package loop2;

import java.util.Scanner;

public class Test02약수개수세기 {
	public static void main(String[] args) {
		//어떤 숫자를 입력하면 해당하는 수의 약수가 몇개인지 카운트해주는 프로그램을 구현하세요
		// 여기서 약수라는것은 나누어 떨어지는 숫자를 의미합니다.
		// 약수는 절대로 입력한 숫자보다 클 수 없으며, 음수이거나 0일 수 없습니다.
		// (ex) 6의 약수는 1, 2, 3, 6 이렇게 네 개입입니다
		 System.out.print("약수를 구할 숫자를 입력하시오 :");
	   Scanner sc = new Scanner(System.in);
	   int score = sc.nextInt();
	   
	   int counter = 0;
	   
	   for(int i = 6; i>=1; i--) {
		   
		   if(score % i == 0) {
			   ++counter;
		   }
	   }
	   System.out.println(counter);
	   
	  if(counter == 2) {
		  System.out.println("소수입니다.");
	  
	  }else
		  
		  {System.out.println("소수가아닙니다.");}
  }
}

//6 5 4 3 2 1 61 23 