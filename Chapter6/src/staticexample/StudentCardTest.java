package staticexample;

public class StudentCardTest {

	public static void main(String[] args) {
		StudentCard Jang = new StudentCard();
		Jang.setStudentName("��׷�");
		System.out.println("�й�: " + Jang.studentID + ", �̸�: " + Jang.getStudentName() + 
				           ", ī���ȣ: " + Jang.cardNumber);
		
		StudentCard Park = new StudentCard();
		Park.setStudentName("���κ�");
		System.out.println("�й�: " + Park.studentID + ", �̸�: " + Park.getStudentName() + 
				           ", ī���ȣ: " + Park.cardNumber);

		StudentCard Chu = new StudentCard();
		Chu.setStudentName("���κ�");
		System.out.println("�й�: " + Chu.studentID + ", �̸�: " + Chu.getStudentName() + 
				           ", ī���ȣ: " + Chu.cardNumber);
	}
}
