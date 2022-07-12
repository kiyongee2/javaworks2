package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//회원 삽입
		memberHashMap.addMember(new Member(1001, "삼성전자"));
		memberHashMap.addMember(new Member(1002, "LG전자"));
		memberHashMap.addMember(new Member(1003, "네이버"));
		memberHashMap.addMember(new Member(1004, "카카오"));
		memberHashMap.addMember(new Member(1002, "현대자동차"));
		
		//회원 목록 조회
		memberHashMap.showAllMember();
		System.out.println("=================================");
		
		//회원 삭제
		memberHashMap.removeMember(1001);
		memberHashMap.removeMember(1005);
		
		memberHashMap.showAllMember();
	}

}
