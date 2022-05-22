package model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "consulta")
public class Consulta {
	
	@Id
	@Column(name = "dataConsulta")
	@NotNull
	private LocalDate dataConsulta;
	
	@OneToOne
	@JoinColumn(name = "numBeneficario")
	@NotNull
	private int numBeneficiario;
	
	@OneToOne
	@JoinColumn(name = "codigoMedico")
	@NotNull
	private int codigoMedico;
	
	@Column(name = "prontuario")
	private String prontuario;
	public String getProntuario() {
		return prontuario;
	}
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	public LocalDate getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(LocalDate dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	public int getNumBeneficiario() {
		return numBeneficiario;
	}
	public void setNumBeneficiario(int numBeneficiario) {
		this.numBeneficiario = numBeneficiario;
	}
	public int getCodigoMedico() {
		return codigoMedico;
	}
	public void setCodigoMedico(int codigoMedico) {
		this.codigoMedico = codigoMedico;
	}
	@Override
	public String toString() {
		return "Consulta [dataConsulta=" + dataConsulta + ", numBeneficiario=" + numBeneficiario + ", codigoMedico="
				+ codigoMedico + ", prontuario=" + prontuario + "]";
	}
	
	
	

}
