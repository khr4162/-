package day08;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구 게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9)
		 * 유저가 3자리의 숫자를 맞추는 게임.
		 * 게임 횟수 출력
		 * 
		 */
		
		int s=0;
		int b=0;
		int comNum[] = new int [3]; //컴퓨터 배열
		int myNum[] = new int [3]; //내 배열
		int count = 0; //게임 횟수
		
		System.out.println("--야구게임 시작");
		System.out.println("컴퓨터가 숫자를 결정했습니다");
		ran(comNum);
		while(true) {
		user(myNum);
		count++;
		int c=result(s, b, count, comNum, myNum);
		if(c==3) {
		break;}
		}
		}
		
	//컴퓨터 랜덤 수
	public static void ran(int arr[]) {
	for(int i=0; i<arr.length; i++) {
		arr[i]=(int)(Math.random()*9)+1; //1~9까지
		for(int j=0; j<i; j++) {
			if(arr[i]==arr[j]) {
				i--;
				break; //(for(j의 구문을 빠져나감)
			}
		}
	}
	}
	//결과
	public static int result(int num1, int num2, int num3, int arr[], int arr1[]) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr1.length; j++) {
				if(arr[i]==arr1[j]&&i==j) { 
					num1++;
				}else if(arr[i]==arr1[j]&&i!=j) {
					num2++;
				}
			}
		}
		
		if(num1==0&&num2==0) {
			System.out.println("out!!");
		}else {
			System.out.println(num1+"S "+num2+"B");
			System.out.println("시도 횟수 : "+num3);
		}
		
		if(num1==3) {
			System.out.println("정답입니다");
			}return num1;
		
	}
	//중복 확인
	public static void check(int arr1[], int arr2[], int num1, int num2) {
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length; j++) {
				if(arr1[i]==arr2[j]&&i==j) { 
					num1++;
				}else if(arr1[i]==arr2[j]&&i!=j) {
					num2++;
				}
			}
		}
	}
	//유저 수 생성
	public static void user(int arr[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println(">> 숫자 입력(1~9, 숫자 3개) : ");
		String myStr = scan.next();
		String[] myNumStrArr = myStr.split("");
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(myNumStrArr[i]);
		}
	}


}