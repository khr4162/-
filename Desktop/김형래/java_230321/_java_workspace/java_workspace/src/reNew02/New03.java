package reNew02;

public class New03 {

	public static void main(String[] args) {
		// car ��ü ���� �� ���� �ѱ�, ���ǵ� �ø���
		// car ���� ���
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
// car class ����
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
		System.out.println("�õ��� �������ϴ�");
	}
	public void  powerOff() {
		power = false;
		System.out.println("�õ��� �������ϴ�");
	}
	public void speedUp() {
		speed = speed+10;
		System.out.println("���ǵ� ��!");
		System.out.println("���� �ӵ��� : "+speed);
	}
	public void speedDown() {
		speed = speed-10;
		System.out.println("���ǵ� �ٿ�!");
		System.out.println("���� �ӵ��� : "+speed);
	}
	public void doorOpen() {
		door = true;
		System.out.println("���� ���Ƚ��ϴ�");
	}
	public void doorClose() {
		door = false;
		System.out.println("���� �������ϴ�");
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
	
	