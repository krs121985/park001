package day03day03;

import java.util.Scanner;

public class Test01조건이란 {
	public static void main(String[] args) {
		//조건(Condition)부 코드
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 한개를 입력하시오.");
		int number = sc.nextInt();
		
		if(number % 2 == 1)
		{
			System.out.println("홀수입니다.");
		}
		if(number % 2 != 1)
		{
			System.out.println("짝수입니다.");
		}
	}
}
 