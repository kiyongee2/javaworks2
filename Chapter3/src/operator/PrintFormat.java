package operator;

public class PrintFormat {

	public static void main(String[] args) {
		/* printf("���ڿ� ����", ��ü) �Լ�
		   ���� ���� - %d : ����, %f : �Ǽ�, %s : ���ڿ�
		   �̽������� ���� - \n : �ٹٲ� , \t : ��
		*/
		int year = 2022;
		System.out.printf("���ش� %d�� �Դϴ�.\n", year);
		
		float weight = 63.7F;
		System.out.printf("���� �����Դ� %.1fkg�Դϴ�.\n", weight);
		
		String nick = "��������";
		System.out.printf("�׳��� ������ %s�Դϴ�.\n", nick);
		
		String table = "";
		table += "---------------------\n";
		table += "�̸�\t����\t����\n";
		table += "������\t82\t���\n";
		table += "�̼���\53\t����\n";
		table += "---------------------\n";
		
		System.out.println(table);
	}
}
