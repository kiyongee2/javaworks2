package dialog;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class Dialog1 extends JDialog{
	JLabel lbl = new JLabel("");
	ImageIcon icon1;
	
	public Dialog1(String str) {
		getContentPane().add(lbl);
		
		icon1 = new ImageIcon("rose.png");
		lbl.setIcon(icon1);

		setTitle(str);
		setLocation(200, 200);
		setSize(400, 400);
		setModal(true);  //�θ�â ���� ����(�θ�â ���� �ȵ�)
		setVisible(true);
	}
}
