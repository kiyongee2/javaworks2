package object;

class Student{
	int studentId;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentId = studentID;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentId == std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentId;
	}
}

public class EqualsTest {
	public static void main(String[] args) {	
		Student studentLee = new Student(100, "�̰���");
		Student studentLee2 = studentLee;
		Student studentKang = new Student(100, "�̰���");
		
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		
		if(studentLee == studentKang)
			System.out.println("studentLee�� studentKang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentKang�� �ּҴ� �ٸ��ϴ�.");
		
		if(studentLee.equals(studentKang))
			System.out.println("studentLee�� studentKang�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentKang�� �������� �ʽ��ϴ�.");
		
		System.out.println("****hash()�ڵ� �׽�Ʈ******");
		System.out.println("studentLee�� hashCode: " + studentLee.hashCode());
		System.out.println("studentKang�� hashCode: " + studentKang.hashCode());
	}
}
