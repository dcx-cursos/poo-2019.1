package singleton.atributos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FachadaBD {

	public static String DRIVER, URL_PREFIX, ADDRESS, SCHEMA, USER, PASSWORD;

	public static Connection abrirConexao() throws ClassNotFoundException, SQLException {

		Class.forName(DRIVER);
		return DriverManager.getConnection(URL_PREFIX + ADDRESS + SCHEMA, USER, PASSWORD);
	}
}