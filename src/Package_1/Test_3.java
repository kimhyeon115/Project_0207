package Package_1;

public class Test_3 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		do {
			sum += i;
			i++;
			System.out.println(sum);
		} while(i<=100);
		System.out.println("1부터 100까지의 합은 "+ sum +"입니다.");

	}

}
