package object.equals;

public class MemberTest {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� ��ġ�մϴ�.");
		}else {
			System.out.println("obj1�� obj2�� �ٸ��ϴ�.");
		}
		
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj��3 ��ġ�մϴ�.");
		}else {
			System.out.println("obj1�� obj3�� �ٸ��ϴ�.");
		}
	}
}
