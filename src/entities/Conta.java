package entities;

import java.math.BigDecimal;

import Interfaces.ContaInterface;

public abstract class Conta implements ContaInterface{

	private static Integer AGENCIA_PADRAO = 0001;
	private static Integer SEQUENCIAL = 1;
	
	protected Integer agencia;
	protected Integer numero;
	protected BigDecimal saldo = new BigDecimal("0.00");;
	protected Cliente cliente;
	protected Banco banco;

	public Conta(Cliente cliente, Banco banco) {
		this.cliente = cliente;
		this.banco = banco;
		banco.addCliente(cliente);
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		
	}

	@Override
	public void sacar(BigDecimal valor) {
		this.saldo = saldo.subtract(valor);
	}

	@Override
	public void depositar(BigDecimal valor) {
		this.saldo = saldo.add(valor);
	}

	@Override
	public void transferir(Conta contaDestino, BigDecimal valor) {
		if(this.saldo.compareTo(valor) == 0 || this.saldo.compareTo(valor) == 1) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			System.out.println("Valor de " + valor + " transferido para a AG: " + contaDestino.getAgencia() + 
					" Conta: " + contaDestino.getNumero());
		}else {
			System.out.println("Saldo insuficiente. Valor não pode ser transferido. Seu saldo atual é de " + this.saldo);
		}
	}
	
	@Override
	public void imprimirSaldo() {
		System.out.println("**   " + this.banco.getNome() + "   **");
		System.out.println("Cliente: " + this.cliente.getNome());
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Conta: " + this.getNumero());
		System.out.println("Saldo " + this.saldo);
	};
	
	
	public Integer getAgencia() {
		return agencia;
	}

	public Integer getNumero() {
		return numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Banco getBanco() {
		return banco;
	}

}
