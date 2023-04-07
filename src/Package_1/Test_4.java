package Package_1;

import java.util.Scanner;

public class Test_4 {

	public static void main(String[] args) {
		System.out.println("키보드에서 입력(성적)");
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		if(num>=60 & num<=100) {
			System.out.println("합격!");
		} else if(num<60 & num>=0) {
			System.out.println("불합격...");
		} else {
			System.out.println("다시입력");
		}

	}

}
