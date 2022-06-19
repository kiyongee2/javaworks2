package table;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableModel;

public class JTableTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("������ ���");
		frame.setSize(350, 150);
		frame.setLocation(500, 400);
		Container contentPane = frame.getContentPane();
		
		String colName[] = {"�̸�", "����", "����"};   //Į�� �̸� -������ �迭
		Object data[][] = { {"��׷�", 24, "��"},     //������ - ������ �迭
				            {"�ȿ���", 26, "��"},
				            {"��븮", 33, "��"}};
		
		JTable table = new JTable(data, colName);  //���̺� ����
		
		JScrollPane scrollPane = new JScrollPane(table);  //ǥ�� ��� �г�
		contentPane.add(scrollPane, "Center");
		
		JButton btn = new JButton("���");
		contentPane.add(btn, "South");
		
		//PrintActionListner ��ü ����
		ActionListener listener = new PrintActionListener(table);
		btn.addActionListener(listener);
		
		//�͸� ��ü ����
		ActionListener listener2 = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TableModel model = table.getModel();
				int rowNum = model.getRowCount();    //�𵨷� ���� ��� ���� ���� ��������
				int colNum = model.getColumnCount();
				
				for(int col=0; col < colNum; col++) {  //Į�� �̸� ���
					String colName = model.getColumnName(col);
					System.out.print(colName + "\t");
				}
				System.out.println();
				
				for(int row=0; row < rowNum; row++) {
					for(int col=0; col < colNum; col++) {
						Object obj = model.getValueAt(row, col);
						System.out.print(obj + "\t");
					}
					System.out.println();
				}
			}
		};
		btn.addActionListener(listener2);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
