
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JDBCProgram {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url = "jdbc:oracle:thin:@211.238.142.251:1521:orcl";
		String user = "c##sist";
		String password = "dclass";
		
		String quest;
		System.out.println("[회원 목록]");
		System.out.println("이름을 입력하세요 >>>");
		Scanner scan = new Scanner(System.in);
		quest = scan.nextLine();
		
		//String sql = "select*from member where name like '%"+quest+"%'";
		String sql = "select* from member where name like ?";
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		
		String id;
		String pwd;
		String name;
	
		while(rs.next()) {
		id = rs.getString("ID");
		pwd = rs.getString("PWD");
		name = rs.getString("NAME");
	
		
		System.out.printf("id:%s, pwd:%s, name:%s\n", id, pwd, name);
		
		}
		
	}

}
