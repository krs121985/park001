package oop.inherit4;

public class IPhone17 extends IPhone{

	public IPhone17(String number) {
		super(number); //전달받은 number를 상위클래스로 전달하는 코드
	}
	public void camera() {
		System.out.println("새로운 카메라 기능");
	}
	//원하는 메소드를 추가하거나 재정의할 수 있음
}
