package layout;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutSample {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Zoo Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		FlowLayout layout = new FlowLayout();
		contentPane.setLayout(layout);
		contentPane.add(new JButton("����"));
		contentPane.add(new JButton("���"));
		contentPane.add(new JButton("��"));
		contentPane.add(new JButton("�丶��"));
		contentPane.add(new JButton("�ٳ���"));
		contentPane.add(new JButton("��"));
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
