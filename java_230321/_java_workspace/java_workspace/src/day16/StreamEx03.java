package day16;
import java.util.ArrayList;
import java.util.List;

import studentmanager.Student;
public class StreamEx03 {
	public static void main(String[] args) {
		List<Student> std = new ArrayList<>();
		std.add(new Student("홍길동",90));
		std.add(new Student("홍길순",80));
		std.add(new Student("강길동",60));
		std.add(new Student("강길순",50));
		std.add(new Student("이길동",70));
		
		//class에 toString 존재하면...
		//std.stream().forEach(System.out::println);
		//{} : 처리구문이 많은경우
		std.stream().forEach(s->{ //s => new Student("홍길동",90)
			String name = s.getName(); //홍길동
			int score = s.getScore(); //90
			System.out.println(name+":"+score);
		});
		
		//합계 => intStream 
		//getScore() => Integer => int변환
		// 추출 => map,  추출 후 int변환 => mapToInt
		int sum = std.stream()
				.mapToInt(n->n.getScore())
				.sum();
		
		//개수
		long count = std.stream().count();
		
		System.out.println("합계:"+sum+", 총인원:"+count);
		
		//점수가 70점이상인 친구들의 합계
		int upSum = std.stream()
				.mapToInt(n->n.getScore())
				.filter(f->f>=70)
				.sum();
		System.out.println(upSum);
	}
}
