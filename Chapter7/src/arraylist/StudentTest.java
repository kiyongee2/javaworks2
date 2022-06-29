package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		Student park = new Student(1001, "박마늘");
		Student lee = new Student(1002, "이양파");
		
		park.koreanSubject("국어", 90);
		park.mathSubject("수학", 80);
		park.showInfo();
		
		lee.koreanSubject("국어", 75);
		lee.mathSubject("수학", 60);
		lee.showInfo();
	}
}
