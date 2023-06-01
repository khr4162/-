package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Set01 {

	public static void main(String[] args) {
		/* Set 순서 보장x, 중복x
		 * HashSet
		 * index가 없음.
		 */
		HashSet<String> set = new HashSet<String>();
		set.add("apple");
		set.add("banana");
		set.add("apple");
		set.add("제이홉");
		set.add("정국");
		set.add("진");
		
		System.out.println(set);
		
		//for(String tmp : set) {
			//System.out.println(tmp);
			
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		System.out.println();
		//set 정렬 : set은 순서가 없기때문에 정렬이 안됨 => list 변환 후 정렬
		List<String> list = new ArrayList<String>(set);
		Collections.sort(list);
		System.out.println("set -> list");
		System.out.println(list);
		
		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
		});
		}
	}