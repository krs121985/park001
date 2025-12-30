package data;

public class Test04시간계산기 {
	public static void main(String []args) {
		//하루에 3시간 40분씩 공부할 예정, 
		//이 상태로 2주(14일)간 공부하면 총 공부시간이 몇시간 몇분인지 구하여 출력
		
		int todayAvgHour = 3;
		int todayAvgMin = 40;
		int DayTotal = 14;
		
		int todayTotal = todayAvgHour *60 + todayAvgMin;
		//System.out.println(todayTotal);
		
		int weekTotal = DayTotal * todayTotal;
		
		int hours = weekTotal/60;
		int minutes = weekTotal%60;
		
		System.out.println(hours + "시간" + minutes + "분");
	}
}
