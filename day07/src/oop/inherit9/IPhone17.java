package oop.inherit9;

public class IPhone17 extends IPhone{


	public IPhone17(String number, String color) {
		super(number, color);
	}
	public void siri() {
		System.out.println("아이폰17의 시리 기능실행");
	}

	public void call() {
		System.out.println("아이폰17의 전화 기능실행");
	}

	public void sms() {
		System.out.println("아이폰17의 문자 기능실행");
	}
	//추가기능
	public void faceTime() {
		System.out.println("아이폰17의 영상통화 기능실행");
	}

	
}
