package singleton.metodos;

import java.sql.SQLException;

import org.junit.Test;

public class TesteBancoDeDados{

	@Test
	public void testeProducaoOracle() throws ClassNotFoundException, SQLException {

		FachadaBD.carregarDados("bd_oracle.properties");
		FachadaBD.abrirConexao();
	}
}