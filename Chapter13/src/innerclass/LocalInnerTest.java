package innerclass;

class Outer{
	int outNum = 100;    
	static int sNum = 200;
	
	Runnable getRunnable(int i){
		int num = 100;  
		
		class MyRunnable implements Runnable{
			int localNum = 10;  
			@Override
			public void run() {
				//num = 200;  ����Ŭ������ ���� ������ ����� �ٲ�Ƿ� ���� ������ �� ���� 
				//i = 100;
				System.out.println(outNum);
				System.out.println(sNum);
				System.out.println(localNum);
				System.out.println(i);   //������ �ȵ����� ������ �� �� �ִ�.
			}
		}
		return new MyRunnable();	
	}
}

public class LocalInnerTest {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.getRunnable(10).run();
		System.out.println("========");
		Runnable runner = outer.getRunnable(50);
		runner.run();
	}
}
