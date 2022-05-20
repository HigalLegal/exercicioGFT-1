package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	
	private String autor;
	private String tema;
	private int quantidaDePaginas;
	
	// -------------------------------
	
	public Livro() {}

	public Livro(String nome, double preco, int quantidade, String autor, String tema, int quantidaDePaginas) {
		super(nome, preco, quantidade);
		this.autor = autor;
		this.tema = tema;
		this.quantidaDePaginas = quantidaDePaginas;
		
	}

	// -------------------------------
	
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantidaDePaginas() {
		return quantidaDePaginas;
	}

	public void setQuantidaDePaginas(int quantidaDePaginas) {
		this.quantidaDePaginas = quantidaDePaginas;
	}
	
	// -------------------------------


	@Override
	public double calcularImposto() {
		if(tema == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + this.getNome());
			return 0;
		}
		
		double imposto = this.getPreco() * 0.1;
		
		System.out.println("Imposto " + this.getNome() + " , " + imposto);
		
		return imposto;
		
	}
	
	@Override
	public String toString() {
		return "Titulo: " + this.getNome() + " , preço: " +  this.getPreco() + " , quantidade: " + this.getQuantidade()
				+ " em estoque.";
	}

}
