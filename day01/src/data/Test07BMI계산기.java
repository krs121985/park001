package data;

public class Test07BMI계산기 {
	public static void main(String []args) {
		//키 180cm, 체중 80kg은 사람의 BMI 수치 구하여 출력하세요
		//소수점 자리 수 신경쓰지 말고 그냥 값이 출력되면됩니다.
		//BMI구하는 공식 : 몸무게 / (키 X 키) < 키는 cm가 아닌 m단위
		// 18.5 미만:저체중 / 18.5 ~ 22.9:정상 / 23.0 ~ 24.9:과체중/25.0 이상:비만
		
		float height = 180;
		float weight = 80;
		float m = height / 100;
		float bmiFormula = weight / (m*m);
		
		System.out.println(bmiFormula);	
		
	    if(bmiFormula<18.5) {
	    	System.out.println("저체중");
	    }
	    else if(bmiFormula<22.9){
	    	System.out.println("정상");	
	    }
	    else if(bmiFormula<24.9){
	    	System.out.println("과체중");
	    }	
	    else {System.out.println("비만");}
	}
}

