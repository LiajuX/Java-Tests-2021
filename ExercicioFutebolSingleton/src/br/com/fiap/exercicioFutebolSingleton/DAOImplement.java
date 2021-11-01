package br.com.fiap.exercicioFutebolSingleton;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOImplement {
	private Connection conexao;
	PreparedStatement pstmt = null;
	
	public void gravar(String nome, int idade, String posicao, String clube, Double salario, Date dataVencimentoContrato) {
		try {
			conexao = ConnectionManager.getInstance().getConnection();
	
			pstmt = conexao.prepareStatement(
					"INSERT INTO futebol_arte (codigo, nome_jogador, idade, posicao, clube, salario, data_vencimento_contrato)"
					+ "VALUES(SEQ_FUTEBOL_ARTE.NEXTVAL,"
					+ "?, ?, ?, ?, ?, ?)");
								
			
			pstmt.setString(1, nome);
			pstmt.setInt(2, idade);
			pstmt.setString(3, posicao);
			pstmt.setString(4, clube);
			pstmt.setDouble(5, salario);
			pstmt.setDate(6, dataVencimentoContrato);

			pstmt.executeUpdate();
			
			Statement stmt = conexao.createStatement();
			
			ResultSet result = stmt.executeQuery("SELECT * FROM futebol_arte");
			
			System.out.println("\nRegistros:");
			
			while(result.next()) {
				System.out.println(result.getInt("codigo") + " - " +
									"Nome: " + result.getString("nome_jogador") + " | " +
									"Idade: " + result.getInt("idade") + " | " +
									"Posição: " + result.getString("posicao") + " | " +
									"Clube: " + result.getString("clube") + " | " +
									"Salário (USD): " + result.getDouble("salario") + " | " +
									"Vencimento do contrato: " + result.getDate("data_vencimento_contrato"));
			}
			
			stmt.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				pstmt.close();
				conexao.close();
			
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
