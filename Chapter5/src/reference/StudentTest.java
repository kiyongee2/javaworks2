package reference;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(201901, "�̼���");
		studentLee.setKorean("����", 100);
		studentLee.setMath("����", 90);
		Student studentSin = new Student(201902, "�Ż��Ӵ�");
		studentSin.setKorean("����", 95);
		studentSin.setMath("����", 85);
		
		studentLee.showInfo();
		studentSin.showInfo();
	}
}
