package enumtype;

enum Level{  //������ ���
	LOW,
	MEDIUM,
	HIGH
}

public class EnumLevel {
	public static void main(String[] args) {
		Level level = Level.HIGH; //����̹Ƿ� new�� ������� ����
		
		switch(level) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		default:
			System.out.println("������ �����ϴ�.");
			break;
		}
	}
}

