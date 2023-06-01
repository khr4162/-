package day01;

public class 변수 {

	public static void main(String[] args) {
		// 변수 명, 클래스 명 한글 사용 가능
		System.out.println("method 내부");
		
		//변수 : 리터럴값을 담는 메모리 공간
		//주석 - 한줄주석 : 코드에 영향을 미치지 않는 구문, 설명을 위해 사용
		/* 여러줄
		 * 주석입니다. */
		//변수 선언 방법
		//변수타입 변수명;
		
		int num, num2, num3, num4; //선언만 (같은 자료형일 경우 여러 변수를 동시에 선언 가능)
		num = 123; //값 지정
		
		int num1 = 123; //변수 선언 후 값 지정
		byte num5;
		char ch1;
		float fl1;
		double dou;
		boolean boo1;
		//노란 밑줄 : 경고, 한번도 사용되지 않은 경우.
		//빨간 밑줄 : error
		
		int appleCount; //변수명은 의미 있게 지정
		int applecount; //대소문자 구분함. 다른 변수
		
		//int num; //중복선언 불가능
		System.out.println("num1의 값 : "+num1);
		// 문자랑 변수 더할때 +를 추가해야함!!
		// a라는 int 변수를 선언 후 값을 지정하고, a 변수의 값을 출력하시오
		int a;
		// 내 핸드폰 중간 번호
		a = 3239;
		System.out.println("a 변수의 값 : " + a);
		
		//num1과 a변수의 값을 하나의 구문으로 출력
		System.out.println("num1 : "+ num1+", "+ "a : "+ a);
		
		//문자(char), 여러 문자(Str)
		char ch = '김'; // "" 문자열(한 글자 이상), ''(한 글자의 문자)
		//역슬레시하고 /'표시
		System.out.println("ch : "+ch);
		
		//일반적인 class는 객체를 만들어서 객체로 사용. String은 워낙 자주 사용하다보니, 자료형처럼 사용이 가능
		String str= "김형래"; //문자열
		System.out.println("str : "+str);
		
		int b = 10; //10진수의 수 10을 저장
		int c = 010; //8진수의 수 10을 저장(앞에 숫자 0) 0~7까지만 사용 8=10
		int d = 0x10; //16진수의 수 10을 저장(앞에 0x) 0~ABCDEF 16=10
		//int 범위를 넘어서면 error
		
		//long형은 접미사 L을 필수로 써야 함. 대소문자 구분 없음.
		long e = 1234567891012L;
		System.out.println("long : "+e);
		
		//기본 실수형은 double로 인식
		//float형의 실수값은 접미사 F를 반드시 써야 함. 대소문자 구분 없음.
		float f = 1.234f;
		System.out.println("float : "+f);
		
		boo1 = true;
		boolean bool2 = false;
		
		int kor = 100;
		int kor1 = kor;
		
		// = : 대입 - 오른쪽 값(값을 가지고 있는, 변수)을 왼쪽(반드시 변수)에 담아라
		
		int g = 10, h = 20, y = 50;
		int k, z = 10;
		
		
	}
	
}
