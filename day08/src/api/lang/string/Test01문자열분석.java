package api.lang.string;

public class Test01문자열분석 {
    public static void main(String[] args) {
//        // 1. 세 개의 변수(a, b, c)를 만들어서 각각 Hello, hello, hello 저장
        String a = new String("Hello");
        String b = new String("hello");
        char [] ch = new char [] {'h','e','l','l','o'};        
         String c = new String(ch);
        
//        // 2. 각 변수에 저장된 문자열 데이터 출력
        System.out.println("--- 1. 데이터 출력 ---");
        System.out.println("a: " + a.toString());
        System.out.println("b: " + b.toString());
        System.out.println("c: " + c.toString());
//
//        // 3. 각 변수에 저장된 문자열의 글자수(길이) 구하여 출력
        System.out.println("\n--- 2. 글자수 출력 ---");
        System.out.println("a의 길이: " + a.length());
        System.out.println("b의 길이: " + b.length());
        System.out.println("c의 길이: " + c.length());
//
//        // 4. b 문자열의 세 번째 글자를 구하여 출력
//        // 인덱스는 0부터 시작하므로 세 번째 글자는 index 2입니다.
        System.out.println("\n--- 3. b의 세 번째 글자 ---");
        System.out.println("b의 세 번째 글자: " + b.charAt(2));
//
//        // 5. c를 5번 반복하여 출력
        System.out.println("\n--- 4. c를 5번 반복 ---");
        System.out.println("c 반복: " + c.repeat(5));
//
//        // 6. a와 b가 같은지 판정하여 출력
        // 대소문자를 구분하여 비교할 때는 equals()를 사용합니다.
        System.out.println("\n--- 5. a와 b 비교 ---");
        System.out.println("a와 b는 같은가? " + a.equals(b));
    	
    	
   }
}

