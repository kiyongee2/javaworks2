package banking1;

import java.util.Scanner;

public class Main {
	//Account�� �迭 ���� 100�� �غ� 
	private static Account[] accountArray = new Account[100];  
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
		    System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
		    System.out.println("-------------------------------------------");
		    System.out.print("����> ");
		    
		    String selectNo = scanner.next();
		    if(selectNo.equals("1")) {
		    	createAccount();  //���� ����
		    }else if(selectNo.equals("2")){
		    	accountList();    //���� ���
		    }else if(selectNo.equals("3")) {
		    	deposit();        //����
		    }else if(selectNo.equals("4")) {
		    	withdraw();       //���
		    }else if(selectNo.equals("5")){
		    	run = false;      //���α׷� ����
		    }else{
		    	System.out.println("�������� �ʴ� ����Դϴ�.");
		    }
		}
		System.out.println("���α׷� ����!!");
	}

	private static void withdraw() {
		System.out.println("-------");
	    System.out.println("���");
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
	    System.out.println("����");
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
		//���¹�ȣ�� �˻�
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
	    	if(accountArray[i] != null) {
	    		String dbAno = accountArray[i].getAno();
	    		if(dbAno.equals(ano)) {
	    			account = accountArray[i];
	    			break;
	    		}
	    	}
	    }
		return account;
	}

	private static void accountList() {
		System.out.println("-------");
	    System.out.println("���� ���");
	    System.out.println("-------");
	    
	    for(int i=0; i<accountArray.length; i++) {
	    	Account account = accountArray[i];
	    	if(account != null) {
	    		System.out.print("���¹�ȣ : " + account.getAno() + "  ");
	    		System.out.print("������ : " + account.getOwner() + "  ");
	    		System.out.println("�ܾ� : " + account.getBalance());
	    	}
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
	    for(int i=0; i<accountArray.length; i++) {
	    	if(accountArray[i] == null) {
	    		accountArray[i] = newAccount;
	    		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
	    		break;
	    	}
	    }
	}
}
