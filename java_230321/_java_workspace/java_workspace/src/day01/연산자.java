package day01;

public class 연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 대입연산자 : = 을 기준으로 오른쪽에 있는 값을 왼쪽에 저장
		 * a = b
		 * b의 값을 a에 저장하라
		 * a는 반드시 변수여야 함
		 */ 
		int a = 10;
		int b = 20;
		a = 30; //기존 a의 값은 사라짐
		b = b + 10; //연산 후 결과를 대입(누적)
		System.out.println("a : "+a+", b : "+b);
		// b + 30 = a; -> 에러 발생. a를 담을 곳이 없기 때문
		
		//산술 연산자 : + - * / %(나머지 연산자)
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		
		System.out.println(1.2+3.4);
		System.out.println(1.2-3.4);
		System.out.println(1.2*3.4);
		
		/* 나누기 /
		 * 정수 / 정수 = (소수점을 버림)
		 * 정수 / 실수 = 실수
		 * 실수 / 실수 = 실수
		 * 실수 / 정수 = 실수(하나라도 실수가 들어가면 실수 처리됨)
		 */
		System.out.println(3 / 2);
		System.out.println(3 / 2.0);
		System.out.println(3.0 / 2.0);
		
		// 자료형 : 정수 -> 실수로 변환 (형변환)
		// 해당 변수 앞에 (double)을 붙이면 형변환이 됨
		
		int num1 = 3;
		int num2 = 2;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / (double)num2);
		
		// 나머지 연산자 % (나눗셈의 나머지를 산출하는 연산)
		System.out.println(4 % 2);
		System.out.println(44 % 7);
		
		/* 문제. 국어 70점, 영어 35점, 수학 97점일때
		 * 국어, 영어, 수학 세 과목의 합과 평균을 구하여 콘솔에 표시
		 */
		int 국어 = 70;
		int 영어 = 35;
		int 수학 = 97;
		int 합 = 국어 + 영어 + 수학;
		double 평균 = 합 / 3.0;
		System.out.println("합 : " + 합 + ", " + "평균 : " + 합 / (double)3);
		
		// 비교 연산자(결과가 true / false로 출력)
		// 논리 연산자 if문에서 체크
		
		System.out.println(4 > 5);
		
		//삼항연산자 (조건식) ? A : B(맞으면 A, 아니면 B)
		//평균이 80 이상이면 합격, 미만은 탈락으로 표시
		System.out.println((평균 >= 80) ? "합격" : "탈락");
		
	}

}
