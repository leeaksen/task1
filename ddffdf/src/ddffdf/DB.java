package ddffdf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	private Connection con;
	public DB() {
		try
		{
			String url = "jdbc:mysql://localhost/?characterEncoding=UTF-8&serverTimezone=UTC";
			String user = "root";
			String passwd = "1127";
			con = DriverManager.getConnection(url, user, passwd);
			con.close();
			System.out.println("DB연결 성공");
		}
	catch (SQLException e)
	{
		System.out.println("DB연결 실패");
		System.out.print("사유 : " + e.getMessage());
	}
	}

	public static void main(String[] args) {
		new DB();
	}
}
