package method;

public class ReturnMethod {
	
	//�� ���� ���ϴ� �ż��� ����
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	//���ڸ� ��ȯ�ϴ� �޼���
	public static String message() {
		return "�ȳ��ϼ���~";
	}
	
	public static void main(String[] args) {
		//static ��� - new ��ü�� �������� �ʾƵ� ���� �� �� ����
		//��, Ŭ������ �ݵ�� ������ �ʴ��� ���� ����.
		
		int sum = add(10, 11);  //add() �޼��� ȣ��
		System.out.println("�� ���� �� : " + sum);
		
		String msg = message();
		System.out.println(msg);
	}
}
