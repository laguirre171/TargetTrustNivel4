package br.com.tt.contoller.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class CadastroBean {

	private String nome;

	public String getNome() {
		System.out.println("Passando pelo GET valor = "+nome);
		return nome;
	}

	public void setNome(String nome) {
		System.out.println("Passando pelo SET valor = "+nome);
		this.nome = nome;
	}

}
