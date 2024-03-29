package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Person person = new Person();
		
		System.out.println("=== 클래스 이름 가져오기 ===");
		Class<?> pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class<?> pClass2 = Class.forName("classexam.Person");
		System.out.println(pClass2.getName());
		
		System.out.println("*********생성자 정보************");
		Constructor<?>[] cons = pClass1.getConstructors();
		for(Constructor<?> c : cons) {
			System.out.println(c);
		}
		
		System.out.println("*********멤버변수(필드) 정보************");
		Field[] fields = pClass1.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
		
		System.out.println("*********메서드 정보************");
		Method[] methods = pClass1.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
	}
}
