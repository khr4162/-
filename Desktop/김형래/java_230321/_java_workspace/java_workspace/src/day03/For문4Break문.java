package day03;

import java.util.Scanner;

public class For문4Break문 {

	public static void main(String[] args) {

		// Break문 : 반복문을 빠져나오는 역할을 하는 키워드
		// 반복문에서 조건(if문을)문을 동반한다
		
		//1 ~ 100까지의 합계

		int i = 1, sum=0;
		for(;;) {
			System.out.println(i+" ");
			sum = sum+i;
			if(i==100) {
				break;
			}
			i++;
		}
		System.out.println();
		System.out.println(sum);
		
		/* 한 글자를 입력 받아 그대로 출력
		 * y를 입력 받으면 종료
		 * a - a, b - b , y - 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		//chatAt : 지정한 문자의 위치를 추출(공백을 포함하지 않는 단어)
		

		for(;;) {
		System.out.println("문자를 입력하시오'y'를 입력하면 종료됩니다");
		char ch = scan.next().charAt(0);
		System.out.println(ch);
			if(ch == 'y')  {
				break;
			}
			else if(ch == 'Y') {
				break;
				}
			}
		System.out.println("입력을 종료합니다");
		
		
		}

	
	}
