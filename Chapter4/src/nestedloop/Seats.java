package nestedloop;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
		//�¼� �� �� ���
		//���尴 ��, �¼� ���� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("���尴 �� : ");
		int customNum = sc.nextInt();
		System.out.print("�¼� �� �� : ");
		int colNum = sc.nextInt();
		
		int rowNum;  //��(��) ��
		
		if(customNum % colNum == 0) {
			rowNum = customNum / colNum;
		}else { //������ �ο��� �ִ� ��� 1�� �߰�
			rowNum = customNum / colNum + 1;  
		}
		
		//�¼� ��ġ �ݺ�
		for(int i = 0; i < rowNum; i++) {  //��
			for(int j = 1; j <= colNum; j++) { //��
				int seatNum = i * colNum + j;  //�¼� ��ȣ
				if(seatNum > customNum)
					break;
				System.out.print("�¼�" + seatNum + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
