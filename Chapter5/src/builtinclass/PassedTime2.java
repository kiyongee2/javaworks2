package builtinclass;

import java.util.Calendar;

public class PassedTime2 {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();  //������ ��ü ����
		Calendar today = Calendar.getInstance();     //������ ��ü ����
		
		startDay.set(2022, 4, 9);  //���� ������ 1�� ����
		
		//��¥ ���
		System.out.println("������ - " + datePrint(startDay));
		System.out.println("���� - " + datePrint(today));
		//���� ������ �ð�(1970�� 1�� 1�� ���� ����), ms ������
		System.out.println(today.getTimeInMillis() + "��");
		
		//������ �ð� ����ϱ�
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//�ʸ� �Ϸ� ȯ��
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("������ " + passedTime + "���� �������ϴ�.");
	}
	
	public static String datePrint(Calendar cal) {
		String date = cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH) + 1) + "�� "
				+ cal.get(Calendar.DATE) + "��";
		return date;
	}
}
