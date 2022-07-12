package collection.member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//ȸ�� ��ü ���
	public void showAllMember() {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			System.out.println(member);
		}
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int dbMemberId = member.getMemberId();
			if(dbMemberId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		System.out.println("ȸ�� ���̵� " + memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
}










