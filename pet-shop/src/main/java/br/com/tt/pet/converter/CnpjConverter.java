package br.com.tt.pet.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.tt.util.CnpjUtil;

@FacesConverter(value = "cnpjConverter")
public class CnpjConverter implements Converter{

	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		return CnpjUtil.removeMascara(value);
	}

	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		// TODO Auto-generated method stub
		return CnpjUtil.adicionarMascara((String)value);
	}
	

}
