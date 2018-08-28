package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the "AnexosMovimento" database table.
 * 
 */
@Embeddable
public class AnexosMovimentoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="numProcesso", insertable=false, updatable=false)
	private long numProcesso;

	@Column(name="codMovimento", insertable=false, updatable=false)
	private int codMovimento;

	@Temporal(TemporalType.DATE)
	@Column(name="dtMovimento", insertable=false, updatable=false)
	private java.util.Date dtMovimento;

	@Column(name="seqMovimento", insertable=false, updatable=false)
	private int seqMovimento;

	@Temporal(TemporalType.DATE)
	@Column(name="dtAnexo")
	private java.util.Date dtAnexo;

	@Column(name="seqAnexo")
	private int seqAnexo;

	public AnexosMovimentoPK() {
	}
	public long getNumProcesso() {
		return this.numProcesso;
	}
	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}
	public int getCodMovimento() {
		return this.codMovimento;
	}
	public void setCodMovimento(int codMovimento) {
		this.codMovimento = codMovimento;
	}
	public java.util.Date getDtMovimento() {
		return this.dtMovimento;
	}
	public void setDtMovimento(java.util.Date dtMovimento) {
		this.dtMovimento = dtMovimento;
	}
	public int getSeqMovimento() {
		return this.seqMovimento;
	}
	public void setSeqMovimento(int seqMovimento) {
		this.seqMovimento = seqMovimento;
	}
	public java.util.Date getDtAnexo() {
		return this.dtAnexo;
	}
	public void setDtAnexo(java.util.Date dtAnexo) {
		this.dtAnexo = dtAnexo;
	}
	public int getSeqAnexo() {
		return this.seqAnexo;
	}
	public void setSeqAnexo(int seqAnexo) {
		this.seqAnexo = seqAnexo;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AnexosMovimentoPK)) {
			return false;
		}
		AnexosMovimentoPK castOther = (AnexosMovimentoPK)other;
		return 
			(this.numProcesso == castOther.numProcesso)
			&& (this.codMovimento == castOther.codMovimento)
			&& this.dtMovimento.equals(castOther.dtMovimento)
			&& (this.seqMovimento == castOther.seqMovimento)
			&& this.dtAnexo.equals(castOther.dtAnexo)
			&& (this.seqAnexo == castOther.seqAnexo);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + ((int) (this.numProcesso ^ (this.numProcesso >>> 32)));
		hash = hash * prime + this.codMovimento;
		hash = hash * prime + this.dtMovimento.hashCode();
		hash = hash * prime + this.seqMovimento;
		hash = hash * prime + this.dtAnexo.hashCode();
		hash = hash * prime + this.seqAnexo;
		
		return hash;
	}
}