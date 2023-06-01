package day02;

public class For문2 {

	public static void main(String[] args) {
		/* 2단 출력
		 * 2*1=2, 2*2=4 ... 2*9=18
		 */
		System.out.println();
		for(int i=2; i<=18; i+=2) {
			System.out.println("2x"+i/2+"="+i);
		}
		
		for(int i=1; i<=9; i++) {
			System.out.println("2*"+i +"="+(2*i));
		}
		
		/* 1 ~ 10까지의 홀수의 합, 짝수의 합을 출력
		 * 
		 */
		int sum = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2==0) {
				sum=sum + i;
			}
		
		}
		int sum1 = 0;
		for(int i=1; i<=10; i++) {
			if(i % 2 !=0) {
				sum=sum + i;
			}
		}
		System.out.println("짝수 : "+sum+", "+"홀수 : "+sum1);
		
		int esum=0, osum=0;
		for(int i=1; i<=10; i++) {
			if(1%2 ==0)
		{esum = esum + i;}
			else{
				osum = osum + i;}
			System.out.println("짝수 : "+esum+", "+"홀수 : "+osum); }
	
	
	
	
		// 2중 for문
		// 2단, 3단, 4단 ... 9단
		// 해당 단의 *9까지
		
		for(int i1 = 2; i1<=9; i1++) {
		for(int i = 1; i<=9; i++) {
		System.out.println(i1+"x"+i+"="+(i1*i));
		}
	 }
		
			for(int i = 1; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.print(j+"x"+i+"="+(i*j)+" ");
			}
			System.out.println();
		}
		
			
		
	}
}	
	
	
	