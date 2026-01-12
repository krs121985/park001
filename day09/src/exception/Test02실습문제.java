package exception;

import java.util.Scanner;
 
public class Test02실습문제 {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("생년월일을 입력(YYYY-MM-DD) : "); 
			String dateOfBirth = sc.next();
			
			int year  = Integer.parseInt((dateOfBirth).substring(0,4));
			int month = Integer.parseInt((dateOfBirth).substring(5,7));
			
			//윤년판정계산기
			boolean leap = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
			String regex;
			if(leap) {
					regex = "^(19[0-9]{2}|20[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-9])$";
			}
			else 	{
					regex = "^(19[0-9]{2}|20[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8])$";
			
			}
			if(dateOfBirth.matches(regex) ==false) {
				throw new Exception("올바른 날짜 형식이아닙니다.");
			}
			
			int currentYear = 2026; //LocalDate.now().getYear();
			int currentMonth = 1;	//LocalDate.now().getMonthValue();

			int user = year * 12 + month;
			int current = currentYear * 12 + currentMonth;
			
			int gap = current - user;//차이 구하기 (개월)
			if(user > current) {
				throw new Exception("미래의 날짜는 지정할 수 없습니다.");
			}
			
			int globalAge = gap / 12;
			
			System.out.println("만 나이 : "+globalAge+"세");
		}
		catch(Exception e){ 
			//System.err.println("생년월일을 다시 입력하세요.");
			e.printStackTrace();
		}
 
	}
}
