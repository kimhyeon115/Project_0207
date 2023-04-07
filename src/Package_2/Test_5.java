package Package_2;

import java.util.Scanner;

public class Test_5 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		//여러번 입력시 한번만 사용해도 가능
		System.out.println("첫번째 숫자 입력:");
		int sum = scn.nextInt();					//next 중복 사용가능
		System.out.println("두첫번째 숫자 입력:");
		int nus = scn.nextInt();
		System.out.println("합계:"+(sum+nus));
		System.out.println("차이:"+(sum-nus));
		}

}
