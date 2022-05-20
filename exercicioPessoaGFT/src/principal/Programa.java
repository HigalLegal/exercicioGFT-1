package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.entities.Pessoa;

public class Programa {

	public static void main(String[] args) {

		List<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(new Pessoa("João", 15));
		pessoas.add(new Pessoa("Leandro", 21));
		pessoas.add(new Pessoa("Paulo", 17));
		pessoas.add(new Pessoa("Jessica", 18));

		pessoas.sort((pessoa1, pessoa2) -> {
			return -pessoa1.getIdade().compareTo(pessoa2.getIdade());
		});

		System.out.println("Pessoa mais velha: " + pessoas.get(0));

		// ----------------------------------------------------------------------------

		System.out.println();

		System.out.println("Removendo menores de 18");

		System.out.println("Antes da exclusão: ");
		pessoas.forEach(System.out::println);
		
		System.out.println();

		pessoas.removeIf(pessoa -> pessoa.getIdade() < 18);

		System.out.println("Após a exclusão: ");
		pessoas.forEach(System.out::println);

		// ----------------------------------------------------------------------------

		System.out.println();

		System.out.println("Verificando se Jessica ainda se encontra.");

		List<Pessoa> verificador = pessoas.stream().filter((pessoa) -> pessoa.getNome().equals("Jessica"))
				.collect(Collectors.toList());
		
		if(verificador.size() >= 1) {
			System.out.println("Sim, ainda se encontra.");
			verificador.forEach(System.out::println);
			
		}

	}
}
