package br.com.tt.pet.validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import br.com.tt.util.CnpjUtil;
@FacesValidator(value="cnpjValidator")
public class CnpjValidator implements Validator {

	public void validate(FacesContext arg0, UIComponent arg1, Object value) throws ValidatorException {
		FacesMessage message = new FacesMessage();

		if (!CnpjUtil.validar((String) value)) {

			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			message.setSummary("CNPJInválido");
			message.setDetail("CNPJ Inválido");
			throw new ValidatorException(message);
		}
	}

}
