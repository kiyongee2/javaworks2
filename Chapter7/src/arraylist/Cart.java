package arraylist;

import java.util.ArrayList;

public class Cart {
	public static void main(String[] args) {
		//ArrayList�� ��ü ����
		ArrayList<String> cart = new ArrayList<>();
		
		//��� ����
		cart.add("Ŀ��");
		cart.add("���");
		cart.add("����");
		
		//����� ����
		System.out.println("��ٱ��� ǰ��: " + cart.size() + "��");
		
		//��ü ���
		for(int i=0; i<cart.size(); i++) {
		   String c =	cart.get(i);
		   System.out.println(c);
		}
		System.out.println();
		
		//�ڷ� ���� - Ŀ�Ǹ� ������� ����
		cart.set(0, "���");
		
		//�ڷ� ���� - ����
		cart.remove(1);
	
		//��� for�� ��ȸ
		for(String c : cart)
			System.out.println(c);
	}
}
