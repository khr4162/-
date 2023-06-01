package day06;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 숫자와 기호를 주고 기호를 숫자만큼 출력
		 * ex) 3, * => ***
		 * ex) 5, o => ooooo
		 * 숫자와 기호는 스캐너로 입력받기
		 */
		Scanner scan = new Scanner(System.in);
		int su = scan.nextInt();
		String gi = scan.next();
		giho(su, gi);

	}
	public static void giho(int num, String a) {
		for(int i=1; i<=num; i++) {
		System.out.print(a);
		}
	}

}
