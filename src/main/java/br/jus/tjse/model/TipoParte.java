package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "TipoParte" database table.
 * 
 */
@Entity
@Table(name="TipoParte", schema = "Custodial")
@NamedQuery(name="TipoParte.findAll", query="SELECT t FROM TipoParte t")
public class TipoParte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codTipoParte")
	private int codTipoParte;

	@Column(name="dsAbreviado")
	private String dsAbreviado;

	@Column(name="dsTipoParte")
	private String dsTipoParte;

	public TipoParte() {
	}

	public int getCodTipoParte() {
		return this.codTipoParte;
	}

	public void setCodTipoParte(int codTipoParte) {
		this.codTipoParte = codTipoParte;
	}

	public String getDsAbreviado() {
		return this.dsAbreviado;
	}

	public void setDsAbreviado(String dsAbreviado) {
		this.dsAbreviado = dsAbreviado;
	}

	public String getDsTipoParte() {
		return this.dsTipoParte;
	}

	public void setDsTipoParte(String dsTipoParte) {
		this.dsTipoParte = dsTipoParte;
	}

}