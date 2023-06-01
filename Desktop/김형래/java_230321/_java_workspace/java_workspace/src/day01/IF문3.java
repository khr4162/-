package day01;

import java.util.Scanner;

public class IF문3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Scanner 클래스 사용
		 * 값을 입력받을 때 사용하는 클래스
		// new
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		

		/* 국어, 영어 수학의 값을 입력받아 합계, 평균을 구하고 A ~ F 등급을 구하시오
		 * 입력을 유도하는 안내 문구
		 */
		System.out.println("점수를 입력해주세요. (0 ~ 100) : 국어, 영어, 수학의 순서로 입력하세요");
		int 국어 = scan.nextInt();
		int 영어 = scan.nextInt();
		int 수학 = scan.nextInt();
		
		if(국어 > 100 || 국어 < 0) {
			System.out.println("잘못된'국어'점수입니다");
		}
		if(영어 > 100 || 영어 < 0) {
			System.out.println("잘못된'영어'점수입니다");
		}
		if(수학 > 100 || 수학 < 0) {
			System.out.println("잘못된'수학'점수입니다");
		}
		
		int 합계 = 국어 + 영어 + 수학;
		double 평균 = 합계 / 3.0;
		
		System.out.println("합계 : " + 합계 + ", " + "평균 : " + 평균);		
		
		// 지역변수는 무조건 초기화가 되어야 함(아무것도 안됐을때 가장 기본 값)
		
		char ch = 'F';
		if(평균 > 100 || 평균 < 0) {
			System.out.println("잘못된 '평균'값입니다");
		} else if(평균 > 90) {
			ch = 'A';
		} else if(평균 > 80) {
			ch = 'B';
		} else if(평균 > 70) {
			ch = 'C';
		} else{
			ch = 'D';
		}
		
		System.out.println("등급 : " + ch);
		
		
		// 테스트
		
	
		scan.close();
		
		
		
		
    	}
	
	
	}
