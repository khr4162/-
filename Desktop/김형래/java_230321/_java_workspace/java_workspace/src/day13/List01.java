package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list 생성
		 * 
		 */
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("오전 07시 기상");
		list.add("오전 08시 출발");
		list.add("오전 09시 수업 시작");
		list.add("오후 13시 점심 식사");
		list.add("오후 14시 수업 시작");
		list.add("오후 18시 학원 끝");
		list.add("오후 19시 저녁 식사 및 샤워");
		list.add("오후 20시 부업 시작");
		list.add("오후 23시 취미 활동");
		list.add("오전 00시 개인 시간");
		list.add("오전 01시 취침");
		
		for(int i=0; i<list.size(); i++) { //for문
			System.out.println(list.get(i));
		}
		
		System.out.println("----------------------");
		
		for(String tmp : list) { //향상된 for문
			System.out.println(tmp);
		}
		
		System.out.println("------------------------");
		
		Iterator<String> it = list.iterator(); //Iterator
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		Collections.sort(list);
		System.out.println(list);
		
		list.sort(new Test());
		
		System.out.println(list);
		
	}

}

class Test implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		//compareTo 메서드 활용
		return o2.compareTo(o1);
	}
	
}
