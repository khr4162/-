package day13;

import java.util.HashMap;
import java.util.Scanner;

public class 과제2 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 출력, 합계, 평균 출력
		 * 종료 키워드가 나올때까지 반복
		 * 과목과 점수를 입력해주세요
		 * 국어 : 89
		 * 수학 : 97
		 * 0 종료
		 * 입력받은 map 출력 후 합계: 평균:
		 * 0 종료
		 */
		int sum = 0;
		double avg = 0;
		int cnt = 0;
		HashMap<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("과목과 점수를 입력해주세요");
		while(true) {
			String sc = scan.next();
			cnt++;
			int sc1 = scan.nextInt();
			map.put(sc, sc1);
			sum+= map.get(sc);
			for(String tmp : map.keySet()) {
				System.out.println(tmp+":"+map.get(tmp));
			}
			System.out.println("0 입력 시 종료");
			System.out.println("1 입력 시 계속 진행");
			int sc2 = scan.nextInt();
			if(sc2==0) {
				break;
			}
			}
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+(double)sum/cnt);
		}
	}

