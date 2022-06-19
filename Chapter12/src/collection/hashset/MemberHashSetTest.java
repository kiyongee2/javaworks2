package collection.hashset;

import collection.Member;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member kang = new Member(1001, "������");
		Member kim = new Member(1002, "������");
		Member lee = new Member(1003, "�̼���");  
		Member shin = new Member(1004, "�Ż��Ӵ�");
		Member hong = new Member(1004, "ȫ�浿");
			
		memberHashSet.addMember(kang);
		memberHashSet.addMember(kim);
		memberHashSet.addMember(lee);   
		memberHashSet.addMember(shin);
		memberHashSet.addMember(hong);
		
		memberHashSet.showAllMember();  //ȸ�� ��ü��ȸ(�������� �ߺ� ���� ���)
		
		memberHashSet.removeMember(1003); //ȸ�� ����
		
		memberHashSet.showAllMember();
	}
}
