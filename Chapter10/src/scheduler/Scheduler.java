package scheduler;

public interface Scheduler {
	//���� ��ȭ�� ��������
	public void getNextCall();  
	
	//�������� ��ȭ�� ����ϱ�
	public void sendCallToAgent(); 
}
