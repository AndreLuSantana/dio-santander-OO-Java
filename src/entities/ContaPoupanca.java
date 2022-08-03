package entities;

import java.math.BigDecimal;

public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente, Banco banco) {
		super(cliente, banco);
		// TODO Auto-generated constructor stub
	}

	private BigDecimal rendimento;

	public BigDecimal getRendimento() {
		return rendimento;
	}
	
	@Override
	public void imprimirSaldo() {
		System.out.println("*****Saldo Conta Poupanca*****");
		super.imprimirSaldo();
	}
	
	public void gerarRendimento(BigDecimal saldo) {
		BigDecimal taxa = new BigDecimal("0.02");
		this.rendimento = taxa.multiply(saldo);
		depositar(this.rendimento);
	}
}
