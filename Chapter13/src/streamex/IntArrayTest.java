package streamex;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		//���� �迭���� ��Ʈ�� Ȱ���ϱ�
		int arr[] = {1, 2, 3, 4, 5};
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		Arrays.stream(arr).forEach(n -> System.out.print(n + " "));
		
		System.out.println();
		int sum = Arrays.stream(arr).sum();
		int count = (int)Arrays.stream(arr).count();
		System.out.println("�迭�� �� : " + sum);
		System.out.println("�迭 �ڷ��� �� : " + count);
	}
}
