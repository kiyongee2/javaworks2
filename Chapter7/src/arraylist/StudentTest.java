package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student park = new Student(1001, "�ڸ���");
		Student lee = new Student(1002, "�̾���");
		
		park.koreanSubject("����", 90);
		park.mathSubject("����", 80);
		park.showInfo();
		
		lee.koreanSubject("����", 75);
		lee.mathSubject("����", 60);
		lee.showInfo();
	}
}
