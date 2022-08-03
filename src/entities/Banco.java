package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Cliente> clientes = new ArrayList<>();

	public Banco(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}
	
	public void listarClientes(){
		clientes.forEach( c -> System.out.println(c.getNome()) );
	}
}
