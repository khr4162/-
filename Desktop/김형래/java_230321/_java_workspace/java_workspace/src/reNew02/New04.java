package reNew02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		/* 컬렉션 프레임워크
		 * - List : 순서보장, 중복가능
		 * - Set : 순서보장X, 중복 불가능
		 * - Map : 2가지 데이터를 쌍으로 저장, 순서보장 X
		 * 	- key(중복불가능) : value(중복가능)
		 */
		//리스트를 생성하고, 1~10까지 저장한 후 출력
		
		List<Integer> list1 = new ArrayList<>();
		List list = new ArrayList();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for(Integer tmp : list1) {
			System.out.println(tmp);
		}
//		 정수를 입력받아 1부터 정수까지 리스트에 추가하고
//		 합을 출력
		list.clear();
		Scanner scan = new Scanner(System.in);
//		int sum=0;
//		int sc = scan.nextInt();
//		for(int i=1; i<=sc; i++) {
//			list.add(i);
//			sum = sum+i;
//		}
//		
//		System.out.println(list);
//		System.out.println(sum);
		
		//map를 이용하여 이름:점수 형태로 3명의 이름과 점수를 입력
		//map 출력하고 합계, 평균 출력
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("김철수", 50);
//		map.put("김영수", 75);
//		map.put("김영희", 100);
//		System.out.println(map);
//		for(String tmp : map.keySet()) {
//			System.out.println(tmp+":"+map.get(tmp));
//		}
//		int sum = map.get("김철수")+map.get("김영수")+map.get("김영희");
//		double avg = (double)sum/map.size();
//		System.out.println(sum);
//		System.out.println(avg);
		
		// 스캐너로 이름과 점수를 입력받아 5명 map, 합계, 평균 출력
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		int sum = 0;
		double avg = 0;
		for(int i = 1; i<=5; i++) {
			String sc = scan.next();
			int sc1 = scan.nextInt();
			map1.put(sc, sc1);
			sum = sum+sc1;
		}
		for(String tmp : map1.keySet()) {
			System.out.println(tmp+":"+map1.get(tmp));
	}
		avg = sum/map1.size();
		System.out.println(sum);
		System.out.println(avg);

}
}
