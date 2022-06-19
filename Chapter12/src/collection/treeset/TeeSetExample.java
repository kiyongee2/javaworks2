package collection.treeset;

import java.util.TreeSet;

public class TeeSetExample {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		for(Integer s : scores) {  //��ȸ�ϸ� �������� ���ĵ�
			System.out.println(s);
		}
		
		int score = scores.first();
		System.out.println("���� ���� ���� : " + score);
		
		score = scores.last();
		System.out.println("���� ���� ���� : " + score+"\n");
		
		score = scores.lower(95);
		System.out.println("95�� �Ʒ� ���� : " + score);
		
		score = scores.higher(95);
		System.out.println("95�� ���� ���� : " + score + "\n");
		
		while(!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(���� ��ü �� : "+scores.size()+")");
		}
	}

}
