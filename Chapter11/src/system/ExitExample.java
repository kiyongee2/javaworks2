package system;

public class ExitExample {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			if(i == 5) {
				System.exit(0);  //���μ��� ����
				//break;
			}
		}
		System.out.println("�ݺ� ����");
	}
}
