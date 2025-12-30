package data3;

public class Test02주차요금계산기 {
	public static void main(String[] args) {
		// 주차요금은 10분당 1000원입니다. 
		// 30분 미만으로 주차하면 화차로 판정합니다. 회차일 경우 요금은 나오지만 실제로 내지는 않습니다.
		// 10시 30분에 주차장에 들어온차가 12시 10분에 나갔을 때 
		// 이 차량의 주차요금과 회차여부를 판정하여 출력하세요
		
		// 어쩌다 달라지는 값
		// int limit = 30; 회차 제한시간(분)
		// int period = 10; 기준시간
		// int fees = 1000; 기준시간에 따른 기본가격 
		
		int inHour = 12, inMin = 20;
		int outHour = 12, outMin = 30;
		
		int inCar = inHour*60+inMin;
		int outCar = outHour*60+outMin;
		int result = outCar - inCar;
		
		System.out.println("주차시간:" + result + "분");
		
		int redeem = result / 10 * 1000;
		System.out.println("주차요금:" + redeem + "원");
		
		boolean reTurn = result < 30;
		System.out.println("회차여부:" + reTurn);
	}
}
