package staticexample;

public class Student {
	static int serialNum = 10000; //���ذ�
	int studentID;
	String studentName;
	
	public Student() {
		serialNum++;
		studentID = serialNum;
	}
}
