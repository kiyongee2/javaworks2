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
			int key = ir.next();  //key 갑을 가져와서
			Member member = hashMap.get(key);  //key로 value 가져오기
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) { //입력받은 memberId가 존재한다면
			hashMap.remove(memberId);  //해당 회원 삭제
			return true;
		}
		System.out.println("회원 아이디 " + memberId + "가 존재하지 않습니다.");
		return false;
	}
}






