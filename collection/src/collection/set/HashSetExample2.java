package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("������", 30));  //�ν��Ͻ��� �ٸ����� ������ �����Ƿ�
		set.add(new Student("������", 30));  //��ü 1���� ����
		
		System.out.println("�� ��ü��: " + set.size());
		
	}
}
