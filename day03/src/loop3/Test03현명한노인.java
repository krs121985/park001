package loop3;

public class Test03현명한노인 {
	
	
	public static void main(String[] args) {
		
		long sum = 1;
		long total = 0;
		
		for(int i = 1; i<=40; i++) {
			
	    System.out.println(i + "일차" +sum+"닢");
	    total +=sum;
	    sum*=2;
	    
		}
		System.out.println(total);
	}
}
