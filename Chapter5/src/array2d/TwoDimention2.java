package array2d;

public class TwoDimention2 {

	public static void main(String[] args) {
		//5�� 3���� 2���� �迭
		int[][] household = new int[5][3];
		household[2] = new int[1];   //2�� �ε����� 1���� �迭
		
		System.out.printf("5�� %d����\n", household[4].length);
		System.out.printf("4�� %d����\n", household[3].length);
		System.out.printf("3�� %d����\n", household[2].length);
		System.out.printf("2�� %d����\n", household[1].length);
		System.out.printf("1�� %d����\n", household[0].length);
	}
}
