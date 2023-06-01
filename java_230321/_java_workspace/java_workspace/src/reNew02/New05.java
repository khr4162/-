package reNew02;

import java.util.HashMap;
import java.util.Scanner;

public class New05 {

	public static void main(String[] args) {
		// �ܾ��� Map �ܾ� : �ǹ�
		// hello : �ȳ�
		// �Է¹��� �ܾ��� ������ �Է¹޾Ƽ� �� ��ŭ map�� �ܾ�� �ǹ̸� �߰�
		// �ֿܼ� ���
		HashMap <String, String> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int num = scan.nextInt();
		for(int i=1; i<=num; i++) {
			System.out.println("단어를 입력하세요");
			String text = scan.next();
			System.out.println("의미를 입력하세요");
			String mean = scan.next();
			map.put(text, mean);
		}
		for(String tmp : map.keySet()) {
			System.out.println("단어 : "+tmp);
			System.out.println("의미 : "+map.get(tmp));
			System.out.println("-------------");
		}

	}

}
