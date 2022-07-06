package system;

public class SystemTime {

	public static void main(String[] args) {
		//수행 시간 측정
		long start = System.nanoTime();  //시작 시간 - 나노초
		//long start = System.currentTimeMillis(); //밀리초
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();  //종료 시간
		
		System.out.println("1~1000000 까지의 합:" + sum);
		System.out.println("계산에 " + (end-start) + " 나노초가 소요되었습니다.");
	}
}
