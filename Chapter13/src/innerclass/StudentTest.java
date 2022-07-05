package innerclass;

class Student{
	
	String name;
	
	Student(String name) {
		this.name = name;
	}
	
	class Score{
		int eng;
		int math;
		
		void showInfo() {
			System.out.println("�̸� : " + name);
			System.out.println("���� ����: " + eng);
			System.out.println("���� ����: " + math);
		}
	}
}

public class StudentTest {
	public static void main(String[] args) {
		//�ܺ� Ŭ���� ��ü ����
		Student jang = new Student("��׷�");
		
		//���� Ŭ���� ��ü ����
		Student.Score score = jang.new Score();
		
		score.eng = 88;
		score.math = 73;
		score.showInfo();
	}
}
