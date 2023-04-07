package Package_2;

import java.util.Scanner;

public class Test_3 {

	public static void main(String[] args) {
		
		System.out.println("나이 입력:");
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
//		if(age>=8 && age<=12) {
//			System.out.println("초등생");
//		}
//		else if(age>=13 && age<=19) {
//			System.out.println("중고생");
//		}
//		else {
//			System.out.println("일반인");
//		}
		String man = " ";
		if(age>=20) {
			man = "일반인";}
		else if(age>=13) {
			man = "중고생";}
		else {
			man ="초등생";}
		System.out.println(man);
	}

}
