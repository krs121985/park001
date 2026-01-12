package time;

import java.time.LocalDate;
import java.time.Period;

public class Test05날짜제어2 {
	public static void main(String[] args) {
		
		LocalDate a = LocalDate.now(); //오늘
		LocalDate b = LocalDate.of(2026,7,17); //날짜를 지정(수료일)
		LocalDate c = LocalDate.parse("2026-07-17"); //문지열로 설정
	
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		
		// System.out.println( b == c ); // 사용금지
		System.out.println(b.equals(c));
		
		System.out.println("윤년인가요?");
		System.out.println(a.isLeapYear());
		
		System.out.println("100일 뒤는 몇일인가요?");
		System.out.println(a.plusDays(100)); //a는 변하지 않음
		
		System.out.println("100일 전 몇일인가요?");
		System.out.println(a.minusDays(100)); //a는 변하지 않음
		
		System.out.println("수료일까지의 기간을 구하라");
		//기간 클래스가 처리하도록 설계되어있음
		Period p = Period.between(a,b); // a와 b 사이의 기간을 구하라
		System.out.println(p.getYears());
		System.out.println(p.getMonths());
		System.out.println(p.getDays());
		
	}
}
