package tire;

public class Tire {
	//필드
	public int maxRotation;         //최대 회전수
	public int accmulatedRotation;  //누적 회전수
	public String location;         //타이어 위치
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메서드
	public boolean roll() {
		++accmulatedRotation;  //누적 회전수 1증가
		if(accmulatedRotation < maxRotation ) { //누적 < 최대
			System.out.println(location + " Tire 수명: " + 
					(maxRotation-accmulatedRotation) + "회" );  //정상 회전
			return true;
		}else { //누적 >= 최대
			System.out.println("*** " + location + " Tire 펑크 ***" );
			return false;
		}
	}
}
