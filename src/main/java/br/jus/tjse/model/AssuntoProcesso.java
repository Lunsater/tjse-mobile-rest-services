package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "AssuntoProcesso" database table.
 * 
 */
@Entity
@Table(name="AssuntoProcesso", schema="Pgrau")
@NamedQuery(name="AssuntoProcesso.findAll", query="SELECT a FROM AssuntoProcesso a")
public class AssuntoProcesso implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AssuntoProcessoPK id;

	@Column(name="codComplemento")
	private Short codComplemento;

	@Column(name="flgAssuntoPrincipal")
	private String flgAssuntoPrincipal;
	
	@ManyToOne
	@JoinColumn(name="codAssunto", insertable=false, updatable=false)
	private Assunto assunto;

	public AssuntoProcesso() {
	}

	public AssuntoProcessoPK getId() {
		return this.id;
	}

	public void setId(AssuntoProcessoPK id) {
		this.id = id;
	}

	public Short getCodComplemento() {
		return this.codComplemento;
	}

	public void setCodComplemento(Short codComplemento) {
		this.codComplemento = codComplemento;
	}

	public String getFlgAssuntoPrincipal() {
		return this.flgAssuntoPrincipal;
	}

	public void setFlgAssuntoPrincipal(String flgAssuntoPrincipal) {
		this.flgAssuntoPrincipal = flgAssuntoPrincipal;
	}

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

}