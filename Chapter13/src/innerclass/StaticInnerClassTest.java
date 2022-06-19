package innerclass;

class Out2Class{
    int num = 10;
	private static int sNum = 20;
	
	//���� ���� Ŭ����
	static class InstaticClass{  
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
			//num += 10;   //�ν��Ͻ� ������ ������
			System.out.println(sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println(inNum + "(���� Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println(sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	
		static void sTest() {
			//num += 20;      //��� ����
			//inNum += 10;    //��� ����
			System.out.println(sNum + "(�ܺ� Ŭ������ ���� ���� ���)");
			System.out.println(sInNum + "(���� Ŭ������ ���� ���� ���)");
		}
	}
}

public class StaticInnerClassTest {

	public static void main(String[] args) {
		
		//�ܺ�Ŭ���� �������� �ʰ� �ٷ� ���� ���� Ŭ���� ���� ����
		Out2Class.InstaticClass sInClass = new Out2Class.InstaticClass();
		System.out.println("**���� ���� Ŭ������ �Ϲ� �޼��� ȣ��**");
		sInClass.inTest();
		
		System.out.println("**���� ���� Ŭ������ ���� �޼��� ȣ��**");
		Out2Class.InstaticClass.sTest();
	}
}
