package day14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Subject정답 {
	Scanner scan = new Scanner(System.in);
	int sum = 0;
	double avg = 0;
	HashMap<String, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void insert() {
		System.out.println("과목과 성적을 입력해주세요");
		String subject = scan.next();
	}
	
	//전체 출력
	public void print() {
		int sum = 0;
		double avg = 0;
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String subject = it.next();
			int score = map.get(subject);
			sum = sum+score;
			System.out.println(subject+":"+score);
		}
		System.out.println("합계:"+sum);
		System.out.println("평균:"+sum/map.size());
	}
	
	//과목조회 후 출력
	public void printSub() {
		System.out.println("조회할 과목을 입력해주세요");
		String subject = scan.next();
		
		Integer score = map.get(subject);
		if(score==null) {
			System.out.println(subject+"는 없는 과목입니다");
		}else {
			System.out.println(subject+":"+score);
		}
	}
	
	//성적 수정
	public void modify() {
		System.out.println("수정할 과목과 점수를 입력해주세요");
		String subject = scan.next();
		int score = scan.nextInt();
		map.put(subject, score); //map의 key는 중복불가 중복되면 덮어쓰기됨
		System.out.println(subject+"성적이 "+score+"로 변경되었습니다");
		
	}
	
	public void delete() {
		System.out.println("삭제할 과목과 점수를 입력해주세요");
		String subject = scan.next();
	}
	
}
