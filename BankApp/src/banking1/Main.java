package banking1;

import java.util.Scanner;

public class Main {
	//Account형 배열 공간 100개 준비 
	private static Account[] accountArray = new Account[100];  
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		
		while(run) {
			System.out.println("-------------------------------------------");
		    System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
		    System.out.println("-------------------------------------------");
		    System.out.print("선택> ");
		    
		    String selectNo = scanner.next();
		    if(selectNo.equals("1")) {
		    	createAccount();  //계좌 생성
		    }else if(selectNo.equals("2")){
		    	accountList();    //계좌 목록
		    }else if(selectNo.equals("3")) {
		    	deposit();        //예금
		    }else if(selectNo.equals("4")) {
		    	withdraw();       //출금
		    }else if(selectNo.equals("5")){
		    	run = false;      //프로그램 종료
		    }else{
		    	System.out.println("지원되지 않는 기능입니다.");
		    }
		}
		System.out.println("프로그램 종료!!");
	}
	
	private static void createAccount() {
		System.out.println("-------");
	    System.out.println("계좌 생성");
	    System.out.println("-------");
	    
	    //계좌번호(기본키) 중복 문제
	    while(true) {
		    System.out.println("계좌 번호 :");
		    String ano = scanner.next();
		    if(findAccount(ano) != null) {
		    	System.out.println("중복 계좌입니다. 다시 입력하세요");
		    }else {
			    System.out.println("계좌주 : ");
			    String owner = scanner.next();
			    
			    //초기 입금액 100원 이상 설정
			    while(true) {
				    System.out.println("초기 입금액 : ");
				    int balance = scanner.nextInt();
				    if(balance < 100) {
				    	System.out.println("기본 입금액은 100원 이상입니다. 다시 입력하세요");
				    }else {
					    Account newAccount = new Account(ano, owner, balance); //계좌 생성
					    for(int i=0; i<accountArray.length; i++) {
					    	if(accountArray[i] == null) {
					    		accountArray[i] = newAccount;
					    		System.out.println("결과 : 계좌가 생성되었습니다.");
					    		break;
					    	}
					    }
					    break;
				    } 
			    }//안쪽 while 닫기
		    }
		    break;
	    }//바깥쪽 while 닫기
	}
	
	private static void accountList() {
		System.out.println("-------");
	    System.out.println("계좌 목록");
	    System.out.println("-------");
	    
	    for(int i=0; i<accountArray.length; i++) {
	    	Account account = accountArray[i];
	    	if(account != null) {
	    		System.out.print("계좌번호 : " + account.getAno() + "  ");
	    		System.out.print("계좌주 : " + account.getOwner() + "  ");
	    		System.out.println("잔액 : " + account.getBalance());
	    	}
	    }
	}

	private static void deposit() {
		System.out.println("-------");
	    System.out.println("예금");
	    System.out.println("-------");
	    
	    while(true) {
	    	System.out.println("계좌 번호 :");
		    String ano = scanner.next();
		    if(findAccount(ano) == null) {
		    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
		    }else {
			    Account account = findAccount(ano);   //계좌 객체 생성
			    while(true) {
				    System.out.println("입금액 :");
				    int money = scanner.nextInt();
				    if(money < 0) {
				    	System.out.println("잘못된 입력입니다. 다시 입력하세요");
				    }else {
				    	account.setBalance(account.getBalance() + money);
				    	System.out.printf("%,d원 정상 입금되었습니다.\n", money);
					    break;
				    }
			    }
			    break;
		    }
	    }
	}

	private static void withdraw() {
		System.out.println("-------");
	    System.out.println("출금");
	    System.out.println("-------");
	    
	    while(true) {
		    System.out.println("계좌 번호 :");
		    String ano = scanner.next();
		    if(findAccount(ano) == null) {
		    	System.out.println("계좌가 없습니다. 다시 입력하세요");	
		    }else {
			    Account account = findAccount(ano);
			    while(true) {
			    	System.out.println("출금액 :");
				    int money = scanner.nextInt();
				    if(money > account.getBalance()) {
				    	System.out.println("잔액이 부족합니다. 다시 입력하세요");
				    }else if(money < 0) {
				    	System.out.println("잘못된 입력입니다. 다시 입력하세요");
				    }else {
				    	account.setBalance(account.getBalance() - money);
				    	System.out.printf("%,d원 정상 출금되었습니다.\n", money);
					    break;
				    }
			    }
			    break;
		    }
	    }
	}

	private static Account findAccount(String ano) {
		//계좌번호로 검색
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
}
