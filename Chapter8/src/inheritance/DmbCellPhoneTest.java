package inheritance;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone dmbPhone = new DmbCellPhone("�ڹ���","����", 10);
		
		System.out.println("�� : "+dmbPhone.model);
		System.out.println("���� : "+dmbPhone.color);
		System.out.println("ä�� : "+dmbPhone.channel);
		dmbPhone.powerOn();
		dmbPhone.bell();
		dmbPhone.sendVoice("��������");
		dmbPhone.receiveVoice("�ȳ��ϼ���! ���� ȫ�浿�ε���");
		dmbPhone.sendVoice("��~ �� �ݰ����ϴ�.");
		dmbPhone.hangUp();
		dmbPhone.turnOnDmb();
		dmbPhone.changeChannelDmb(12);
		dmbPhone.turnOffDmb();
	}

}
