package br.com.fiap.mobilePreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataInsert {
	
	public void doInsert(String marca, String modelo, String cor, String tamanho, int mem) {	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM84546", "221202");
			
			System.out.println("Conectou!");

			PreparedStatement pstmt = conexao.prepareStatement(
					"INSERT INTO mobile (cod_item, marca, modelo, cor, tamanho, mem)"
					+ "VALUES(SEQ_MOBILE.NEXTVAL,"
					+ "?, ?, ?, ?, ?)");
								
			pstmt.setString(1, marca);
			pstmt.setString(2, modelo);
			pstmt.setString(3, cor);
			pstmt.setString(4, tamanho);
			pstmt.setInt(5, mem);
			
			pstmt.executeUpdate();
			
			System.out.println("Insert realizado com sucesso!");
			
			conexao.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
