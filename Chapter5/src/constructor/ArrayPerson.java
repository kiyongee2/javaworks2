package constructor;

public class ArrayPerson {

	public static void main(String[] args) {
		
		Person[] person = new Person[3];
		person[0] = new Person("����", 165.3F, 60.1F);
		person[1] = new Person("������", 165.3F, 60.1F);
		person[2] = new Person("��ȫ��", 165.3F, 60.1F);
		
		for(Person p : person)
			p.showInfo();
	}

}
