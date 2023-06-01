package day01;

public class IF문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 조건문 : 주어진 조건에 맞을 경우 실행문을 처리하는 구문
		 * if / switch문
		 * if문 : if, if~else, id~else if
		 * 
		 * if(조건식){
		 * 실행문;
		 * }
		 * 실행문이 하나일경우 {} 생략 가능(비추)
		 * 
		/* num1의 값을 주고, num1이 0이면 "num1은 0입니다"라고 출력
		 * 
		 */
		
		int num1 = 1;
		if(num1 == 0) {
		    System.out.println("num1은 0입니다.");
		}
		/* num1의 값을 주고, num1이 0이 아니면 "num1은 0이 아닙니다"라고 출력
		 * != 같지않다. ==같다
		 */
		
		if(num1 != 0) {
			System.out.println("num1은 0이 아닙니다.");
		}
		
		
		// num1이 0이면 0입니다.라고 출력, 0이 아니면 0이 아닙니다.라고 출력
		
		if(num1 != 0) {
			System.out.println("num1은 0이 아닙니다");
		} else {
			System.out.println("num1은 0입니다");
		}
		
		/** num1이 양수면 양수라고 출력 (0을 포함하지 않는경우 >)
		 *  num1이 0이면 0이라고 출력, 아니면 음수라고 출력
		 */
		num1 = -1;
		
		if(num1 > 0) {
			System.out.println("num1은 양수이다");
		} else if(num1 < 0){
			System.out.println("num1은 음수이다");
		} else {
			System.out.println("num1은 0이다");
		}
		
		/* num2가 짝수인지 홀수인지 판별
		 * num2가 짝수이면 "짝수", 아니면 "홀수" 출력
		 */
		
		int num2 = 3;
		if(num2 % 2 == 0) { // (조건식)은 true / false로 표현되어야 함.
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		
		
		
		
		
		
		}
		
	}

