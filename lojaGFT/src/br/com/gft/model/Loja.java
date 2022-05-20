package br.com.gft.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	// -------------------------------

	public Loja() {
	}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	// -------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void adicionarVideoGame(VideoGame videoGame) {
		videoGames.add(videoGame);
	}

	// -------------------------------

	public void listaLivros() {

		if (!livros.isEmpty()) {

			System.out.println("A loja " + nome + " possui estes livros para a venda:");

			for (Livro livro : livros) {
				System.out.println(livro);
			}
		} else {
			System.out.println("A loja não tem livros no seu estoque.");
		}

	}

	public void listaVideoGames() {
		System.out.println("A loja " + nome + " possui estes video-games para a venda:");

		for (VideoGame videoGame : videoGames) {
			System.out.println(videoGame);
		}
	}

	public double patrimonio() {

		BigDecimal totalPatrimonio = patrimonioLivros().multiply(patrimonioVideoGames());

		return totalPatrimonio.doubleValue();
	}

	private BigDecimal patrimonioLivros() {

		List<Integer> tudoQuantidade = livros.stream().map((livro) -> livro.getQuantidade())
				.collect(Collectors.toList());

		double totalLivros = tudoQuantidade.stream().reduce(0, (a, b) -> a + b);

		List<Double> tudoPrecoLivro = livros.stream().map((livro) -> livro.getPreco()).collect(Collectors.toList());

		double precoPorUm = tudoPrecoLivro.stream().reduce(0.0, (a, b) -> a + b);

		return BigDecimal.valueOf(totalLivros).multiply(BigDecimal.valueOf(precoPorUm));
	}

	private BigDecimal patrimonioVideoGames() {

		List<Integer> tudoQuantidade = videoGames.stream().map((videoGame) -> videoGame.getQuantidade())
				.collect(Collectors.toList());

		double totalVideoGames = tudoQuantidade.stream().reduce(0, (a, b) -> a + b);

		List<Double> tudoPrecoVG = videoGames.stream().map((videoGame) -> videoGame.getPreco())
				.collect(Collectors.toList());

		double precoPorUm = tudoPrecoVG.stream().reduce(0.0, (a, b) -> a + b);

		return BigDecimal.valueOf(totalVideoGames).multiply(BigDecimal.valueOf(precoPorUm));
	}

}
