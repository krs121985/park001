package data2;

public class Test04무임승차대상 {
  public static void main(String[] args) {
	  // - 자바에서 or연산은 '||'와 같이 사용합니다.
	  // - 65세 이상일 경우 무임승차 대상입니다.
	  // - 7세 이하일 경우 무임승차 대상입니다.
	  
	  int age = 68;
	  // int up = 65;
	  // int down = 7;
	  
	  boolean result = age>=65 || age<=7;
	  System.out.println("무임승차 대상 :" + result);
  }
}
