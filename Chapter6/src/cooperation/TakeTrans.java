package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		Student james = new Student("james", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		Subway subwayBlue = new Subway("4호선");
		james.takeBus(bus100);
		james.takeSubway(subwayBlue );
		james.showInfo();
		bus100.showInfo();
		subwayBlue.showInfo();
		
		Subway subwayGreen = new Subway("2호선");
		tomas.takeSubway(subwayGreen);
		tomas.showInfo();
		subwayGreen.showInfo();
		
		Student Edward = new Student("Edward", 20000);
		Taxi taxi = new Taxi("카카오");
		Edward.takeTaxi(taxi);
		Edward.showInfo();
		taxi.showInfo();
	}
}
