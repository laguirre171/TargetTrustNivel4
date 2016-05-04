package br.com.tt.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MessageBean {
	
	public void info(){
		String string = "Texto da info";
		FacesMessage messageInfo = new FacesMessage(
		FacesMessage.SEVERITY_INFO, "Info", string);
		FacesContext.getCurrentInstance().addMessage(null, messageInfo);
		
	}
	

}
