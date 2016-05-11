package br.com.tt.web;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;
 
public class CountryValueListener implements ValueChangeListener{

	@Override
	public void processValueChange(ValueChangeEvent event)
			throws AbortProcessingException {
		
		CountryBean country = (CountryBean) FacesContext.getCurrentInstance().
			getExternalContext().getSessionMap().get("country");

		country.setLocaleCode(event.getNewValue().toString());
		
	}
	
	
}