package oop.inherit9;

public class Test01파일생성 {
	public static void main(String[] args) {
		
		//객체(인스턴스)생성
		Galaxy g1 = new Galaxy25s("010-1111-1111", "검정");//Galaxy25s > Galaxy(업캐스팅, up-casting) - 다형성
		Galaxy g2 = new GalaxyFold7("010-2222-2222", "화이트");//GalaxyFold7 > Galaxy(업캐스팅, up-casting)
		IPhone g3 = new IPhone16("010-3333-3333", "그레이");//IPhone16 > IPhone(업캐스팅, up-casting)
		IPhone g4 = new IPhone17("010-4444-4444", "블루");//IPhone17 > IPhone(업캐스팅, up-casting)
		
		g1.show();
		g1.call();
		g1.sms();
		g1.samsungPay();
		//g1.bixby();
		System.out.println("------------------------");
		g2.show();
		g2.call();
		g2.sms();
		g2.samsungPay();
		//g2.iris();
		System.out.println("------------------------");
		g3.show();
		g3.call();
		g3.sms();
		g3.siri();
		//g3.itunes();
		System.out.println("------------------------");
		g4.show();
		g4.call();
		g4.sms();
		g4.siri();
		//g4.faceTime();
	}
	
}
