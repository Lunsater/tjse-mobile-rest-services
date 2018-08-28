package br.jus.tjse.dominio;

import java.util.ArrayList;
import java.util.List;

public class DadosParte {
	private String tipoParte;
	private String nome;
	List<DadosAdvogado> listaAdvogados;

	public String getTipoParte() {
		return tipoParte;
	}
	public void setTipoParte(String tipoParte) {
		this.tipoParte = tipoParte;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<DadosAdvogado> getListaAdvogados() {
		if (listaAdvogados == null) {
			listaAdvogados = new ArrayList<DadosAdvogado>();
		}
		return listaAdvogados;
	}
	public void setListaAdvogados(List<DadosAdvogado> listaAdvogados) {
		this.listaAdvogados = listaAdvogados;
	}
	
}
