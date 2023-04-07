package Package_2;

import java.util.Scanner;

public class Test_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int i = scn.nextInt();
		String t = " ";
		if(i>20 ) {
			t = ("20보다 큽습니다.");
		}
		else {
			t = ("20보다 작습니다.");
		}
		System.out.println("입력 값은 "+i);
		System.out.println(t);
	}

}
