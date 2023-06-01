package day06;

import java.util.Scanner;

public class Method03 {

	public static void main(String[] args) {
		/* 메서드를 활용하여 계산기를 작성
		 * 
		 * 메서드는 +, -, *, /, %를 작성하여 출력
		 * 두 수를 입력 받아서 연산. 연산자를 입력 받아 메서드를 활용하여 연산
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("값을 입력하세요");
		//int sca[] = new int[2];
		//String b = scan.next();
		//for(int i=0; i<sca.length; i++) {
			//sca[i] = scan.nextInt();
		//}
		//System.out.println(cul(sca[0], sca[1], b));
		//리턴을 배열로 리턴 : 몫, 나머지 double로 리턴
	
		System.out.println("첫 번째 숫자");
		int num1 = scan.nextInt();
		System.out.println("두 번째 숫자");
		int num2 = scan.nextInt();
		String op = scan.next();
		double[] arr = rem(num1, num2);
		
		switch(op) {
		case "%" : System.out.println("몫"+arr[0]);
		System.out.println("나머지"+arr[1]);
		break;
		
		case "+" : addition(op, num1, num2);
		break;
		
		} 
		
	
		//다른 Class에 있는 메서드 사용하기
		//Class이름 이름 = new Class이름();
		//이름.메서드
		Method02 m2 = new Method02();
		m2.sumPrint(0, 0);
	
		
	
	
	}
	

	public static int cul(int num1, int num2, String op) {
		int result =0;
		switch(op) {
			case "+" : result = num1 + num2;
			break;
			case "-" : result =(num1 - num2);
			break;
			case "*" : result =(num1 * num2);
			break;
			case "/" : result =(num1 / num2);
			break;
			case "%" : result =(num1 % num2);
			break;
			
		}
		return result;
	
		
		
	}
	//메서드 생성
	//위에 switch문으로 작성
	
	
	
	
	public static void addition(String op, int num1, int num2) {
		System.out.println(num1+op+num2+ "="+(num1+num2));
	}
	public static int substration(int num1, int num2) {
		return num1 - num2;
	}
	public static double division(int num1, int num2, String op) {
		return (double)num1 / num2;
	}
	/* 기능 : 두 정수를 입력받아 두 정수를 나눈 몫과 나머지를 배열로 리턴
	 * 리턴타입 : double
	 * 매개변수 : int num1, int num2
	 * 변수명 : rem
	 */
	public static double[] rem(int num1, int num2) {
		double arr[] = new double[2];
		arr[0]=num1/num2;
		arr[1]=num1%num2;
		return arr;
	}
	
}
