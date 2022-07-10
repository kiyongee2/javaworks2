package collection.set;

public class Student {
	String name;
	int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {            //name과 age 값이 같으면
		return name.hashCode() + age;  //동일한 hashCode를 리턴
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {         //name과 age 값이 같으면
			Student student = (Student)obj;  //true 리턴
			if(student.name.equals(name) && (student.age==age)) {
				return true;
			}
		}
		return false;
	}
}
