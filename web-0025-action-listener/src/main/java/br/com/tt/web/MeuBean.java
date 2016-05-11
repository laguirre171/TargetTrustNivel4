package br.com.tt.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@SessionScoped
public class MeuBean {
	public String buttonId;

	public void printIt(ActionEvent event) {
		buttonId = event.getComponent().getClientId();
		System.out.println("teste "+buttonId);

	}

	public String outcome() {
		return "result";
	}
}
