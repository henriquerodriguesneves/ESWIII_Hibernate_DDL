package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "paciente")
public class Paciente {
	
	@Id
	@Column(name = "numBeneficiario")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int numBeneficiario;
	
	@Column(name = "nomePaciente")
	@NotNull
	private String nome;
	
	@Column(name = "enderecoPaciente")
	private String endereco;
	
	@Column(name = "telPaciente")
	private String telefone;
	
	public int getNumBeneficiario() {
		return numBeneficiario;
	}
	
	public void setNumBeneficiario(int numBeneficiario) {
		this.numBeneficiario = numBeneficiario;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return "Paciente [numBeneficiario=" + numBeneficiario + ", nome=" + nome + ", endereco=" + endereco
				+ ", telefone=" + telefone + "]";
	}
	
	

}
