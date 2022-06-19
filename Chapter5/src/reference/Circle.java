package reference;

public class Circle {
	Point point;
	int radius;
	
	public Circle(int r) {
		point = new Point();
		radius = r;
	}
	
	public void setPoint(int x, int y) {
		point.setX(x);
		point.setY(y);
	}
	
	public void showInfo() {
		System.out.println("���� �߽�(" + point.getX()+","+ point.getY() + ")"
	                      + ", ���� ������ : " + radius );
	}
}
