package collection.treeset;

import collection.Member;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberLee = new Member(1003, "�̼���");
		Member memberKang = new Member(1001, "������");
		Member memberHong = new Member(1002, "ȫ�浿");
		
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberHong);
		
		memberTreeSet.showAllMember();
	}
}
