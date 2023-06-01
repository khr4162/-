package day02;

public class Switch문2 {

	public static void main(String[] args) {
		/* 주사위의 값을 출력하는 예제
		 * 주사위는 1 ~ 6까지의 랜덤 수로 결정됨
		 * 주사위의 랜덤 수를 콘솔에 표현
		 */

		int num = (int)(Math.random()*13)-6;
		System.out.println("주사위 숫자는 "+ num + " 입니다");
		
		if(num == 0) {
			System.out.println("움직이지 않습니다");}
		else if(num > 0) {
			System.out.println(num + "만큼 전진합니다");}
		else {
			System.out.println(Math.abs(num) + "만큼 후진합니다");
		}
		
		
		}
		
	}
