package arraylist;

import java.util.ArrayList;

public class Cart {
	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		
		cart.add("Ŀ��");
		cart.add("���");
		cart.add("����");
		
		System.out.println("��ٱ��� : " + cart.size() + "��");
		
		for(int i=0; i<cart.size(); i++) {
		   String c =	cart.get(i);
		   System.out.println(c);
		}
		
		//Ŀ�� ����
		cart.remove(0);
		
		for(String c : cart)
			System.out.println(c);
	}
}
