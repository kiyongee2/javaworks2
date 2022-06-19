package layout;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GridLayoutSample2 {

	public static void main(String[] args) {
		JFrame frm = new JFrame("����ó ���α׷�");
		frm.setSize(250, 150);
		frm.setLocation(500, 400);
		Container contentPane = frm.getContentPane();
		
		JPanel pane = new JPanel();
		pane.setLayout(new GridLayout(3, 2));
		JTextField text1 = new JTextField();
		JTextField text2 = new JTextField();
		JTextField text3 = new JTextField();
		
		pane.add(new JLabel("�̸�"));
		pane.add(text1);
		pane.add(new JLabel("�ּ�"));
		pane.add(text2);
		pane.add(new JLabel("��ȭ��ȣ"));
		pane.add(text3);
		contentPane.add(pane, "Center");
		contentPane.add(new JButton("�Է�"), "South");
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setVisible(true);
	}
}
