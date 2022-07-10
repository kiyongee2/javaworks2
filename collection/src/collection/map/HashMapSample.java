package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<>();
		
		//��ü ����
		map.put("�̼���", 85);
		map.put("ȫ�浿", 90);
		map.put("������", 80);
		map.put("ȫ�浿", 75);
		System.out.println("�� ��ü ��: " + map.size());
		
		//��ü ã��
		System.out.println("\tȫ�浿: " + map.get("ȫ�浿"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//��ü ����
		map.remove("ȫ�浿");  //Ű�� ����
		System.out.println("�� ��ü ��: " + map.size());
	}
}
