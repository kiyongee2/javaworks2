package dbconnection.person;

import java.util.ArrayList;

public class PersonMain {

	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		PersonDAO dao = new PersonDAO();
		
		//자료 삽입
		Person p1 = new Person();
		
		p1.setUserId("today");
		p1.setUserPw("today11");
		p1.setName("오늘");
		p1.setAge(15);
		
		dao.insertPerson(p1); //삽입 메서드 호출*/
		
		//자료 수정
		Person p2 = new Person();
		
		p2.setUserId("ocean");
		p2.setUserPw("ocean11");
		p2.setName("바다");
		p2.setAge(33);
		
		dao.updatePerson(p2);
		
		//자료 삭제
		Person p3 = new Person();
		p3.setUserId("cloud");
		dao.deletePerson(p3);
		
		//자료 전체 조회
		personList = dao.getPersonList();  //db 목록 호출
		
		for(int i=0; i<personList.size(); i++) {
			Person person = personList.get(i);
			personPrint(person);
		}
		
		//자료 1명 검색
		Person selectOne = dao.getPerson("today");
		personPrint(selectOne);
	}
	
	public static void personPrint(Person person) {
		System.out.println("id: " + person.getUserId());
		System.out.println("password: " + person.getUserPw());
		System.out.println("이름: " + person.getName());
		System.out.println("나이: " + person.getAge());
		System.out.println("=========================");
	}

}
