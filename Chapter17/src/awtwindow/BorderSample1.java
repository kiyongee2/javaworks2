package awtwindow;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderSample1 {
	private Frame frame;
	private Button center, east, west, south;
	private TextField text;
	
	public BorderSample1() {
		frame = new Frame("BorderLayout ����");
		south = new Button("��ư1");  //��ư ����
		west = new Button("��ư2");
		east = new Button("��ư3");
		center = new Button("��ư4");
	
		text = new TextField();
		text.setText("�Է�â�Դϴ�.");
	}
	
	public void startFrame() {
		frame.add(text, "North");
		frame.add(east, "East");
		frame.add(west, "West");
		frame.add(south, "South");
		frame.add(center, "Center");
		
		frame.setSize(400, 500);  //������ ũ��
		frame.setVisible(true);   //ȭ�� ���̱�
	}

	public static void main(String[] args) {
		BorderSample1 border = new BorderSample1();
		border.startFrame();	
	}
}
