package day17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

public class BufferedReaderEx03 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* out.txt파일을 읽어들여 map에 저장 후 합계 출력
		 * 이름 : 점수
		 * 총 합계 , 총 인원 출력
		 * 
		 * map.put(name, score)
		 * 입력받은 값은 전부 String  계산을 위해서는 int 자료형으로 변환이 필요
		 * Integer.parseInt(문자값);
		 */
		
		int sum = 0;
		int cnt = 0;
		HashMap<String, Integer> map = new HashMap<>();
		BufferedReader br = null;
		br = new BufferedReader(new FileReader("out.txt"));
	
		while(true) {
			String line = br.readLine(); //홍길동 97
			if(line == null) { //마지막 라인일경우 null이 입력되면 반복문을 빠져나감
				break;
			}
			else {
				cnt++;
			}
			//홍길동 79 substring(start index=포함, end index=미 포함)
			//String name = line.substring(0, line.indexOf("");
			
			//end index를 적지 않으면 끝까지
			//int score = Integer.parseInt(line.subString(line.indexOf("")+1));
			map.put(line.substring(0, line.lastIndexOf(' ')), Integer.parseInt(line.substring(line.lastIndexOf(' ')+1)));
		}
		
		//Iterator
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String name = it.next();
			int score = map.get(name); //name에 대한 value 값 (name 짝꿍)
			sum = sum+score;
			System.out.println("이름 : "+name+", 점수 : "+score);
		}
		System.out.println("총 합계 : "+sum+"점, 총 인원 : "+cnt+"명");
		
		System.out.println("-----------------------------------------------");
		
		//향상된 for문
		for(String n : map.keySet()) {
			System.out.println(n+" : "+map.get(n));
			sum += map.get(n);
		}
		System.out.println("총 합계 : "+sum+", 총 인원 수 : "+map.size());
		
		
		br.close();
		
	}

}
