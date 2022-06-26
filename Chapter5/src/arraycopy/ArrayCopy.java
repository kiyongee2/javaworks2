package arraycopy;

public class ArrayCopy {

	public static void main(String[] args) {
		char[] arr1 = {'N', 'E', 'T'};
		char[] arr2 = new char[3];
		
		//배열 복사(저장)
		for(int i = 0; i < arr1.length; i++) {
			arr2[i] = arr1[i];
		}
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		
		System.out.println();
		
		//역순 복사
		char[] arr3 = new char[3];
		for(int i = 0; i < arr1.length; i++) {
			arr3[2-i] = arr1[i];
		}
		
		for(int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
	}
}
