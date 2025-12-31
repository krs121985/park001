package data2;

public class Test05윤년판정기 {
	public static void main(String[] args) {
		// 윤년은 1년이 정확하게 365일이 아니어서 생기는 차이를 보정하는 작업
		// 실제 1년은 365.24xxx일입니다.
		
		// 4의 배수인 해에는 2월을 29일까지 설정해서 366로 처리합니다. 
		// 100의 배수인 해는 윤년이 아닙니다. 
		// 400의 배수인 해는 다시 윤년으로 취급합니다.
		
		int year = 2020;
		
		int firstLeepCalculator= year % 4;
		int secondLeepCalculator= year % 100;
		int thirdLeepCalculator= year % 400;
		
		boolean leap = firstLeepCalculator == 0 && secondLeepCalculator !=0 || thirdLeepCalculator ==0;
		System.out.println("윤년 : " + leap);			
		/*또는
		
		boolean is4 = year % 4 == 0;
		boolean is100 = year % 100 == 0;
		boolean is 400 = year % 400 ==0;
	
		
		boolean leap = is400 == true || (is100 == false && is4 == true);
		boolean leap = is400 || (is100 == false && is4)
		boolean leap = is400 || (!is100 && is4)
		*/
		
		// (참고) 논리에서 true와 같다는 말은 숫자에서 +0, *1, -0 / 1과 같은 표현(하나마나한 말)
	}
}
