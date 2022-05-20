package entities;

import java.math.BigDecimal;

public class Gerente extends Funcionario {

	private final Double VALOR_BONIFICACAO = 10000.00;

	public Gerente() {
	}

	public Gerente(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	// --------------------------------------

	@Override
	public BigDecimal bonificacao() {

		return this.getSalario().add(BigDecimal.valueOf(VALOR_BONIFICACAO));

	}

}
