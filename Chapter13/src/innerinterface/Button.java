package innerinterface;

public class Button {
	
	OnClickListner listner;  //�������̽��� �ʵ� ����
	
	static interface OnClickListner{  //���� �������̽�
		void onClick();
	}
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
}
