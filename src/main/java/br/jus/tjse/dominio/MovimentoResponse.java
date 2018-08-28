package br.jus.tjse.dominio;

import java.util.ArrayList;
import java.util.List;

public class MovimentoResponse {
	
	private String numProcesso;
	private List<DadosMovimento> listaMovimentos;

	public String getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}
	public List<DadosMovimento> getListaMovimentos() {
		if (listaMovimentos == null) {
			listaMovimentos = new ArrayList<DadosMovimento>();
		}
		return listaMovimentos;
	}
	public void setListaMovimentos(List<DadosMovimento> listaMovimentos) {
		this.listaMovimentos = listaMovimentos;
	}
	
}
