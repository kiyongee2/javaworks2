package interfaceex.remotecontrol;

// �������̽��� ���� ��ü�� ����ϴ� ���
public class MyClass {
	//�ʵ�
	RemoteControl rc = new Television();
	
	//������
	MyClass(){}
	
	//�������� �Ű� ���� Ÿ������ ����
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//�޼����� ���� ������ ���
	void methodA() {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//�޼����� �Ű� ������ ���
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
