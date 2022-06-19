package array.objectarray;

public class StudentArray {

	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		for(int i=0; i<student.length; i++) {
			System.out.println(student[i]);
		}
		
		student[0] = new Student(1001, "�߽ż�");
		student[1] = new Student(1002, "���κ�");
		student[2] = new Student(1003, "�����");
		student[3] = new Student(1004, "������");
		student[4] = new Student(1005, "�迬��");
		
		for(int i=0; i<student.length; i++) {
			student[i].showInfo();
		}
		
		for(Student stu : student)
			stu.showInfo();
	}

}
