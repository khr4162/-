package reNew02;

public class New03 {

	public static void main(String[] args) {
		// car 객체 생성 후 전원 켜기, 스피드 올리기
		// car 정보 출력
		car c = new car();
		c.powerOn();
		c.doorOpen();
		c.doorClose();
		c.setColor("red");
		c.speedUp();
		
		car c2 = new car("yellow");
		System.out.println(c2);
		c.powerOn();
		c.doorOpen();
		
	}

}
// car class 생성
// power, speed, door, color
class car{
	private boolean power;
	private int speed = 0;
	private boolean door;
	private String color;
	
	public car(String color) {
		this.color = color;
	}
	public car() {}
	public void powerOn(){
		power = true;
		System.out.println("시동이 켜졌습니다");
	}
	public void  powerOff() {
		power = false;
		System.out.println("시동이 꺼졌습니다");
	}
	public void speedUp() {
		speed = speed+10;
		System.out.println("스피드 업!");
		System.out.println("현재 속도는 : "+speed);
	}
	public void speedDown() {
		speed = speed-10;
		System.out.println("스피드 다운!");
		System.out.println("현재 속도는 : "+speed);
	}
	public void doorOpen() {
		door = true;
		System.out.println("문이 열렸습니다");
	}
	public void doorClose() {
		door = false;
		System.out.println("문이 닫혔습니다");
	}
	public boolean isPower() {
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
	public boolean isDoor() {
		return door;
	}
	public void setDoor(boolean door) {
		this.door = door;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
	
	