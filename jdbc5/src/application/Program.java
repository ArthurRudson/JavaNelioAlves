package application;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.postgresql.util.PSQLException;

import db.DbException;


public class Program {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection con = Conecta.criarConexao();
	
		try {
			
			con.setAutoCommit(false);
			
			Statement st = null;
			
			st =  con.createStatement();
			
			int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE DepartmentId = 1");
			
			//int x = 1;
			//if(x < 2) {
			//	throw new SQLException("Fake error");
			//}
			
			int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE DepartmentId = 2");
			
			
			con.commit();
			
			System.out.println("rows1 " + rows1);
			System.out.println("rows2 " + rows2);
			
		}  catch (SQLException e) {
			try {
				con.rollback();
				throw new DbException("Transaction rolled back! Caused by: " + e.getMessage());
			} catch (PSQLException e1) {
				throw new DbException("Error trying to rollback! Caused by: " + e1.getMessage());
			}
		}
		
	}

}
