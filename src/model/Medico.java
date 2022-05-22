package model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "medico")
public class Medico {
	
	@Id
	@Column(name = "codigoMedico")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private int codigo;
	
	@Column(name = "nomeMedico")
	@NotNull
	private String nome;
	
	@Column(name = "logradouroMedico")
	private String logradouro;
	
	@Column(name = "numEnderecoMedico")
	private int numEndereco;
	
	@Column(name = "cepMedico")
	private int cep;
	
	@Column(name = "telMedico")
	private String telefone;
	
	@Column(name = "idEspecialidade")
	@NotNull
	private String especialidade;
	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumEndereco() {
		return numEndereco;
	}
	public void setNumEndereco(int numEndereco) {
		this.numEndereco = numEndereco;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	@Override
	public String toString() {
		return "Medico [codigo=" + codigo + ", nome=" + nome + ", logradouro=" + logradouro + ", numEndereco="
				+ numEndereco + ", cep=" + cep + ", telefone=" + telefone + ", especialidade=" + especialidade + "]";
	}
	
	
	

}
