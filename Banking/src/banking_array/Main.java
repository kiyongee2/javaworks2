package banking_array;

import java.util.Scanner;

import banking_arraylist.Account;

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
		
		while(true) {
			System.out.println("���� ��ȣ: ");
			String ano = scanner.next();
			if(findAccount(ano) != null) {
		    	System.out.println("�ߺ� �����Դϴ�. �ٽ� �Է��ϼ���");
		    }else {
				System.out.println("������: ");
				String owner = scanner.next();
				
				while(true) {
					System.out.println("�ʱ� �Աݾ� : ");
				    int balance = scanner.nextInt();
				    if(balance < 100) {
				    	System.out.println("�⺻ �Աݾ��� 100�� �̻��Դϴ�. �ٽ� �Է��ϼ���");
				    }else {
					    Account newAccount = new Account(ano, owner, balance); //���� ����
					    for(int i=0; i<accountArray.length; i++) {
					    	if(accountArray[i] == null) {
					    		accountArray[i] = newAccount;
					    		System.out.println("��� : ���°� �����Ǿ����ϴ�.");
					    		break;
					    	}
					    }
					    break;
				    } //���� while
				}
				break;
		    }
		}//�ٱ� while
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
		
		while(true) {
			System.out.println("���� ��ȣ: ");
			String ano = scanner.next();
			//�Է��� ���°� ������ ó��
			if(findAccount(ano) == null) {
				System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");
			}else {
				Account account = findAccount(ano);  //�˻��� ���� ��ȯ
				while(true) {
					System.out.println("�Աݾ�: ");
					int money = scanner.nextInt();
					if(money <= 0) {
						System.out.println("������ �Է��� �� �����ϴ�. �ٽ� �Է��ϼ���");
					}else {
						account.setBalance(account.getBalance() + money);
						System.out.println("���: �Ա��� �����Ͽ����ϴ�.");
						break;
					}
				}//���� while
				break;
			}
		}//�ٱ��� while
	}

	//���
	private static void withdraw() {
		System.out.println("--------------------------");
		System.out.println("���");
		System.out.println("--------------------------");
		
		while(true) {
			System.out.println("���� ��ȣ: ");
			String ano = scanner.next();
			
			//�Է��� ���°� ������ ó��
			if(findAccount(ano) == null) {
				System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");
			}else {
				Account account = findAccount(ano);
				while(true) {
					System.out.println("��ݾ�: ");
					int money = scanner.nextInt();
					if(money > account.getBalance()) {
						System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է��ϼ���");
					}else if(money < 0) {
						System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���");
					}else {
						account.setBalance(account.getBalance() - money);
						System.out.printf("%,d�� ���� ��ݵǾ����ϴ�.\n", money);
						break;
					}
				}//���� while
				break;
			}
		}//�ٱ��� while
	}
	
	//���� ã��
	private static Account findAccount(String ano) {
		Account account = null;  //ã�� ���� ��ü ����
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno(); //�̹� ����� ���¸� �����ͼ�
				if(dbAno.equals(ano)) { //ã�� ����(ano)�� ��ġ�Ѵٸ�
					account = accountArray[i]; //�迭�� ����� ���� ����
					break;
				}
			}
		}
		return account;
	}
}