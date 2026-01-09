package oop.multi2;

public class Car implements LandMachine{
	
	private String name;
	// ------------------------------------------------------------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car(String name) {
		super();
		this.name = name;
	}

	public void show() {
		System.out.println("모델명 : " + this.name);
	}

	public void drive() {
		System.out.println("운행");
	}
	//테슬라 :운행, 충전, 자율주행
	//경찰차 :운행, 충전, 사이렌
	//경찰헬기 : 비행, 비상사이렌
	//군용트럭 : 운행, 자율주행
}
