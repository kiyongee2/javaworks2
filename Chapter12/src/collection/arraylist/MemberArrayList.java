package collection.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	//Member������ ������ ArrayList ����
	public MemberArrayList(){
		arrayList = new ArrayList<Member>();
	}
	
	//ArrayList�� ȸ���� �߰��ϴ� �޼���
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//ArrayList���� ȸ���� �����ϴ� �޼���
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int dbMemberId = member.getMemberId();
			if(dbMemberId==memberId) {
				arrayList.remove(i);
				return true;
			}else {
				return false;
			}
		}
		System.out.println(memberId + "�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	// ��ü ȸ���� ����ϴ� �޼���
	public void showAllMember() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
	
//		Iterator<Member> ir = arrayList.iterator();
//		while(ir.hasNext()) {
//			Member member = ir.next();
//			if(member.getMemberId()==memberId) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		

	
	public void insertMember(Member member, int index) {
//		if(index< 0 || index > arrayList.size()+1)
//			System.out.println("������ ��ġ�� �߰��Ҽ� �����ϴ�.");
//		arrayList.add(index-1, member);
		try {
			arrayList.add(index-1, member);
		}catch(Exception e) {
			//e.printStackTrace();
			System.out.println("������ �ڸ��� �߰��� �� �����ϴ�.");
		}
	}
}
