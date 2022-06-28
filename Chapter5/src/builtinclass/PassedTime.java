package builtinclass;

import java.util.Calendar;

public class PassedTime {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();  //������ ��ü ����
		Calendar today = Calendar.getInstance();     //������ ��ü ����
		
		startDay.set(2022, 4, 9);  //���� ������ 1�� ����
		
		//��¥ ���
		String startDay1 = startDay.get(Calendar.YEAR) + "�� " + (startDay.get(Calendar.MONTH) + 1) + "�� "
				+ startDay.get(Calendar.DATE) + "��";
		String today1 = today.get(Calendar.YEAR) + "�� " + (today.get(Calendar.MONTH) + 1) + "�� "
				+ today.get(Calendar.DATE) + "��";
		
		System.out.println("������ - " + startDay1);
		System.out.println("���� - " + today1);
		//���� ������ �ð�(1970�� 1�� 1�� ���� ����), ms ������
		System.out.println(today.getTimeInMillis() + "��");
		
		//������ �ð� ����ϱ�
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//�ʸ� �Ϸ� ȯ��
		passedTime = passedTime / (24*60*60*1000);
		System.out.println("������ " + passedTime + "���� �������ϴ�.");
	}
}
