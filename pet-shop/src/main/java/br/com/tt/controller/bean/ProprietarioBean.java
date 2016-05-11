package br.com.tt.controller.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.model.Fornecedor;
import br.com.tt.model.Proprietario;
import br.com.tt.pet.dao.Dao;
import br.com.tt.pet.dao.IDao;
import br.com.tt.util.faces.MessageUtil;

@ManagedBean(name="proprietario")
@SessionScoped
public class ProprietarioBean {
	
	private Proprietario proprietario;
	private List<Proprietario> proprietarios;
	private IDao<Proprietario> dao;
	
	@PostConstruct
	private void init(){
		dao = new Dao<Proprietario>(Proprietario.class);
		proprietario = new Proprietario();
		proprietarios = new ArrayList<Proprietario>();
		proprietarios = dao.consultar();
		
	}
	
	
	public void salvar(){
		dao.salvar(proprietario);
		proprietarios = dao.consultar();		
		MessageUtil.info("Proprietario Salvo", "Proprietario salvo com sucesso");
		proprietario = new Proprietario();
		
		/*
		System.out.println("Salvando \n\t" + proprietario.getNome() + "\n\t" + proprietario.getCpf());
		MessageUtil.info("Salvo", proprietario.getNome() + " Salvo com sucesso");
		proprietarios.add(proprietario);
		proprietario = new Proprietario();
		*/
	}
	
	public void cancelar(){
		MessageUtil.warn("Cancelado", "Cancelado" + " Cancelado o cadastro!");
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
