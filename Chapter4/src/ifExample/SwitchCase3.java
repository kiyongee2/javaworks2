package ifExample;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		//int rank = 1;
		String medalColor = "Gold";
		/*
		switch(rank) {
			case 1: medalColor = "Gold";
					break;
			case 2: medalColor = "Silver";
					break;
			case 3: medalColor = "Bronze";
					break;
			default: System.out.println("�޴��� �����ϴ�.");
		}
		System.out.println(rank + "�� �޴��� ������ " + medalColor + "�Դϴ�.");*/
		
		switch(medalColor){
			case "Gold":
				System.out.println("�ݸ޴� �Դϴ�.");
				//break;
			case "Silver":
				System.out.println("���޴� �Դϴ�.");
				//break;
			case "Bronze":
				System.out.println("���޴� �Դϴ�.");
				break;
			default:
				System.out.println("�޴��� �����ϴ�.");
				//break;
		}
	}

}
