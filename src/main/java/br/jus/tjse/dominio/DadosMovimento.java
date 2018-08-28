package br.jus.tjse.dominio;

import java.util.Date;

public class DadosMovimento {
	
	private Date dataMovimento;
	private String txtMovimento;
	private String txtIntegra;
	private String flgSilgiloso;

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
	public String getFlgSilgiloso() {
		return flgSilgiloso;
	}
	public void setFlgSilgiloso(String flgSilgiloso) {
		this.flgSilgiloso = flgSilgiloso;
	}
	
}
