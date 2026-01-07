package oop.inherit9;

public class Galaxy25s extends Galaxy {

	public Galaxy25s(String number, String color) {
		super(number, color);
	}
	
	public void samsungPay() {
	System.out.println("갤럭시 25s의 삼성페이 기능 실행");
	}

	public void call() {
		System.out.println("갤럭시 25s의 전화 기능 실행");	
	}

	public void sms() {
		System.out.println("갤럭시 25s의 문자 기능 실행");
	}
	//추가기눙
	public void bixby() {
		System.out.println("갤럭시 25s의 홍채인식 기능 실행");
	}
}
