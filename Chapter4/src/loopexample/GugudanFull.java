package loopexample;

public class GugudanFull {

	public static void main(String[] args) {
		//������ ��ü
		int i, j;
		/*for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}*/
		
		//�ܺ��� ���ϴ� ���� �۰ų� ���� �������� ���
		for(i = 2; i <= 9; i++) {
			for(j = 1; j <= 9; j++) {
				if(i < j)
					break;
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}

}
