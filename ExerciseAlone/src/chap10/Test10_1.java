package chap10;

public class Test10_1 {

	public static void main(String[] args) {
		// 1. 4
		
		//10-2
		//1. 3
		//2. 4
		//3. 3
		//4.
		
		String[] strArray = {"10", "2a"};
		int value = 0;
		for(int i=0; i<=2; i++) {
			try {
				value = Integer.parseInt(strArray[i]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("인덱스 초과");
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환할 수 없음");
			}finally {
				System.out.println(value);
			}
		}
	}

}
