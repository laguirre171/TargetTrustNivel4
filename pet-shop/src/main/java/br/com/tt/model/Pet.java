package br.com.tt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Pet {
	@Id
	@SequenceGenerator(name="pet_seq", 
						sequenceName="pet_seq", 
						allocationSize =1)
	@GeneratedValue(generator="pet_seq",
	strategy = GenerationType.SEQUENCE)
	private Long id;
	private String nome;
	private String cor;
	private String raca;
	private String especie;
	private String sexo;
		
	public Long getId() {
		return id;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
