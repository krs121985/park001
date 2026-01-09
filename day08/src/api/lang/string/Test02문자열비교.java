package api.lang.string;

public class Test02문자열비교 {
	public static void main(String[] args) {
		
		//문자열의 생성방식에 따른 비교차이
		//문자열은 한번 생성되면 전대로 변하지 않는다.(불변, Immutated)
		
		String a = "hello";
		String b = a;
		String c = new String("hello");
		String d = new String("hello");
		
		//비교 연산은 완벽하게 동일한 객체인지를 판정해준다.
		//기준이 너무 타이트해서 같은 경우가 거의 없다. 
		// 객체환경에서는 부적합한 연산이다.
		System.out.println(a == b); //T
		System.out.println(b == c);	//F
		System.out.println(c == d); //F
		
		//실제와 유사하게 비교하려면 별도의 비교 명령을 써야 한다. (equals)
		System.out.println(a.equals(b)); //T
		System.out.println(a.equals(c)); //T
		System.out.println(c.equals(d)); //T
	}
}
