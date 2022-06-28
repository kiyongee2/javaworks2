package staticexample;

public class StudentTest {

	public static void main(String[] args) {
		
		Student lee = new Student();
		lee.setName("ภฬด๋วั");
		Student.serialNum++;
		
		System.out.println(Student.serialNum);
	
	}
}
