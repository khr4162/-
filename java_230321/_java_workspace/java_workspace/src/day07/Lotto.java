package day07;

public class Lotto {

	public static void main(String[] args) {
		/* 로또번호를 생성하는 메서드(1 ~ 45까지 랜덤으로 번호를 생성)
		 * 로또번호 = 사용자번호 6자리 (1 ~ 45) : 자동번호
		 * 당첨번호 = 당첨번호 6자리 + 1자리(1 ~ 45) 
		 * 사용자번호, 당첨번호를 랜덤으로 발생시켜
		 * 로또의 등수를 확인
		 */
		
		//배열은 main에서 생성
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6]; //사용자번호
		
		randomArray(lotto);
		randomArray(user);
		System.out.println("당첨번호 (7자리)");
		print(lotto);
		System.out.println();
		System.out.println("사용자 번호 (6자리)");
		print(user);
		
		int rank = rank(lotto, user);
		if(rank==-1) {
			System.out.println("꽝");
		}else {
			System.out.println(rank+"등 당첨");
		}
		
		
	}
	/* 1. 번호 랜덤으로 생성 기능(1 ~ 45) 번호만 리턴(랜덤번호 1개만 생성 후 리턴)
	 * 리턴타입 : int(랜덤번호)
	 * 매개변수 : x
	 * 메서드명 : random
	 */
	
	public static int random() {
		int n = (int)(Math.random()*9)+1;
		return n;
	}
	
	
	/* 2. 랜덤 번호를 배열에 저장하는 기능 (배열을 랜덤번호로 완성하시오)
	 * 리턴타입 : void
	 * 매개변수 : int arr[] (로또 혹은 user)
	 * 메서드명 : save
	 */
	
	public static void randomArray(int arr[]) {
		//중복 상관없이 배열 채우기
//		for(int i=0; i<arr.length; i++) {
//			//중복체크를 해서 이전에 담은 랜덤값이 중복되지 않았다면 채우기
//			arr[i]=random();
//		}
//	}	
		for(int i=0; i<arr.length; i++) {
		int r = random();
		if(!check(arr, r)) {
			arr[i]=r;
		}else {
			i--;
		}
		}
		
/*		int i=0;
		while(i<arr.length) {
			int r=random();
			if(!check(arr, r)) {
				arr[i]=r;
				i++;
			}
		}*/
	}
//	public static int [] save(int lotto[]) {
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i]=random();}
//		return lotto;
//	}
	
	
	
	/* 3. 정수 배열을 출력하는 메서드
	 * 리턴타입 : void
	 * 매개변수 : int lotto[]
	 * 메서드명 : print
	 */
	
	public static void print(int arr[]) {
		for(int i=0; i<arr.length; i++)
		System.out.print(arr[i]+" ");
		System.out.println();
	}
	
	/* 4. 같은 값이 들어가지않게 체크
	 * 배열에 생성한 랜덤 값이 있는지 체크(있으면 true / 없으면 false)
	 * 리턴타입 : boolean
	 * 매개변수 : int arr[], random
	 * 메서드명 : check
	 */
	public static boolean check(int arr[], int random) {
//		for(int tmp : arr) {
//			if(tmp == random) {
//				return true;
//			}
//	}return false;
//	}
	
	for(int i=0; i<arr.length; i++) {
			if(arr[i]==random) {
				return true;
			}
		}return false;
	}
	
	/* 5. 등수 체크하는 기능
	 * 리턴타입 : int 등수 리턴
	 * 매개변수 : 로또번호, 사용자번호 => int lotto[], int user[]
	 * 메서드명 : rank
	 * 
	 * --당첨기준
	 * 6개 일치 : 1등
	 * 5개 일치 + 보너스 일치 : 2등
	 * 5개 일치 : 3등
	 * 4개 일치 : 4등
	 * 3개 일치 : 5등
	 * 꽝 : (-1 리턴)
	 */
	public static int rank(int lotto[], int user[]) {
		// lotto배열과 user배열은 갯수가 다름
		// 배열의 순서가 바뀌거나, 같은 배열을 넣었을 경우 에러

		
		int cnt = 0; //당첨번호 갯수 카운트
		for(int i=0; i<user.length; i++) {
			//user : 1 2 3 4 5 6
			//lotto : 1 2 3 8 5 4 9
		if(check(user, lotto[i])) {
			cnt++; //보너스번호 제외
		}
		}//switch문을 이용하여 랭크 결정
		switch(cnt) {
		case 6: return 1;
		case 5: 
			if(check(user, lotto[lotto.length-1])) {
				return 2;
			}else {
					return 3;
				}
			//return check(user, lotto[lotto.length-1])? 2: 3
		case 4: return 4;
		case 3: return 5;
			default : return -1;
		}
	}
	
	
	
	

}