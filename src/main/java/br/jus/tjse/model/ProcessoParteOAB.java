package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "ProcessoParteOAB" database table.
 * 
 */
@Entity
@Table(name="ProcessoParteOAB", schema="Pgrau")
@NamedQuery(name="ProcessoParteOAB.findAll", query="SELECT p FROM ProcessoParteOAB p")
public class ProcessoParteOAB implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProcessoParteOABPK id;
	
	@ManyToOne
	@JoinColumn(name="codParte", insertable=false, updatable=false)
	private Parte parte;
	
	@ManyToOne
	@JoinColumn(name="idAdvogado", insertable=false, updatable=false)
	private Advogado advogado;
	
	@ManyToOne
	@JoinColumn(name="codTipoAtuacao", insertable=false, updatable=false)
	private TipoAtuacaoAdv tipoAtuacaoAdv;

	public ProcessoParteOABPK getId() {
		return id;
	}

	public void setId(ProcessoParteOABPK id) {
		this.id = id;
	}

	public Parte getParte() {
		return parte;
	}

	public void setParte(Parte parte) {
		this.parte = parte;
	}

	public Advogado getAdvogado() {
		return advogado;
	}

	public void setAdvogado(Advogado advogado) {
		this.advogado = advogado;
	}

	public TipoAtuacaoAdv getTipoAtuacaoAdv() {
		return tipoAtuacaoAdv;
	}

	public void setTipoAtuacaoAdv(TipoAtuacaoAdv tipoAtuacaoAdv) {
		this.tipoAtuacaoAdv = tipoAtuacaoAdv;
	}

	public ProcessoParteOAB() {
	}

}