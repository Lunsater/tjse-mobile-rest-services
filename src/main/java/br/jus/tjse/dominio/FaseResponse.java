package br.jus.tjse.dominio;

import java.util.ArrayList;
import java.util.List;

public class FaseResponse {
	
	private String numProcesso;
	private List<DadosFase> listaFases;
	
	public String getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}
	public List<DadosFase> getListaFases() {
		if (listaFases == null) {
			listaFases = new ArrayList<DadosFase>();
		}
		return listaFases;
	}
	public void setListaFases(List<DadosFase> listaFases) {
		this.listaFases = listaFases;
	}

}
