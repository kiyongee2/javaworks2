package array2d;

public class TwoDimention2 {

	public static void main(String[] args) {
		//5행 3열의 2차원 배열
		int[][] household = new int[5][3];
		household[2] = new int[1];   //2번 인덱스는 1차원 배열
		
		System.out.printf("5층 %d세대\n", household[4].length);
		System.out.printf("4층 %d세대\n", household[3].length);
		System.out.printf("3층 %d세대\n", household[2].length);
		System.out.printf("2층 %d세대\n", household[1].length);
		System.out.printf("1층 %d세대\n", household[0].length);
	}
}
