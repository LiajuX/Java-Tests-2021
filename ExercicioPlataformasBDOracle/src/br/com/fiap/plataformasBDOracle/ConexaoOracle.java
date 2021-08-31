package br.com.fiap.plataformasBDOracle;

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
			
			// INSERT
			stmt.executeUpdate(
					"INSERT INTO plataformas (cnpj, nome, qtd_catalogo, qtd_assinantes, sistema, cod_item)"
					+ "VALUES('12302537906324', 'Netflix', 2844, 204000000, 'Todos', SEQ_PLATAFORMAS.NEXTVAL)");

			stmt.executeUpdate(
					"INSERT INTO plataformas (cnpj, nome, qtd_catalogo, qtd_assinantes, sistema, cod_item)"
					+ "VALUES('21302537906324', 'Prime Video', 2000, 200000000, 'Todos', SEQ_PLATAFORMAS.NEXTVAL)");
			
			stmt.executeUpdate(
					"INSERT INTO plataformas (cnpj, nome, qtd_catalogo, qtd_assinantes, sistema, cod_item)"
					+ "VALUES('31302537906324', 'Disney+', 2844, 103600000, 'Todos', SEQ_PLATAFORMAS.NEXTVAL)");

			ResultSet result = stmt.executeQuery("SELECT * FROM plataformas");
			
			System.out.println("\nINSERT");

			while(result.next()) {
				System.out.println(result.getInt("cod_item") + " " +
									result.getString("cnpj") + " " +
									result.getString("nome") + " " +
									result.getInt("qtd_catalogo") + " " +
									result.getInt("qtd_assinantes")+ " " +
									result.getString("sistema"));
			}
			
			// UPDATE
			String sqlUpdate = "UPDATE plataformas SET nome = 'HBO Max' WHERE cod_item = 2";
			stmt.executeUpdate(sqlUpdate);
			
			ResultSet updateResult = stmt.executeQuery("SELECT * FROM plataformas");
			
			System.out.println("\nUPDATE");
			
			while(updateResult.next()) {
				System.out.println(updateResult.getInt("cod_item") + " " +
									updateResult.getString("cnpj") + " " +
									updateResult.getString("nome") + " " +
									updateResult.getInt("qtd_catalogo") + " " +
									updateResult.getInt("qtd_assinantes")+ " " +
									updateResult.getString("sistema"));
			}
			
			// DELETE
			String sqlDelete = "DELETE FROM plataformas WHERE cod_item = 3";
			stmt.executeUpdate(sqlDelete);
			
			ResultSet deleteResult = stmt.executeQuery("SELECT * FROM plataformas");
			
			System.out.println("\nDELETE");

			while(deleteResult.next()) {
				System.out.println(deleteResult.getInt("cod_item") + " " +
									deleteResult.getString("cnpj") + " " +
									deleteResult.getString("nome") + " " +
									deleteResult.getInt("qtd_catalogo") + " " +
									deleteResult.getInt("qtd_assinantes")+ " " +
									deleteResult.getString("sistema"));
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
