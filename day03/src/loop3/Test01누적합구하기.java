package loop3;

public class Test01누적합구하기 {
	public static void main(String[] args) {
		// (ex) 100을 100 더하면 얼마에요?
		
		int sum = 0;
		for(int i = 1; i <=100; i++) {
			sum +=100;
		} 
		System.out.println(sum);
		// (ex) 1부터 10까지 더하면 얼마에요?
		
		int summ = 0;
		for(int i = 1; i<=10; i++) {
			
			summ += i;
			
		}	System.out.println(summ);
	}
}
