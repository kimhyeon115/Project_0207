package Package_1;

public class Test_5 {

	public static void main(String[] args) {
		int ss = (int)3.14;
		double kk = 3;
		System.out.println(ss);
		System.out.println(kk);
		
		int j = 2;
		int i = 2;
		j = ++i;
		System.out.println("j는 "+j);
		System.out.println("i는 "+i);

		String dd = "yes";
		System.out.println(dd.equals("YES"));
		System.out.println(dd.equals("yes"));
		System.out.println(dd.equalsIgnoreCase("YES"));
		
		int x = 3;
		int sum = 0;
		if(x>5) {
			sum = 5;
		} else {
			sum = 20;
		}
		System.out.println(x);
		System.out.println(sum);
		
	}

}
