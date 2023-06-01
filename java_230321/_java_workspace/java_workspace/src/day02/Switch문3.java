package day02;

public class Switch문3 {

	public static void main(String[] args) {
		/* 계절을 출력
		 * 1 ~ 12월까지 랜덤으로 생성 후 월과 계절을 출력
		 * 3 ~ 5 : 봄, 6 ~ 8 : 여름, 9 ~ 11 : 가을, 12 ~ 2: 겨울
		 * (1) || (2) => or 둘 중 하나의 조건만 맞으면 true
		 * (1) && (2) => and 둘 다 맞아야 true
		 * !(1) => 조건의 반대
		 */
		
		int 월 = (int)(Math.random()*12)+1;
		
		if (월 == 3 || 월 == 4 || 월 == 5) {
			System.out.println(월 + "월은 봄 입니다");
		}
		else if(월 == 6 || 월 == 7 || 월 == 8) {
			System.out.println(월 + "월은 여름 입니다");
		}
		else if(월 == 9 || 월 == 10 || 월 == 11) {
			System.out.println(월 + "월은 가을 입니다");
		}
		else {
			System.out.println(월 + "월은 겨울 입니다");
		}
		
		int mon = (int) (Math.random()*12)+1;
		switch(mon) {
		case 3 : case 4 : case 5 :
			System.out.println(mon + "월의 계절은 봄 입니다");
			break;
		case 6 : case 7 : case 8 :
			System.out.println(mon + "월의 계절은 여름 입니다");
			break;
		case 9 : case 10 : case 11 :
			System.out.println(mon + "월의 계절은 가을 입니다");
			break;
		default : 
			System.out.println(mon + "월의 계절은 겨울 입니다");
		}
		
		
	}

}
