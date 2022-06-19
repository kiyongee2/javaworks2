package combobox;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Exchange extends JFrame implements ActionListener{
	private static float USD_RATE = 1099.48F;
    private static float JPY_RATE = 10.64F;
    private static float EUR_RATE = 1347.69F;
    private static float CNY_RATE = 168.19F;
	
	String[] money = {"�޷�", "��", "����", "����"};
	JComboBox<String> combo;
	JPanel pane1, pane2;
	JLabel lbl;
	JTextField txt;
	JButton btn;
	
	public Exchange() {
		combo = new JComboBox<>(money);
		Container con = getContentPane(); 
		
		setTitle("ȯ�� ����ϱ�");
		pane1 = new JPanel();
		pane2 = new JPanel();
		
		lbl = new JLabel("��ȯ ���");
		txt = new JTextField(10);
		btn = new JButton("��ȯ");
		
		con.add(pane1, "North");
		con.add(pane2, "Center");

		pane1.add(new JLabel("��ȭ"));
		pane1.add(txt);
		pane1.add(combo);
		pane1.add(btn);
		
		pane2.add(lbl);
		
		setSize(350, 150);
		setLocation(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		btn.addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		calculate();
	}
	
	private void calculate(){
		try {
			float won = Float.parseFloat(txt.getText());
			String result = null;
			String money = combo.getSelectedItem().toString();
			
			if(money.equals("�޷�")) {
				result = String.format("%.2f�޷�", won / USD_RATE);
			}else if(money.equals("��")) {
				result = String.format("%.2f��", won / JPY_RATE);
			}else if(money.equals("����")) {
				result = String.format("%.2f����", won / EUR_RATE);
			}else if(money.equals("����")) {
				result = String.format("%.2f����", won / CNY_RATE);
			}
			lbl.setText(result);
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		try {
			new Exchange();
		}catch(Exception e) {
			System.out.println("���ڸ� �Է��ϼ̽��ϴ�.");
		}
	}
}
