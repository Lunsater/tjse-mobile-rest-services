package br.jus.tjse.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the "Fase" database table.
 * 
 */
@Entity
@Table(name="Fase", schema="Pgrau")
@NamedQuery(name="Fase.findAll", query="SELECT f FROM Fase f")
public class Fase implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codFase")
	private int codFase;

	@Column(name="dsFase")
	private String dsFase;

	@Column(name="flgValida")
	private String flgValida;

	//bi-directional many-to-one association to FaseProcesso
	@OneToMany(mappedBy="fase")
	private List<FaseProcesso> faseProcessos;

	public Fase() {
	}

	public int getCodFase() {
		return this.codFase;
	}

	public void setCodFase(int codFase) {
		this.codFase = codFase;
	}

	public String getDsFase() {
		return this.dsFase;
	}

	public void setDsFase(String dsFase) {
		this.dsFase = dsFase;
	}

	public String getFlgValida() {
		return this.flgValida;
	}

	public void setFlgValida(String flgValida) {
		this.flgValida = flgValida;
	}

	public List<FaseProcesso> getFaseProcessos() {
		return this.faseProcessos;
	}

	public void setFaseProcessos(List<FaseProcesso> faseProcessos) {
		this.faseProcessos = faseProcessos;
	}

	public FaseProcesso addFaseProcesso(FaseProcesso faseProcesso) {
		getFaseProcessos().add(faseProcesso);
		faseProcesso.setFase(this);

		return faseProcesso;
	}

	public FaseProcesso removeFaseProcesso(FaseProcesso faseProcesso) {
		getFaseProcessos().remove(faseProcesso);
		faseProcesso.setFase(null);

		return faseProcesso;
	}

}