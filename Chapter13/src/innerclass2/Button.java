package innerclass2;

public class Button {
	
	OnClickListner listner;  //�������̽��� �ʵ� ����
	
	interface OnClickListner{  //���� �������̽�
		void onClick();
	}
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
}
