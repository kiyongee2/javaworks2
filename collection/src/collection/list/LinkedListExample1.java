package collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {

	public static void main(String[] args) {
		//List Ÿ������ LinkedList ��ü ����
		List<String> myList = new LinkedList<>();
		
		//��ü �߰�
		myList.add("A");
		myList.add("B");
		myList.add("C");
		
		//��ü ���
		System.out.println(myList);
		
		//Ư�� ��ġ�� ��ü �߰�
		myList.add(2, "D");
		System.out.println(myList);
		
		//��� ����
		myList.remove(1);
		System.out.println(myList);
		
		//��� ��ü ���
		for(int i=0; i<myList.size(); i++) {
			String list = myList.get(i);
			System.out.print(list + " ");
		}
	}
}
