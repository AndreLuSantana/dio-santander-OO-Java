package main;

import java.math.BigDecimal;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		Banco banco = new Banco("Banco do André");
		
		Cliente c1 = new Cliente("André", "81760248215");
		Cliente c2 = new Cliente("Karleane", "965948462632");
		Cliente c3 = new Cliente("Agnes", "65432198715");
		
		Conta cc = new ContaCorrente(c1, banco);
		Conta cc1 = new ContaCorrente(c3, banco);
		
		Conta cp = new ContaPoupanca(c2, banco);
		
		cc.depositar(new BigDecimal("110.00"));
		
		banco.listarClientes();

	}

}
