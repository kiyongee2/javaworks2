package operator;

public class Swap {

	public static void main(String[] args) {
		int x = 0;
		int y = 1;
		int temp;
		
		System.out.println("��ȯ��");
		System.out.println("x = " + x + ", y= " + y);
		
		//��ȯ ó��
		temp = x;
		x = y;
		y = temp;
		
		System.out.println("��ȯ��");
		System.out.println("x = " + x + ", y= " + y);
	}
}
