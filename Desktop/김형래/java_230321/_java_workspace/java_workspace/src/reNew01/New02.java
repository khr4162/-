package reNew01;

public class New02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for臾몄쓣 �씠�슜�븯�뿬 1遺��꽣 10源뚯� 異쒕젰
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i = 0; i<=10; i++) {
			int num = i;
			System.out.print(num+", ");
			sum2 = sum2+num;
			if(num%2==1) {
				sum = sum+num;
			}
			if(num%2==0) {
				sum1 = sum1+num;
			}
		}
		System.out.println();
		System.out.println("총 합계: "+sum2);
		System.out.println("홀수 합: "+sum);
		System.out.println("짝수 합 : "+sum1);
	}

}
