package classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	
	private String nomeCliente;
	private String nomeArquiteto;
	
	private List<Cliente> clientes = new ArrayList<>();
	private List<Projetos> projetos = new ArrayList<>();
	
	public Cliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public String getNomeArquiteto() {
		return nomeArquiteto;
	}
	
	public List<Projetos> getProjetos() {
		return Collections.unmodifiableList(projetos);
	}
	
	public void AdicionaProjetos(Projetos proj){
		this.projetos.add(proj);
	}
	
	@Override
	public String toString() {
		
		return "Nome: "+this.getNomeCliente()+ " Projetos: "+ getProjetos();
	}

}
