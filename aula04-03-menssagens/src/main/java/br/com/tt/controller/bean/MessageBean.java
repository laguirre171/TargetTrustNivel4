package br.com.tt.controller.bean;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class MessageBean {

	public void info() {
		String detail = "Texto da \"a\" Info";
		String summary = "Info";
		Severity severityInfo = FacesMessage.SEVERITY_INFO;
		FacesMessage message = new FacesMessage(severityInfo, summary, detail);
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		currentInstance.addMessage(null, message);
	}
	public void warn() {
		String detail = "verificar a informação ";
		String summary = "WARN";
		Severity severityInfo = FacesMessage.SEVERITY_WARN;
		FacesMessage message = new FacesMessage(severityInfo, summary, detail);
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		currentInstance.addMessage(null, message);
	}
	public void error() {
		String detail = "tem alguma coisa errada ";
		String summary = "ERROR";
		Severity severityInfo = FacesMessage.SEVERITY_ERROR;
		FacesMessage message = new FacesMessage(severityInfo, summary, detail);
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		currentInstance.addMessage(null, message);
	}
	public void fatal() {
		String detail = " erro fatal ";
		String summary = "FATAL";
		Severity severityInfo = FacesMessage.SEVERITY_FATAL;
		FacesMessage message = new FacesMessage(severityInfo, summary, detail);
		FacesContext currentInstance = FacesContext.getCurrentInstance();
		currentInstance.addMessage(null, message);
	}
	
	public void all(){
		info();
		warn();
		error();
		fatal();
	}

}
