package reference;

public class Circle {
	Point circle;
	int radius;
	
	public Circle(int x, int y, int radius) {
		circle = new Point(x, y);
		this.radius = radius;
	}
	
	public void showInfo() {
		System.out.println("���� �߽�(" + circle.x + "," + circle.y + ")"
	                      + ", ���� ������ : " + radius );
	}
}
