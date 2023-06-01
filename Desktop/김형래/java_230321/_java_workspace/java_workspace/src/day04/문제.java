package day04;

import java.util.Scanner;

public class 문제 {

	public static void main(String[] args) {
		/* 1 ~ 50 사이의 랜덤 수 하나를 생성 후 맞추는 게임.
		 * 예) 컴퓨터가 랜덤 수를 생성했습니다.
		 * 사용자 입력 : 
		 * 랜덤 수 보다 낮을 경우 "up"
		 * 사용자 입력 : 
		 * 랜덤 수 보다 높을 경우 "down"
		 * 사용자 입력 :
		 * 정답 시 "정답"
		 */
		
		int b;
		int count = 0; //카운트
		System.out.println("1 ~ 50 사이의 랜덤 수 맞추기 게임");
		int a=(int)(Math.random()*50)+1;
		System.out.println("컴퓨터가 랜덤 수를 생성했습니다.");
		Scanner scan = new Scanner(System.in);

		do {b= scan.nextInt();
		count++; //카운팅(횟수마다 +1씩 증가)
			System.out.println("사용자 입력 : "+ b);
			System.out.println("게임 횟수 : "+count);
			
			if(b<1 || b>50) {
				System.out.println("잘못된 값입니다");
				}
			else if(b==a) {
				System.out.println("정답입니다");	
				break;}
			else if(count==5) {
				System.out.println("Game Over");
				break;}
			else if(b<a) {
				System.out.println("up");
				}
				else if(b>a) {
				System.out.println("down");
				}
			else if(count<5) {
				System.out.println("남은 기회 : "+ (5-count));
			}
		}while(a!=b || count==5);
		
		
		
		
		
		
		
		
		
	}

}
