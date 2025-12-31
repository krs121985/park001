package condition;

import java.util.Scanner;

public class Test07날짜계산기 {
	public static void main(String[] args) {
		//사용자에게 연도와 달을 입력받아서 해당하는 달의 날짜수를 구해서 출력하세요
		
		/* 사례1 : 큰달 (31일까지 있는 달)
			2025년 12월은 31일까지 있습니다

			사례2 : 작은달 (30일까지 있는 달)
			2025년 11월은 30일까지 있습니다
			
			사례3 : 윤년 2월 (29일까지 있는 달)
			2024년 2월은 29일까지 있습니다

             사례4 : 평년 2월 (28일까지 있는 달)
             2025년 2월은 28일까지 있습니다

		윤년은 1년이 정확하게 365일이 아니어서 생기는 차이를 보정하는 작업
		실제 1년은 365.24xxx일입니다.
		
		4의 배수인 해에는 2월을 29일까지 설정해서 366로 처리합니다. 
		100의 배수인 해는 윤년이 아닙니다. 
		400의 배수인 해는 다시 윤년으로 취급합니다.
	
          */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요");
		int entYear = sc.nextInt();
		System.out.println("달을입력하세요");
		int entMonth = sc.nextInt();
		
		int date;
		
		int year = 2000;
		int firstLeepCalculator= entYear % 4; 
		int secondLeepCalculator= entYear % 100; 
		int thirdLeepCalculator= entYear % 400;
		boolean leap = firstLeepCalculator == 0 && secondLeepCalculator !=0 || thirdLeepCalculator ==0;
		
		if(entMonth ==2) 
		{
			if(leap) 
			{
				date = 29;	
			}
			else {date = 28;}	
		}
		else if(entMonth == 4 ||entMonth ==6 || entMonth == 9 || entMonth == 11 )
		{
			date = 30;
		}
		else {date =31;}
		// 큰 달(31일): 1, 3, 5, 7, 8, 10, 12월
        // 작은 달(30일): 4, 6, 9, 11월
		// 2월 - 윤년: 29일,  평년: 28일
		
		System.out.println(entYear + "년"+ entMonth + "월은" +date + "까지있습니다");		
		
		
		
		
	}
}
