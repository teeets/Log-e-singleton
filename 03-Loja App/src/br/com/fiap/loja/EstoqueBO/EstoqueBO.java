package br.com.fiap.loja.EstoqueBO;

import br.com.fiap.to.ProdutoTO;

public class EstoqueBO {

	
	public ProdutoTO consultarProduto(int codigo) {
		ProdutoTO to = null;
		switch (codigo) {
		case 401:
			to = new ProdutoTO(401,"Camiseta Masculina", 50, 10000);
			break;
		case 402:
			to = new ProdutoTO(402, "Camiseta Feminina", 40, 20);
			break;
		}
		return to;
	}
	

	
}
