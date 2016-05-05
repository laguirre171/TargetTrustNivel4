package br.com.tt.controller.bean;

import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class I18n {

	private String idioma = "en";

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public void alteraIdioma(String idioma) {
		this.idioma = idioma;
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		UIViewRoot viewRoot = currentInstance.getViewRoot();
		viewRoot.setLocale(new Locale(this.idioma));
		
	}
}
