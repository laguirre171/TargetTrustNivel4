package br.com.tt.bean;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
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
	
	public void warn(){
		String string = "Verifica a informação";
		Severity severityInfo = FacesMessage.SEVERITY_WARN;
		FacesMessage messageInfo = new FacesMessage(
		severityInfo, "Info", string);
		FacesContext.getCurrentInstance().addMessage(null, messageInfo);
		
	}
	
	public void erro(){
		String string = "tem algo errado";
		Severity severityInfo = FacesMessage.SEVERITY_ERROR;
		FacesMessage messageInfo = new FacesMessage(
		severityInfo, "Info", string);
		FacesContext.getCurrentInstance().addMessage(null, messageInfo);
		
	}
	
	public void fatal(){
		String string = "fatal";
		Severity severityInfo = FacesMessage.SEVERITY_FATAL;
		FacesMessage messageInfo = new FacesMessage(
		severityInfo, "Info", string);
		FacesContext.getCurrentInstance().addMessage(null, messageInfo);
		
	}
	
	

}
