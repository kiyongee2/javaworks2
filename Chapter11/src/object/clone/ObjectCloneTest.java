package object.clone;

public class ObjectCloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Circle circle = new Circle(10, 20, 30);
		System.out.println(circle);
		
		//circle 객체 복사
		Circle copyCircle = (Circle) circle.clone(); //clone()의 반환값이 Object이므로 형 변환
		System.out.println(copyCircle);
	}
}
