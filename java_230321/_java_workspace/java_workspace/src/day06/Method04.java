package day06;

public class Method04 {

	public static void main(String[] args) {
		/* 1. 랜덤(1 ~ 100) 정수 5개를 배열에 담는 메서드 (배열을 리턴)
		 * 2. 배열을 전달 받아서 평균을 연산하는 메서드 (평균(double)을 리턴)
		 * 3. 정수 5개와 평균을 출력하는 메서드 
		 * 
		 * main에서는 연산식이 있으면 안됨.
		 * 메서드간의 데이터 전달 및 호출만 있어야 함.
		 */
	/*	int arr[] = arr();
		System.out.println(arr());
		System.out.println(avg(arr));
		printer(arr(), avg(arr));
		
	}
	public static int[] arr() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
			}
		return arr;
		
	}
	public static double avg(int arr[]) {
		int arr[] = arr();
		double a = 0;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}a = double sum/arr.length;
		return a;

	}
	public static void printer(int arr[], double avg) {
		System.out.println(arr()+", "+avg(arr));
	}
	*/
	

	
	
	int arr[] = random();
	average();
	//print(arr, avg);
	System.out.println();
	//print(arr, average());
	
	
	
}
	//랜덤(1~100) 정수 5개를 배열에 담는 메서드
	//리턴타입 : 정수배열 => int[]
	//매개변수 : x
	//메서드명 : random
	public static int[] random() {
		int arr[] = new int[5];
		for(int i=0; i<arr.length; i++)
			arr[i] = (int)(Math.random()*100)+1;
			return arr;
	}
	//랜덤 메서드를 호출하여 평균을 연산하는 메서드
	//리턴타입 : 평균 => double
	//매개변수 : 
	//메서드명 : average
	public static void average() {
		int arr[] = random(); // 위에서 만든 random 메서드 호출
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
		}double avg = sum / arr.length;
		print(arr, avg); //프린트 호출해서 출력
	}
	//정수 5개와 평균을 출력하는 메서드
	//리턴타입 : void(출력은 리턴이 없음)
	//매개변수 : 배열, 평균 = int arr[], double avg
	//메서드명 : print
	
	public static void print(int arr[], double avg) {
		System.out.println("5개의 랜덤 정수 값");
		for(int tmp : arr) {
			System.out.print(tmp+" ");
		}System.out.println();
		System.out.println("평균 : "+avg);
	}
	
}
