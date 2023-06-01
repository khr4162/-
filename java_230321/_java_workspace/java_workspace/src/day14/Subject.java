package day14;

import java.util.HashMap;
import java.util.Scanner;

public class Subject {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	double avg = 0;
	HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		/* map을 이용. 성적관리 프로그램 생성
		 * >>menu
		 * 			  과목  성적
		 * 1. 성적추가 (국어 97)
		 * 2. 성적조회(전체출력) : 합계/평균 같이 출력
		 * 3. 성적조회(과목) : 서치 후 일치하는 과목 출력
		 * 4. 성적수정 : 서치 후 수정
		 * 5. 성적삭제
		 * 6. 종료
		 * 
		 * CRUD
		 * C(create) : 생성
		 * R(read) : 읽기
		 * U(update) : 수정
		 * D(delete) : 삭제
		 */
		Subject sub = new Subject();
		sub.menu();

	}
	public void menu() {
		while(true) {
		System.out.println(">>menu");
		System.out.println("1. 성적추가");
		System.out.println("2. 성적조회(전체출력)");
		System.out.println("3. 성적조회(과목)");
		System.out.println("4. 성적수정");
		System.out.println("5. 성적삭제");
		System.out.println("6. 종료");
		int sc = scan.nextInt();
		switch(sc) {
		case 1 : add(); break;
		case 2 : print(); break;
		case 3 : sca(); break;
		case 4 : update(); break;
		case 5 : delete(); break;
		case 6 : System.out.println("장비를 정지합니다");break;
		default : System.out.println("잘못된 입력입니다"); break;
		}
		if(sc==6) {
			break;
		}
		}
	}
	public void add() {
		while(true) {
			System.out.println("과목과 점수를 입력해주세요");
			String sc1 = scan.next();
			int sc2 = scan.nextInt();
			map.put(sc1, sc2);
			sum+=sc2;
			System.out.println("계속 추가는 1번, 종료는 0번을 눌러주세요");
			int stop = scan.nextInt();
			if(stop==0) {
				break;
			}else{
				System.out.println("다시 입력해주세요");
			}
		}
	}
	public void print() {
		System.out.println(map);
		System.out.println("합계 : "+sum+" 평균 : "+sum/map.size());
	}
	
	public void sca() {
		System.out.println("조회할 과목을 입력해주세요");
		String sca3 = scan.next();
		for(String tmp : map.keySet()){
			if(tmp.equals(sca3)) {
				System.out.println(sca3+"점수 : "+map.get(sca3));
			}
		}
			
		}
	public void update() {
		System.out.println(map);
		System.out.println("수정할 과목과 점수를 입력해주세요");
		String sca4 = scan.next();
		int sca5 = scan.nextInt();
		for(String tmp : map.keySet()) {
			if(tmp.equals(sca4)) {
				map.put(sca4, sca5);
				System.out.println(tmp+" 점수 : "+map.get(sca4));
			}
		}
	}
	public void delete() {
		System.out.println("삭제할 과목을 입력해주세요");
		String sca6 = scan.next();
		for(String tmp : map.keySet()) {
			if(tmp.equals(sca6)) {
				map.remove(sca6);
				System.out.println(sca6+"가 삭제되었습니다");
			}
		}
	}
	

}
