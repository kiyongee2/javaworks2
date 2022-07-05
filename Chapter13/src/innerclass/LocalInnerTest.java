package innerclass;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {
		int num = 10;  //�������̽� ���
		
		//�޼����� ���� Ŭ������ ���
		class MyRunnable implements Runnable{
			int localNum = 20;
			
			@Override
			public void run() {
				//num = 20;  
				System.out.println(outNum + "(�ܺ�Ŭ������ �ν��Ͻ� ����)");
				System.out.println(sNum + "(�ܺ�Ŭ������ ���� ����)");
				System.out.println(localNum + "(����Ŭ������ ��� ����)");
			}
		}
		//MyRunnable myRun = new MyRunnable();
		//return myRun;
		return new MyRunnable();
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable().run();
		
		System.out.println("*** �������̽������� ��ȯ ***");
		Runnable runner = outer.getRunnable();
		runner.run();
	}
}
