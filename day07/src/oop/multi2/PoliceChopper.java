package oop.multi2;

public class PoliceChopper implements FlyingMachine, Siren{

	public void emergency() {
		System.out.println("비상사이렌 기능이 존재");
	}

	public void fly() {
		System.out.println("비행 기능이 존재");
	}

}
