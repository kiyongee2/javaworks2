package ifExample;

public class Ranking {

	public static void main(String[] args) {
		int rank = 1;
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
					break;
			case 2: medalColor = 'S';
					break;
			case 3: medalColor = 'B';
					break;
			default: medalColor = 'A';
		}
		System.out.println(rank + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
		
		//if������ ȣȯ
		if(rank == 1) {
			medalColor = 'G';
		}
		else if(rank == 2) {
			medalColor = 'S';
		}
		else if(rank == 3) {
			medalColor = 'B';
		}
		else {
			medalColor = 'A';
		}
		System.out.println(rank + "�� �޴��� ������ " + medalColor + "�Դϴ�.");
	}

}
