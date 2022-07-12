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
	
	//회원 전체 목록
	public void showAllMember() {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			System.out.println(member);
		}
	}
	
	//회원 삭제
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
		System.out.println("회원 아이디 " + memberId + "가 존재하지 않습니다.");
		return false;
	}
}










