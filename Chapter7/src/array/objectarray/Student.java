package array.objectarray;

public class Student {
	int id;
	String name;
	
	Student(int id, String name){
		this.name = name;
		this.id = id;
	}
	
	void showInfo() {
		System.out.println("�й� : " + id + ", �̸� : " + name);
	}
}
