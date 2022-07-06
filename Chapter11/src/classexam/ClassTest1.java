package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest1 {

	public static void main(String[] args) throws ClassNotFoundException {
		
		System.out.println("=== Ŭ���� �̸� �������� ===");

		Class<?> pClass1 = Class.forName("java.lang.String");
		System.out.println(pClass1.getName());
		
		System.out.println("*********������ ����************");
		Constructor<?>[] cons = pClass1.getConstructors();
		for(Constructor<?> c : cons) {
			System.out.println(c);
		}
		
		System.out.println("*********�������(�ʵ�) ����************");
		Field[] fields = pClass1.getDeclaredFields();
		for(Field f : fields) {
			System.out.println(f);
		}
	}
}
