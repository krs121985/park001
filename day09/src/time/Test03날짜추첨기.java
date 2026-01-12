package time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Test03날짜추첨기 {
	public static void main(String[] args) {

	Random r = new Random();
	Calendar c = Calendar.getInstance();
	
	int year = 1998;
	c.set(Calendar.YEAR, year); //연도변경
	
	int count = c.getActualMaximum(Calendar.DAY_OF_YEAR);
	System.out.println("count = " + count);
	while(true) {
		int choice = r.nextInt(365)+1; //1부터 365개
		
		c.set(2026,0,choice);
		
		//토요일 또는 일요일이면 나가라
		int week = c.get(Calendar.DAY_OF_WEEK);
		if(week == Calendar.SATURDAY || week == Calendar.SUNDAY) {
			break;
		}
	}
	//출력
	Date d = c.getTime(); //date로 변환
	SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
	System.out.println(fmt.format(d));
	}
}
