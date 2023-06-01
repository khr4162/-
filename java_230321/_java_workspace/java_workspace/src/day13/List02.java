package day13;

import java.util.ArrayList;
import java.util.Scanner;

public class List02 {

	public static void main(String[] args) {
		/* --메뉴판--
		 * 1. 햄버거 : 7000
		 * 2. 핏자 : 15000
		 * 3. 음료 : 2000
		 * 4. 과자 : 2000
		 * 5. 사탕 : 500
		 * 6. 프로그램 종료
		 * 
		 * 메뉴를 선택해주세요. 1, 수량을 선택해주세요. 2.
		 * => 1번 메뉴 햄버거 2개
		 * 주문을 끝내시려면 0을 눌러주세요.
		 * 메뉴를 선택해주세요. 3, 수량을 선택해주세요. 2.
		 * => 3번 메뉴 햄버거 2개
		 * 주문을 끝내시려면 0을 눌러주세요. 0
		 * 
		 * -- 선택한 메뉴
		 * 햄버거 2개, 음료 2개 선택. 총 금액 : 
		 */
		
		FoodManager food = new FoodManager();
		ArrayList<Integer> order = new ArrayList<Integer>();
		food.printMenu();

		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("메뉴를 선택해주세요.");
			int menu1 = scan.nextInt();
			if(menu1>=6) {
				System.out.println("잘못된 값입니다");
				break;
			}
			if(menu1!=0) {
				System.out.println("수량를 선택해주세요.");
				int count = scan.nextInt();
				food.add(menu1, count);
				System.out.println(menu.get(menu1-1)+" "+count+"개");
				sum = sum + price.get(menu1-1)*count;
				System.out.println("총 금액 :"+sum);
				System.out.println("주문을 끝내시려면 0을 눌러주세요.");
				System.out.println();
			}
			else {
				System.out.println("잘못된 값입니다");
			}
		}
		while(menu1!=0);
	}

}

class FoodManager{
	//멤버변수 ArrayList 가격, ArrayList 메뉴, 그외 멤버변수는 알아서 선언
	private ArrayList<Integer> price = new ArrayList<Integer>();
	private ArrayList<String> menu = new ArrayList<String>();
	private int sum;
	private int totsum;
	
	
	
	//메서드 정의
	//void printMenu(), 추가 메서드 void add(), sale(int menu, int count)
	public void printMenu() {
		System.out.println("------메뉴판------");
		System.out.println("1. 햄버거 : 7000");
		System.out.println("2. 핏자 : 15000");
		System.out.println("3. 음료 : 2000");
		System.out.println("4. 과자 : 2000");
		System.out.println("5. 사탕 : 500");
		System.out.println("6. 프로그램 종료");
	}
	public void add(int menu1, int count) {
		price.add(7000);
		price.add(15000);
		price.add(2000);
		price.add(2000);
		price.add(500);
		menu.add("햄버거");
		menu.add("핏자");
		menu.add("음료");
		menu.add("과자");
		menu.add("사탕");
	}
	
	public void sale(int menu1, int count) {
		sum=price.get(menu1)-1*count;
		totsum+=sum;
		System.out.println(menu.get(menu-1));
		}
			
			
	
	public void list() {

	}
	
	
}