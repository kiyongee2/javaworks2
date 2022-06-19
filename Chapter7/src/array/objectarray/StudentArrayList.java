package array.objectarray;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		ArrayList<Student> studentlist = new ArrayList<>();
		Student chu = new Student(2020001, "�߽ż�");
		Student inbi = new Student(2020002, "���κ�");
		Student son = new Student(2020003, "�����");
		
		studentlist.add(chu);
		studentlist.add(inbi);
		studentlist.add(son);
		
//		students.add(new Student(2020001, "�߽ż�"));
//		students.add(new Student(2020002, "���κ�"));
//		students.add(new Student(2020003, "�����"));
		
		for(int i=0; i<studentlist.size(); i++) {
			Student stu = studentlist.get(i);
			stu.showInfo();
		}
		
		System.out.println();
		
		for(Student stu : studentlist)
			stu.showInfo();

	}

}
