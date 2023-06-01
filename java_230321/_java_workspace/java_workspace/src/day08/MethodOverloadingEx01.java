package day08;

public class MethodOverloadingEx01 {

	public static void main(String[] args) {
		/* calc(1,2,"+")
		 * calc(1,"+",2)
		 * calc("+",1,2)
		 * 메서드 오버로딩을 이용하여 두 정수와 연산자를 입력받아 연산자의 위치에 상관없이
		 * 연산의 결과가 출력되는 calc 메서드를 완성
		 * 잘못된 연산자가 들어오면 잘못된 연산자입니다.
		 */
		calc('+', 5, 3);
		calc(3, '-', 1);
		calc(8, 3, '*');
		
	}
	public static void calc(int num1, int num2, char a) {
		switch(a) {
		case '+' : System.out.println(num1+num2);
			break;
			
		case '-' : System.out.println(num1-num2);
			break;
			
		case '*' : System.out.println(num1*num2);
			break;
			
		case '/' : System.out.println(num1/num2);
			break;
			
		case '%' : System.out.println(num1%num2);
			break;
			
		default : 
			System.out.println("연산자가 잘못되었습니다");
		}
		}
	
	public static void calc(int num1, char a, int num2) {
		switch(a) {
		case '+' : System.out.println(num1+num2);
			break;
			
		case '-' : System.out.println(num1-num2);
			break;
			
		case '*' : System.out.println(num1*num2);
			break;
			
		case '/' : System.out.println(num1/num2);
			break;
			
		case '%' : System.out.println(num1%num2);
			break;
			
		default : 
			System.out.println("연산자가 잘못되었습니다");
		}
		}
	
	public static void calc(char a, int num1, int num2) {
		switch(a) {
		case '+' : System.out.println(num1+num2);
			break;
			
		case '-' : System.out.println(num1-num2);
			break;
			
		case '*' : System.out.println(num1*num2);
			break;
			
		case '/' : System.out.println(num1/num2);
			break;
			
		case '%' : System.out.println(num1%num2);
			break;
			
		default : 
			System.out.println("연산자가 잘못되었습니다");
		}
		}
	
}
	
		

