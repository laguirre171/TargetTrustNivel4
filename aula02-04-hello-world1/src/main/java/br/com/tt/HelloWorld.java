package br.com.tt;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {

	public String getMessage() {
		return "Ol� Mundo, Bem Vindo ao JSF";
	}

	public String moverParaPage1() {
		
		return "page1";
	}
}
