package singleton.heranca;

import java.sql.SQLException;

import org.junit.Test;

public class TesteBancoDeDados{

	@Test
	public void testeProducaoOracle() throws ClassNotFoundException, SQLException {
		FachadaBD.getInstance().carregarDados("bd_oracle.properties");
		FachadaBD.getInstance().abrirConexao();
	}

	@Test
	public void testeDesenvolvimentoHsqldb() throws ClassNotFoundException, SQLException {
		FachadaHsqldb.getInstance().carregarDados("bd_local.properties");
		FachadaBD.getInstance().abrirConexao();
	}
}