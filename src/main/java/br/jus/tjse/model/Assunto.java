package br.jus.tjse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Assunto" database table.
 * 
 */
@Entity
@Table(name="Assunto", schema="CNJ")
@NamedQuery(name="Assunto.findAll", query="SELECT a FROM Assunto a")
public class Assunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codAssunto")
	private Integer codAssunto;

	@Column(name="alteracaoDescricao")
	private Integer alteracaoDescricao;

	@ManyToOne
	@JoinColumn(name="codAssuntoRaiz", referencedColumnName="codAssunto")
	private Assunto assuntoRaiz;

	private Integer codAssuntoSuperior;

	@Column(name="depreciado")
	private Integer depreciado;

	@Column(name="dsAssunto")
	private String dsAssunto;

	@Column(name="dsAssuntoCompleto")
	private String dsAssuntoCompleto;

	@Temporal(TemporalType.DATE)
	@Column(name="dtDesativacao")
	private Date dtDesativacao;

	@Temporal(TemporalType.DATE)
	@Column(name="dtInclusao")
	private Date dtInclusao;

	@Column(name="flgAssuntoTree")
	private String flgAssuntoTree;

	@Column(name="numRevisao")
	private Integer numRevisao;

	public Assunto() {
	}

	public Integer getCodAssunto() {
		return this.codAssunto;
	}

	public void setCodAssunto(Integer codAssunto) {
		this.codAssunto = codAssunto;
	}

	public Integer getAlteracaoDescricao() {
		return this.alteracaoDescricao;
	}

	public void setAlteracaoDescricao(Integer alteracaoDescricao) {
		this.alteracaoDescricao = alteracaoDescricao;
	}

	public Assunto getAssuntoRaiz() {
		return this.assuntoRaiz;
	}

	public void setAssuntoRaiz(Assunto assuntoRaiz) {
		this.assuntoRaiz = assuntoRaiz;
	}

	public Integer getCodAssuntoSuperior() {
		return this.codAssuntoSuperior;
	}

	public void setCodAssuntoSuperior(Integer codAssuntoSuperior) {
		this.codAssuntoSuperior = codAssuntoSuperior;
	}

	public Integer getDepreciado() {
		return this.depreciado;
	}

	public void setDepreciado(Integer depreciado) {
		this.depreciado = depreciado;
	}

	public String getDsAssunto() {
		return this.dsAssunto;
	}

	public void setDsAssunto(String dsAssunto) {
		this.dsAssunto = dsAssunto;
	}

	public String getDsAssuntoCompleto() {
		return this.dsAssuntoCompleto;
	}

	public void setDsAssuntoCompleto(String dsAssuntoCompleto) {
		this.dsAssuntoCompleto = dsAssuntoCompleto;
	}

	public Date getDtDesativacao() {
		return this.dtDesativacao;
	}

	public void setDtDesativacao(Date dtDesativacao) {
		this.dtDesativacao = dtDesativacao;
	}

	public Date getDtInclusao() {
		return this.dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public String getFlgAssuntoTree() {
		return this.flgAssuntoTree;
	}

	public void setFlgAssuntoTree(String flgAssuntoTree) {
		this.flgAssuntoTree = flgAssuntoTree;
	}

	public Integer getNumRevisao() {
		return this.numRevisao;
	}

	public void setNumRevisao(Integer numRevisao) {
		this.numRevisao = numRevisao;
	}

}