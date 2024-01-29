package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

	private static final String URL = "jdbc:mysql";
	
	public static Connection criarConexao() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL);			
		} catch (SQLException e) {
			throw new RuntimeException("Falha ao conectar com o BD: ", e);
		}
		return con;
	}
}
