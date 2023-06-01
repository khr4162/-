package day09;

public class CardPackMain {

	public static void main(String[] args) {
		/* 카드 생성
		 * 
		 */
		Card c = new Card(); // 하트1
		//c.print();
		CardPack cp = new CardPack();
		//cp.pick().print();
//		Card tmp = cp.pick(); //가장 위에 있는 카드 한장을 pick해서 c 객체에 저장
//		tmp = cp.pick();
//		tmp.print();
//		tmp = cp.pick();
//		tmp.print();
		//모양대로 4열 횡대
		//한 모양이 끝나면 줄 바꿈
		
		a: for(int i=1; i<=4; i++) {
			 for(int j=1; j<=13; j++) {
				 Card tmp = cp.pick();
				 if(tmp != null) {
					 tmp.print();					 
				 }else {
					 System.out.println("카드가 없습니다. 초기화 해주세요");
					 break a;
				 }
			 }System.out.println();
		 }
		 System.out.println();
		 
		 cp.init(); // 다시 52개 생성
		 cp.suffle();
		 cp.pick().print();
		 System.out.println();
		 System.out.println();
		 cp.init();
		 for(int i=1; i<=4; i++) {
			 for(int j=1; j<=13; j++) {
				 Card tmp = cp.pick();
				 tmp.print();
			 }System.out.println();
		 }
		
	}

}
