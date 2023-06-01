package day14;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {
	//private HashMap<String, Integer> map = new HashMap<>();
	private int sum = 0;
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		/* map에 상품명과 가격을 입력받고, 출력
		 * 총 지불가격 출력
		 * 입력과 출력 모두 메서드로
		 */
		//HashMap<String, Integer> map = new HashMap<>();
		MapEx02 ma = new MapEx02();
		//ma.make();
		//ma.show();
		//ma.make1(map);
		//ma.show1(map);
		HashMap<String, Integer> map = ma.make3();
		ma.show3(map);
		
		
	}
//	public void make() {
//		while(true) {
//		System.out.println("상품명을 입력해주세요");
//		String sc = scan.next();
//		System.out.println("가격을 입력해주세요");
//		int sc1 = scan.nextInt();
//		map.put(sc, sc1);
//		sum+=sc1;
//		System.out.println("계속 구매는 1번, 정지는 2번을 누르세요");
//		int sc2 = scan.nextInt();
//		if(sc2==2) {
//			break;
//		}
//		}
//		
//	}
	
//	public void show() {
//		for(String tmp : map.keySet()) {
//			System.out.println("상품명 : "+tmp+", 가격 : "+map.get(tmp)+"원");
//		}
//		System.out.println("총 지불 가격 : "+sum+"원")		
//	}
	
//	public void make1(HashMap<String, Integer> map) {
//		while(true) {
//		System.out.println("상품을 입력하세요");
//		String sc = scan.next();
//		System.out.println("가격을 입력하세요");
//		int sc1 = scan.nextInt();
//		sum+=sc1;
//		map.put(sc, sc1);
//		System.out.println("계속 구매는 1번, 정지는 2번을 누르세요");
//		int num = scan.nextInt();
//		if(num==2) {
//			break;
//		}
//		}
//	}
//		
//	public void show1(HashMap<String, Integer> map) {
//		for(String tmp : map.keySet()) {
//			System.out.println("상품명 : "+tmp+", 가격 : "+map.get(tmp)+"원");
//			}
//			System.out.println("총 지불 가격 : "+sum+"원");		
//		}
	
	public HashMap<String, Integer> make3() {
		HashMap<String, Integer> map = new HashMap<>();
		while(true) {
			System.out.println("상품을 입력하세요");
			String sc = scan.next();
			System.out.println("가격을 입력하세요");
			int sc1 = scan.nextInt();
			sum+=sc1;
			map.put(sc, sc1);
			System.out.println("계속 구매는 1번, 정지는 2번을 누르세요");
			int num = scan.nextInt();
			if(num==2) {
				break;
			}
		}
		return map;
	}
	
	public void show3(HashMap<String, Integer> map) {
		for(String tmp : map.keySet()) {
			System.out.println("상품명 : "+tmp+", 가격 : "+map.get(tmp)+"원");
			}
			System.out.println("총 지불 가격 : "+sum+"원");	
	}
		

}
