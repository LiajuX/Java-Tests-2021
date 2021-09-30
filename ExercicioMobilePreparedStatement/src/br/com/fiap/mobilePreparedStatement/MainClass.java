package br.com.fiap.mobilePreparedStatement;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		boolean continua;
		int opcao, cod_item, mem;
		String marca, modelo, cor, tamanho;
		
		DataInsert dataInsert = new DataInsert();
		DataUpdate dataUpdate = new DataUpdate();
		DataSelect dataSelect = new DataSelect();
		DataDelete dataDelete = new DataDelete();
		
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("\nEscolha conforme o menu:");
			System.out.println("1. INSERT");
			System.out.println("2. UPDATE");
			System.out.println("3. SELECT");
			System.out.println("4. DELETE");
			
			opcao = input.nextInt();
			
			input.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("\nInserindo novo smartphone...");
					
					System.out.println("Marca: ");
					marca = input.nextLine();
					
					System.out.println("Modelo: ");
					modelo = input.nextLine();
					
					System.out.println("Cor: ");
					cor = input.nextLine();
					
					System.out.println("Tamanho: ");
					tamanho = input.nextLine();
					
					System.out.println("Memória: ");
					mem = input.nextInt();
					
					
					dataInsert.doInsert(marca, modelo, cor, tamanho, mem); 
				break;
				
				case 2:
					System.out.println("\nAtualizando modelo do smartphone...");

					System.out.println("Modelo: ");
					modelo = input.nextLine();
					
					System.out.println("Código do item: ");
					cod_item = input.nextInt();
					
					input.nextLine();
					
					dataUpdate.doUpdate(modelo, cod_item);					
				break;
				
				case 3:
					System.out.println("\nDeseja selecionar a entidade inteira? Digite true para SIM ou false para NÃO");
					boolean selecionarTodos = input.nextBoolean();
					
					if (selecionarTodos == true) {
						dataSelect.selectAll();
						
					} else {
						System.out.println("\nSelecionando smartphone...");

						System.out.println("Código do item: ");
						cod_item = input.nextInt();
						
						input.nextLine();
						
						dataSelect.doSelect(cod_item);	
					} 
				break;
				
				case 4:
					System.out.println("\nDeletando smartphone...");

					System.out.println("Código do item: ");
					cod_item = input.nextInt();
					
					input.nextLine();
					
					dataDelete.doDelete(cod_item);					
				break;
				
				default:
					System.out.println("\nOpção inválida!");
			}
			
			System.out.println("\nDeseja continuar? Digite true para SIM ou false para NÃO");
			continua = input.nextBoolean();
			
			input.nextLine();
			
		} while(continua == true);
				
		input.close();
	}

}
