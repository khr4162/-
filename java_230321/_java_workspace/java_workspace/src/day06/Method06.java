package day06;

import java.util.Scanner;

public class Method06 {

	public static void main(String[] args) {
		/* 구구단 출력
		 * 구구단 1단을 출력하는 메서드
		 * 입력하는 숫자에 맞는 단을 출력
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int sca = scan.nextInt();
		System.out.println(sca+"단");
		gugu(sca);
	}
	
	/* 구구단 출력
	 * 매개변수 : int num1
	 * 리턴 : void
	 * 메서드명 : gugu
	 */
	
	public static void gugu(int num1) {
		int a = 0;
			for(int j=1; j<=9; j++) {
				a= num1*j;
				System.out.print(num1+" x "+j+" = "+a);
				System.out.println();
			}
		}
	
	
	
	
	
	}


