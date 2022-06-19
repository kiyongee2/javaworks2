package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("�̼���", 85);
		map.put("������", 80);
		map.put("�Ż��Ӵ�", 90);
		map.put("�̼���", 95);
		
		System.out.println("�� Entry �� : " + map.size());
		
		//��ü ã��
		System.out.println("�̼��� : " + map.get("�̼���"));
		System.out.println();
		
		//��ü�� �ϳ��� ó��
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIr = keySet.iterator();
		Iterator<String> ir = map.keySet().iterator();
		while(ir.hasNext()) {
			String key = ir.next();
			Integer value = map.get(key);
			System.out.println(key + ", " + value);
		}
		
		//��ü ����
		map.remove("������");
		System.out.println("�� Entry �� : " + map.size());
		
		map.clear();
		System.out.println("�� Entry �� : " + map.size());
	}

}
