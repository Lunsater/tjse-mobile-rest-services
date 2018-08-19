package br.jus.tjse.dominio;

import java.util.Date;

public class ProcessoResponse {
	
	private Date dataDistribuicao;
	private String numProcesso;
	private String numUnico;
	private String assunto;
	private String competencia;
	private Integer qtdMovimentos;
	private String ultimaFase;
	private Integer qtdFases;
	private Integer qtdDecisoes;	
	private Integer qtdPartes;

	public Date getDataDistribuicao() {
		return dataDistribuicao;
	}
	public void setDataDistribuicao(Date dataDistribuicao) {
		this.dataDistribuicao = dataDistribuicao;
	}
	public String getNumProcesso() {
		return numProcesso;
	}
	public void setNumProcesso(String numProcesso) {
		this.numProcesso = numProcesso;
	}
	public String getNumUnico() {
		return numUnico;
	}
	public void setNumUnico(String numUnico) {
		this.numUnico = numUnico;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public String getCompetencia() {
		return competencia;
	}
	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}
	public Integer getQtdMovimentos() {
		return qtdMovimentos;
	}
	public void setQtdMovimentos(Integer qtdMovimentos) {
		this.qtdMovimentos = qtdMovimentos;
	}
	public String getUltimaFase() {
		return ultimaFase;
	}
	public void setUltimaFase(String ultimaFase) {
		this.ultimaFase = ultimaFase;
	}
	public Integer getQtdFases() {
		return qtdFases;
	}
	public void setQtdFases(Integer qtdFases) {
		this.qtdFases = qtdFases;
	}
	public Integer getQtdDecisoes() {
		return qtdDecisoes;
	}
	public void setQtdDecisoes(Integer qtdDecisoes) {
		this.qtdDecisoes = qtdDecisoes;
	}
	public Integer getQtdPartes() {
		return qtdPartes;
	}
	public void setQtdPartes(Integer qtdPartes) {
		this.qtdPartes = qtdPartes;
	}
	
}