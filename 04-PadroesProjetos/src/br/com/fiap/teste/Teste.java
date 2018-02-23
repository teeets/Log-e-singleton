package br.com.fiap.teste;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.fiap.singleton.PropertySingleton;

public class Teste {

	private static final Logger log = LoggerFactory.getLogger(Teste.class); 
		
		
	public static void main(String[] args) {
		log.trace("Iniciando o sistema");
		
		Properties p = PropertySingleton.getInstance();
		System.out.println(p.getProperty("url"));
		System.out.println(p.getProperty("login"));

	}

}
