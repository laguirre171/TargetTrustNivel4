package br.com.tt;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloWorld {
	public String getMessage(){
		return "Olá Mundo, bem vindo ao JSF";
	}

}
