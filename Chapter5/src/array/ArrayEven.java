package array;

public class ArrayEven {

	public static void main(String[] args) {
		// 1���� 10������ �ڿ��� �� ¦�� ����
		int[] arr = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 2;
		}
		
		/*for(int i = 1; i <= 10; i++) { //2 4 6 8 10
			if(i % 2 != 0)
				continue;
			arr[(i/2)-1] = i;
		}*/
		
		for(int i : arr)
			System.out.print(i + " ");
		
	}
}
