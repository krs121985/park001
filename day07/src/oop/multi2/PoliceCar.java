package oop.multi2;

public class PoliceCar extends Car implements Chargable, Siren {

	public PoliceCar(String name) {
		super(name);
	}

	public void emergency() {
		System.out.println("비상사이렌 기능이 존재");
	}

	public void charge() {
		System.out.println("충전 기능이 존재");
	}
}