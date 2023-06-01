package day09;

public class CardPack {
	/* CardPack클래스
	 * - 카드팩 : 52장의 카드들
	 * 
	 * - 카드를 섞는 기능
	 * - 1장을 선택하는 기능
	 * - 카드 초기화 기능
	 * - 출력 기능 - card클래스에서 가져오기
	 * - 생성자 - 52장의 카드를 모두 생성
	 */
	
	//생성자 => 52장의 카드를 생성
	public CardPack() {
		//'♥' '♠' '◆' '♣'
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1 : shape = '♥'; break;
			case 2 : shape = '♠'; break;
			case 3 : shape = '◆'; break;
			case 4 : shape = '♣'; break;
			}
			for(int j=1; j<=13; j++) {
				Card c = new Card(); //카드 한장 생성
				c.setShape(shape);
				c.setNumber(j);
				pack[cnt] = c; //shape = 하트, 1
				cnt++;
			}
		}
	}
	
	//멤버변수
	//카드를 담을 수 있는 배열 52장
	private Card[] pack = new Card[52]; //카드 팩 배열
	private int cnt = 0; //카드의 남은 갯수
	
	//카드 섞기 기능
	//메서드명 : shuffle
	public void suffle() {
		for(int i=0; i<pack.length; i++) {
			int j=(int)(Math.random()*pack.length);
			Card tmp = pack[i];
			pack[i] = pack[j];
			pack[j] = tmp;
			}
	}
	//카드 선택
	//메서드명 : pick
	//리턴타입 : 카드 1장
	//cnt = 52 (가정)
	public Card pick() {
		if(cnt==0) {
			return null;
		}	cnt--; 
			return pack[cnt];
		}
	
	//카드 초기화
	//메서드명 : init
	public void init() {
//		cnt = 52; //카드 리필
		
		cnt = 0; //카드 완전 초기화
		char shape = '♥';
		for(int i=1; i<=4; i++) {
			switch(i) {
			case 1 : shape = '♥'; break;
			case 2 : shape = '♠'; break;
			case 3 : shape = '◆'; break;
			case 4 : shape = '♣'; break;
			}
			for(int j=1; j<=13; j++) {
				Card c = new Card(); //카드 한장 생성
				c.setShape(shape);
				c.setNumber(j);
				pack[cnt] = c; //shape = 하트, 1
				cnt++;
			}
		}
	
	
	
	}
	
	//카드 출력
	
	
	
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
}
