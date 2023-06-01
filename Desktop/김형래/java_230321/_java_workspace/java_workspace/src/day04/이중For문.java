package day04;

public class 이중For문 {

	public static void main(String[] args) {
		/* 이중For문을 이용해 작성, 출력
		 * 1 2 3
		 * 4 5 6
		 * 7 8 9
		 */
		//for + if
		for(int i=1; i<=9; i++) {
				if(i%3==1) {
					System.out.println();
				}System.out.print(i +" ");
			}System.out.println();
			
			System.out.println();
		
		//이중for
			//cnt++ " 표현하고 증가, ++cnt : 증가하고 표현
			//들어가는 순서에 따라 값이 다름(sysout)
		int cnt=1;
		for(int I=1; I<=3; I++) {
			for(int J=1; J<=3; J++){
				System.out.print((cnt++)+" ");
				
				
			}System.out.println();
		}
		
		
		
		
		
		
	}

}
