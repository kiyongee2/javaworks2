package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public static void main(String[] args) {
		Student studentLee = new Student();
		studentLee.studentID = 1001;
		studentLee.studentName = "�̼���";
		
		System.out.println("�й� : " + studentLee.studentID);
		System.out.println("�̸� : " + studentLee.studentName);
		
		System.out.println(studentLee);
	}
}
