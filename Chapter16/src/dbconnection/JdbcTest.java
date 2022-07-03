package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTest {
		
	private static String driverClass = "oracle.jdbc.OracleDriver";      //����Ŭ ����̹�
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";   //db ��� ��Ʈ-1521
	private static String username = "system";                           //����� �̸�
	private static String password = "12345";                            //����� ��й�ȣ
	

	public static void main(String[] args) {
		//���� ��ü ����
		Connection conn = null;
		
		try {
			Class.forName(driverClass);
			System.out.println("Oracle ����̹� �ε�");
			conn = DriverManager.getConnection(url, username, password);
			System.out.println("Connection ��ü ���� : " + conn);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
