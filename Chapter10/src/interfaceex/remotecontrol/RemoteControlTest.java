package interfaceex.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		RemoteControl rcTV = new Television();
		RemoteControl rcAudio = new Audio();
		
		rcTV.turnOn();
		rcTV.setVolume(15);
		rcTV.setMute(true);
		rcTV.turnOff();
		System.out.println("===================");
		
		rcAudio.turnOn();
		rcAudio.setVolume(-1);
		rcAudio.setMute(false);
		rcAudio.turnOff();
	}
}
