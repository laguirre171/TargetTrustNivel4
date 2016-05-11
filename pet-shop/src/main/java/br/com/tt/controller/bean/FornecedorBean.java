package br.com.tt.controller.bean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.model.Fornecedor;
import br.com.tt.model.Pet;
import br.com.tt.pet.dao.Dao;
import br.com.tt.pet.dao.IDao;
import br.com.tt.util.faces.MessageUtil;

@ManagedBean(name="fornecedorBean")
@SessionScoped
public class FornecedorBean {
	
	private Fornecedor fornecedor;
	private List<Fornecedor> fornecedores;
	private IDao<Fornecedor> dao;
	
	@PostConstruct
	private void init(){
		dao = new Dao<Fornecedor>(Fornecedor.class);
		fornecedor  = new Fornecedor();
		fornecedores = new ArrayList<Fornecedor>();
		fornecedores = dao.consultar();
		
	}
	
	
	public void salvar(){
		
		dao.salvar(fornecedor);
		fornecedores = dao.consultar();		
		MessageUtil.info("Fornecedor Salvo", "Fornecedor salvo com sucesso");
		fornecedor = new Fornecedor();
		/*
		MessageUtil.info("", fornecedor.getNome() + " Cadastrado com sucesso!");
		for (Fornecedor fornecedor : fornecedores) {
			if (this.fornecedor.getCnpj().equals(fornecedor.getCnpj())) {
				this.fornecedor = new Fornecedor();
				
				return;
			}
		}
		fornecedores.add(fornecedor);
		fornecedor = new Fornecedor();*/
	}
	
	public void cancelar(){
		MessageUtil.warn("Cancelado", "Cancelado" + " Cancelado o cadastro!");
		fornecedor = new Fornecedor();
	}
	
	public void alterar(Fornecedor fornecedor){
		this.fornecedor = fornecedor;
	}
	
	public void excluir(Fornecedor fornecedor){
		MessageUtil.warn("", fornecedor.getNome() + " Foi Excluido!" );		
		//fornecedores.remove(fornecedor);*/
		dao.excluir(fornecedor.getId());
		fornecedores = dao.consultar();
		
	}
	
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

}
