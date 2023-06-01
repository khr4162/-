package day01;

public class IF문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 국어, 영어, 수학 점수의 합계와 평균을 출력
		 * 평균이 80점 이상이면 합격, 미만이면 불합격
		 * 출력 : 합계, 평균, 평가
		 * 국어 80점, 영어 75점, 수학 100점
		 * */
		
		int 국어 = 80;
		int 영어 = 75;
		int 수학 = 100;
		int 합계 = 국어 + 영어 + 수학;
		double 평균 = 합계 / 3.0;
		
		System.out.println("합계 : " + 합계 + ", " + "평균 : " + 평균);
		
		if(평균 >= 80) {
			System.out.println("결과 : 합격");
		} else {
				System.out.println("결과 : 불합격");
		}
		
		// 평가를 A(90), B(80), C(70), D(60), F(50)로 나타내고자 함
        
		if(평균 >= 90) {
			System.out.println("A");
		}else if(평균 >= 80){
			System.out.println("B");
		}else if(평균 >= 70){
			System.out.println("C");
		}else if(평균 >= 60){
			System.out.println("D");
		}else {
			System.out.println("F");}
		
		
			

		
		}

	}
