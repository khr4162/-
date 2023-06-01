package day03;

public class 이중For문 {

	public static void main(String[] args) {

		/* for(1초기화; 3,14,22조건식; 13,21증감식){ //1, 2, 3
		 * 		4,15실행문;
		 * 		for(5,16초기화; 6,9,12,17,20조건식; 8,11,19증감식){ //1~끝까지, 1~끝까지
		 * 			7,10,18실행문;
		 * 		}
		 * }
		 *  
		 */
		
		/* * ***** 줄 = i, / 별 = j
		 * * *****
		 * * *****
		 * * *****
		 * * *****
		 * 가로/세로 5*5의 별을 찍어보자
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		System.out.println();
		/* *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				System.out.print("*");
				if(i==j) {
					break;
				}
				
		}System.out.println();	
		
	}
		
		/*      *	i=1 공=4 j=1
		 *     **
		 *    ***
		 *   ****
		 *  *****
		 */
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
		}
		System.out.println();
		}
		/* if문을 이용한 방법
		 * 
		 */
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(j<=5-i) { // j=1, i=1
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}System.out.println();
		}
	
	
}
}