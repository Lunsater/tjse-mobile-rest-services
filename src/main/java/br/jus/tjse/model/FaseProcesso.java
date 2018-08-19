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
 * The persistent class for the "FaseProcesso" database table.
 * 
 */
@Entity
@Table(name="FaseProcesso", schema="Pgrau")
@NamedQuery(name="FaseProcesso.findAll", query="SELECT f FROM FaseProcesso f")
public class FaseProcesso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FaseProcessoPK id;

	@Column(name="codFase")
	private int codFase;

	@Column(name="flgProcessoJulgado")
	private String flgProcessoJulgado;

	//bi-directional many-to-one association to Fase
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codFase", insertable=false, updatable=false)
	private Fase fase;

	public FaseProcesso() {
	}

	public FaseProcessoPK getId() {
		return this.id;
	}

	public void setId(FaseProcessoPK id) {
		this.id = id;
	}

	public int getCodFase() {
		return this.codFase;
	}

	public void setCodFase(int codFase) {
		this.codFase = codFase;
	}

	public String getFlgProcessoJulgado() {
		return this.flgProcessoJulgado;
	}

	public void setFlgProcessoJulgado(String flgProcessoJulgado) {
		this.flgProcessoJulgado = flgProcessoJulgado;
	}

	public Fase getFase() {
		return this.fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

}