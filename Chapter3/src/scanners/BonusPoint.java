package scanners;

import java.util.Scanner;

public class BonusPoint {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �̸��� �Է��ϼ��� : ");
		String name = scan.nextLine(); //�� �̸�
		
		System.out.print("���� �ݾ��� �Է��ϼ��� : ");
		int price = scan.nextInt();  //����
		int bonusPoint = 0;          //���ʽ� ����Ʈ
		double bonusRatio = 0.05;    //���ʽ������� : 5%
		
		//���ʽ�����Ʈ = ���� x ���ʽ�������
		bonusPoint = (int)(price * bonusRatio);
		System.out.println(name + " ���� ���ʽ� ����Ʈ�� " + bonusPoint + "���Դϴ�." );
	
		scan.close();
	}
}
