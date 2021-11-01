package br.com.fiap.exercicioFutebolCallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionManager {
	private static ConnectionManager instance;
	
	private ConnectionManager() {}
	
	public static ConnectionManager getInstance() {
		if (instance == null) {
			instance = new ConnectionManager();
		}
		
		return instance;
	}
	
	public Connection getConnection() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			conexao = DriverManager.getConnection(
				"jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL",
				"RM84546", "221202");
			
		} catch (Exception e) {
			System.err.println("N�o foi poss�vel conectar no Oracle");
			
			e.printStackTrace();
		}
		
		return conexao;
	}
	
}
