package streamex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		//collection���� ��Ʈ�� Ȱ���ϱ�
		List<String> sList = new ArrayList<>();
		sList.add("cat");
		sList.add("elephant");
		sList.add("deer");
		
		for(String str : sList) {
			System.out.println(str);
		}
		
		//Stream Ŭ����
		Stream<String> stream = sList.stream();
		stream.forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		sList.stream().forEach(str -> System.out.print(str + " "));
		System.out.println();
		
		//�߰����� -> �������� ����
		sList.stream().sorted().forEach(str -> System.out.println(str));
		System.out.println();
		
		//�߰����� -> ������ ����
		sList.stream().filter(s->s.length()>=5).forEach(str -> System.out.println(str));
	}
}
