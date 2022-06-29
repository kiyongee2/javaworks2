package arraylist;

import java.util.ArrayList;

public class Student2 {
	private int studentID;
	private String studentName;
	private ArrayList<Subject> subjectList;
	
	public Student2(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<>();
	}
	
	public void addSubject(String name, int score) {
		
		Subject subject = new Subject();
		
		subject.setSubjectName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);  //������ ������ ����Ʈ�� ����
	}
	
	public void showStudentInfo() {
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "��  " + s.getSubjectName() + 
				       "���� ������ " + s.getScorePoint() + "�� �Դϴ�.");
		}
		/*for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("�л� " + studentName + "��  " + s.getSubjectName() + 
					       "���� ������ " + s.getScorePoint() + "�� �Դϴ�.");
		}*/
		avg = (double)total / subjectList.size();
		System.out.printf("�л� %s���� ������  %d�� �̰�, ����� %.2f�� �Դϴ�.\n" , 
				     studentName, total, avg);
	}
}
