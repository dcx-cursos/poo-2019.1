package encapsulamento;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		Cliente cliente = new Cliente(100, 100);
		Loja loja = new Loja(1000, 100);
		
		loja.vender(100, cliente);
		System.out.println(loja.status());
		loja.vender(150, cliente);
		System.out.println(loja.status());
		loja.vender(0, cliente);
		System.out.println(loja.status());
		loja.vender(-10, cliente);
		System.out.println(loja.status());		
		
		
		Class<?> c = Class.forName("encapsulamento.Loja");
		Constructor<?> cons = c.getConstructor(double.class, double.class);
		Loja object = (Loja) cons.newInstance(10, 10);
		System.out.println(object.status());
		
	}

}
