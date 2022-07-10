package genericex.threedprinter;

public class GenericPrinterTest {

	public static void main(String[] args) {
		//powderPrinter ��ü ����
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		//Powder Type
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powder);
		
		//plasticPrinter ��ü ����
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		//Plastic Type
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plastic.toString());
	} 
}
