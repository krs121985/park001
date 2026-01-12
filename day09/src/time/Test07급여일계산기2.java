package time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class Test07급여일계산기2 {
	public static void main(String[] args) {

//		(+추가) 미리 법정 공휴일을 저장해두고 이것까지 고려해서 급여일을 조정하도록 처리해보세요.
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("급여일 입력 : ");
		
		int day = sc.nextInt();
		int year = LocalDate.now().getYear();
		int month = LocalDate.now().getMonthValue();
		
		LocalDate date = LocalDate.of(year, month, day);
		
		LegalHoliday[] holidays = LegalHoliday.values();
		
		for (int i = 0; i < holidays.length; i++) {
		    System.out.println(holidays[i].getDate());
		}
		
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

