package hiding;

public class StudentTest {
	public static void main(String[] args) {
		Student lee = new Student();
		//lee.studentID = 1004
		//lee.studentName = "�̰���";
		lee.setStudentID(1004);
		lee.setStudentName("�̰���");
		
		System.out.println(lee.getStudentID());
		System.out.println(lee.getStudentName());
	}
}
