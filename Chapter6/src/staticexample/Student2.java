/*
 * �й� �ڵ� �߱� ���α׷�
 */

package staticexample;

public class Student2 {
	private static int serialNum = 1000; //static ����
	int studentID;    //�ν��Ͻ� ����                
	String studentName;
	
	public Student2() {
		serialNum++;
		studentID = serialNum;
	}
	
	public static int getSerialNum() {
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		//studentID = 1002;  �ν��Ͻ� ������ ����� �� ����.
		Student2.serialNum = serialNum;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
}
