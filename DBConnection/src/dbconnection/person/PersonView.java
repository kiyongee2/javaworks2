package dbconnection.person;

import java.util.ArrayList;

public class PersonView {

	public static void main(String[] args) {
		//PersonVO chu = new PersonVO("0001", "�߽ż�", 35);
		//Person1VO inbi = new Person1VO("0002", "���κ�", 32);
		PersonVO son = new PersonVO("0003", "�����", 28);
		PersonDAO dao = new PersonDAO();
		//dao.addPerson(chu);
		//dao.addPerson(inbi);
		dao.addPerson(son);

		ArrayList<PersonVO> list = dao.listAll();
		
		for(int i=0; i<list.size(); i++) {
			PersonVO data =list.get(i);
			String id = data.getId();
			String name = data.getName();
			int age = data.getAge();
			
			System.out.println("���̵�:" + id + 
					           ", �̸�:" + name +
					           ", ����:" + age );
		}
	}

}
