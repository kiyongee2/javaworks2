package object;

class Point{
	int x, y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "x=" + x+ "," + "y=" + y;
	}
}

class Circle implements Cloneable{ //��ü�� �����ص� �ȴٴ� �ǹ��� Cloneable �������̽� ����
	Point point;
	int radius;
	
	Circle(int x, int y, int radius){
		point = new Point(x, y);
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "������ " + point + "�̰�," + "�������� " + radius + "�Դϴ�.";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Circle circle = new Circle(10, 20, 30);
		System.out.println(circle);
		
		Circle circle2 = (Circle) circle.clone();  //���� ����ȯ
		System.out.println(circle2);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(circle2));
	}

}
