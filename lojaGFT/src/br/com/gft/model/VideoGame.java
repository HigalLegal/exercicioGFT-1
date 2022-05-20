package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca;
	private String modelo;
	private boolean usado;

	// -------------------------------

	public VideoGame() {
	}

	public VideoGame(String nome, double preco, int quantidade, String marca, String modelo, boolean usado) {
		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
		this.usado = usado;
	}

	// -------------------------------

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}

	// -------------------------------

	@Override
	public double calcularImposto() {

		double imposto = 0.45 * this.getPreco();

		String mensagem = "Imposto " + this.getNome() + " " + modelo + ": " + String.format("%.2f", imposto);

		if (usado) {
			imposto = 0.25 * this.getPreco();
			mensagem = "Imposto " + this.getNome() + " " + modelo + " usado: " + String.format("%.2f", imposto);
		}

		System.out.println(mensagem);

		return imposto;
	}

	@Override
	public String toString() {
		return "Video-Game: " + modelo + " , pre�o: " + this.getPreco() + " , quantidade: " + this.getQuantidade()
				+ " em estoque.";
	}

}
