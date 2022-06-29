package arraylist;

public class StudentTest2 {
	public static void main(String[] args) {
		Student2 studentLee = new Student2(1001, "이순신");
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("수학", 53);
		studentLee.addSubject("과학", 80);
		
		Student2 studentPark = new Student2(1002, "강감찬");
		studentPark.addSubject("국어", 88);
		studentPark.addSubject("수학", 70);
		studentPark.addSubject("영어", 93);
		
		studentLee.showStudentInfo();
		System.out.println("===============================================");
		studentPark.showStudentInfo();	
	}
}
