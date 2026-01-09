package api.lang.string2;

import java.util.Scanner;

public class Test04생년월일검사 {
	public static void main(String[] args) {
		//날짜 검사를 하려면 범위를 검사할 수 있어야한다.
		//월은 00부터 99까지가 아니라, 01~12까지이다.
		//정규표현식은 오직 문자열을 대상으로 하기에, 범위가 아니라 자리별로 파악하여 처리
		//OR연산을 이용해서 큰달, 작은달, 2월로 구분하여 날짜수를 각각 31,30, 28일로 처리
		//프로그래밍으로 연도를 잘라낸 다음 숫자로 바꿔 윤년을 계산하여 2월의 날짜수만 조정
		Scanner sc = new Scanner(System.in);
		System.out.println("YYYY-MM-DD 형식으로 입력하세요.");
		String date = sc.next();
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[0-9]|1[12])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
		//System.out.println(date.matches(regex));
		
		int year = Integer.parseInt(date.substring(0,4));
		// System.out.println(year);
		
		int month = Integer.parseInt(date.substring(5,7));
		// System.out.println(month);
		
		int day = Integer.parseInt(date.substring(8,10));
		//System.out.println(day);
		
		int maxDay = 0;
		
		if(month == 2) {    
		 
				boolean leap = year % 400 == 0 || (year % 100 != 0 && year % 4 == 0);
				
				if(leap) {
					maxDay = 29;
				}
				else {
					maxDay = 28;
				}
				 System.out.println("2월입니다. (윤년여부: " + leap + ", 최대일수: " + maxDay + ")");    
		}
		       
		
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
		    maxDay = 30;
		    System.out.println("작은달입니다. 최대일수: " + maxDay);
		}
		else {
		    maxDay = 31;
		    System.out.println("큰달입니다. 최대일수: " + maxDay);
		}

		// 최종 결과 출력
		if(day < 1 || day > maxDay) { 
		    System.out.println("잘못된 날짜입니다. 날짜를 다시 입력하세요.");
		} else {
		    System.out.println("정상적인 날짜 입력입니다: " + date);
		}

	}
}
