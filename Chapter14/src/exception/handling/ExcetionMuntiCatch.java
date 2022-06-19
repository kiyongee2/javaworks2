package exception.handling;

public class ExcetionMuntiCatch {

	public static void main(String[] args) {
		try {
			int[] num = new int[2];
			
			num[0] = 1;
			num[1] = 2;
			//num[2] = 3;   //ArrayIndexOutOfBoundsException �߻�
			
			num[1] = 3/0;  //ArithmeticException �߻�
			
			System.out.println("1, 2, 3 ����");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done");
	}
}
