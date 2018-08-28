package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * The primary key class for the "ProcessoTipoParte" database table.
 * 
 */
@Embeddable
public class ProcessoParteOABPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="numProcesso", insertable=false, updatable=false)
	private long numProcesso;

	@Column(name="codParte", insertable=false, updatable=false)
	private int codParte;

	@Column(name="idAdvogado", insertable=false, updatable=false)
	private int idAdvogado;

	public ProcessoParteOABPK() {
	}

	public long getNumProcesso() {
		return numProcesso;
	}

	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}

	public int getCodParte() {
		return codParte;
	}

	public void setCodParte(int codParte) {
		this.codParte = codParte;
	}

	public int getIdAdvogado() {
		return idAdvogado;
	}

	public void setIdAdvogado(int idAdvogado) {
		this.idAdvogado = idAdvogado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codParte;
		result = prime * result + idAdvogado;
		result = prime * result + (int) (numProcesso ^ (numProcesso >>> 32));
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
		ProcessoParteOABPK other = (ProcessoParteOABPK) obj;
		if (codParte != other.codParte)
			return false;
		if (idAdvogado != other.idAdvogado)
			return false;
		if (numProcesso != other.numProcesso)
			return false;
		return true;
	}
	
}
