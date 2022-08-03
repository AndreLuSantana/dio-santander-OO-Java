package Interfaces;

import java.math.BigDecimal;

import entities.Conta;

public interface ContaInterface {

	public void sacar(BigDecimal valor);

	public void depositar(BigDecimal valor);

	public void transferir( Conta contaDestino, BigDecimal valor);
	
	public void imprimirSaldo();
	
}
