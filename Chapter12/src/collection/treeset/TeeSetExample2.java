package collection.treeset;

import java.util.TreeSet;

public class TeeSetExample2 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>();
		names.add("ȫ�浿");
		names.add("������");
		names.add("�����");
		names.add("��׷�");
		names.add("������");
		
		for(String str : names) {
			System.out.println(str);
		}
	}
}
