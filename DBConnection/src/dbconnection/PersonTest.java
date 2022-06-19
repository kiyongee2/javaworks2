package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PersonTest {
	private static final String driver="oracle.jdbc.driver.OracleDriver";
	private static final String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private static final String user="scott";
	private static final String pwd="tiger";

	public static void main(String[] args) {
		Connection conn;
		Statement stmt;
		ResultSet rs;
		try {
			Class.forName(driver);
			System.out.println("Oracle ����̹� �ε� ����");
			conn = DriverManager.getConnection(url,user, pwd);
			System.out.println("Connection ���� ����");
			
			stmt = conn.createStatement();
			System.out.println("Statement ��ü ���� ����");
			
			String query1 = "insert into Person values('0002', '������', 33)";
			System.out.println(query1);
			stmt.executeUpdate(query1);
			
			String query2 = "select * from Person";
			System.out.println(query2);
			
			rs = stmt.executeQuery(query2);
			while(rs.next()) {
				System.out.print("���̵� : " + rs.getString("id"));
				System.out.print(", �̸� : " + rs.getString("name"));
				System.out.println(", ���� : " + rs.getInt("age"));
			}
			rs.close();
			stmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
