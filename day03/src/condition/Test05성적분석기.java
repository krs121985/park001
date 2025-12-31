package condition;

import java.util.Scanner;

public class Test05성적분석기 {
	public static void main(String[] args) 
	{
		/*
		다음 요구사항에 맞는 계산 프로그램을 구현하세요
		어느 중학교의 내신 평가 기준은 다음과 같습니다
		
		- 평균 90점 이상 : A등급
		- 평균 70점 이상 : B등급
		- 나머지 : C등급
		
		사용자에게 국어, 영어, 수학점수를 입력받아 이 학생의 평균 점수와 등급을 출력해주세요
		 */
		
	  Scanner sc = new Scanner(System.in); 
	  
	  System.out.print("국어점수:");
	  int a = sc.nextInt();
	  System.out.print("영어점수:");
	  int b = sc.nextInt(); 
	  System.out.print("수학점수:");
	  int c = sc.nextInt();
  
	  int total = a+b+c;
	  int avg = total/3;
	  System.out.println("평균점수 : " + avg);
	  String grade;
	  
	  
	  if(avg>=90)
	  {
		  grade = "A등급";
		  
	  }else if(avg>=70) 
	  {
		  grade = "B등급";
	  }
	  else 
	  {
		  grade = "C등급";
	  }
	  System.out.println("등급 : " + grade);
	}
}
