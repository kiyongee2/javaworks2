package object.hashcode;

import java.util.HashMap;

public class KeyTest {

	public static void main(String[] args) {
		//HashMap ��ü ����
		//Key ��ü�� �ĺ�Ű�� String ���� ������
		HashMap<Key, String> hashMap = new HashMap<>();
		
		//put(key, value)
		hashMap.put(new Key(1), "���İ�");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
