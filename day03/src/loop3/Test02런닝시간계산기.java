package loop3;

public class Test02런닝시간계산기 {
	public static void main(String[] args) {
		// 새해부터 살을 빼기 위해서 요즘 유행한다는 런닝을 하려고 합니다.
		// 첫날은 힘드니까 10분만 하고 둘째날부터는 5분씩 시간을 늘려가면서 약 30일간 시도해보려고 합니다.

		// 각 날짜별로 하게되는 런닝 시간을 출력하세요
		// 30일동안 하게되는 런닝 시간을 출력하세요 (?시간 ?분)
		
		int sum = 10;
		int total = 0;

		
		for(int i = 1; i<=30; i++) {
			
			System.out.println(i +"일차 러닝시간 : " +sum + "분");
			total +=sum;
			sum+=5;
		}
		int hour = total/60;
		int min = total%60;
		System.out.println("총 러닝시간 : " + hour + "시간"+min+"분");
	}
}
