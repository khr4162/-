package day08;

public class Method09 {

	public static void main(String[] args) {
		/* 메서드 오버로딩 (Method Overloading)
		 * - 동일한 이름을 가지는 메서드를 여러 개 만드는 경우
		 * 1. 매개변수의 갯수가 달라야 함
		 * 2. 매개변수의 종류(자료형)가 달라야 함
		 * 3. 리턴타입은 상관없음, 이름도 상관없음
		 * 
		 */
		System.out.println(sum(5, 3));
		System.out.println(sum(3.5, 8.1));
		System.out.println(sum(1,2,3,4,5,6,7,8,9,10));
		int arr[] = {78,569,13,52,68,94,12};
		System.out.println(sum(arr));
		
	}
	/* 더하기 하는 메서드 생성
	 * int num1, int num2를 매개변수로 받아 더한 값을 return
	 * 
	 */
	
	/* 가변길이 메서드
	 * 1+2, 1+2+3, 45+78
	 * 피연산자의 갑이 일정하지 않을경우 매개변수의 개수와 상관없이 매개 값을 줄때 사용
	 */
	//가변길이 num는 배열처럼 사용
	public static int sum(int ...num) {
		int sum=0;
		for(int i=0; i<num.length; i++) {
			sum=sum+num[i];
		}
		return sum;
	}
	
	/* 더하기 하는 메서드 생성
	 * 매개변수 : double 자료형으로
	 * 메서드명 : sum
	 */
	public static double sum(double num1, double num2) {
		return num1+num2;
	}
}