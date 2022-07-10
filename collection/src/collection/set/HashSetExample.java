package collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		
		//��� ����
		set.add("Java");
		set.add("JDBC");
		set.add("JSP/Servlet");
		set.add("Java");
		set.add("MyBatis");
		
		int size = set.size();
		System.out.println("�� ��ü��: " + size);
		
		Iterator<String> iterator = set.iterator(); //�ݺ��� ���
		while(iterator.hasNext()) {            //��ü ����ŭ �ݺ�
			String element = iterator.next();  //1���� ��ü ������
			System.out.println("\t" + element);
		}
		
		//��� ����
		set.remove("JDBC");
		System.out.println("�� ��ü��: " + set.size());
		
		for(String element : set) {
			System.out.println("\t" + element);
		}
		
		//��� ��� ����
		set.clear();
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}
	}
}
