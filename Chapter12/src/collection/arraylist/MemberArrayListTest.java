package collection.arraylist;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberList = new MemberArrayList();
		Member memberLee = new Member(1001, "�̼���");
		Member memberKim = new Member(1003, "������");
		Member memberKang = new Member(1002, "������");
		Member memberShin = new Member(1004, "�Ż��Ӵ�");
		
		memberList.addMember(memberLee);
		memberList.addMember(memberKim);
		memberList.addMember(memberKang);
		memberList.addMember(memberShin);
	    
		memberList.showAllMember();
	    
		memberList.removeMember(1002);  //1003 ȸ�� ����
		memberList.showAllMember();  //��ü ȸ�� ���
	    
//	    Member memberHong = new Member(1005, "ȫ�浿");
//	    memberList.insertMember(memberHong, 6);  //2��° ��ġ�� ȸ�� �߰�
//	    memberList.showAllMember(); 
	}
}
