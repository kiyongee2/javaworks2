package object.hashcode;

public class Student {
	private String studentNum;
	
	public Student(String studentNum) {
		this.studentNum = studentNum;
	}
	
	public String getStudentNum() {
		return studentNum;
	}

	@Override
	public int hashCode() {
		//studentNum �ʵ尪�� hashCode()�� ��ȯ
		return studentNum.hashCode();  
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			if(studentNum.equals(student.studentNum)) {
				return true;
			}
		}
		return false;
	}
}
