package operator;

public class Operation_increase {

	public static void main(String[] args) {
		//����, ���� ������
		int num = 10;
		
		//System.out.println(num);
		//System.out.println(num++);
		
		System.out.println(++num);
		System.out.println(num);
		
		//�� ���������� ��� ��(���� ó������ ������ ������)
		int i = 0;
		while(i < 5) {
			System.out.println(i);
			i++;
		}
	}

}
