package br.com.tt.pet.bean.ManagedBean;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.tt.model.Pet;
import br.com.tt.pet.dao.Dao;
import br.com.tt.util.faces.MessageUtil;

@ManagedBean
@SessionScoped


public class PetBean {
	
	private Pet pet = new Pet();
	private List<Pet> pets = new ArrayList<Pet>();
	private Dao<Pet> dao = new Dao<Pet>(Pet.class);
	
	@PostConstruct
	private void init(){
		pets = dao.consultar();
	}
	
	public Pet getPet() {
		return pet;
	}


	public void setPet(Pet pet) {
		this.pet = pet;
	}


	public void salvar(){
		//pets.add(pet);
		dao.salvar(pet);
		pet = new Pet();
		MessageUtil.info("Pet Salvo", "Pet salvo com sucesso");
		pets = dao.consultar();
		/*
		String detail = "Pet Salvo com sucesso";
		String summary = "Pet Salvo";
		MessageUtil.info(detail, summary);
		//UtilMessage.error(detail, summary);
		 
		System.out.println(pets.size());*/
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
