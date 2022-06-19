package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PlusCalc {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Program");
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		JPanel pane1 = new JPanel();
		JPanel pane2 = new JPanel();
		
		contentPane.add(pane1, BorderLayout.CENTER);
		contentPane.add(pane2, BorderLayout.SOUTH);
		
		pane1.setLayout(new FlowLayout());
		JTextField text1 = new JTextField(5);
		JTextField text2 = new JTextField(5);
		JTextField text3 = new JTextField(5);
		
		pane1.add(text1);
		pane1.add(new JLabel("+"));
		pane1.add(text2);
		pane1.add(new JLabel("="));
		pane1.add(text3);
		
		pane2.setLayout(new FlowLayout());
		JButton button1 = new JButton("Ȯ��");
		JButton button2 = new JButton("���");
		pane2.add(button1);
		pane2.add(button2);
		
		ActionListener listener = new ActionListener() {
			@Override   //Ȯ�� ��ư ó�� -�͸� ��ü ����
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(text1.getText());
				int num2 = Integer.parseInt(text2.getText());
				int sum = num1 + num2;
				//text3.setText(String.valueOf(sum));
				text3.setText(sum + "");
			}
		};
		button1.addActionListener(listener);
		
		ActionListener listener2 = new ActionListener() {
			@Override    //��� ��ư ó�� - �͸� ��ü ����
			public void actionPerformed(ActionEvent e) {
				text1.setText(" ");
				text2.setText(" ");
				text3.setText(" ");
			}
		};
		button2.addActionListener(listener2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
