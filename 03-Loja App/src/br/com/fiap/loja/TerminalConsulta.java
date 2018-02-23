package br.com.fiap.loja;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import br.com.fiap.loja.EstoqueBO.EstoqueBO;
import br.com.fiap.sigleton.PropertysSingleton;
import br.com.fiap.to.ProdutoTO;

public class TerminalConsulta {

	private static final Logger log = LoggerFactory.getLogger(TerminalConsulta.class);
	
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);

		
		log.info("Iniciando o sistema");
		EstoqueBO bo = new EstoqueBO();//Instanciado para usar o metodo .consultarProduto
		DecimalFormat df = new DecimalFormat("R$ ##,###.00");
		Calendar hoje = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		int codigo;
		
		String nome = PropertysSingleton.getInstance().getProperty("nome");
		System.out.println(nome + "      " + sdf.format(hoje.getTime()));
		System.out.println("*******************");
		
		log.info("Digite o codigo");
		do {
			System.out.print("Digite o c�digo do produto:");
			codigo = tec.nextInt();//ler o codigo
			
			if(codigo !=0) {
				ProdutoTO prod = bo.consultarProduto(codigo);

				if (prod != null) {
					System.out.println(prod.getNome());
					System.out.println(df.format(prod.getPreco()));
					System.out.println(prod.getQtd());
				}else {
					System.out.println("Produto n�o cadastrado");
					log.error("Produto n�o cadastrado");
				}
			}
		}while(codigo != 0 );
		
		System.out.println("Fim da aplica�o");
		tec.close();

	}

	
}
