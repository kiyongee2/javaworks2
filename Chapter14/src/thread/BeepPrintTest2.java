package thread;

public class BeepPrintTest2 {

	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();   //�������̽������� beepTask ��ü ����
		Thread thread = new Thread(beepTask);   //Thread �ν��Ͻ� ����
		thread.start();      //������ ����
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
