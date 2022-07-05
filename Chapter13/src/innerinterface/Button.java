package innerinterface;

public class Button {
	
	OnClickListner listner;  //인터페이스형 필드 선언
	
	static interface OnClickListner{  //내부 인터페이스
		void onClick();
	}
	
	void setOnClickListner(OnClickListner listner) {
		this.listner = listner;
	}
	
	void touch() {
		listner.onClick();
	}
}
