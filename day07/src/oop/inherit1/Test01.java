package oop.inherit1;

public class Test01 {
	public static void main(String[] args) {
		//Galaxy24s 생성
		Galaxy24s p1 = new Galaxy24s();
		p1.call();
		p1.sms();
		p1.camera();
		p1.bluetoothPen();
		
		//Galaxy25s 생성
		Galaxy25s p2 = new Galaxy25s();
		p2.call();
		p2.sms();
		p2.camera();
		p2.visualAi();
		
	}
}
