package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구 게임
		 * 컴퓨터가 3자리의 숫자를 생성(1~9)
		 * 유저가 3자리의 숫자를 맞추는 게임.
		 * 게임 횟수 출력
		 * 
		 */
		int com[] = new int[3];
		int user[] = new int[3];
		
		int ran = random();
		int cnt = 0;
		
		num(com, ran);
		print(com);
		
		System.out.println();
		System.out.println("컴퓨터가 숫자를 결정하였습니다");
		System.out.println();
		user(user);
		System.out.println("유저의 선택 >> "+user[0]+""+user[1]+""+user[2]);
		base(com, user);
		
		
	



			
		

	}
	public static int random() {
		int n = (int)(Math.random()*9)+1;
		return n;
	}
	
	public static boolean check(int arr[], int random) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==random()) {
				return true;
			}
		}return false;
	}
	
	public static void num(int arr[], int random) {
		int i=0;
		while(i<arr.length) {
			int ran=random();
			if(!check(arr, ran)) {
				arr[i]=ran;
				i++;
		}
	}
	}
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]);
		}
		
	}
	public static void user(int arr[]){
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 하나 씩 입력해주세요");
		for(int i=0; i<arr.length; i++) {
			int sca = scan.nextInt();
			arr[i] = sca;
		}
		
	}
	public static void base(int arr[], int ar[]) {
		int str = 0;
		int bal = 0;
		int out = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==ar[i]) {
				str++;
			}
			else if(arr[i] == ar[0] || arr[i]==ar[1] || arr[i]==ar[2]) {
				bal++;
			}
			
			else {
				out++;
			}
			
			
		}if(str==3) {
			System.out.println("게임을 종료합니다");}
		System.out.println("스트라이크 : "+str+" 볼 : "+bal+" 아웃 : "+out);	
		}

	}
