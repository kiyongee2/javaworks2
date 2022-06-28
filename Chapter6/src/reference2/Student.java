package reference2;

public class Student {
	String studentName;
	int studentID;
	Subject korean;
	Subject math;

	public Student(String name, int id){
		studentName = name;
		studentID = id;
		korean = new Subject("����");
		math = new Subject("����");
	}
	
	public void setKorea(int score) {
		korean.setScorePoint(score);
	}
	
	public void setMath(int score) {
		math.setScorePoint(score);
	}
	
	public void showInfo() {
		int total = korean.getScorePoint() + math.getScorePoint();
		double avg = (double)total / 2;
		System.out.println(studentName + " �л��� ������" + total + "���̰�, ����� " + avg + "���Դϴ�.");
	}
}
