package api.lang.string;

public class Test04문자열의명령들 {
	public static void main(String[] args) {
		//비교 명령들
		//같은지 판정하는 메소드 : equals(), equalsIgnoreCase()
		//비슷한지 판정하는 메소드 : startWith(), endsWith(), contains(), indexOf()
		
		String a = "http://wwww.naver.com"; //http:// 또는 https://만쳐도 홈페이지임을 알 수 있음
		
		//(Q) a는 홈페이지 주소인가요?
		System.out.println("홈페이지 주소인가요?");
		System.out.println(a.startsWith("http://") || a.startsWith("https://"));
		
		//(Q) a는 기업 홈페이지인가요?
		System.out.println("기업 홈페이지 주소인가요?");
		System.out.println(a.endsWith(".com"));
		
		//(Q) a는 네이버 관련 홈페이지인가요?
		System.out.println("네이버 네이버 관련 주소인가요?");
		System.out.println(a.contains("naver"));
		System.out.println(a.indexOf("naver"));
		System.out.println(a.lastIndexOf("naver")); //좌측 첫 번째 시작지점(없으면 -1)
		
		//편집 명령
		//문자열은 불변이기에, 편집하면 새로 복사된 신규 문자열이 생성된다.(원본은 변하지 않음)
		String b = "Hello";
		System.out.println(b.toLowerCase()); //소문자 변환
		System.out.println(b.toUpperCase()); //대문자 변환
		
		//[1]
		String c = "이런 개나리 같은 색상을 보았나.";
		System.out.println(c.replace("개나리","***"));
		
		//[2]
		String filter = "개나리";
		String star = "*";
		System.out.println(c.replace(filter, star.repeat(filter.length())));
		
		//변환 명령(원시형)
		
		//int > String
		int d = 100;
		//String e = d;
		String e = String.valueOf(d);
		System.out.println("e : " + e);
		//오버로딩이란? 뭘 좋아할지 몰라서 다 준비했어 즉 같은 이름의 메소드가 많은거
		
		//String > int
		String f = "1234";
		int g = Integer.parseInt(f);
		System.out.println(g);

		//원시형을 도와주는 클래스들(Wrapper class)
		//boolean을 도와주는 Boolean클래스 ..... Boolean.parseBoolen(문자열) / 'true' > true
		//long 도와주는 Long클래스 ..... Long.parseLong(문자열) 
		//float 도와주는 Float클래스 ..... Float.parseFloat(문자열) 
		//double 도와주는 Double클래스 ..... Double.parseDouble(문자열) 
	
	}

}
