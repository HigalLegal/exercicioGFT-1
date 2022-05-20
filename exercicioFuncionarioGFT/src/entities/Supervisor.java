package entities;

import java.math.BigDecimal;

public class Supervisor extends Funcionario {

	private final Double VALOR_BONIFICACAO = 5000.00;

	public Supervisor() {
	}

	public Supervisor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	// --------------------------------------

	@Override
	public BigDecimal bonificacao() {

		return this.getSalario().add(BigDecimal.valueOf(VALOR_BONIFICACAO));

	}


}
