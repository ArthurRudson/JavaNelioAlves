package application;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import db.DbIntegrityException;


public class Program {

	public static void main(String[] args) {
	
		try {
			Connection con = Conecta.criarConexao();
			
			PreparedStatement st = null;
			
			st =  con.prepareStatement(
					"DELETE FROM department " 
					+ "WHERE "
					+ "Id = ?");
			
			st.setInt(1, 2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Done! Rows affected: " +  rowsAffected);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			throw new DbIntegrityException(e.getMessage());
		}
		
	}

}
