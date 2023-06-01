package day04;

import java.util.Scanner;

public class DoWhile문 {

	public static void main(String[] args) {
		/* for, while문은 조건식이 한번도 실행이 안될 수도 있음.
		 * do{
		 * 실행문;
		 * }while(조건문); //조건식 필수
		 * 
		 */
		
		/* 값을 입력하면 그대로 출력하는 구문
		 * 단, y/Y가 입력되면 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		char ch;
		do {System.out.println("문자를 입력하시오");
			ch = scan.next().charAt(0);
			System.out.println();
		}while(ch!='y'||ch!='Y');
		//do 안에서 break를 넣을 경우 조건문에 true(while(true))
			
			
			
			
			
		}

}
