package operator;

public class OperationEx4 {

	public static void main(String[] args) {
		//���մ��� ������
		int num = 10;
		System.out.println(num += 1);
		System.out.println(num %=10);
		num -= 1;
		System.out.println(num);
		
		//���� ������
		System.out.println("---------");
		//�θ���� ���� ��
		boolean bool = (5 > 3) ? true : false;
		System.out.println(bool);
		
		int fatherAge = 45;
		int motherAge = 47;
		
		char ch;
		ch = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(ch);
	}
}
