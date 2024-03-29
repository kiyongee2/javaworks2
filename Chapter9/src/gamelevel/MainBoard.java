package gamelevel;

public class MainBoard {

	public static void main(String[] args) {
		//player 객체 생성 - BiginnerLevel 
		Player player = new Player();
		player.play(1);
		
		//중급자 레벨
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgradeLevel(aLevel);
		player.play(2);
		
		//고급자 레벨
		SuperLevel sLevel = new SuperLevel();
		player.upgradeLevel(sLevel);
		player.play(3);			
	}
}
