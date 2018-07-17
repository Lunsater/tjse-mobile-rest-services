package br.jus.tjse.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Assunto" database table.
 * 
 */
@Entity
@Table(name="Assunto")
@NamedQuery(name="Assunto.findAll", query="SELECT a FROM Assunto a")
public class Assunto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codAssunto")
	private int codAssunto;

	@Column(name="alteracaoDescricao")
	private int alteracaoDescricao;

	@Column(name="codAssuntoRaiz")
	private int codAssuntoRaiz;

	@Column(name="codAssuntoSuperior")
	private int codAssuntoSuperior;

	@Column(name="depreciado")
	private int depreciado;

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
	private int numRevisao;

	//bi-directional many-to-one association to Assunto
	@ManyToOne
	@JoinColumns({
		@JoinColumn(name="numProcesso", referencedColumnName = "numProcesso"),
		@JoinColumn(name="codAssunto", referencedColumnName = "codAssunto")
		})
	private Assunto assunto;

	//bi-directional many-to-one association to Assunto
	@OneToMany(mappedBy="assunto")
	private List<Assunto> assuntos;

	public Assunto() {
	}

	public int getCodAssunto() {
		return this.codAssunto;
	}

	public void setCodAssunto(int codAssunto) {
		this.codAssunto = codAssunto;
	}

	public int getAlteracaoDescricao() {
		return this.alteracaoDescricao;
	}

	public void setAlteracaoDescricao(int alteracaoDescricao) {
		this.alteracaoDescricao = alteracaoDescricao;
	}

	public int getCodAssuntoRaiz() {
		return this.codAssuntoRaiz;
	}

	public void setCodAssuntoRaiz(int codAssuntoRaiz) {
		this.codAssuntoRaiz = codAssuntoRaiz;
	}

	public int getCodAssuntoSuperior() {
		return this.codAssuntoSuperior;
	}

	public void setCodAssuntoSuperior(int codAssuntoSuperior) {
		this.codAssuntoSuperior = codAssuntoSuperior;
	}

	public int getDepreciado() {
		return this.depreciado;
	}

	public void setDepreciado(int depreciado) {
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

	public int getNumRevisao() {
		return this.numRevisao;
	}

	public void setNumRevisao(int numRevisao) {
		this.numRevisao = numRevisao;
	}

	public Assunto getAssunto() {
		return this.assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public List<Assunto> getAssuntos() {
		return this.assuntos;
	}

	public void setAssuntos(List<Assunto> assuntos) {
		this.assuntos = assuntos;
	}

	public Assunto addAssunto(Assunto assunto) {
		getAssuntos().add(assunto);
		assunto.setAssunto(this);

		return assunto;
	}

	public Assunto removeAssunto(Assunto assunto) {
		getAssuntos().remove(assunto);
		assunto.setAssunto(null);

		return assunto;
	}

}