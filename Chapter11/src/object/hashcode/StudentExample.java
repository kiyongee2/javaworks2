package object.hashcode;

import java.util.HashMap;

public class StudentExample {

	public static void main(String[] args) {
		//HashMap ��ü ����
		//Student ��ü�� �ĺ�Ű�� String ���� ������
		HashMap <Student, Integer> hashMap = new HashMap<>();
		
		//�ڷ� ����
		hashMap.put(new Student("1"), 95);
		
		//Ư�� �ڷ� ����(�˻�)
		int score = hashMap.get(new Student("1"));
		
		System.out.println("1�� �л��� ���� ����: " + score);
	}
}
