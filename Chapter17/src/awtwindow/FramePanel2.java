package awtwindow;

import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextField;

public class FramePanel2 {

	public static void main(String[] args) {
		Frame frame =new Frame("�ؽ�Ʈ�ʵ� �׽�Ʈ"); 
		Panel panel = new Panel(); 
			
		TextField text1 = new TextField("���̵� �Է�",12); //�ؽ�Ʈ�ʵ����
		TextField text2 = new TextField("��ȣ �Է�",10);
			
		text2.setEchoChar('*'); //���ڰ� *�� ����
			
		panel.add(text1);//�гο� �ؽ�Ʈ�ʵ� �������
		panel.add(text2);
		frame.add(panel);
			
		frame.setSize(300,100); 
		frame.setVisible(true); 
	}
}
