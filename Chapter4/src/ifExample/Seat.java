package ifExample;

public class Seat {

	public static void main(String[] args) {
		//�¼� �� �� ���
		//���尴 ��, �¼� ���� ����
		int customer = 22;
		int column = 5;
		int row = 0;
		
		//row = customer / column;
		
		//�������� �ִ� ���� ������ �������� ��� �߻�
		//�������� ������ 1�� �߰��ؾ� ��.
		if(customer % column == 0) {
			row = customer / column;
		}else {
			row = customer / column + 1;   //rValue���� ����ȯ �߻�
		}
		System.out.println(row + "���� ���� �ʿ��մϴ�.");
	}
}
