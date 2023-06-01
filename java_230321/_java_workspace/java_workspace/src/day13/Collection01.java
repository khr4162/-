package day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Collection01 {

	public static void main(String[] args) {
		   /* 컬렉션 프레임워크 : 표준화된 방식의 자료구조
		    * List, Set, Map
		    * 데이터를 묶어서 관리할때 사용
		    * 주로 배열 대신 사용
		    * 
		    * List : 배열과 동일
		    * - 값을 하나씩 저장
		    * - 순서를 보장
		    * - 중복을 허용
		    * - 배열 대신 가장 많이 사용
		    * 
		    * Set
		    * - 값을 하나씩 저장
		    * - 순서를 보장하지 않음(index 번지가 없음)
		    * - 중복 허용 x
		    * 
		    * Map
		    * - 값을 두개 저장 key/value 쌍으로 저장
		    * - key는 중복 불가, value는 중복 가능
		    * - key가 중복되면 덮어쓰기 됨
		    * - 아이디 / 패스워드처럼 같이 묶어서 하나의 자료로 저장할때 사용
		    * 
		    * int arr[]; : 기본 자료형 사용가능.
		    * collection에서는 어떤 클래스로 데이터를 관리할지 지정해야 함.
		    * 
		    * int빼고 나머진 첫 글자를 대문자로 변환하면 ㅇㅋ(자료형을 클래스로 변환)
		    * int -> Integer, String, Byte, Boolean
		    * 클래스를 지정하지 않으면 Object가 자동으로 들어감.
		    */
		
		//List list1 = new List(); //error (앞에껀 Import해서 사용)
		List list1 = new ArrayList(); //Object클래스가 자동 지정된 케이스
		ArrayList list2 = new ArrayList(); //Object클래스가 자동 지정된 케이스
		//숫자만 가능한 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new ArrayList<>(); 이거도 같은 의미
		
		//문자열만 가능한 ArrayList 생성
		ArrayList<String> list3 = new ArrayList<String>();
		
		//add() : 요소를 추가
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		//size() : List의 총 갯수
		System.out.println(list.size());
		
		//list3에 문자 5개 지정 후 출력, 총 갯수 출력
		list3.add("김");
		list3.add("형");
		list3.add("래");
		list3.add("바");
		list3.add("보");
		System.out.println(list3);
		System.out.println(list3.size());
		
		//List 하나를 생성하고 1~10까지 저장한 후 출력
		ArrayList<Integer> list0 = new ArrayList<>();
		for(int i=1; i<=10; i++) {
			list0.add(i);
			}
		System.out.println(list0);
		System.out.println(list0.size());
		
		for(int i=1; i<=10; i++) {
			list0.add(i);
			}
		System.out.println(list0);
		System.out.println(list0.size());
		//get(index) : index 번지의 값을 가져와라
		System.out.println(list0.get(5));
		//set(index, 값) : index 번지에 값을 넣어라
		
		list0.set(0, 5); //0번지 값을 5로 변경
		System.out.println(list0);
		System.out.println(list0.get(0));
		
		//remove(index) : index 번지 값 삭제
		//remove(Object) : Object 값으로 넣으면 값으로 삭제
		list0.remove(0);
		System.out.println(list0);
		
		Integer a = 10;
		list0.remove(a);
		System.out.println(list0);
		
		//contains(Object) : list에 값이 있는지 검사. 있으면 true / 없으면 false
		System.out.println(list0.contains(a));
		
		//clear() : list 전체 삭제 (비움)
		list0.clear();
		System.out.println(list0);
		
		//isEmpty() : list가 비어있는지 체크. 비어있으면 true
		System.out.println(list0.isEmpty());
		
		//list0에 for문으로 1~5까지만 입력
		for(int i=1; i<=5; i++) {
			list0.add(i);
		}System.out.println(list0);
		
		//list0 요소 출력
		for(int i=0; i<list0.size(); i++) {
			System.out.print(list0.get(i)+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		//요즘 자주 사용 : 향상된 for문
		for(int tmp : list0) {
			System.out.print(tmp+" ");
		}
		System.out.println();
		System.out.println("-------------------------");
		
		//Iterator : 컬렉션을 출력하기위해 사용.
		/* list는 순서를 보장하기 때문에 get(i)를 이용하여 원하는 번지에 접근이 가능
		 * set은 순서를 보장하지 않기 때문에 for문을 이용할 수 없음.
		 * 향상된 for, Iterator처럼 순서와 상관없이 값을 가져올 수 있는 구문에서 출력가능.
		 * 
		 */
		System.out.println("> Iterator 출력");
		Iterator<Integer> it = list0.iterator();
		while(it.hasNext()) { //hasNext() 다음 요소가 있는지 체크 (true / false)
			Integer tmp = it.next(); //next() 다음 요소 가져오기
			System.out.print(tmp+" "); //출력
		}
		
		System.out.println();
		//indexOf(값) : 해당 값의 list index 번지를 반환 / 없다면 -1 리턴
		Integer b = 5;
		System.out.println(list0.indexOf(b));
		
		System.out.println();
		
		//Collections.sort(list0); //오름차순 정렬
		System.out.println(list0);
		
		//sort(객체)
		// - 객체 : Comparator 인터페이스를 구현한 객체를 넣어야함. (익명클래스 사용)
		// - 비교(compare) 메서드를 사용하여 객체를 정렬하는 형태
		//오름, 내림차순
		list0.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// o1-o2 : 오름차순, o2-o1 : 내림차순
				return o2-o1;
			}
		});
		System.out.println(list0);
		}
	}

