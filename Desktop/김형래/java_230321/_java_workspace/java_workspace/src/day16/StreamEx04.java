package day16;
import java.util.ArrayList;
public class StreamEx04 {
	public static void main(String[] args) {
		/* 여행상품이 있습니다. 
			여행 비용은 15세이상은 100만원, 15세 미만은 50만원
			고객 3명이 패키지 여행을 떠나려고할 때 
			1. 비용계산
			2. 고객 명단 
			
			고객은 class로 생성, ArrayList로 추가
			고객정보
			이름:이순신, 나이:40, 비용:100
			이름:신사임당, 나이:35, 비용:100
			이름:이아들, 나이:10, 비용:50
			총 여행비용 : 250
		 * */
		ArrayList<Customer> list = new ArrayList<>();
		list.add(new Customer("이순신", 40));
		list.add(new Customer("신사임", 35));
		list.add(new Customer("이아들", 10));
		
		System.out.println("--고객명단--");
		//list.stream().forEach(System.out::println);
		list.stream().forEach(n->{
			String name = n.getName();
			int age = n.getAge();
			int price = n.getPrice();
			System.out.println(name+" "+age+"세 비용:"+price);
		});
		System.out.println("-----------------");
		System.out.print("총비용:");
		int sum = list.stream()
				.mapToInt(n-> n.getPrice())
				.sum();
		System.out.println(sum+"만원");
		
		//20세 이상 성인만 이름을 정렬하여 출력
		list.stream()
			.filter(n->n.getAge()>=20)
			.sorted()
			.forEach(n->{
				String name = n.getName();
				int age = n.getAge();
				int price = n.getPrice();
				System.out.println(name+" "+age+"세 비용:"+price);
			});
	}
}
class Customer implements Comparable<Customer>{
	private String name;
	private int age;
	private int price;
	
	public Customer(String name, int age) {
		this.name = name;
		this.age =age;
		this.price = (age>=15)? 100 : 50;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "[name=" + name + ", age=" + age + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
	
	
}
