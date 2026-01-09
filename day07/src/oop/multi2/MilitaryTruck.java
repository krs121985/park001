package oop.multi2;

public class MilitaryTruck extends Car implements Autodrive{

	public MilitaryTruck(String name) {
		super(name);
	}

	public void aiDrive() {
		System.out.println("자율주행 기능이 존재");
	}
	
}
