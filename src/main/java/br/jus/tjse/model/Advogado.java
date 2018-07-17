package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Advogado", schema="Corp")
public class Advogado implements Serializable {
	
	private static final long serialVersionUID = 5216440703152597707L;

	@Id
	@Column(name="IdAdvogado", nullable=false)
	private Integer Id;
	
	@Column(name="CodOAB", nullable=false)
	private String codOAB;
	
	@Column(name="CodUFOAB", nullable=false)
	private String codUFOAB;
	
	@Column(name="TipoInscricao")
	private String tipoInscricao;
	
	@Column(name="NomeAdvogado", nullable=false)
	private String nomeAdvogado;
	
	@Column(name="CodSenhaInternet", nullable=false)
	private String codSenhaInternet;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getCodOAB() {
		return codOAB;
	}
	public void setCodOAB(String codOAB) {
		this.codOAB = codOAB;
	}
	public String getCodUFOAB() {
		return codUFOAB;
	}
	public void setCodUFOAB(String codUFOAB) {
		this.codUFOAB = codUFOAB;
	}
	public String getTipoInscricao() {
		return tipoInscricao;
	}
	public void setTipoInscricao(String tipoInscricao) {
		this.tipoInscricao = tipoInscricao;
	}
	public String getNomeAdvogado() {
		return nomeAdvogado;
	}
	public void setNomeAdvogado(String nomeAdvogado) {
		this.nomeAdvogado = nomeAdvogado;
	}
	public String getCodSenhaInternet() {
		return codSenhaInternet;
	}
	public void setCodSenhaInternet(String codSenhaInternet) {
		this.codSenhaInternet = codSenhaInternet;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Advogado other = (Advogado) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}
	
}
