package day14;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		/* 로또번호 출력 : Set이용
		 * random으로 생성. 1~45까지 총 6개
		 * TreeSet<>(); = 자동 오름차순
		 * 검색을 강화시킨 구조
		 */
		
		//Math 클래스에서 제공하는 random메서드 사용
		
		//Random 클래스 사용하는 방법
		
		//로또 번호
		TreeSet<Integer> set = new TreeSet<>();
		while(set.size()<6) {
			int b = new Random().nextInt(45)+1;
			set.add(b);
		}
		System.out.println("로또번호 : "+set);
		
		//내 번호
		TreeSet<Integer> set1 = new TreeSet<>();
		while(set1.size()<6) {
			int a = (int)(Math.random()*45)+1;
			set1.add(a);
		}System.out.println("내번호 : "+set1);
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set);
		
	}

}
