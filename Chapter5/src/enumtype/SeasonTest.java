package enumtype;

public class SeasonTest {

	public static void main(String[] args) {
		Season season = null;
		season = Season.����;
		
		switch(season) {
		case ��:
			season = Season.��;
			break;
		case ����:
			season = Season.����;
			break;
		case ����:
			season = Season.����;
			break;
		case �ܿ�:
			season = Season.�ܿ�;
			break;
		}
		System.out.println("���� ������ " + season + "�Դϴ�.");
		
		if(season == Season.����) {
			System.out.println("�������� �帶�� �ɴϴ�.");
		}else {
			System.out.println("�������� �帶�� ���� �����ϴ�.");
		}
	}
}

