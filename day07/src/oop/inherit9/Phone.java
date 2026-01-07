package oop.inherit9;

public abstract class Phone {
	//필드 - 번호(필수), 색상(필수)
	protected String number;
	protected String color;
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColorData() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
//생성자
	public Phone(String number, String color) {
		super();
		this.setNumber(number);
		this.setColor(color);
	}
	
	public final void show() {
		System.out.println("폰 정보");
		System.out.println("전화번호 : " + this.number);
		System.out.println("색상정보 : " + this.color);
	}
	public abstract void call();
	public abstract void sms();
}
