package day03;

import java.util.Scanner;

public class 소수구하기 {

	public static void main(String[] args) {
		
		/* 소수 : 약수가 1과 자기 자신인 수
		 * 소수 : 3, 5, 7, 11, 13 ...
		 * 소수는 약수가 2개인 수(1과 나 자신)
		 * num를 입력받아서 입력 받은 num가 소수인지 아닌지 판별
		 * 누적합계 : sum = sum +i
		 * 개수 : count = count +1
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오");
		int num1 = scan.nextInt();
		int count = 0;
		
		for(int i=1; i<=num1; i++) {
			if(num1 % i==0) {
				count = count +1;
			}
		}
			if(count == 2) {
				System.out.println("소수");
			}
			else if(count != 2){
				System.out.println("소수 x");
			}
		
			
			System.out.println("--------------------");
			/* 2 ~ 100까지의 소수를 출력
			 * 
			 */
			
			int cnt = 0;
			for(int num1 =2; num1<=100; num1++) {
				cnt = 0;
				for(int i=1; i<=num1; i++)
					if(num1 % i == 0) {
						cnt = cnt++;
					}
			}
			System.out.println(num1+">>>"+cnt);
			if(cnt == 2) {
				System.out.print(num1+ " ");
			}
			
			
			
			
		
	}		
		
}		