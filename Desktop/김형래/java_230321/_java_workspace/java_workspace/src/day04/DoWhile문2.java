package day04;

import java.util.Scanner;

public class DoWhile문2 {

	public static void main(String[] args) {
		/* -------menu--------
		 * 1. 저장|2. 출력|3. 종료
		 * -------------------
		 * 입력 : 1
		 * 저장되었습니다.

		 * 입력 : 2
		 * 출력되었습니다.

		 * 입력 : 3
		 * 종료되었습니다. 반복문 종료
		 * DoWhile / Switch / If
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("-------menu--------");
			System.out.println("1. 저장|2. 출력|3. 종료");
			System.out.println("-------------------");
			ch = scan.nextInt();
			System.out.println("입력 : "+ch);
			if(ch ==1) {
				System.out.println("저장되었습니다.");
			}
			else if(ch ==2) {
				System.out.println("출력되었습니다.");
			}
			else if(ch >3) {
				System.out.println("잘못된 값입니다");
			}
		}while(ch >= 3); //true가 될 수 있는 조건
		System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
	}

}
