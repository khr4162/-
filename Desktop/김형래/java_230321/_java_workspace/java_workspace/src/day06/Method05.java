package day06;

import java.util.Scanner;

public class Method05 {

	public static void main(String[] args) {
		/* 2 ~ 100까지의 소수를 출력
		 * for문을 돌려 해당 정수가 is를 호출 후 정수가 맞으면 출력
		 */
		int sum = 0;
		for(int num1=2; num1<=100; num1++) {
			if(is(num1)) {
				sum+=num1;
				System.out.print(num1+" "); //2부터 100까지의 소수
			}
			//System.out.println(num1+" : "+is(num1));
			}
		
		
		//입력 수가 소수가 맞는지
		Scanner scan = new Scanner(System.in);
		//int s = scan.nextInt();
		//System.out.println((s+" : "+is(s)));
		}
		
		
		
	/* 소수 : 1과 자기 자신만을 약수로 가지는 수
	 * 기능 : 정수가 주어지면 이 정수가 소수인지 아닌지 판별(true / false)
	 * 리턴타입 : boolean
	 * 매개변수 : int num1
	 * 메서드명 : is
	 */
	//boolean에서 아무것도 안 줬으면 기본 값 false
	public static boolean is(int num1) {
		int cnt = 0;
			for(int j=1; j<=num1; j++) {
				if(num1%j==0) {
					cnt++; //약수의 갯수
				}
			}
			if(cnt==2) {
				return true;
			}
			return false;





}
	}
