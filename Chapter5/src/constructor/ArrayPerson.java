package constructor;

public class ArrayPerson {

	public static void main(String[] args) {
		
		Person[] person = new Person[3];
		person[0] = new Person("±è±â¿ë", 165.3F, 60.1F);
		person[1] = new Person("Á¤¼±ÇÊ", 165.3F, 60.1F);
		person[2] = new Person("¼ÕÈ«ÈÆ", 165.3F, 60.1F);
		
		for(Person p : person)
			p.showInfo();
	}

}
