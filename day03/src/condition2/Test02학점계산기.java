package condition2;

import java.util.Scanner;

public class Test02학점계산기 {
	public static void main(String[] args) {
		// 1. 평가점수는 0점에서 100점 사이이며, 이 점수를 구간별로 나눠 학점을 부여한다.
		// 2. A+는 90점 이상일 경우 부여한다.
		// 3. A는 80점 이상일 경우 부여한다.
		// 4. B는 70점 이상일 경우 부여한다.
		// 5. C는 60점 이상일 경우 부여한다.
		// 6. 나머지는 F로 처리한다.
		// 사용자에게 점수를 입력받아 예상 학점을 출력하는 프로그램을 구현하세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("평가점수를 입력하시오");
		int score = sc.nextInt();
		
		int ten = score/10;
		
		String grade;
		
		switch(ten) 
		{
		case 10,9:
			grade = "A+";
			break;
		
		case 8:
			grade = "A";
			break;
		
		case 7: 
			grade = "B";
			break;
		
		case 6: 
			grade = "C";
			break;
			
		default : 
			grade = "f";
			break;
		} System.out.println(grade);
		
		if(score>=90) 
		{
			System.out.println("A+");
		}
		else if(score>=80) 
		{
			System.out.println("A");
		}
		else if(score>=70) 
		{
			System.out.println("B");
		}
		else if(score>=60) 
		{
			System.out.println("C");
		} else {System.out.println("F");}
	}

}
