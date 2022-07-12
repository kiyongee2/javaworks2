package collection.member;

import java.util.HashMap;
import java.util.Iterator;


public class MemberHashMap {
	HashMap<Integer, Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<>();
	}
	
	public void addMember(Member member) {
		//key:memberId, value:member
		hashMap.put(member.getMemberId(), member);
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();  //key ���� �����ͼ�
			Member member = hashMap.get(key);  //key�� value ��������
			System.out.println(member);
		}
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //�Է¹��� memberId�� �����Ѵٸ�
			hashMap.remove(memberId);  //�ش� ȸ�� ����
			return true;
		}
		System.out.println("ȸ�� ���̵� " + memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
}






