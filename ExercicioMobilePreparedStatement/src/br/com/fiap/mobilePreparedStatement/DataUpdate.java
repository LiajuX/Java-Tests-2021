package br.com.fiap.mobilePreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataUpdate {
	
	public void doUpdate(String modelo, int cod_item) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM84546", "221202");
			
			System.out.println("Conectou!");
			
			PreparedStatement pstmt = conexao.prepareStatement("UPDATE mobile SET modelo=? WHERE cod_item=?");
			pstmt.setString(1, modelo);
			pstmt.setInt(2, cod_item);
			
			pstmt.executeUpdate();

			System.out.println("Update realizado com sucesso!");
			
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
