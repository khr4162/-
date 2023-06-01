package day07;

import java.util.Scanner;

public class 야구게임 {

	public static void main(String[] args) {
		/* 야구 게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9)
		 * 유저가 3자리의 숫자를 맞추는 게임.
		 * 게임 횟수 출력
		 * 
		 */
		//1. 스캐너 열기
		Scanner scan=new Scanner(System.in);
		
		//2. 변수 선언
		int comNum[] = new int [3]; //컴퓨터 배열
		int myNum[] = new int [3]; //내 배열
		int count = 0; //게임 횟수
		
		//로또 예제 메서드 호출
//		Lotto lot = new Lotto();
//		Lotto.randomArray(comNum);
//		Lotto.print(comNum);
//		Point p = new Point(); //포인트 클래스
		
		//3. 컴퓨터가 결정한 3가지 숫자를 중복되지않게 추출
		for(int i=0; i<comNum.length; i++) {
			comNum[i]=(int)(Math.random()*9)+1; //1~9까지
			for(int j=0; j<i; j++) {
				if(comNum[i]==comNum[j]) {
					i--;
					break; //(for(j의 구문을 빠져나감)
				}
			}
		}
		
		System.out.println("--야구게임 시작");
		System.out.println("컴퓨터가 숫자를 결정했습니다");
		//4. 사용자 숫자 입력
		int s=0;
		int b=0;
		while(true) {
			System.out.println(">> 숫자 입력(1~9, 숫자 3개) : ");
			
			//값을 실제 숫자로 받는 경우
//			for(int i=0; i<myNum.length; i++) {
//				myNum[i]=scan.nextInt();
//			}
			
			//값을 문자로 입력받는 경우
			String myStr = scan.next(); //한 자리씩 잘라서 배열에 저장
			String[] myNumStrArr = myStr.split(""); //한 글자씩 잘라서 배열로 저장
			for(int i=0; i<myNum.length; i++) {
				myNum[i]=Integer.parseInt(myNumStrArr[i]);  //String => int Integer.parseInt
			}
			count++;; //카운트 1회 증가
			
			//숫자 비교
			for(int i=0; i<comNum.length; i++) { //컴퓨터 Num 기준 탐색
				for(int j=0; j<myNum.length; j++) { //myNum 기준 탐색
					//스트라이크 기준 (값 & 자리수도 같을 경우)
					if(comNum[i]==myNum[j]&&i==j) { 
						s++;
						//볼의 기준 (값만 같고, 자리수는 다를 경우)
					}else if(comNum[i]==myNum[j]&&i!=j) {
						b++;
					}
				}
			}
			//출력
			//out의 조건(아무것도 안 맞을때)
			if(s==0&&b==0) {
				System.out.println("out!!");
			}else {
				System.out.println(s+"S "+b+"B");
				System.out.println("시도 횟수 : "+count);
			}
			
			if(s==3) {
				System.out.println("정답입니다");
				break;
			}
		}

	}

}
