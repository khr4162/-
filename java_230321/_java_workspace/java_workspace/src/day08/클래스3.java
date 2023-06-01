package day08;

public class 클래스3 {

	public static void main(String[] args) {
		/* 
		 * 
		 */
		
		Card ca = new Card();
		ca.print();
		// 카드에 없는 모양, 숫자가 들어오면 무조건 1하트
		ca.setShape('◁');
		ca.setNumber(-3);
		ca.print();
		ca.setShape('♣');
		ca.setNumber(12);
		ca.print();
	}

}
/* Card 클래스 : 포커게임에서 사용하는 카드를 나타내는 클래스
 * 모양 : 하트(♥), 클로버(♣), 스페이드(♠), 다이아(◆)
 * 숫자 : 1 ~ 10, J(11), Q(12), K(13)
 * 
 * 클래스의 구성
 * - 멤버변수 : char shape, int number
 * - 메서드 : print(1♥)
 * - getter/setter
 * - 생성자 : 하트 1(1♥)
 * 
 * 생성자 선언 방법
 * public 클래스명(){ //매개변수는 없을 수도 있음
 * 초기값;
 * }
 */
class Card{
	private char shape; //모양
	private int number; //숫자
	
	//생성자 : 객체의 초기값을 결정
	public Card() {
		shape = '♥';
		number = 1;
	}
	
	//출력 메서드
	public void print() {
		switch(number) {
		case 11 : 
			System.out.print("J");
			break;
		case 12 : 
			System.out.print("Q");
			break;
		case 13 : 
			System.out.print("K");
			break;
		default : 
			System.out.print(number);
		}
		System.out.println(shape);
	}
	
	public char getShape() {
		return shape;
	}
	public void setShape(char shape) {
		switch(shape) {
		case '♥' : case '♣' : case '♠': case '◆' :
			this.shape = shape;
			break;
			default :
				this.shape = '♥';
		}
		}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		if(number>13||number<0) {
		}else {
		this.number = number; }
	}
	
	
}