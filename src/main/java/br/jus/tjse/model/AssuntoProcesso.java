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
 * The persistent class for the "AssuntoProcesso" database table.
 * 
 */
@Entity
@Table(name="AssuntoProcesso")
@NamedQuery(name="AssuntoProcesso.findAll", query="SELECT a FROM AssuntoProcesso a")
public class AssuntoProcesso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AssuntoProcessoPK id;

	@Column(name="codComplemento")
	private short codComplemento;

	@Column(name="flgAssuntoPrincipal")
	private String flgAssuntoPrincipal;

	//bi-directional many-to-one association to Processo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="numProcesso", insertable=false, updatable=false)
	private Processo processo;

	public AssuntoProcesso() {
	}

	public AssuntoProcessoPK getId() {
		return this.id;
	}

	public void setId(AssuntoProcessoPK id) {
		this.id = id;
	}

	public short getCodComplemento() {
		return this.codComplemento;
	}

	public void setCodComplemento(short codComplemento) {
		this.codComplemento = codComplemento;
	}

	public String getFlgAssuntoPrincipal() {
		return this.flgAssuntoPrincipal;
	}

	public void setFlgAssuntoPrincipal(String flgAssuntoPrincipal) {
		this.flgAssuntoPrincipal = flgAssuntoPrincipal;
	}

	public Processo getProcesso() {
		return this.processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

}