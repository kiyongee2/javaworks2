package array2d;

public class TwoDimension3 {

	public static void main(String[] args) {
		//������ 2���� �迭
		char[][] alphabets = new char[13][2];
		char ch = 'A';
		//���ĺ� ����
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				alphabets[i][j] = ch;
				ch++;
			}
		}
		//���ĺ� ���
		for(int i=0; i<alphabets.length; i++) {
			for(int j=0; j<alphabets[i].length; j++) {
				System.out.print(alphabets[i][j] + " ");
				//System.out.println(alphabets[i][j]+", "+(int)alphabets[i][j]);
			}
			System.out.println();
		}
	}
}
