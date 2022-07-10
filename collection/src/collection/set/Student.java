package collection.set;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {            //name�� age ���� ������
		return name.hashCode() + age;  //������ hashCode�� ����
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {         //name�� age ���� ������
			Student student = (Student)obj;  //true ����
			if(student.name.equals(name) && (student.age==age)) {
				return true;
			}
		}
		return false;
	}
}
