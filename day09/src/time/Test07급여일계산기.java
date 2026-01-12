package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Test07급여일계산기 {
	public static void main(String[] args) {
//		현재 시점을 기준으로 하여 급여일을 입력받아 1년치 급여일을 출력하세요.
//		단, 급여일이 주말이라면 가장 가까운 이전 날짜의 평일에 지급하는걸로 조정해주세요.
	
//		급여일 입력 : (5)
//		- 급여일 : 2025-08-05
//		- 급여일 : 2025-09-05
//		- 급여일 : 2025-10-05 → 2025-10-03
//		..(생략)
	
//		(+추가) 미리 법정 공휴일을 저장해두고 이것까지 고려해서 급여일을 조정하도록 처리해보세요.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여일 입력 : ");
		
		int day = sc.nextInt();
		int year = LocalDate.now().getYear();
		int month = LocalDate.now().getMonthValue();
		
		LocalDate date = LocalDate.of(year, month, day);
		
		for(int i = 1; i <=12; i++) {
			
			LocalDate future = date.plusMonths(i);
			DayOfWeek dayOfWeek = future.getDayOfWeek();
		
			if(dayOfWeek == DayOfWeek.SATURDAY) 
			{ 
			
				LocalDate saturDay = future.minusDays(1);
				System.out.println("급여일" + future + " > " + saturDay);
			}
			
			else if(dayOfWeek == DayOfWeek.SUNDAY)
			{
				LocalDate sunDay = future.minusDays(2);
				System.out.println("급여일" + future + " > " + sunDay);	
			}
			else 
			{
				System.out.println("급여일" + future);
			}
			

		}
	
	}
}

