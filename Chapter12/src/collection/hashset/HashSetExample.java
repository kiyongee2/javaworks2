package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("��");
		set.add("��");
		set.add("���");
		set.add("����");
		set.add("���");
		
		System.out.println("�� ��ü��:" + set.size());
		
		System.out.println(set);  //�ڷḦ []�� �����ش�.
		
		//��ȸ(��ȸ)
		Iterator<String> ir = set.iterator();
		while(ir.hasNext()) {
			String fruit = ir.next();
			System.out.println(fruit);
		}
			
		set.remove("��");
		set.remove("����");
		
		System.out.println("�� ��ü��:" + set.size());
		System.out.println(set);
		
		set.clear();
		
		if(set.isEmpty()) {
			System.out.println("��� ����");
		}

	}

}
