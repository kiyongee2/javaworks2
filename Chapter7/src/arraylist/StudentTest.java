package arraylist;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(1001, "Lee");
		studentLee.addSubject("����", 100);
		studentLee.addSubject("����", 53);
		studentLee.addSubject("����", 80);
		
		Student studentPark = new Student(1002, "Park");
		studentPark.addSubject("����", 88);
		studentPark.addSubject("����", 70);
		studentPark.addSubject("����", 93);
		
		studentLee.showStudentInfo();
		System.out.println("===============================================");
		studentPark.showStudentInfo();	
	}
}
