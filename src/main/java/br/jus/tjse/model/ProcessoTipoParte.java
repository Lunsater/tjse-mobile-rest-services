package br.jus.tjse.model;

import java.io.Serializable;
import java.sql.Timestamp;

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
	private int codEndereco;

	@Column(name="codRepresentante")
	private int codRepresentante;

	@Column(name="codUsuarioDesvinculacao")
	private int codUsuarioDesvinculacao;

	@Column(name="dtDesvinculacao")
	private Timestamp dtDesvinculacao;

	@Column(name="flgMenor")
	private String flgMenor;

	//bi-directional many-to-one association to Processo
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="numProcesso", referencedColumnName = "numProcesso", insertable=false, updatable=false)
	private Processo processo;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="codParte", referencedColumnName = "codParte", insertable=false, updatable=false)
	private Parte parte;

	public ProcessoTipoParte() {
	}

	public ProcessoTipoPartePK getId() {
		return this.id;
	}

	public void setId(ProcessoTipoPartePK id) {
		this.id = id;
	}

	public int getCodEndereco() {
		return this.codEndereco;
	}

	public void setCodEndereco(int codEndereco) {
		this.codEndereco = codEndereco;
	}

	public int getCodRepresentante() {
		return this.codRepresentante;
	}

	public void setCodRepresentante(int codRepresentante) {
		this.codRepresentante = codRepresentante;
	}

	public int getCodUsuarioDesvinculacao() {
		return this.codUsuarioDesvinculacao;
	}

	public void setCodUsuarioDesvinculacao(int codUsuarioDesvinculacao) {
		this.codUsuarioDesvinculacao = codUsuarioDesvinculacao;
	}

	public Timestamp getDtDesvinculacao() {
		return this.dtDesvinculacao;
	}

	public void setDtDesvinculacao(Timestamp dtDesvinculacao) {
		this.dtDesvinculacao = dtDesvinculacao;
	}

	public String getFlgMenor() {
		return this.flgMenor;
	}

	public void setFlgMenor(String flgMenor) {
		this.flgMenor = flgMenor;
	}

	public Processo getProcesso() {
		return this.processo;
	}

	public void setProcesso(Processo processo) {
		this.processo = processo;
	}

}