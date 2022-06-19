package windowsample.extend;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class JTabTest extends JFrame{
	JPanel pane1, pane2;
	ImageIcon icon;
	JLabel lbl;
	JTabbedPane tabPane;
	JTextField text;
	JTextArea textArea;
	
	public JTabTest() {
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		icon = new  ImageIcon("dogs.jpg");
		lbl = new JLabel(icon);   //�׸��� ��� ��
		
		text = new JTextField("�׽�Ʈ�Դϴ�.");
		pane1.add(text);
		
		textArea = new JTextArea(7, 20);  //7��. 20��
		textArea.setText("������ �Է��ϼ���. ");
		
		tabPane = new JTabbedPane();
		tabPane.addTab("��1", lbl);
		tabPane.addTab("��2", textArea);
		
		getContentPane().add(tabPane);   //Container�� contentPane
		setBounds(0, 0, 500, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new JTabTest();
	}
}
