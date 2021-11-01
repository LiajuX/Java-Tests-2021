package br.com.fiap.exercicioFutebolSingleton;

import java.sql.Date;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		DAOImplement dao = new DAOImplement();

		boolean continuaLoop = true;
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("\nInsira os seguintes dados do jogador: ");
			
			System.out.println("\nNome: ");
			String nome = input.nextLine();
			
			System.out.println("\nIdade: ");
			int idade = input.nextInt();
			
			input.nextLine();

			System.out.println("\nPosição: ");
			String posicao = input.nextLine();

			System.out.println("\nClube: ");
			String clube = input.nextLine();
			
			System.out.println("\nSalário (USD): ");
			Double salario = input.nextDouble();

			input.nextLine();
			
			System.out.println("\nData de vencimento de contrato (yyyy-MM-dd): ");
			Date dataVencimentoContrato =  Date.valueOf(input.nextLine());
			
			dao.gravar(nome, idade, posicao, clube, salario, dataVencimentoContrato);
			
			System.out.println("\nDeseja continuar? Digite true para SIM ou false para NÃO");
			
			continuaLoop = input.nextBoolean();
			input.nextLine();
			
		} while (continuaLoop == true);
		
		input.close();
	}
	
}
