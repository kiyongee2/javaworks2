package exception.handling;

public class exceptionhandling1 {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			
			num[0] = 1;
			num[1] = 2;
			num[2] = 3;   //���� �߻�
			
			System.out.println("1, 2, 3 ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ������ ������ϴ�.");
		}
		System.out.println("Done");
	 }
}