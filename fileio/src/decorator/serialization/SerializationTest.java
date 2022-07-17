package decorator.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationTest {

	public static void main(String[] args) {
		//����ȭ
		Person personSon = new Person("������", "��ǥ�̻�");
		Person personJang = new Person("��׷�", "����");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
			ObjectOutputStream oos = new ObjectOutputStream(fos)){
			
			oos.writeObject(personSon);
			oos.writeObject(personJang);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//������ȭ
		try(FileInputStream fis = new FileInputStream("serial.out");
			ObjectInputStream ois = new ObjectInputStream(fis)){
			
			Person p1 = (Person) ois.readObject();
			Person p2 = (Person) ois.readObject();
			
			System.out.println(p1);
			System.out.println(p2);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
