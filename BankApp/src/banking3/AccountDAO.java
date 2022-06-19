package banking3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountDAO {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url="jdbc:oracle:thin:@localhost:1522:xe";
	private static final String username="system";
	private static final String password="54321";
	
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	private Scanner scanner = new Scanner(System.in);
	
	//DB ����
	public void connDB() {
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, username, password);
			//System.out.println("DB ���� ����!!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	//���� ����
	private void disconnect() {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//���� ����(ResultSet �ִ� ���)
	private void disconnectRS() {
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	//���� ����
	public void createAccount() {
		System.out.println("---------------------------------");
	    System.out.println("1. ���� ����");
	    System.out.println("---------------------------------");
	    
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
		
		connDB();
		String sql = "INSERT INTO account(ano, owner, balance) VALUES (?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.setString(2, owner);
			pstmt.setInt(3, balance);
			pstmt.executeUpdate();
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//���� ���
	public void accountList(){
		System.out.println("---------------------------------------");
	    System.out.println("2. ���� ���");
	    System.out.println("---------------------------------------");
	    
		ArrayList<Account> accountList = new ArrayList<>();
		connDB();
		String sql = "SELECT * FROM account";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				Account account = new Account(ano, owner, balance);
				accountList.add(account);
			}
			
			for(int i = 0; i < accountList.size(); i++) {
		    	Account account = accountList.get(i);
		    	System.out.print("���¹�ȣ : " + account.getAno() + "  ");
	    		System.out.print("������ : " + account.getOwner() + "  ");
	    		System.out.println("�ܾ� : " + account.getBalance());
		    }
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
	}
	
	//����
	public void deposit() {
		System.out.println("---------------------------------");
	    System.out.println("3. ��  ��");
	    System.out.println("---------------------------------");
	    
    	System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
    	System.out.println("�Աݾ� :");
	    int money = scanner.nextInt();
	    
		Account account = findAccount(ano);  //�Ա��� ���� ������
		String owner = account.getOwner();
		int balance = account.getBalance() + money;  //�ܾ� = �ܾ� + �Աݾ�
	
		connDB();
		String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.executeUpdate();
			System.out.println("��� : �Ա��� �����߽��ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//���
	public void withdraw() {
		System.out.println("---------------------------------");
	    System.out.println("4. ��  ��");
	    System.out.println("---------------------------------");
	    
	    System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
	    
	    System.out.println("��ݾ� :");
	    int money = scanner.nextInt();
	    
	    Account account = findAccount(ano);
//	    ano = account.getAno();
	    String owner = account.getOwner();
		int balance = account.getBalance();
	    if(account.getBalance() < money) {
	    	System.out.println("�ܾ��� �����մϴ�. �ٽ� �Է��ϼ���");
	    	System.out.println("��ݾ� :");
		    money = scanner.nextInt();
	    }
	    balance = account.getBalance() - money;
	    
		connDB();
		String sql = "UPDATE account SET owner = ?, balance = ?  WHERE ano = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, owner);
			pstmt.setInt(2, balance);
			pstmt.setString(3, ano);
			pstmt.executeUpdate();
			System.out.println("��� : ����� �����߽��ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}
	}
	
	//Ư�� ���� 1�� �˻�
	public void searchAccount() {
		System.out.println("------------------------------------");
	    System.out.println("5.���� �˻�");
	    System.out.println("------------------------------------");
	    
    	System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
	    
	    Account account = findAccount(ano);
	    System.out.print("���¹�ȣ : " + account.getAno() + "  ");
		System.out.print("������ : " + account.getOwner() + "  ");
		System.out.println("�ܾ� : " + account.getBalance());
	}
	
	//���� ����
	public void deleteAccount() {
		System.out.println("-------------------------------");
	    System.out.println("6. ���� ����");
	    System.out.println("-------------------------------");
	    
    	System.out.println("���� ��ȣ :");
	    String ano = scanner.next();
	    if(findAccount(ano) == null) {
	    	System.out.println("���°� �����ϴ�. �ٽ� �Է��ϼ���");	
	    	System.out.println("���� ��ȣ :");
		    ano = scanner.next();
	    }
	    
		connDB();
		String sql = "DELETE FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			pstmt.executeUpdate();
			System.out.println("��� : ���°� �����Ǿ����ϴ�.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnect();
		}		
	}
	
	//���� ã�� �޼���(��ü �޼��忡�� ����)
	public Account findAccount(String ano) {
		Account account = null;
		connDB();
		String sql = "SELECT * FROM account WHERE ano = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, ano);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				ano = rs.getString("ano");
				String owner = rs.getString("owner");
				int balance = rs.getInt("balance");
				
				account = new Account(ano, owner, balance);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			disconnectRS();
		}
		return account;
	}
}











