package genericex.threedprinter;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//powderPrinter 梓端 持失
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		//Powder Type
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		//plasticPrinter 梓端 持失
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		//Plastic Type
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic.toString());
	} 
}
