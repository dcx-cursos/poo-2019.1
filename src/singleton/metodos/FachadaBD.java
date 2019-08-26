package singleton.metodos;

import java.io.BufferedInputStream;
import java.io.ObjectInputFilter.Config;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FachadaBD {

	private static String driver = "oracle.jdbc.driver.OracleDriver";
	private static String urlPrefix = "jdbc:oracle:thin:@//";
	private static String address = "10.0.0.1:1521";
	private static String schema = "database1";
	private static String user = "root";
	private static String password = "123";

	public static void carregarDados(String arquivo) {
		Properties prop = new Properties();

		try {
			URL resource = Config.class.getResource(arquivo);
			if(resource == null) {
				throw new RuntimeException("Nao pode achar recurso: " + arquivo);
			}
			prop.load(new BufferedInputStream(resource.openStream()));
		} catch(Exception ex ) {
			System.err.println(ex.getMessage());
		}

		driver = prop.getProperty("driver", driver);
		urlPrefix = prop.getProperty("url.prefix", urlPrefix);
		address = prop.getProperty("address", address);
		schema = prop.getProperty("schema", schema);
		user = prop.getProperty("user", user);
		password = prop.getProperty("password", password);
	}

	public static String getDriver() {
		return driver;
	}

	public static String getURL() {
		return urlPrefix + address + schema;
	}

	public static String getUser() {
		return user;
	}

	public static String getPassword() {
		return password;
	}

	public static Connection abrirConexao() throws ClassNotFoundException, SQLException {
		Class.forName(getDriver());
		return DriverManager.getConnection(getURL(), getUser(), getPassword());
	}
}