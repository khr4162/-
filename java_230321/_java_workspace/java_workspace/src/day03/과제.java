package day03;

public class 과제 {

	public static void main(String[] args) {

		/* char : 유니코드표에 따라 글자의 코드별로 글자를 표시
		 * 
		 * 
		 */
		
		/* a
		 * ab
		 * abc
		 * abcd
		 * abcde
		 * abcde...z
		 * 
		 */
		
		for(char ch='a'; ch<='z'; ch++) {
			for(char ch1='a'; ch1<=ch; ch1++) {
				System.out.print(ch1+" ");
			}System.out.println();
		}
		
		
		
		
	}

}
