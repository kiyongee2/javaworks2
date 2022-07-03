package dbconnection.person;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//�ڷ� ����
		Person p1 = new Person();
		
		p1.setUserId("today");
		p1.setUserPw("today11");
		p1.setName("����");
		p1.setAge(15);
		
		dao.insertPerson(p1); //���� �޼��� ȣ��*/
		
		//�ڷ� ����
		Person p2 = new Person();
		
		p2.setUserId("ocean");
		p2.setUserPw("ocean11");
		p2.setName("�ٴ�");
		p2.setAge(33);
		
		dao.updatePerson(p2);
		
		//�ڷ� ����
		Person p3 = new Person();
		p3.setUserId("cloud");
		dao.deletePerson(p3);
		
		//�ڷ� ��ü ��ȸ
		personList = dao.getPersonList();  //db ��� ȣ��
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			personPrint(person);
		}
		
		//�ڷ� 1�� �˻�
		Person selectOne = dao.getPerson("today");
		personPrint(selectOne);
	}
	
	public static void personPrint(Person person) {
		System.out.println("id: " + person.getUserId());
		System.out.println("password: " + person.getUserPw());
		System.out.println("�̸�: " + person.getName());
		System.out.println("����: " + person.getAge());
		System.out.println("=========================");
	}

}
