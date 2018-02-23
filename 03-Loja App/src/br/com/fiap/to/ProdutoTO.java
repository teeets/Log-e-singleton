package br.com.fiap.to;

import java.io.Serializable;

public class ProdutoTO implements Serializable {

	private int codigo;
	private String nome;
	private int qtd; 
	private double preco;
	
		
	public ProdutoTO() {
		super();
	}


	public ProdutoTO(int codigo, String nome, int qtd, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.qtd = qtd;
		this.preco = preco;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getQtd() {
		return qtd;
	}



	public void setQtd(int qtd) {
		this.qtd = qtd;
	}



	public double getPreco() {
		return preco;
	}



	public void setPreco(double preco) {
		this.preco = preco;
	}
	
		
	
}
