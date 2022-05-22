package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "especialidade")
public class Especialidade {
	
	@Id
	@Column(name = "id")
	@NotNull
	private int idEspecialidade;
	
	@Column(name = "especialidade")
	private String especialidade;
	public int getIdEspecialidade() {
		return idEspecialidade;
	}
	public void setIdEspecialidade(int idEspecialidade) {
		this.idEspecialidade = idEspecialidade;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		return "Especialidade [idEspecialidade=" + idEspecialidade + ", especialidade=" + especialidade + "]";
	}
	
	

}
