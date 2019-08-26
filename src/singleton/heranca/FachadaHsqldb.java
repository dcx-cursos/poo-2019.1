package singleton.heranca;

import java.io.BufferedInputStream;
import java.net.URL;
import java.util.Properties;

public class FachadaHsqldb extends FachadaBD {

	public static FachadaBD getInstance() {
		if(instance == null) {
			instance = new FachadaHsqldb();
		}
		return instance;
	}

	private String directory;

	private FachadaHsqldb() {
		//Default values
		setDriver("org.hsqldb.jdbc.JDBCDriver");
		setUrlPrefix("jdbc:hsqldb:");
		setDirectory("db1");
	}

	//Esse método poderia ter ficado melhor...
	public void carregarDados(String arquivo) {
		super.carregarDados(arquivo);

		Properties prop = new Properties();
		try {
			URL resource = FachadaHsqldb.class.getResource(arquivo);
			if(resource == null) {
				throw new RuntimeException("Nao pode achar recurso: " + arquivo);
			}
			prop.load(new BufferedInputStream(resource.openStream()));
		} catch(Exception ex ) {
			System.err.println(ex.getMessage());
		}

		driver = prop.getProperty("driver", driver);
		urlPrefix = prop.getProperty("url.prefix", urlPrefix);
		directory = prop.getProperty("directory", directory);
	}

	public String getDirectory() {
		return directory;
	}

	private void setDirectory(String directory) {
		this.directory = directory;
	}
	
	@Override
	public String getURL() {
		return urlPrefix + directory;
	}

}