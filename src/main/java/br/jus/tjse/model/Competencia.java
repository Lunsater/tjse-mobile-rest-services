package br.jus.tjse.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the "Competencia" database table.
 * 
 */
@Entity
@Table(name="Competencia", schema="TJSE")
@NamedQuery(name="Competencia.findAll", query="SELECT c FROM Competencia c")
public class Competencia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codCompetencia")
	private int codCompetencia;

	@Column(name="bairro")
	private String bairro;

	@Column(name="cep")
	private String cep;

	@Column(name="cidade")
	private String cidade;

	@Column(name="classificacao")
	private int classificacao;

	@Column(name="CNPJBanese")
	private String CNPJBanese;

	@Column(name="codComarca")
	private int codComarca;

	@Column(name="Competencia")
	private int competencia;

	@Column(name="defensor")
	private String defensor;

	@Column(name="email")
	private String email;

	@Column(name="endereco")
	private String endereco;

	@Column(name="escrivaoChefeSecretaria")
	private String escrivaoChefeSecretaria;

	@Column(name="flagExtinto")
	private String flagExtinto;

	@Column(name="flagSorteioSemanal")
	private String flagSorteioSemanal;

	@Column(name="juiz")
	private String juiz;

	@Column(name="juizadoVirtual")
	private String juizadoVirtual;

	@Column(name="nome")
	private String nome;

	@Column(name="oficio")
	private String oficio;

	@Column(name="oficio1")
	private String oficio1;

	@Column(name="oficio2")
	private String oficio2;

	@Column(name="orgaoAssociado")
	private BigDecimal orgaoAssociado;

	@Column(name="promotor")
	private String promotor;

	@Column(name="regiao")
	private String regiao;

	@Column(name="telefone")
	private String telefone;

	@Column(name="uf")
	private String uf;

	public Competencia() {
	}

	public int getCodCompetencia() {
		return this.codCompetencia;
	}

	public void setCodCompetencia(int codCompetencia) {
		this.codCompetencia = codCompetencia;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public int getClassificacao() {
		return this.classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public String getCNPJBanese() {
		return this.CNPJBanese;
	}

	public void setCNPJBanese(String CNPJBanese) {
		this.CNPJBanese = CNPJBanese;
	}

	public int getCodComarca() {
		return this.codComarca;
	}

	public void setCodComarca(int codComarca) {
		this.codComarca = codComarca;
	}

	public int getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(int competencia) {
		this.competencia = competencia;
	}

	public String getDefensor() {
		return this.defensor;
	}

	public void setDefensor(String defensor) {
		this.defensor = defensor;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEscrivaoChefeSecretaria() {
		return this.escrivaoChefeSecretaria;
	}

	public void setEscrivaoChefeSecretaria(String escrivaoChefeSecretaria) {
		this.escrivaoChefeSecretaria = escrivaoChefeSecretaria;
	}

	public String getFlagExtinto() {
		return this.flagExtinto;
	}

	public void setFlagExtinto(String flagExtinto) {
		this.flagExtinto = flagExtinto;
	}

	public String getFlagSorteioSemanal() {
		return this.flagSorteioSemanal;
	}

	public void setFlagSorteioSemanal(String flagSorteioSemanal) {
		this.flagSorteioSemanal = flagSorteioSemanal;
	}

	public String getJuiz() {
		return this.juiz;
	}

	public void setJuiz(String juiz) {
		this.juiz = juiz;
	}

	public String getJuizadoVirtual() {
		return this.juizadoVirtual;
	}

	public void setJuizadoVirtual(String juizadoVirtual) {
		this.juizadoVirtual = juizadoVirtual;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getOficio() {
		return this.oficio;
	}

	public void setOficio(String oficio) {
		this.oficio = oficio;
	}

	public String getOficio1() {
		return this.oficio1;
	}

	public void setOficio1(String oficio1) {
		this.oficio1 = oficio1;
	}

	public String getOficio2() {
		return this.oficio2;
	}

	public void setOficio2(String oficio2) {
		this.oficio2 = oficio2;
	}

	public BigDecimal getOrgaoAssociado() {
		return this.orgaoAssociado;
	}

	public void setOrgaoAssociado(BigDecimal orgaoAssociado) {
		this.orgaoAssociado = orgaoAssociado;
	}

	public String getPromotor() {
		return this.promotor;
	}

	public void setPromotor(String promotor) {
		this.promotor = promotor;
	}

	public String getRegiao() {
		return this.regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getUf() {
		return this.uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

}