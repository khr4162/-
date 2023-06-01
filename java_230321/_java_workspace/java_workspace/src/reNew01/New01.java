package reNew01;

public class New01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 홍길동의 주민등록번호 : 881002-1234567
		 * 출력형태 : 생년월일 : 881002
		 * 성별 : 남
		 * */ 
		 String pin = "881002-1234567";
		 System.out.println("생년월일 : "+ pin.substring(0, pin.indexOf('-')));
		 if(pin.charAt(7) == '1' || pin.charAt(7) == '3') {
			 System.out.println("성별 : 남자");
		 }
		 else {
			 System.out.println("성별 : 여자");
		 }
		
	}

}
