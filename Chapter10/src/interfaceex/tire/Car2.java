package interfaceex.tire;

public class Car2 {
	//�ʵ�
	Tire[] tires = {
		new HanTire(),
		new HanTire(),
		new KumTire(),
		new KumTire()
	};
	
	//�޼���
	void run() {
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}
