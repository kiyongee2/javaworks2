package math_random;

public class MathTest {

	public static void main(String[] args) {
		
		int v1 = Math.abs(-10);      //���밪
		System.out.println("v1 = " + v1);

		long v2 = Math.round(5.6);   //�ݿø�
		System.out.println("v2 = " + v2);
		
	    double v3 = Math.floor(5.9);
		System.out.println("v3 = " + v3); //����
		
		int max = Math.max(10, 20);
		System.out.println("max = " + max); //�ִ밪
		
		double rand = Math.random();
		System.out.println("rand = " + rand); //���� ��(0.0 <= rand <1.0)
		
		int dice = (int)(Math.random()*6) + 1;
		System.out.println("�ֻ��� �� : " + dice);
		
	}

}
