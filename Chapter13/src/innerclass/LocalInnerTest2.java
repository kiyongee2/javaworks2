package innerclass;

class Outer2{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable runner = new Runnable() {
		int num = 10;

		@Override
		public void run() {
			System.out.println(outNum + "(�ܺ�Ŭ������ �ν��Ͻ� ����)");
			System.out.println(sNum + "(�ܺ�Ŭ������ ���� ����)");
			System.out.println(num + "(�͸�Ŭ������ ��� ����)");
		}
	};
}

public class LocalInnerTest2 {

	public static void main(String[] args) {
		Outer2 out = new Outer2();
		out.runner.run();
	}
}
