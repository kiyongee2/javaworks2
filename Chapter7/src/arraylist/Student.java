package arraylist;

public class Student {
	int studentID;
	String studentName;
	Subject korean;
	Subject math;
	
	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		korean = new Subject();
		math = new Subject();
	}
	
	public void koreanSubject(String name, int score) {
		korean.setSubjectName(name);
		korean.setScorePoint(score);
	}
	
	public void mathSubject(String name, int score) {
		math.setSubjectName(name);
		math.setScorePoint(score);
	}
	
	public void showInfo() {
		System.out.println("학생 " + studentName + "의 국어 점수는 " + 
				korean.getScorePoint() + "점이고, 수학 점수는 " + math.getScorePoint() + "점입니다.");
	}
}
