package collection.member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		//ȸ�� ����
		memberHashMap.addMember(new Member(1001, "�Ｚ����"));
		memberHashMap.addMember(new Member(1002, "LG����"));
		memberHashMap.addMember(new Member(1003, "���̹�"));
		memberHashMap.addMember(new Member(1004, "īī��"));
		memberHashMap.addMember(new Member(1002, "�����ڵ���"));
		
		//ȸ�� ��� ��ȸ
		memberHashMap.showAllMember();
		System.out.println("=================================");
		
		//ȸ�� ����
		memberHashMap.removeMember(1001);
		memberHashMap.removeMember(1005);
		
		memberHashMap.showAllMember();
	}

}
