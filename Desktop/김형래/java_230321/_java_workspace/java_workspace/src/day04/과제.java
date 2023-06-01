package day04;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위를 던져서 총 30칸을 이동하면 완주
		 * 주사위 : 1 ~ 6까지의 랜덤 수
		 * 주사위 : 3
		 * 3칸 전진 => 27칸 남았습니다
		 * ...
		 * 도착. 총 이동횟수 : 00번
		 * 클럽에 도착
		 */
		int sum = 0;
		int count = 0;
		System.out.println("주사위 게임 시작~");
		System.out.println();
		for(int i=30; ; i--) {
			int ran = (int)(Math.random()*6)+1;
			sum=ran+sum;
			count++;
			System.out.println("주사위 : "+ran);
			System.out.println(ran+"칸 만큼 전진합니다.");
			System.out.println(30-sum+"칸 남았습니다.");
			System.out.println();
			
		if(sum>=30) {
			System.out.println("경-축!!"+count+"번만에 성공하셨습니다!!");
			break;
			
		}	
	}
		//int random=0 // 주사위 값
		//int sum=0 // 이동거리
		//int count=0 // 주사위 던진 횟수
		//int last = 30; // 최종 목표 값
		
		//while(sum<last){ //sum이 last가 될때까지 반복
		//random = (int)(Math.random()*6)+1; //1~6까지 랜덤 수 생성
		//sum+=random; // 거리 합산
		//count++;
		//system.out.println("주사위 : "+random+", 전진 => "+"+last-random+"칸 남았습니다");
		//}
		// system.out.println("도착, 총 이동횟수 : "+count);
		
		
		
		
		
		
		
	}
	}
