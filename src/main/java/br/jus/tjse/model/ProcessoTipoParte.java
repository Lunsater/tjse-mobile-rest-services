package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "ProcessoTipoParte" database table.
 * 
 */
@Entity
@Table(name="ProcessoTipoParte", schema = "Pgrau")
@NamedQuery(name="ProcessoTipoParte.findAll", query="SELECT p FROM ProcessoTipoParte p")
public class ProcessoTipoParte implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ProcessoTipoPartePK id;

	@Column(name="codEndereco")
	private Integer codEndereco;

	@Column(name="codRepresentante")
	private Integer codRepresentante;

	@Column(name="flgMenor")
	private String flgMenor;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codParte", insertable=false, updatable=false)
	private Parte parte;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codTipoParte", insertable=false, updatable=false)
	private TipoParte tipoParte;

	public ProcessoTipoParte() {
	}

	public ProcessoTipoPartePK getId() {
		return this.id;
	}

	public void setId(ProcessoTipoPartePK id) {
		this.id = id;
	}

	public Integer getCodEndereco() {
		return this.codEndereco;
	}

	public void setCodEndereco(Integer codEndereco) {
		this.codEndereco = codEndereco;
	}

	public Integer getCodRepresentante() {
		return this.codRepresentante;
	}

	public void setCodRepresentante(Integer codRepresentante) {
		this.codRepresentante = codRepresentante;
	}

	public String getFlgMenor() {
		return this.flgMenor;
	}

	public void setFlgMenor(String flgMenor) {
		this.flgMenor = flgMenor;
	}

	public Parte getParte() {
		return parte;
	}

	public void setParte(Parte parte) {
		this.parte = parte;
	}

	public TipoParte getTipoParte() {
		return tipoParte;
	}

	public void setTipoParte(TipoParte tipoParte) {
		this.tipoParte = tipoParte;
	}

}