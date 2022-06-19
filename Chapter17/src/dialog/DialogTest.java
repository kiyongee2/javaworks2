package dialog;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DialogTest extends JFrame implements ActionListener {
	JLabel lbl = new JLabel("���̾�α� �׽�Ʈ");
	JButton btn1 = new JButton("ù��° ���̾�α� ����");
	JButton btn2 = new JButton("�ι�° ���̾�α� ����");
	Dialog1 dlg1;
	
	public DialogTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new GridLayout(3, 0));
		getContentPane().add(lbl);
		getContentPane().add(btn1);
		getContentPane().add(btn2);
		
		this.setLocation(200, 200);
		setSize(300, 300);
		setVisible(true);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);	
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource()==btn1) {
			dlg1 = new Dialog1(arg0.getActionCommand() + " ��ư�� �����̳׿�!");
		}else if(arg0.getSource()==btn2) {
			new Dialog2(this, lbl, "�ι�° ���̾�α��Դϴ�.");
		}
	}

	public static void main(String[] args) {
		new DialogTest();
	}
}
