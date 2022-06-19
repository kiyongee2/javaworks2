package dbconnection.member;

import java.util.ArrayList;

public class MemberMain {

	public static void main(String[] args) {
		//MemberVO lee = new MemberVO("lee", "1234", "�̼���", 38);
		MemberVO grae = new MemberVO("grae", 29);
		MemberDAO dao = new MemberDAO();
		//dao.addMember(lee);
		//dao.modMember(ryu);
		dao.delMember(grae);
		
		ArrayList<MemberVO> list = dao.listAll();
		
		for(int i=0; i<list.size(); i++) {
			MemberVO data = (MemberVO)list.get(i);
			String id = data.getId();
			String password = data.getPassword();
			String name = data.getName();
			int age = data.getAge();
			
			System.out.println("���̵�:" + id + 
							   ", �н�����:" + password +
					           ", �̸�:" + name +
					           ", ����:" + age );
		}
	}

}
