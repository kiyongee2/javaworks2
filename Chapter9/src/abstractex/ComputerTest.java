package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		//Computer c1 = new Computer();   //�ν��Ͻ��� ������ �� ����.
		Computer c2 = new DeskTop();      //�� ��ȯ
		//Computer c3 = new NoteBook();
		Computer c4 = new MyNoteBook();
		
		c2.display();
		c4.display();
	}
}
