package combobox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBox extends JFrame implements ActionListener{
	String[] money = {"�޷�", "��", "����", "����"};
	JComboBox<String> combo;
	JLabel lbl;
	
	public ComboBox() {
		combo = new JComboBox<>(money);
		lbl = new JLabel("ȭ�� ����");
		
		getContentPane().add(combo, "North");
		getContentPane().add(lbl, "Center");
		
		setSize(300, 150);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		combo.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String result = combo.getSelectedItem().toString();
		lbl.setText(result + "�� �����ϼ̳׿�.");
	}
	
	public static void main(String[] args) {
		new ComboBox();
	}
}
