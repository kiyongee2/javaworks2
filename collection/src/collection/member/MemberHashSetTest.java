package collection.member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//회원 추가
		memberHashSet.addMember(new Member(1001, "네이버"));
		memberHashSet.addMember(new Member(1002, "카카오"));
		memberHashSet.addMember(new Member(1003, "엔씨소프트"));
		memberHashSet.addMember(new Member(1001, "네이버"));  //중복
		
		//회원 목록
		memberHashSet.showAllMember();
		System.out.println("=================================");
		
		//회원 삭제
		memberHashSet.removeMember(1002);
		memberHashSet.removeMember(1004);
		
		memberHashSet.showAllMember();
		
	}

}
