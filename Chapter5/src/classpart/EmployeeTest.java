package classpart;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee jang = new Employee();
		jang.companyID = 1001;
		jang.name = "��׷�";
		
		System.out.println(jang.getCompanyID());
		System.out.println(jang.getName());
		
		Employee sunmi = new Employee();
		sunmi.companyID = 1002;
		sunmi.name = "�ڼ���";
		
		System.out.println(sunmi.getCompanyID());
		System.out.println(sunmi.getName());
	}
}
