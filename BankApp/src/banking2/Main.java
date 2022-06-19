package banking2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ArrayList<Account> accountlist = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------------------------");
		    System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.���°˻� | 6.���»��� | 7.����");
		    System.out.println("----------------------------------------------------------------");
		    System.out.print("����> ");
		    
		    String selectNo = scanner.next();
		    if(selectNo.equals("1")) {
		    	createAccount();
		    }else if(selectNo.equals("2")){
		    	accountList();
		    }else if(selectNo.equals("3")) {
		    	deposit();
		    }else if(selectNo.equals("4")) {
		    	withdraw();
		    }else if(selectNo.equals("5")){
		    	searchAccount();
		    }else if(selectNo.equals("6")){
		    	deleteAccount();
		    }else if(selectNo.equals("7")) {
		    	run = false;
		    }else {
		    	System.out.println("�������� �ʴ� ����Դϴ�. �ٽ� �Է��ϼ���.");
		    }
		}
		System.out.println("���α׷� ����!!");
	}

	private static void deleteAccount() {
		System.out.println("-------");
	    System.out.println("���� ����");
	    System.out.println("-------");
	    
	    System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
	    
	    Account account = findAccount(ano);
	    
	    accountlist.remove(account);
	    System.out.println("���°� �����Ǿ����ϴ�.");	
		
	}

	private static void searchAccount() {
		System.out.println("-------");
	    System.out.println("���� �˻�");
	    System.out.println("-------");
	    
	    System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
	    
	    Account account = findAccount(ano);
	    System.out.print("���� ��ȣ:" + account.getAno() + "  ");
	    System.out.print("������:" + account.getOwner() + "  ");
	    System.out.println("�ܾ�:" + account.getBalance());
	}

	private static void withdraw() {
		System.out.println("-------");
	    System.out.println("��  ��");
	    System.out.println("-------");
	    
	    System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
		    
	    Account account = findAccount(ano);
	    
	    System.out.println("��ݾ� :");
	    int money = scanner.nextInt();
	    if(money > account.getBalance()) {
	    	System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է��ϼ���");
	    	System.out.println("��ݾ� :");
		    money = scanner.nextInt();
	    }
	    account.setBalance(account.getBalance() - money);
	    System.out.println("��� : ����� �����Ͽ����ϴ�."); 
	}

	private static void deposit() {
		System.out.println("-------");
	    System.out.println("��  ��");
	    System.out.println("-------");
	    
    	System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
	    Account account = findAccount(ano);
	    
	    System.out.println("�Աݾ� :");
	    int money = scanner.nextInt();
	    account.setBalance(account.getBalance() + money);
	    System.out.println("��� : �Ա��� �����Ͽ����ϴ�.");
	}

	private static Account findAccount(String ano) {
		//���� ��ȣ�� �˻�
		Account account = null;
		for(int i = 0; i < accountlist.size(); i++) {
			String dbAno = accountlist.get(i).getAno();
			if(dbAno.equals(ano)) {
				account = accountlist.get(i);
				break;
			}
		}
		return account;
	}

	private static void accountList() {
		System.out.println("-------");
	    System.out.println("���� ���");
	    System.out.println("-------");
	    
	    for(int i = 0; i < accountlist.size(); i++) {
	    	Account account = accountlist.get(i);
	    	System.out.print("���¹�ȣ : " + account.getAno() + "  ");
    		System.out.print("������ : " + account.getOwner() + "  ");
    		System.out.println("�ܾ� : " + account.getBalance());
	    }
	}

	private static void createAccount() {
		System.out.println("-------");
	    System.out.println("���� ����");
	    System.out.println("-------");
	    
	    //���¹�ȣ(�⺻Ű) �ߺ� ����
	    System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) != null) {
	    	System.out.println("�ߺ� �����Դϴ�. �ٽ� �Է��ϼ���");
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
		    
	    System.out.println("������ : ");
	    String owner = scanner.next();
	    
	    //�ʱ� �Աݾ� 100�� �̻� ����
	    System.out.println("�ʱ� �Աݾ� : ");
	    int balance = scanner.nextInt();
	    if(balance < 100) {
	    	System.out.println("�⺻ �Աݾ��� 100�� �̻��Դϴ�. �ٽ� �Է��ϼ���");
	    	System.out.println("�ʱ� �Աݾ� : ");
		    balance = scanner.nextInt();
	    }
	    
	    Account newAccount = new Account(ano, owner, balance); //���� ����
	    accountlist.add(newAccount);
	    System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	}
}
