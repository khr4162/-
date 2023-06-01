package day02;

import java.util.Scanner;

public class IF예제 {

	public static void main(String[] args) {
		/**정수를 입력받아서 정수가 짝수인지 홀수인지 판단하여 출력.
		 **/
		
		Scanner scan = new Scanner(System.in); //ctrl+shift+o (import 단축키)
		
		System.out.println("숫자를 입력하시오");
		int 숫자= scan.nextInt();
		
		if(숫자 == 0) {
			System.out.println("잘못된 값입니다");
		}
		else if(숫자 % 2 == 0)
		{System.out.println("'짝수' 입니다");
		}else if(숫자 % 2 != 0) 
		{System.out.println("'홀수' 입니다");
		}
		
		
		
				

				
		scan.close();
	}

	}