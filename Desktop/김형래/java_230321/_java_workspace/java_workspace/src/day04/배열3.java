package day04;

import java.util.Scanner;

public class 배열3 {

	public static void main(String[] args) {
		
		/* 5명의 점수를 입력받아서 배열에 저장
		 * 점수의 합계와 평균을 출력
		 * 배열의 값은 5개
		 * 합계 : 
		 * 평균 :
		 * 
		 *  1. Scanner
		 *  2. 배열 선언 / int[]arr = new int[숫자]
		 *  3. 값 추가 (for문으로)
		 *  4. for문 for(int i=0; i>arr.length; i++){
		 *  arr[i]=scan.nextint();
		 *  
		 *  제일 먼저 뭘 해야할지를 생각해라!!
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int max = 0;
		int min = 0;
		double avg = 0;
		int arr[] = new int [5];
		System.out.println("점수를 입력하시오");
	
		for(int i=0; i<arr.length; i++) { //정해진 숫자만큼 계속 입력 받을려면 scan.nextint를 for문 안에 넣기
			int a = scan.nextInt();
			arr[i]=a;
			
			sum=sum+arr[i]; //누적이 될려면 자기 자신을 꼭 더해야 함
			avg=(double)sum/5;
			min=arr[0];
			if(arr[i]<min) {
				min=arr[i];
				
			}
			for(int j=0; j<arr.length; j++) { //굳이 포문 안 열어 if문 그대로 원래 있던 for문에 넣어도 가능
				if(arr[j]>max) {
					max=arr[j];
				}
			}
				} 

		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		//System.out.printf("평균 : %f\n", avg); (printf 사용시)
		System.out.println("최고 점수 : "+max);
		System.out.println("최저 점수 : "+min);
		
		scan.close();
		
		
		
		
		
	}

}
