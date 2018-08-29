package br.jus.tjse.dominio;

import java.util.Date;

public class DadosMovimento {
	
	private Date dataMovimento;
	private String txtMovimento;
	private String txtIntegra;
	private String flgSigiloso;
	//private List<AnexosMovimento> listaAnexosMovimento;
	
	public DadosMovimento() {
		
	}
	
	public DadosMovimento(Date dataMovimento, String txtMovimento, String txtIntegra, String flgSilgiloso/*,
			List<AnexosMovimento> listaAnexosMovimento*/) {
		super();
		this.dataMovimento = dataMovimento;
		this.txtMovimento = txtMovimento;
		this.txtIntegra = txtIntegra;
		this.flgSigiloso = flgSilgiloso;
		//this.listaAnexosMovimento = listaAnexosMovimento;
	}
	
	public Date getDataMovimento() {
		return dataMovimento;
	}
	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}
	public String getTxtMovimento() {
		return txtMovimento;
	}
	public void setTxtMovimento(String txtMovimento) {
		this.txtMovimento = txtMovimento;
	}
	public String getTxtIntegra() {
		return txtIntegra;
	}
	public void setTxtIntegra(String txtIntegra) {
		this.txtIntegra = txtIntegra;
	}
	public String getFlgSigiloso() {
		return flgSigiloso;
	}
	public void setFlgSigiloso(String flgSigiloso) {
		this.flgSigiloso = flgSigiloso;
	}
	
	/*
	public List<AnexosMovimento> getListaAnexosMovimento() {
		if (listaAnexosMovimento == null) {
			listaAnexosMovimento = new ArrayList<AnexosMovimento>();
		}
		return listaAnexosMovimento;
	}
	public void setListaAnexosMovimento(List<AnexosMovimento> listaAnexosMovimento) {
		this.listaAnexosMovimento = listaAnexosMovimento;
	}
	*/
}
