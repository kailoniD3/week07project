package mainApp;

import projects.dao.DbConnection;

public class App {

	public static void main (String[] args) {
		try {
			DbConnection.getConnection();
			System.out.println("Connection to MySQL server succesful.");
		} catch (Exception e) {
			System.err.println("Error connecting to MySql server:" + e.getMessage());
		}
	}
}
