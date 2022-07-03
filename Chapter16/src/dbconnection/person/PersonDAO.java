package dbconnection.person;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dbconnection.common.JDBCUtil;

public class PersonDAO {
	//JDBC ���� ����
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	//�ڷ� ����
	public void insertPerson(Person person) {
		try {
			conn = JDBCUtil.getConnention();  //DB ���� �޼��� ȣ��
			//SQL - DML ���, ���� ���� - ?��ȣ�� ������� ����
			String sql = "INSERT INTO person (userId, userPw, name, age) VALUES (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);      //���� ó��
			pstmt.setString(1, person.getUserId());
			pstmt.setString(2, person.getUserPw());
			pstmt.setString(3, person.getName());
			pstmt.setInt(4, person.getAge());
			
			pstmt.executeUpdate();    //db�� ����
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);  //���� ���� �޼��� ȣ��
		}
	}

	// �ڷ� ��� ��ȸ
	public ArrayList<Person> getPersonList(){
		ArrayList<Person> personList = new ArrayList<>();
		try {
			conn = JDBCUtil.getConnention();
			String sql = "SELECT * FROM person";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();     //���� ����
			while(rs.next()) {             //�ڷᰡ �ִٸ� ��� �ݺ�
				Person person = new Person();
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
				
				personList.add(person);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return personList;
	}
	
	//Ư�� �ڷ� �˻�
	public Person getPerson(String userId) {
		Person person = new Person();
		try {
			conn = JDBCUtil.getConnention();
			String sql = "SELECT * FROM person WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, userId);
			rs = pstmt.executeQuery();
			if(rs.next()) {    //�ڷᰡ �ִٸ�
				person.setUserId(rs.getString("userId"));
				person.setUserPw(rs.getString("userPw"));
				person.setName(rs.getString("name"));
				person.setAge(rs.getInt("age"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt, rs);
		}
		return person;
	}
	
	//�ڷ� ����
	public void updatePerson(Person person) {
		try {
			conn = JDBCUtil.getConnention();  
			String sql = "UPDATE person SET userPw = ?, name = ?, age = ? WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserPw());
			pstmt.setString(2, person.getName());
			pstmt.setInt(3, person.getAge());
			pstmt.setString(4, person.getUserId());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
	
	//�ڷ� ����
	public void deletePerson(Person person) {
		try {
			conn = JDBCUtil.getConnention();
			String sql = "DELETE FROM person WHERE userId = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, person.getUserId());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(conn, pstmt);
		}
	}
}//PersonDAO �ݱ�
