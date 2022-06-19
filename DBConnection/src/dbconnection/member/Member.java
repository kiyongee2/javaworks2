package dbconnection.member;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Member extends JFrame{
	JLabel lbl1, lbl2, lbl3, lbl4;
	JTextField txt1, txt2, txt3, txt4;
	JButton save, cancel;
	
	public Member() {
		lbl1 = new JLabel("���̵�");
		lbl2 = new JLabel("�н�����");
		lbl3 = new JLabel("�̸�");
		lbl4 = new JLabel("����");
		txt1 = new JTextField();
		txt2 = new JTextField();
		txt3 = new JTextField();
		txt4 = new JTextField();
		save = new JButton("����");
		cancel = new JButton("���");
		
		JPanel pane = new JPanel();
		pane.setLayout(null);
		add(lbl1);
		add(txt1);
		add(lbl2);
		add(txt2);
		add(lbl3);
		add(txt3);
		add(lbl4);
		add(txt4);
		add(save);
		add(cancel);
		
		lbl1.setBounds(60, 50, 60, 40);
		txt1.setBounds(130, 50, 120, 40);
		lbl2.setBounds(60, 100, 60, 40);
		txt2.setBounds(130, 100, 120, 40);
		lbl3.setBounds(60, 150, 60, 40);
		txt3.setBounds(130, 150, 120, 40);
		lbl4.setBounds(60, 200, 60, 40);
		txt4.setBounds(130, 200, 120, 40);
		save.setBounds(70, 270, 80, 40);
		cancel.setBounds(160, 270, 80, 40);
		
		add(pane);
		setTitle("ȸ������ ȭ��");
		setLocation(600, 300);
		setSize(350, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				MemberVO vo = new MemberVO(txt1.getText(), txt2.getText(), txt3.getText(), Integer.parseInt(txt4.getText()));
				MemberDAO dao = new MemberDAO();
				
				dao.addMember(vo);
				JOptionPane.showMessageDialog(null, "ȸ�������� �����մϴ�.");
				dispose();
			}
			
		});
		
		cancel.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
