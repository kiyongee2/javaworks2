package innerinterface;

public class MessageListener implements Button.OnClickListner{

	@Override
	public void onClick() {
		System.out.println("���ڸ� �����ϴ�.");
	}
}
