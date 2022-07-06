package object.clone;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 30);
		System.out.println(circle);
		
		//circle ��ü ����
		Circle copyCircle = (Circle) circle.clone(); //clone()�� ��ȯ���� Object�̹Ƿ� �� ��ȯ
		System.out.println(copyCircle);
	}
}
