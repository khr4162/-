package day14;

import java.util.Calendar;

public class Date01 {

	public static void main(String[] args) {
		/* 날짜시간 클래스 
		 * Calendar 클래스 사용 => 추상 클래스
		 * 직접 객체를 생성할 수 없음
		 * new 연산자를 통해 객체 구현이 안됨
		 * getInstance()를 이용하여 구현한 클래스를 통해 인스턴스를 얻어 옴
		 * 
		 * month : (0월 ~ 11월) +1
		 * week : 1 = 일요일, 2 = 월요일...
		 * am_pm : am=0, pm=1
		 */
//		Date d = new Date();
//		d.getDate(); //depercated : 비권장
		 
		
		//2023-02-17(금)
		//오후 2:42
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1; //0월부터 시작
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK); //일요일부터 시작
		System.out.print(year+"-"+"0"+month+"-"+day);
		
//		String weekString = null;
//		switch(week) {
//		case 1 : weekString = "일"; break;
//		case 2 : weekString = "월"; break;
//		case 3 : weekString = "화"; break;
//		case 4 : weekString = "수"; break;
//		case 5 : weekString = "목"; break;
//		case 6 : weekString = "금"; break;
//		case 7 : weekString = "토"; break;
//		}
		
		switch(week) {
		case 1 : System.out.println("(일)"); break;
		case 2 : System.out.println("(월)"); break;
		case 3 : System.out.println("(화)"); break;
		case 4 : System.out.println("(수)"); break;
		case 5 : System.out.println("(목)"); break;
		case 6 : System.out.println("(금)"); break;
		default : System.out.println("(토)"); break;
		}
		
		//hour, minute, second
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		int ampm = now.get(Calendar.AM_PM);
//		if(ampm==0) {
//			System.out.print("오전 ");
//		}else {
//			System.out.print("오후 ");
//		}
		System.out.println(ampm==0?"오전":"오후"+" "+hour+":"+minute+":"+second);
		System.out.println(hour+":"+minute);
		
		
	}

}
