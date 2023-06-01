package day14;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx01 {

	public static void main(String[] args) {
		/* 
		 * 
		 */
		//2023-02-17 T15:30:36.020259200
		//날짜만 분리시켜 추출하여 찍기
		//substring(str) : 문자열 추출
		//indexOf(str) : 문자의 위치를 찾아주는 기능, 없으면 -1을 반환
		
		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);
		String curr = today.toString();
		System.out.println(curr.substring(0,curr.indexOf("T")));
		System.out.println(curr.substring(curr.indexOf("T")+1,curr.indexOf(".")));
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd hh:mm:ss");
		System.out.println(dtf.format(today));

		LocalDateTime sDate = LocalDateTime.of(1997, 10, 12, 2, 30);
		System.out.println(sDate.format(dtf));
	}

}
