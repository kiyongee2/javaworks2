package collection.member;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//ȸ�� �߰� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ȸ�� ��ü ��ȸ
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//ȸ�� ����
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();  //�̹� ����� ȸ�����̵�
			if(tempId==memberId) {    //���� Id�� �ܺ� �Է� Id�� ���ٸ�
				arrayList.remove(i);  //member ��ü ����
				return true;
			}
		}
		System.out.println("ȸ�� ���̵� " + memberId + "�� �������� �ʽ��ϴ�.");
		return true;
	}
}
