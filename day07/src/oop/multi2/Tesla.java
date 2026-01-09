package oop.multi2;

public class Tesla extends Car implements Chargable, Autodrive{

	public Tesla(String name) {
		super(name);
	}

	public void aiDrive() {
		System.out.println("자율주행 기능이 존재");
	}

	public void charge() {
		System.out.println("충전 기능이 존재");
	}

}
