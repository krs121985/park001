package oop.keyword5;

public class Test01불변처리 {
	public static void main(String[] args) {
		//변수는 기본적으로 데이터 덮어쓰기가 가능하다
		final int a = 10;
		//a = 20;
		//a = 30;
		//a = 40;
		System.out.println("a :" + a );
		
		//언제쓰나? 1시간이 60분이라는 사실을 이름을 붙여서 보관하고 싶을 때 사용
		int hour = 3;
		int minute = 40;
		
		//int time = hour*60 + minute; //60이 무슨 뜻인지 알지 못하는 사람도 있지 않을까?
		final int minutesInHour = 60; //final을 물론 안붙혀도되지만 일종의 안전장치임(해도되고 안해도되긴해)
		int time = hour * minutesInHour + minute;
		System.out.println(time);
		
	}
}
