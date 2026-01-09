package api.lang.object;

public class Test01Object클래스분석 {
	public static void main(String[] args) {
		
		
		//자바에서 제공하는 Object라는 클래스를 분석(오브젝트는 모든 클래스의 최상위)
		//1.생성방법이 무엇인가?(Constructor Summary)
		// - 하나밖에 없음
		
		Object a = new Object();
		Object b = new Object();
		
		//2.내부에 포함된 필드가 있나요?
		//안보이는거 보니까 없거나 숨겼나봐요
		
		//3.내부에 포함된 메소드가 있나요?
		//있어요 몇개 써보죠
		System.out.println(a.hashCode()); // 일종의 일련번호
		System.out.println(b.hashCode());
		
		System.out.println(a.toString()); // 클래스명@일련번호
		System.out.println(b.toString());
		
		//자바전체 원시형은 : byte, short, char, int, long, double, float, boolean / 나머지 다 참조형 
	}
}
