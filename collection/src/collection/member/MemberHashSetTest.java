package collection.member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		//ȸ�� �߰�
		memberHashSet.addMember(new Member(1001, "���̹�"));
		memberHashSet.addMember(new Member(1002, "īī��"));
		memberHashSet.addMember(new Member(1003, "��������Ʈ"));
		memberHashSet.addMember(new Member(1001, "���̹�"));  //�ߺ�
		
		//ȸ�� ���
		memberHashSet.showAllMember();
		System.out.println("=================================");
		
		//ȸ�� ����
		memberHashSet.removeMember(1002);
		memberHashSet.removeMember(1004);
		
		memberHashSet.showAllMember();
		
	}

}
