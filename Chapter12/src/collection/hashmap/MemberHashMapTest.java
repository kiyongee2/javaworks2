package collection.hashmap;

import collection.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		memberHashMap.addMember(new Member(1003,"������"));
		memberHashMap.addMember(new Member(1001,"�̼���"));
		memberHashMap.addMember(new Member(1004,"�Ż��Ӵ�"));
		memberHashMap.addMember(new Member(1002,"ȫ�浿"));
		
		memberHashMap.showAllMember();
		
		memberHashMap.addMember(new Member(1002,"��׷�"));
		//memberHashMap.addMember(new Member(1005,"��׷�"));
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(1004);
	
		memberHashMap.removeMember(1005);

	}

}
