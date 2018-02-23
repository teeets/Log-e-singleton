package br.com.fiap.singleton;

import java.io.IOException;
import java.util.Properties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertySingleton {

	private static final Logger log = LoggerFactory.getLogger(PropertySingleton.class);
	
	//1- Atributo Est�tico que armazena a instancia unica
	private static Properties prop;

	//3- Construtor Privado
	private PropertySingleton(){
	}

	//2- M�todo est�tico que retorna a inst�ncia �nica
	public static Properties getInstance() {
		log.debug("Recuperando o objeto de propriedades");
		if(prop == null) {
			//Inicialisa objeto
			prop = new Properties();
			//Carrega o objeto com as configura��es do arquivo
			try {
				log.info("Carregando as propriedades do sistema");
				prop.load(PropertySingleton.class
						.getResourceAsStream("/propriedades.properties"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Propriedades n�o foram carregadas");
			}
		}
		return prop;
	}


}
