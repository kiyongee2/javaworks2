package arraylist;

public class StudentTest2 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2(1001, "�̼���");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 53);
		studentLee.addSubject("����", 80);
		
		Student2 studentPark = new Student2(1002, "������");
		studentPark.addSubject("����", 88);
		studentPark.addSubject("����", 70);
		studentPark.addSubject("����", 93);
		
		studentLee.showStudentInfo();
		System.out.println("===============================================");
		studentPark.showStudentInfo();	
	}
}
