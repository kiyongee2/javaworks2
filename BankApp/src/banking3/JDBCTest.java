package banking3;

import java.util.ArrayList;

public class JDBCTest {

	public static void main(String[] args) {
		AccountDAO dao = new AccountDAO();
		//dao.connDB();
		
		//���� ����
		//Account newAccount = new Account("103", "park", 5000);
		//dao.createAccount();
		
		//���� ���
		dao.accountList();
		
	}

}
