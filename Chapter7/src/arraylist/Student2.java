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
		
		subjectList.add(subject);  //생성한 과목을 리스트에 저장
	}
	
	public void showStudentInfo() {
		int total = 0;
		double avg = 0.0;
		
		for(int i=0; i<subjectList.size(); i++) {
			Subject s = subjectList.get(i);
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의  " + s.getSubjectName() + 
				       "과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}
		/*for(Subject s : subjectList) {
			total += s.getScorePoint();
			System.out.println("학생 " + studentName + "의  " + s.getSubjectName() + 
					       "과목 성적은 " + s.getScorePoint() + "점 입니다.");
		}*/
		avg = (double)total / subjectList.size();
		System.out.printf("학생 %s님의 총점은  %d점 이고, 평균은 %.2f점 입니다.\n" , 
				     studentName, total, avg);
	}
}
