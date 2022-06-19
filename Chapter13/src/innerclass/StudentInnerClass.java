package innerclass;

class Student{
	String name;
	
	public Student(String name) {
		this.name = name;
	}
	
	public class Score{
		int eng;
		int math;
		
		public void showInfo() {
			System.out.println("�̸� : " + name);
			System.out.println("���� ����: " + eng);
			System.out.println("���� ����: " + math);
		}
	}
}

public class StudentInnerClass {
	public static void main(String[] args) {
		Student jang = new Student("��׷�");
		Student.Score score = jang.new Score();
		score.eng = 88;
		score.math = 73;
		score.showInfo();
	}
}
