package br.jus.tjse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "TipoAtuacaoAdv" database table.
 * 
 */
@Entity
@Table(name="TipoAtuacaoAdv", schema = "Custodial")
@NamedQuery(name="TipoAtuacaoAdv.findAll", query="SELECT t FROM TipoAtuacaoAdv t")
public class TipoAtuacaoAdv implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codTipoAtuacao")
	private short codTipoAtuacao;

	@Column(name="dsTipoAtuacao")
	private String dsTipoAtuacao;

	@Temporal(TemporalType.DATE)
	@Column(name="dtDesativacao")
	private Date dtDesativacao;

	public TipoAtuacaoAdv() {
	}

	public short getCodTipoAtuacao() {
		return this.codTipoAtuacao;
	}

	public void setCodTipoAtuacao(short codTipoAtuacao) {
		this.codTipoAtuacao = codTipoAtuacao;
	}

	public String getDsTipoAtuacao() {
		return this.dsTipoAtuacao;
	}

	public void setDsTipoAtuacao(String dsTipoAtuacao) {
		this.dsTipoAtuacao = dsTipoAtuacao;
	}

	public Date getDtDesativacao() {
		return this.dtDesativacao;
	}

	public void setDtDesativacao(Date dtDesativacao) {
		this.dtDesativacao = dtDesativacao;
	}

}