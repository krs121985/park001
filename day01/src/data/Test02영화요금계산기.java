package data;

public class Test02영화요금계산기 {
 public static void main(String []args) {
	 
	 /*
	  영화요금 
	  성인   : 1인 당 : 15000원
	  청소년 : 1인 당 : 9000원
	  어린이 : 1인 당 : 5000원
	*/
	 
	 // 위 요금표를 토대로 성인 2명, 청소년1명, 어린이 2명의 영화요금을 계산하여 출력
	 
	 int adult = 15000;
	 int adultCount = 2;
	 int youth = 9000;
	 int youthCount = 1;
	 int child = 5000;
	 int childCount = 2;
			 
	 int adultTotal = adult * adultCount;
	 int youthTotal = youth * youthCount;
	 int childTotal = child * childCount;
	 
	 int total = adultTotal + youthTotal + childTotal;
	 
	 System.out.println(total);
			 
	 
 }
}
