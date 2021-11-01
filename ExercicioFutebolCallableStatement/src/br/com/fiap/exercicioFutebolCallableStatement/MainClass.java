package br.com.fiap.exercicioFutebolCallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		boolean continuaLoop = true;
		
		Scanner input = new Scanner(System.in);
		
		do {
			try {
				Connection conexao = ConnectionManager.getInstance().getConnection();
				
				CallableStatement cs = conexao.prepareCall("{call SP_INSERT_FUTEBOL_ARTE(?, ?, ?, ?, ?, ?)}");
				
				System.out.println("\nInsira os seguintes dados do jogador: ");
				
				System.out.println("\nNome: ");
				cs.setString(1, input.nextLine());
				
				System.out.println("\nIdade: ");
				cs.setInt(2, input.nextInt());
				
				input.nextLine();

				System.out.println("\nPosição: ");
				cs.setString(3, input.nextLine());

				System.out.println("\nClube: ");
				cs.setString(4, input.nextLine());
				
				System.out.println("\nSalário (USD): ");
				cs.setDouble(5, input.nextDouble());

				input.nextLine();
				
				System.out.println("\nData de vencimento de contrato (yyyy-MM-dd): ");
				Date dataFormatada =  Date.valueOf(input.nextLine());
				cs.setDate(6, dataFormatada);
				
				cs.executeUpdate();
							
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
				
				conexao.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			System.out.println("\nDeseja continuar? Digite true para SIM ou false para NÃO");
			
			continuaLoop = input.nextBoolean();
			input.nextLine();
			
		} while (continuaLoop == true);
		
		input.close();
	}

}
