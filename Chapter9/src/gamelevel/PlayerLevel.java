package gamelevel;

public abstract class PlayerLevel {
	
	public abstract void run();
	
	public abstract void jump();
	
	public abstract void turn();
	
	public abstract void showLevelMessage();
	
	//���ø� �޼��� (�Ϸ��� ����)
	public final void go(int count) {
		run();
		jump();
		for(int i=1; i<=count; i++) {
			jump();
		}
		turn();
	}
}
