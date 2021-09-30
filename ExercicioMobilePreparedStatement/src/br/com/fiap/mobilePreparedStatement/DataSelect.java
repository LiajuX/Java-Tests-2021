package br.com.fiap.mobilePreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataSelect {

	public void doSelect(int code_item) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM84546", "221202");
			
			System.out.println("Conectou!");

			PreparedStatement pstmt = conexao.prepareStatement("SELECT * FROM mobile WHERE cod_item=?");
			pstmt.setInt(1, code_item);

			ResultSet result = pstmt.executeQuery();

			while(result.next()) {
				System.out.println(result.getInt("cod_item") + " " +
									result.getString("marca") + " " +
									result.getString("modelo") + " " +
									result.getString("cor") + " " +
									result.getString("tamanho") + " " +
									result.getInt("mem"));
			}   

			System.out.println("\nSelect realizado com sucesso!");

			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void selectAll() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM84546", "221202");
			
			System.out.println("Conectou!");

			PreparedStatement pstmt = conexao.prepareStatement("SELECT * FROM mobile");
			
			ResultSet result = pstmt.executeQuery();

			System.out.println("\nRegistros da entidade MOBILE:");

			while(result.next()) {
				System.out.println(result.getInt("cod_item") + " " +
									result.getString("marca") + " " +
									result.getString("modelo") + " " +
									result.getString("cor") + " " +
									result.getString("tamanho") + " " +
									result.getInt("mem"));
			}   

			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
