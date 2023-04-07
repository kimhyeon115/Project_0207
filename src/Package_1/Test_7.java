package Package_1;

import java.util.Scanner;

public class Test_7 {

	public static void main(String[] args) {
		System.out.println("성적을 입력:");
		Scanner scn = new Scanner(System.in);
		int ss = scn.nextInt();
		if(ss>=80) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}

	}

}
