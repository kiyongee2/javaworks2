package banking;

import java.util.Scanner;

public class Main {
	
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
				createAccount();     //���� ����
			}else if(selectNo.equals("2")) {
				accountList();       //���� ���
			}else if(selectNo.equals("3")) {
				deposit();           //����
			}else if(selectNo.equals("4")) {
				withdraw();          //���
			}else if(selectNo.equals("5")) {
				run = false;         //����
			}else {
				System.out.println("�������� �ʴ� ����Դϴ�.");
			}
		}//while �ݱ�
		System.out.println("���α׷� ����!");
	}//main �ݱ�

	//���� ����
	private static void createAccount() {
		System.out.println("--------------------------");
		System.out.println("���� ����");
		System.out.println("--------------------------");
		
		System.out.println("���� ��ȣ: ");
		String ano = scanner.next();
		
		System.out.println("������: ");
		String owner = scanner.next();
		
		System.out.println("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		
		//���� ��ü ����
		Account newAccount = new Account(ano, owner, balance); 
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				accountArray[i] = newAccount;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
	}

	//���� ���
	private static void accountList() {
		System.out.println("-----------------------------------------");
		System.out.println("���� ���");
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];
			if(account != null) {
				System.out.print("���¹�ȣ: " + account.getAno() + "\t");
				System.out.print("������: " + account.getOwner() + "\t");
				System.out.println("�ܾ�: " + account.getBalance());
			}
		}
	}

	//����
	private static void deposit() {
		System.out.println("--------------------------");
		System.out.println("����");
		System.out.println("--------------------------");
		
		System.out.println("���� ��ȣ: ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);  //�˻��� ���� ��ȯ
		
		System.out.println("�Աݾ�: ");
		int money = scanner.nextInt();
		account.setBalance(account.getBalance() + money);
		System.out.println("���: �Ա��� �����Ͽ����ϴ�.");
	}

	//���
	private static void withdraw() {
		System.out.println("--------------------------");
		System.out.println("���");
		System.out.println("--------------------------");
		
		System.out.println("���� ��ȣ: ");
		String ano = scanner.next();
		
		Account account = findAccount(ano);
		
		System.out.println("��ݾ�: ");
		int money = scanner.nextInt();
		account.setBalance(account.getBalance() - money);
		System.out.println("���: ����� �����Ͽ����ϴ�.");	
	}
	
	//���� ã��
	private static Account findAccount(String ano) {
		Account account = null;  //ã�� ���� ��ü ����
		for(int i=0; i<accountArray.length; i++) {
			String dbAno = accountArray[i].getAno(); //�̹� ����� ���¸� �����ͼ�
			if(dbAno.equals(ano)) { //ã�� ����(ano)�� ��ġ�Ѵٸ�
				account = accountArray[i]; //�迭�� ����� ���� ����
				break;
			}
		}
		return account;
	}
}
