package collection.member;

import java.util.ArrayList;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	//회원 전체 조회
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			int tempId = member.getMemberId();  //이미 저장된 회원아이디
			if(tempId==memberId) {    //저장 Id와 외부 입력 Id가 같다면
				arrayList.remove(i);  //member 객체 삭제
				return true;
			}
		}
		System.out.println("회원 아이디 " + memberId + "가 존재하지 않습니다.");
		return true;
	}
}
