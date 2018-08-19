package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the "NumeracaoUnica" database table.
 * 
 */
@Embeddable
public class NumeracaoUnicaPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="numProcesso")
	private long numProcesso;

	@Column(name="codOrigem")
	private int codOrigem;

	@Column(name="ano")
	private int ano;

	@Column(name="sequencial")
	private int sequencial;

	public NumeracaoUnicaPK() {
	}
	public long getNumProcesso() {
		return this.numProcesso;
	}
	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}
	public int getCodOrigem() {
		return this.codOrigem;
	}
	public void setCodOrigem(int codOrigem) {
		this.codOrigem = codOrigem;
	}
	public int getAno() {
		return this.ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getSequencial() {
		return this.sequencial;
	}
	public void setSequencial(int sequencial) {
		this.sequencial = sequencial;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof NumeracaoUnicaPK)) {
			return false;
		}
		NumeracaoUnicaPK castOther = (NumeracaoUnicaPK)other;
		return 
			(this.numProcesso == castOther.numProcesso)
			&& (this.codOrigem == castOther.codOrigem)
			&& (this.ano == castOther.ano)
			&& (this.sequencial == castOther.sequencial);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.numProcesso ^ (this.numProcesso >>> 32)));
		hash = hash * prime + this.codOrigem;
		hash = hash * prime + this.ano;
		hash = hash * prime + this.sequencial;
		
		return hash;
	}
}