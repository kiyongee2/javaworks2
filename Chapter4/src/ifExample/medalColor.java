package ifExample;

public class medalColor {

	public static void main(String[] args) {
		
		String medalColor = "Gold";
		
		switch(medalColor){
			case "Gold":
				System.out.println("�ݸ޴� �Դϴ�.");
				break;
			case "Silver":
				System.out.println("���޴� �Դϴ�.");
				break;
			case "Bronze":
				System.out.println("���޴� �Դϴ�.");
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
				break;
		}
	}
}
