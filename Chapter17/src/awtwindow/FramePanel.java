package awtwindow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class FramePanel {

	public static void main(String[] args) {
		Frame frame = new Frame("��ư�׽�Ʈ"); 
		Panel panel = new Panel(); //�гλ���
			
		Button btn1 = new Button(); //��ư����
		Button btn2 = new Button("���");

		btn1.setLabel("�Է�");//��ư1�� �̸�����
		panel.add(btn1); //�гο� ��ư���̱�
		panel.add(btn2);
		frame.add(panel); //�����ӿ��� �гκ��̱�
			
		frame.setLocation(300,300); //��������ġ
		frame.setSize(300,100);
		frame.setVisible(true);
	}
}
