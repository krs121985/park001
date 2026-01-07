package oop.inherit9;

public class IPhone16 extends IPhone{

	
	public IPhone16(String number, String color) {
		super(number, color);
	}

	public void siri() {
		System.out.println("아이폰16의 시리 기능실행");
	}

	public void call() {
		System.out.println("아이폰16의 전화 기능실행");
	}

	public void sms() {
		System.out.println("아이폰16의 문자 기능실행");
	}
	
	//추가기능
	public void itunes() {
		System.out.println("아이폰16의 아이튠즈 기능실행");
	}


}
