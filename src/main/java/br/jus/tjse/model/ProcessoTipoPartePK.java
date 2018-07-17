package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the "ProcessoTipoParte" database table.
 * 
 */
@Embeddable
public class ProcessoTipoPartePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="numProcesso", insertable=false, updatable=false)
	private long numProcesso;

	@Column(name="codParte", insertable=false, updatable=false)
	private int codParte;

	@Column(name="codTipoParte", insertable=false, updatable=false)
	private int codTipoParte;

	public ProcessoTipoPartePK() {
	}
	public long getNumProcesso() {
		return this.numProcesso;
	}
	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}
	public int getCodParte() {
		return this.codParte;
	}
	public void setCodParte(int codParte) {
		this.codParte = codParte;
	}
	public int getCodTipoParte() {
		return this.codTipoParte;
	}
	public void setCodTipoParte(int codTipoParte) {
		this.codTipoParte = codTipoParte;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ProcessoTipoPartePK)) {
			return false;
		}
		ProcessoTipoPartePK castOther = (ProcessoTipoPartePK)other;
		return 
			(this.numProcesso == castOther.numProcesso)
			&& (this.codParte == castOther.codParte)
			&& (this.codTipoParte == castOther.codTipoParte);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.numProcesso ^ (this.numProcesso >>> 32)));
		hash = hash * prime + this.codParte;
		hash = hash * prime + this.codTipoParte;
		
		return hash;
	}
}