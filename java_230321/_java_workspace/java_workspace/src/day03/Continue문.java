package day03;

public class Continue문 {

	public static void main(String[] args) {
		/* Continue : pass, 조건에 맞다면 pass
		 * 1 ~ 10까지 출력하는데 5만 빼고 출력
		 * 1 2 3 4 6 7 8 9 10
		 */

		for(int i=1; i<=10; i++) {
			if(i ==5) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println(); // 줄 바꿈
		
		//짝수만 출력
		for(int i=1; i<=10; i++) {
			if(i%2 ==1) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println(); //줄 바꿈
		
		
		
		
		
	}

}
