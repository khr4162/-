package day05;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 가위바위보 게임 만들기
		 * 컴퓨터가 가위, 바위, 보 중 랜덤으로 선택 (0=가위, 1=바위, 2=보)
		 * 내가 가위, 바위, 보 중 선택해서 입력
		 * 승패무 결과 출력
		 * 삼항연산자 (조건식)? true : false;
		 */
		//System.out.println((num %2==0)? "짝수" : "홀수");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("가위바위보 게임 시작~");
		System.out.println("0=가위, 1=바위, 2=보");

		int com = (int)(Math.random()*3);
		String a=scan.next();
		
		//컴퓨터의 선택을 String으로 변환
		String b= (com==0)?"가위" : (com==1)?"바위" : "보";
		System.out.println(b);
		if(b.equals(a)) {
			System.out.println("비겼습니다");
		}
		else {
			if(b.equals("가위")) {
				System.out.println((a.equals("바위")? "승리했습니다" : "패배하였습니다"));
			}else if(b.equals("바위")) {
				System.out.println((a.equals("보")? "승리했습니다" : "패배하였습니다"));
			}
			else {
				System.out.println(a.equals("가위")?"승리했습니다" : "패배하였습니다");
			}
		}
		
		
			
			
			
		}
	}
	

