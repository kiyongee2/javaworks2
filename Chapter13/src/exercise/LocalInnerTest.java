package exercise;

class Outer{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable() {
		int num = 100;
		
		//���� ���� Ŭ����
		class MyRunnable implements Runnable{
			int localNum = 10;
			
			@Override
			public void run() {
				//num = 200; //���������� ����� �ٲ�Ƿ� ���� �����Ҽ� ����(final ���� �����Ǿ� ����)
				//getRunnable()�� ȣ��� �� run()�޼��尡 ����. num�� �����ϴ� ���� ����̹Ƿ� ����.
				localNum = 20;
				System.out.println(num);     //num������ ������ �ȵ����� ����� ����.
				System.out.println(localNum);
				System.out.println(outNum + "(�ܺ�Ŭ���� �ν��Ͻ� ����)");
				System.out.println(Outer.sNum + "(�ܺ�Ŭ���� ���� ����)");
			}
			
		}
		return new MyRunnable();
	}
}


public class LocalInnerTest {

	public static void main(String[] args) {
		Outer out = new Outer();
		out.getRunnable().run();
		
		System.out.println("***Runnable �������̽��� ���� runner�� ���� ***");
		Runnable runner = out.getRunnable();
		runner.run();

	}

}
