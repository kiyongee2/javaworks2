package exception.throwsample;

public class AutoCloseTest {

	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception();
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("���� �κ��Դϴ�.");
		}
	}
}
