package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "Movimento" database table.
 * 
 */
@Entity
@Table(name="Movimento", schema="Custodial")
@NamedQuery(name="Movimento.findAll", query="SELECT m FROM Movimento m")
public class Movimento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codMovimento")
	private Integer codMovimento;

	@Column(name="dsMovimento")
	private String dsMovimento;

	@Column(name="flgHomologavel")
	private String flgHomologavel;

	@Column(name="flgManterDestinoProcesso")
	private String flgManterDestinoProcesso;

	@Column(name="flgRelevante")
	private String flgRelevante;

	@Column(name="idMovimentoCNJ")
	private Integer idMovimentoCNJ;

	public Movimento() {
	}

	public Integer getCodMovimento() {
		return this.codMovimento;
	}

	public void setCodMovimento(Integer codMovimento) {
		this.codMovimento = codMovimento;
	}

	public String getDsMovimento() {
		return this.dsMovimento;
	}

	public void setDsMovimento(String dsMovimento) {
		this.dsMovimento = dsMovimento;
	}

	public String getFlgHomologavel() {
		return this.flgHomologavel;
	}

	public void setFlgHomologavel(String flgHomologavel) {
		this.flgHomologavel = flgHomologavel;
	}

	public String getFlgManterDestinoProcesso() {
		return this.flgManterDestinoProcesso;
	}

	public void setFlgManterDestinoProcesso(String flgManterDestinoProcesso) {
		this.flgManterDestinoProcesso = flgManterDestinoProcesso;
	}

	public String getFlgRelevante() {
		return this.flgRelevante;
	}

	public void setFlgRelevante(String flgRelevante) {
		this.flgRelevante = flgRelevante;
	}

	public Integer getIdMovimentoCNJ() {
		return this.idMovimentoCNJ;
	}

	public void setIdMovimentoCNJ(Integer idMovimentoCNJ) {
		this.idMovimentoCNJ = idMovimentoCNJ;
	}

}