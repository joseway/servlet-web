package com.gestion.livres.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {
	
	public static Connection getConnection() {
		final String URL = "jdbc:mysql://localhost:3306/student";
		final String PWD = "dbpassword";
		final String USER = "dbuser";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(URL, USER, PWD);
			
			return con;
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Echec connexion");
			e.printStackTrace();
		}
		return null;
	}
}
