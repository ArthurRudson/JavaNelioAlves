package jdbc1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Teste {

	public static void main(String[] args) {

		try {
			Connection con = Conecta.criarConexao();
			
			Statement st = null;
			
			ResultSet rs = null;
			
			st = con.createStatement();
			
			rs = st.executeQuery("select * from department");
			
			while (rs.next()) {
				System.out.println(rs.getInt("Id") + ", " + rs.getString("Name"));
			}
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
