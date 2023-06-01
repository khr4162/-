package day07;

import java.util.Scanner;

public class Method08 {

	public static void main(String[] args) {
		/* 배열이 주어졌을 때 배열을 출력하는 메서드 생성
		 * 
		 * 
		 */
		int arr[] = new int[] {1, 5, 4, 9, 7, 8, 2, 11, 16, 15, 6, 10, 13, 14};
		printArray(arr);
		System.out.println();
		
		sortArray(arr);
		printArray(arr);
		System.out.println();
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int sca = scan.nextInt();
		int arr1[] = randomArray(sca); // 배열 리턴
		printArray(arr1); // 출력
		System.out.println("---정렬---");
		sortArray(arr1);
		printArray(arr1);

	}
	/* 기능 : 주어진 정수 배열을 콘솔에 출력하는 메서드
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : printArray
	 * 옆으로 출력 / 5개씩 한 줄에 나열
	 */
	public static void printArray(int arr[]) {
			for(int i=0; i<arr.length; i++) {
				if(i%5==0 && i!=0) {System.out.println();
				}System.out.print(arr[i]+" ");
				}System.out.println();
	}
	
	/* 기능 : 주어진 정수 배열을 정렬하는 기능
	 * 매개변수 : int arr[]
	 * 리턴타입 : void
	 * 메서드명 : sortArray
	 */
	public static void sortArray(int arr[]) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]>arr[j]) { //오름차순
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		}
	
	/* 새로운 배열을 만들어서 랜덤 수를 채워 리턴하는 메서드
	 * 랜덤 수 범위(1 ~ 100까지)
	 * 매개변수 : 사이즈를 매개변수로 받아서
	 * 리턴타입 : 배열
	 * 메서드명 : randomArray
	 */
	public static int [] randomArray(int sca) {
		int arr1[] = new int[sca];
		for(int i=0; i<arr1.length; i++) {
			arr1[i]=(int)(Math.random()*100)+1;}	
		return arr1;
		
		
		
		
		
	}
	
	
	
	
	}

