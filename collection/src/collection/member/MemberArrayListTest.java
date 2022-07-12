package collection.member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member chu = new Member(1001, "�߽ż�");
		Member son = new Member(1002, "�����");
		Member park = new Member(1003, "���κ�");
		Member kim = new Member(1004, "�迬��");
		
		//ȸ�� �߰�
		memberArrayList.addMember(chu);
		memberArrayList.addMember(son);
		memberArrayList.addMember(park);
		memberArrayList.addMember(kim);
		
		//ȸ�� ��ü ���
		memberArrayList.showAllMember();
		
		System.out.println("----------------------------------");
		
		//ȸ�� ����
		memberArrayList.removeMember(1003);
		memberArrayList.removeMember(1005);   //�������� �ʴ� ���̵�
		
		memberArrayList.showAllMember();
	}
}
