package br.com.fiap.mobileBDOracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoOracle {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
					"RM84546", "221202");
			
			System.out.println("Conectou!");
			
			Statement stmt = conexao.createStatement();
			
			/* INSERT INTO
			stmt.executeUpdate(
					"INSERT INTO mobile (serie, marca, modelo, tela, memoria)"
					+ "VALUES(SEQ_MOBILE.NEXTVAL,"
					+ "'Samsung', 'Galaxy S20FE', '6.5', 64)");
			 
			stmt.executeUpdate(
					"INSERT INTO mobile (serie, marca, modelo, tela, memoria)"
					+ "VALUES(SEQ_MOBILE.NEXTVAL,"
					+ "'Apple', 'iPhone X', '6.4', 32)");
			
			stmt.executeUpdate(
					"INSERT INTO mobile (serie, marca, modelo, tela, memoria)"
					+ "VALUES(SEQ_MOBILE.NEXTVAL,"
					+ "'LG', 'K22', '6.2', 64)");
			
			stmt.executeUpdate(
					"INSERT INTO mobile (serie, marca, modelo, tela, memoria)"
					+ "VALUES(SEQ_MOBILE.NEXTVAL,"
					+ "'LG', 'K41S', '6.5', 32)");
			*/
				
			String sqlUpdate = "UPDATE mobile SET memoria = 128 WHERE serie = 123565980";
			stmt.executeUpdate(sqlUpdate);
			
			String sqlDelete = "DELETE FROM mobile WHERE serie = 123565983";
			stmt.executeUpdate(sqlDelete);
			
			ResultSet result = stmt.executeQuery("SELECT * FROM mobile");
			
			while(result.next()) {
				System.out.println(result.getInt("serie") + " " +
									result.getString("marca") + " " +
									result.getString("modelo") + " " +
									result.getString("tela") + " " +
									result.getInt("memoria"));
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
