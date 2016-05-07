package br.com.tt.controller.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.model.Proprietario;
import br.com.tt.pet.util.UtilMessage;

@ManagedBean(name="proprietario")
@SessionScoped
public class ProprietarioBean {
	
	private Proprietario proprietario = new Proprietario();
	private List<Proprietario> proprietarios = 
			new ArrayList<Proprietario>();
	
	public void salvar(){
		System.out.println("Salvando \n\t" + proprietario.getNome() + "\n\t" + proprietario.getCpf());
		UtilMessage.info("Salvo", proprietario.getNome() + " Salvo com sucesso");
		proprietarios.add(proprietario);
		proprietario = new Proprietario();
	}
	
	public void cancelar(){
		UtilMessage.warn("Cancelado", "Cancelado" + " Cancelado o cadastro!");
		proprietario = new Proprietario();
	}
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public List<Proprietario> getProprietarios() {
		for (Proprietario proprietario : proprietarios) {
			System.out.println("Lista " + proprietario.getNome());
			
		}
		return proprietarios;
	}
	
	

}
