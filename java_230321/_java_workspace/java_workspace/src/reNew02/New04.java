package reNew02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		/* �÷��� �����ӿ�ũ
		 * - List : ��������, �ߺ�����
		 * - Set : ��������X, �ߺ� �Ұ���
		 * - Map : 2���� �����͸� ������ ����, �������� X
		 * 	- key(�ߺ��Ұ���) : value(�ߺ�����)
		 */
		//����Ʈ�� �����ϰ�, 1~10���� ������ �� ���
		
		List<Integer> list1 = new ArrayList<>();
		List list = new ArrayList();
		for(int i=1; i<=10; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		for(Integer tmp : list1) {
			System.out.println(tmp);
		}
//		 ������ �Է¹޾� 1���� �������� ����Ʈ�� �߰��ϰ�
//		 ���� ���
		list.clear();
		Scanner scan = new Scanner(System.in);
//		int sum=0;
//		int sc = scan.nextInt();
//		for(int i=1; i<=sc; i++) {
//			list.add(i);
//			sum = sum+i;
//		}
//		
//		System.out.println(list);
//		System.out.println(sum);
		
		//map�� �̿��Ͽ� �̸�:���� ���·� 3���� �̸��� ������ �Է�
		//map ����ϰ� �հ�, ��� ���
		
//		HashMap<String, Integer> map = new HashMap<String, Integer>();
//		map.put("��ö��", 50);
//		map.put("�迵��", 75);
//		map.put("�迵��", 100);
//		System.out.println(map);
//		for(String tmp : map.keySet()) {
//			System.out.println(tmp+":"+map.get(tmp));
//		}
//		int sum = map.get("��ö��")+map.get("�迵��")+map.get("�迵��");
//		double avg = (double)sum/map.size();
//		System.out.println(sum);
//		System.out.println(avg);
		
		// ��ĳ�ʷ� �̸��� ������ �Է¹޾� 5�� map, �հ�, ��� ���
		HashMap<String, Integer> map1 = new HashMap<String, Integer>();
		int sum = 0;
		double avg = 0;
		for(int i = 1; i<=5; i++) {
			String sc = scan.next();
			int sc1 = scan.nextInt();
			map1.put(sc, sc1);
			sum = sum+sc1;
		}
		for(String tmp : map1.keySet()) {
			System.out.println(tmp+":"+map1.get(tmp));
	}
		avg = sum/map1.size();
		System.out.println(sum);
		System.out.println(avg);

}
}
