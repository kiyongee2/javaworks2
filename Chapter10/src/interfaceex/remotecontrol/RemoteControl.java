package interfaceex.remotecontrol;

public interface RemoteControl {
	//volume�� ������ ��� ����
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻� �޼���
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default �޼���
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	static void ChangeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
