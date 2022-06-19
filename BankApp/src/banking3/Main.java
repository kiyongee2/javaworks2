package banking3;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		
		while(run) {
			System.out.println("----------------------------------------------------------------");
		    System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���°˻� | 6.���»��� | 7.����");
		    System.out.println("----------------------------------------------------------------");
		    System.out.print("����> ");
		    
		    String selectNo = scanner.next();
		    if(selectNo.equals("1")) {
		    	dao.createAccount();
		    }
		    else if(selectNo.equals("2")){
		    	dao.accountList();
		    }
		    else if(selectNo.equals("3")) {
		    	dao.deposit();
		    }
		    else if(selectNo.equals("4")) {
		    	dao.withdraw();
		    }
		    else if(selectNo.equals("5")){
		    	dao.searchAccount();
		    }
		    else if(selectNo.equals("6")){
		    	dao.deleteAccount();
		    }
		    else if(selectNo.equals("7")){
		    	run = false;
		    }
		    else{
		    	System.out.println("�������� �ʴ� ����Դϴ�.");
		    }
		}
		System.out.println("���α׷� ����!!");
		scanner.close();
	}
}
