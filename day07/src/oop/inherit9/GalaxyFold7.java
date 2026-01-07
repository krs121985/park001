package oop.inherit9;

public class GalaxyFold7 extends Galaxy{


	public GalaxyFold7(String number, String color) {
		super(number, color);
	}
	public void samsungPay() {
		System.out.println("갤럭시 폴드7의 삼성페이 기능실행");
	}

	public void call() {
		System.out.println("갤럭시 폴드7의 전화 기능실행");
	}

	public void sms() {
		System.out.println("갤럭시 폴드7의 문자 기능실행");
	}
	//추가기능
	public void iris() {
		System.out.println("갤럭시 폴드7 자동시리 기능 실행");
	}

}
