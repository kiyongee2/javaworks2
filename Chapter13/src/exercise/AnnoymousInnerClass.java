package exercise;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		//�͸�(���� Ŭ������ �̸��� ����) ���� Ŭ����
		return new Runnable() {

			@Override
			public void run() {
				//num = 200;
				//i=20  //�Ű������� ����� �ٲ�
				System.out.println(i);
				System.out.println(num);
			}
		};
	}
	
	//�͸� ���� Ŭ������ �������̽��� ������ ����
	Runnable runner = new Runnable() {

		@Override
		public void run() {
			System.out.println("Runnable�� ������ �͸� Ŭ���� ����");
		}
	};
}


public class AnnoymousInnerClass {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		
		Runnable runner = out.getRunnable(10);
		runner.run();
		out.runner.run();
	}
}
