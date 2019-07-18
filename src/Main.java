

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import encapsulamento.Cliente;
import encapsulamento.Loja;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Cliente cliente = new Cliente(100, 100);
		Loja loja = new Loja(1000, 100);
		
		loja.vender(100, cliente);
		loja.vender(150, cliente);
		loja.vender(0, cliente);
		loja.vender(-10, cliente);
		
		Class<?> c = Class.forName("encapsulamento.Loja");
        Constructor<?> cons = c.getConstructor(double.class, double.class);
		Object object = cons.newInstance(10, 10);
		System.out.println(((Loja) object).status());
		
	}

}
