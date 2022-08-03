package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente, Banco banco) {
		super(cliente, banco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirSaldo() {
		System.out.println("*****Saldo Conta Corrente*****");
		super.imprimirSaldo();
	}
	
}
