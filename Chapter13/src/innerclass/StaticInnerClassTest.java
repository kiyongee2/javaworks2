package innerclass;

class OutClass{
    int num = 10;
	static int sNum = 20;
	
	//���� ���� Ŭ����
	static class InClass{  
		int inNum = 100;
		static int sInNum = 200;

		void inTest() {
			//num += 10;   //�ܺ� Ŭ������ �ν��Ͻ� ������ ������
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
		//��ø Ŭ������ ��ü ����
		OutClass.InClass inClass = new OutClass.InClass();
		
		System.out.println("**���� ���� Ŭ������ �Ϲ� �޼��� ȣ��**");
		inClass.inTest();
		
		System.out.println("**���� ���� Ŭ������ ���� �޼��� ȣ��**");
		OutClass.InClass.sTest();
		
	}
}
