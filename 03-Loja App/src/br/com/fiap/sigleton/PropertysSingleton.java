package br.com.fiap.sigleton;

import java.io.IOException;
import java.util.Properties;

public class PropertysSingleton {

	private static Properties p;
	
	private PropertysSingleton() { //Construtor
		
	}
	
	public static Properties getInstance() {
		if (p == null) {
			p = new Properties();
			try {
				p.load(PropertysSingleton.class.getResourceAsStream("/loja.properties"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	return p;
	}
	
}
