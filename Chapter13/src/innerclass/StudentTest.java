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
			System.out.println("이름 : " + name);
			System.out.println("영어 점수: " + eng);
			System.out.println("수학 점수: " + math);
		}
	}
}

public class StudentTest {
	public static void main(String[] args) {
		//외부 클래스 객체 생성
		Student jang = new Student("장그래");
		
		//내부 클래스 객체 생성
		Student.Score score = jang.new Score();
		
		score.eng = 88;
		score.math = 73;
		score.showInfo();
	}
}
