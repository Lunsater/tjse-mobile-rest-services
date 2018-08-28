package br.jus.tjse.dominio;

import java.util.List;

public class ParteAdvogadoResponse {
	
	private String numProcesso;
	private List<DadosParte> listaPartes;

	public String getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}
	public List<DadosParte> getListaPartes() {
		return listaPartes;
	}
	public void setListaPartes(List<DadosParte> listaPartes) {
		this.listaPartes = listaPartes;
	}
	
}
