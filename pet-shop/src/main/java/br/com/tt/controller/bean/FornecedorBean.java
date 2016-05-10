package br.com.tt.controller.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.model.Fornecedor;
import br.com.tt.pet.util.MessageUtil;

@ManagedBean(name="fornecedorBean")
@SessionScoped
public class FornecedorBean {
	
	private Fornecedor fornecedor = new Fornecedor();
	private List<Fornecedor> fornecedores = 
			new ArrayList<Fornecedor>();
	
	public void salvar(){
		MessageUtil.info("", fornecedor.getNome() + " Cadastrado com sucesso!");
		for (Fornecedor fornecedor : fornecedores) {
			if (this.fornecedor.getCnpj().equals(fornecedor.getCnpj())) {
				this.fornecedor = new Fornecedor();
				
				return;
			}
		}
		fornecedores.add(fornecedor);
		fornecedor = new Fornecedor();
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
		fornecedores.remove(fornecedor);
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
