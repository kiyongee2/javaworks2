package innerclass;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		return new Runnable() {  //�̸� ���� ����Ŭ���� ����

			@Override
			public void run() {
				System.out.println(num);
				System.out.println(i);
			}	
		};  //���� Ŭ���� ���� ';' 
	}
		
	Runnable runner = new Runnable() {  //�������̽��� ���� ����
		//�����ݷ��� ���� ���̸� run()�� implements �� �� �ִ�.
		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");	
		}	
	};
}

public class AnnoymousInnerTest {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		Runnable runnerable = out.getRunnable(20);
		runnerable.run();
		out.runner.run();
	}
}
