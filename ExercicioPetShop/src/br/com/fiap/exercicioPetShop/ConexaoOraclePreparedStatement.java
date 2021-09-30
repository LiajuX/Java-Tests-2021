package br.com.fiap.exercicioPetShop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexaoOraclePreparedStatement {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM84546", "221202");
			
			System.out.println("Conectou!");
			
			PreparedStatement pstmt;
			
			// INSERT	
			pstmt = conexao.prepareStatement(
					"INSERT INTO petshop (cod_item, nome, tipo, cor, raca, servico)"
					+ "VALUES(SEQ_PETSHOP.NEXTVAL,"
					+ "?, ?, ?, ?, ?)");
								
			pstmt.setString(1, "Sirius");
			pstmt.setString(2, "Cachorro");
			pstmt.setString(3, "Dourado");
			pstmt.setString(4, "Golden Retriever");
			pstmt.setString(5, "Banho");
	
			pstmt.executeUpdate();
			
			pstmt = conexao.prepareStatement(
					"INSERT INTO petshop (cod_item, nome, tipo, cor, raca, servico)"
					+ "VALUES(SEQ_PETSHOP.NEXTVAL,"
					+ "?, ?, ?, ?, ?)");
								
			pstmt.setString(1, "Minerva");
			pstmt.setString(2, "Gata");
			pstmt.setString(3, "Cinza");
			pstmt.setString(4, "American Shorthair");
			pstmt.setString(5, "Compra");
	
			pstmt.executeUpdate();
			
			pstmt = conexao.prepareStatement(
					"INSERT INTO petshop (cod_item, nome, tipo, cor, raca, servico)"
					+ "VALUES(SEQ_PETSHOP.NEXTVAL,"
					+ "?, ?, ?, ?, ?)");
								
			pstmt.setString(1, "White Fang");
			pstmt.setString(2, "Cachorro");
			pstmt.setString(3, "Cinza");
			pstmt.setString(4, "Malamute do Alasca");
			pstmt.setString(5, "Tosa");
	
			pstmt.executeUpdate();
			
			ResultSet insertResult = pstmt.executeQuery("SELECT * FROM petshop");
			
			System.out.println("\nINSERT");
			
			while(insertResult.next()) {
				System.out.println(insertResult.getInt("cod_item")+ " " +
									insertResult.getString("nome") + " " +
									insertResult.getString("tipo") + " " +
									insertResult.getString("cor") + " " +
									insertResult.getString("raca") + " " +
									insertResult.getString("servico"));
			}

			// UPDATE
			pstmt = conexao.prepareStatement("UPDATE petshop SET nome=? WHERE cod_item=?");
			pstmt.setString(1, "Mufasa");
			pstmt.setInt(2, 3);
			
			pstmt.executeUpdate();

			ResultSet updateResult = pstmt.executeQuery("SELECT * FROM petshop");
			
			System.out.println("\nUPDATE");
			
			while(updateResult.next()) {
				System.out.println(updateResult.getInt("cod_item")+ " " +
									updateResult.getString("nome") + " " +
									updateResult.getString("tipo") + " " +
									updateResult.getString("cor") + " " +
									updateResult.getString("raca") + " " +
									updateResult.getString("servico"));
			}
			
			// DELETE
			pstmt = conexao.prepareStatement("DELETE FROM petshop WHERE cod_item=?");
			pstmt.setInt(1, 2);
			
			pstmt.executeUpdate();
			
			ResultSet deleteResult = pstmt.executeQuery("SELECT * FROM petshop");
						
			System.out.println("\nDELETE");
			
			while(deleteResult.next()) {
				System.out.println(deleteResult.getInt("cod_item")+ " " +
									deleteResult.getString("nome") + " " +
									deleteResult.getString("tipo") + " " +
									deleteResult.getString("cor") + " " +
									deleteResult.getString("raca") + " " +
									deleteResult.getString("servico"));
			}
			
			conexao.close();
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar no Oracle");
			e.printStackTrace();
		
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver JDBC não foi encontrado");
			e.printStackTrace();
		}
	}

}
