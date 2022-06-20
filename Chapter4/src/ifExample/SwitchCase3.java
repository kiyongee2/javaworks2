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
			default: System.out.println("메달이 없습니다.");
		}
		System.out.println(rank + "등 메달의 색깔은 " + medalColor + "입니다.");*/
		
		switch(medalColor){
			case "Gold":
				System.out.println("금메달 입니다.");
				//break;
			case "Silver":
				System.out.println("은메달 입니다.");
				//break;
			case "Bronze":
				System.out.println("동메달 입니다.");
				break;
			default:
				System.out.println("메달이 없습니다.");
				//break;
		}
	}

}
