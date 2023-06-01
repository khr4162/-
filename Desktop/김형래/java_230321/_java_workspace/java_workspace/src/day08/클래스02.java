package day08;

public class 클래스02 {

	public static void main(String[] args) {
		/* 자동차 클래스 생성
		 * 멤버변수 : color, power, speed
		 * 메서드 : powerOn, powerOff, speedUp(+10), speedDown(-10)
		 * 멤버변수 : private
		 * 멤버변수를 확인/수정 => getter/setter 필요
		 */
		
		Car c = new Car("빨강", 2);
		c.powerOff();
		c.powerOn();
		c.speedDown();
		c.speedDown();
		c.speedUp();
		c.speedDown();
		c.speedDown();
		System.out.println(c.getDoor());
		
		Car c2 = new Car("노랑");
		System.out.println("-----새 자동차 출고-----");
		System.out.println(c2.getSpeed());
		System.out.println(c2.isPower());
		c2.setColor("red");
		System.out.println(c2.getColor());
		c2.powerOn();
		System.out.println(c2.isPower());
		c2.speedUp();
		c2.powerOff();
		System.out.println(c2.isPower());
		c2.speedUp();
		c2.speedDown();
		c2.speedDown();
	}
	
}

class Car{
	
	private String color; //null
	private int door;
	private boolean power; //false
	private int speed = 0; //0
	
	//생성자 : 없으면 기본생성자가 자동 추가됨
	//생성자 위치
	public Car(String color, int door){
		//this(color); //생성자 호출 (호출하는 생성자는 무조건 맨 앞에)
		this.color = color;
		this.door = door;
	}
	public Car(String color) {
		this.color = color;
	}
	public Car() {	} //기본생성자
	
	
	
	//멤버메서드
//	public void powerOn() {
//		if(power=false) {
//		power = true;
//		System.out.println("전원 on");
//		}else {
//			System.out.println("이미 켜졌습니다");
//		}
//	}
//	
//	public void powerOff() {
//		if(power=true) {
//		power = false;
//		System.out.println("전원 OFF");
//		}else {
//			System.out.println("이미 종료되었습니다");
//		}
//	}
	public boolean isPower() {
		return power;
	}
	
	public void powerOn() {
		System.out.println("전원이 켜졌습니다");
		power = true;
	}
	public void powerOff() {
		System.out.println("전원이 꺼졌습니다");
		power = false;
	}
	
	public void speedUp() {
		if(power==false) {
			System.out.println("전원을 켜주세요");
		}else {
		speed = speed + 10;
		System.out.println("speed Up!!");
		System.out.println(color+"의 "+"현재 속도 :"+speed);
		}
	}
	
	public void speedDown() {
		if(speed!=0) {
			speed = speed - 10;
			System.out.println("speed Down...");
			System.out.println(color+"의 "+"현재 속도 :"+speed);
		}else {
			System.out.println("전원을 켜주세요");
		}
	}

	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean getPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
}