package day05;

import java.util.Scanner;

public class 배열연습 {

	public static void main(String[] args) {

		/* 5명의 점수를 입력받아 배열에 저장하고,
		 * 점수의 합계, 평균, 최대, 최소 값을 출력
		 * 
		 */
		
		//1. 스캐너 열기
		Scanner scan = new Scanner(System.in);
		
		//2. 변수 및 배열 선언
		int [] arr = new int[5];
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 0;
		System.out.println("점수를 입력하세요");
		
		//3. for문을 사용하여 배열안을 탐색
		for(int i=0; i<arr.length; i++) {
			int sco = scan.nextInt();
			arr[i]=sco;
			sum = arr[i] + sum;
			avg = sum/5;
			min = arr[0];
			//max = Math.man(max, arr[i]);
			//min = Math.min(min, arr[i]);
			if(arr[i]>max) {
				max = arr[i];
			}
			else if(arr[i]<min) {
				min = arr[i];
			}
		}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최고점 : "+max);
		System.out.println("최저점 : "+min);
		
		
		
		
	}

}
