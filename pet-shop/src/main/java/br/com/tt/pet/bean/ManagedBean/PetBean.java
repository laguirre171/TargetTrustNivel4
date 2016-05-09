package br.com.tt.pet.bean.ManagedBean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import br.com.tt.model.Pet;
import br.com.tt.pet.util.UtilMessage;

@ManagedBean
@SessionScoped


public class PetBean {
	
	private Pet pet = new Pet();
	private List<Pet> pets = new ArrayList<Pet>();
		
	public Pet getPet() {
		return pet;
	}


	public void setPet(Pet pet) {
		this.pet = pet;
	}


	public void salvar(){
		pets.add(pet);
		pet = new Pet();
		
		String detail = "Pet Salvo com sucesso";
		String summary = "Pet Salvo";
		UtilMessage.info(detail, summary);
		//UtilMessage.error(detail, summary);
		System.out.println(pets.size());
	}


	public List<Pet> getPets() {
		return pets;
	}



	/*
	private void MessageInfo(String detail, String summary) {
		FacesContext.getCurrentInstance().addMessage("form-message", new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail));
	}
	*/

	
	
	
}