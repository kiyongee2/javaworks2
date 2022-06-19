package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	
	private InClass inClass;   //���� Ŭ���� �ڷ��� ���� 
	
	public OutClass() {
		inClass = new InClass();
	}
	
	//�ν��Ͻ� ���� Ŭ����
	class InClass{  
		int inNum = 100;
		void inTest() {
			System.out.println(num + "(�ܺ� Ŭ������ �ν��Ͻ� ����)");
			System.out.println(sNum + "(�ܺ� Ŭ������ ���� ����)");
			System.out.println(inNum + "(���� Ŭ������ �ν��Ͻ� ����)");
		}
	}
	
	public void usingClass() {
		inClass.inTest();
	}
}

public class InnerClassTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("**�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ��� ȣ�� - ���1**");
		outClass.usingClass();
		
		System.out.println("**�ܺ� Ŭ������ �̿��Ͽ� ���� Ŭ���� ��� ȣ�� - ���2**");
		OutClass.InClass inClass = outClass.new InClass();
		inClass.inTest();
	}
}
