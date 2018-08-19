package br.jus.tjse.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "NumeracaoUnica" database table.
 * 
 */
@Entity
@Table(name="NumeracaoUnica", schema="Pgrau")
@NamedQuery(name="NumeracaoUnica.findAll", query="SELECT n FROM NumeracaoUnica n")
public class NumeracaoUnica implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private NumeracaoUnicaPK id;

	@Column(name="codCompetencia")
	private int codCompetencia;

	@Column(name="numeroUnico")
	private String numeroUnico;

	@Column(name="numeroUnicoAnterior")
	private String numeroUnicoAnterior;

	public NumeracaoUnica() {
	}

	public NumeracaoUnicaPK getId() {
		return this.id;
	}

	public void setId(NumeracaoUnicaPK id) {
		this.id = id;
	}

	public int getCodCompetencia() {
		return this.codCompetencia;
	}

	public void setCodCompetencia(int codCompetencia) {
		this.codCompetencia = codCompetencia;
	}

	public String getNumeroUnico() {
		return this.numeroUnico;
	}

	public void setNumeroUnico(String numeroUnico) {
		this.numeroUnico = numeroUnico;
	}

	public String getNumeroUnicoAnterior() {
		return this.numeroUnicoAnterior;
	}

	public void setNumeroUnicoAnterior(String numeroUnicoAnterior) {
		this.numeroUnicoAnterior = numeroUnicoAnterior;
	}

}