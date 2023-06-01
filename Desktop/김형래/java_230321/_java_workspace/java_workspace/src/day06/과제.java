package day06;

import java.util.Scanner;

public class 과제 {
	//멤버변수의 자리(클래스 안, 메서드 밖)
	//모든 메서드에서 공통으로 사용 가능 (앞에 static 붙이기)
	public static void main(String[] args) {
		/* 계산기 (+ - * / %) 각각 메서드 만들기
		 * 메서드에서 바로 출력
		 * 1. 숫자를 입력받는 메서드 
		 * 	-숫자는 배열로 입력받기
		 * 2. 메뉴 메서드
		 * 	- 원하는 계산을 선택해주세요 > 
		 * 	- 1 : 덧셈. 2 : 뺄셈, 3 : 곱셈, 4 : 나눗셈, 5 : 나머지
		 * 3. 각 기능 메서드 => 메서드에서 바로 출력(3 + 2 = 5)
		 * main에서 처리되어야 되는 부분
		 * 	1) 1번 메서드 호출 => 숫자를 배열로 저장
		 * 	2) 2번 메서드 호출 => 내가 선택한 번호 가져오기
		 * 	3) switch문을 이용해서 2번 메서드 return
		 * 	4) case에 따라 계산기 메서드 호출
		 * */
		//number(); //1
		//menu(); //2
		
		int num[] = number();
		int sc = menu();
		
		switch(sc) { //3
		
		case 1 : sum(num);
		break;
		case 2 : sub(num);
		break;
		case 3 : mul(num);
		break;
		case 4 : div(num);
		break;
		case 5 : mod(num);
		break;
		default : 
			System.out.println("잘못된 연산입니다");
		} //4
		System.out.println("장비를 정지합니다");
	}
	/* 각 기능에 대한 메서드
	 * 리턴 : void
	 * 매개변수 : 배열(1번 리턴)
	 * 
	 */
	
	
	
	/* 숫자를 배열로 입력받는 메서드
	 * 매개변수 : x
	 * 리턴 : 배열 => int[]
	 * 메서드명 : number()
	 */

	public static int[] number() {
		System.out.println("숫자를 입력하세요");
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[2];
		for(int i=0; i<arr.length; i++) {
		arr[i]=scan.nextInt();
		} return arr;
	}
	/* 메뉴를 나타내는 메서드
	 * 매개변수 : x
	 * 리턴타입 : 메뉴에서 선택한 값 => int
	 * 메서드명 : menu()
	 */
	
	public static int menu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 메뉴를 선택해주세요");
		System.out.println("1 : 덧셈, 2 : 뺄셈, 3 : 곱셈, 4 : 나눗셈, 5 : 나머지");
		int sc = scan.nextInt();
		return sc;
		}
	/* 각 기능(+ - * / %)
	 * 리턴 : void
	 * 매개변수 : 배열
	 * 
	 */
	
	public static void sum(int num[]) {
		int result = 0;
		for(int i=0; i<num.length; i++) {
			result = result + num[i];}
		System.out.println(num[0] + " + " + num[1] +" = "+result);
	}
	
	public static void sub(int num[]) {
	 int result = num[0]-num[1];
	 System.out.println(num[0] + " - " + num[1] +" = "+result);
	}
	
	public static void mul(int num[]) {
		int result = num[0]*num[1];
		System.out.println(num[0] + " * " + num[1] +" = "+result);
	}
	
	public static void div(int num[]) {
		int result = num[0]/num[1];
		System.out.println(num[0] + " / " + num[1] +" = "+(double)result);
	}
	
	public static void mod(int num[]) {
		int result = num[0]%num[1];
		System.out.println(num[0] + " % " + num[1] +" = "+result);
}
}
	
