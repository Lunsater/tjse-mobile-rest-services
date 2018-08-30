package br.jus.tjse.dominio;

import java.util.Date;

public class DadosMovimento {
	
	private Date dataMovimento;
	private String txtMovimento;
	private String txtIntegra;
	private String flgSigiloso;
	private Boolean temAnexo = false;
	
	public DadosMovimento() {
		
	}
	
	public DadosMovimento(Date dataMovimento, String txtMovimento, String txtIntegra, String flgSilgiloso,
			Boolean temAnexo) {
		super();
		this.dataMovimento = dataMovimento;
		this.txtMovimento = txtMovimento;
		this.txtIntegra = txtIntegra;
		this.flgSigiloso = flgSilgiloso;
		this.temAnexo = temAnexo;
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

	public Boolean getTemAnexo() {
		return temAnexo;
	}

	public void setTemAnexo(Boolean temAnexo) {
		this.temAnexo = temAnexo;
	}	
}
