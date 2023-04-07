package Package_2;

public class Test_9 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(i=0;;i++) {
			sum += i;
			if(sum>=100) {
				break;
			}
		}
		System.out.println(sum);
	}

}
