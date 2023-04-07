package Package_2;

public class Test_7 {

	public static void main(String[] args) {
		int sum = 0;
//		for(int i=0; i<=100; i++) {
//			sum = (i%2==0)? sum+=i : sum;
//		}
//		System.out.println("1부터 100까지 짝수의 합:"+sum);
		
		for(int i = 0; i<=100; i++) {
			if(i%2==1) {
				continue;								//리싸이클
			}											//범위의 시작으로 이동
			sum += i;
		}
		System.out.println("1부터 100까지 짝수의 합:"+sum);
	}

}
