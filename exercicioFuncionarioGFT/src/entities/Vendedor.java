package entities;

import java.math.BigDecimal;

public class Vendedor extends Funcionario {
	
	private final Double VALOR_BONIFICACAO = 3000.00;
	
	public Vendedor() {
	}

	public Vendedor(String nome, Integer idade, Double salario) {
		super(nome, idade, salario);
	}

	// --------------------------------------

	@Override
	public BigDecimal bonificacao() {

		return this.getSalario().add(BigDecimal.valueOf(VALOR_BONIFICACAO));

	}

}
