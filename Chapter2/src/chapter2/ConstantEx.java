package chapter2;

public class ConstantEx {
	public static void main(String[] args) {
		//����� �����ϱ�
		final int MAX_NUM = 100;
		final int MIN_NUM;
		
		MIN_NUM = 0;
		//MAX_NUM = 1000;  //final�� �����ϸ� ������ �� ����
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);	
		
		// ���� ���� ���ϱ�(������*������*3.14)
		final double PI = 3.14;
		int radius = 5;
		double area = PI * radius * radius;
		System.out.println("���� ���̴� " + area  + "�Դϴ�.");
	}
}
