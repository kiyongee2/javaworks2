package window;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class JFrameSample1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Java Program"); 
		frame.setLocation(500, 400);   //�������� ��ġ
		frame.setSize(300, 200);       //������ ũ��
		
		JLabel label = new JLabel("Hello, �ڹ�", SwingConstants.CENTER);
		
		//�гο� �� ���̱�
		Container pane = frame.getContentPane(); 
		pane.add(label);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //����
		frame.setVisible(true);	  //������ ���÷���
	}
}
