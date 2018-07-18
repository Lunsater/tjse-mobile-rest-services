package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the "AssuntoProcesso" database table.
 * 
 */
@Embeddable
public class AssuntoProcessoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="numProcesso")
	private long numProcesso;

	@Column(name="codAssunto")
	private int codAssunto;

	public AssuntoProcessoPK() {
	}
	public long getNumProcesso() {
		return this.numProcesso;
	}
	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}
	public int getCodAssunto() {
		return this.codAssunto;
	}
	public void setCodAssunto(int codAssunto) {
		this.codAssunto = codAssunto;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AssuntoProcessoPK)) {
			return false;
		}
		AssuntoProcessoPK castOther = (AssuntoProcessoPK)other;
		return 
			(this.numProcesso == castOther.numProcesso)
			&& (this.codAssunto == castOther.codAssunto);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.numProcesso ^ (this.numProcesso >>> 32)));
		hash = hash * prime + this.codAssunto;
		
		return hash;
	}
}