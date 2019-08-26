package singleton.atributos;

import java.sql.SQLException;

import org.junit.Test;

public class TesteBancoDeDados{

	@Test
	public void testeProducaoOracle() throws ClassNotFoundException, SQLException {

		FachadaBD.DRIVER = "oracle.jdbc.driver.OracleDriver";
		FachadaBD.URL_PREFIX = "jdbc:oracle:thin:@//";
		FachadaBD.ADDRESS = "10.0.0.1:1521";
		FachadaBD.SCHEMA = "/teste";
		FachadaBD.USER = "user1";
		FachadaBD.PASSWORD = "pass";
		FachadaBD.abrirConexao();
	}
}