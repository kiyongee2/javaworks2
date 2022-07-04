package interfaceex.remotecontrol;

public interface RemoteControl {
	//volume을 조절할 상수 선언
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//default 메서드
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	static void ChangeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
