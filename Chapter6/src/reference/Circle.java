package reference;

public class Circle {
	Point circle;
	int radius;
	
	public Circle(int x, int y, int radius) {
		circle = new Point(x, y);
		this.radius = radius;
	}
	
	public void showInfo() {
		System.out.println("원의 중심(" + circle.x + "," + circle.y + ")"
	                      + ", 원의 반지름 : " + radius );
	}
}
