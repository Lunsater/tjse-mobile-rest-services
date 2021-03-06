package br.jus.tjse.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Processo" database table.
 * 
 */
@Entity
@Table(name="Processo", schema = "Pgrau")
@NamedQuery(name="Processo.findAll", query="SELECT p FROM Processo p")
public class Processo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="numProcesso")
	private Long numProcesso;

	@Column(name="codAcao")
	private Short codAcao;

	@Column(name="codCategoria")
	private Short codCategoria;

	@Column(name="codClasse")
	private Integer codClasse;

	@Column(name="codClasseCNJ")
	private Short codClasseCNJ;

	@ManyToOne
	@JoinColumn(name="codCompetencia")
	private Competencia competencia;

	@Column(name="codDestino")
	private Integer codDestino;

	@Column(name="codFase")
	private Integer codFase;

	@Column(name="codMovimento")
	private Integer codMovimento;

	@Column(name="codMovimentoRelevante")
	private Short codMovimentoRelevante;

	@Column(name="codTipoProcesso")
	private Short codTipoProcesso;

	@Column(name="codUsuario")
	private Long codUsuario;

	@Temporal(TemporalType.DATE)
	@Column(name="dtBaixa")
	private Date dtBaixa;

	@Temporal(TemporalType.DATE)
	@Column(name="dtDistribuicao")
	private Date dtDistribuicao;

	@Temporal(TemporalType.DATE)
	@Column(name="dtJulgamento")
	private Date dtJulgamento;

	@Temporal(TemporalType.DATE)
	@Column(name="dtMovimento")
	private Date dtMovimento;

	@Temporal(TemporalType.DATE)
	@Column(name="dtMovimentoRelevante")
	private Date dtMovimentoRelevante;

	@Temporal(TemporalType.DATE)
	@Column(name="dtTransitoJulgado")
	private Date dtTransitoJulgado;

	@Temporal(TemporalType.DATE)
	@Column(name="dtVirtualizacao")
	private Date dtVirtualizacao;

	@Column(name="flgApenso")
	private String flgApenso;

	@Column(name="flgJulgado")
	private String flgJulgado;

	@Column(name="flgSegredoJustica")
	private String flgSegredoJustica;

	@Column(name="flgSigiloso")
	private String flgSigiloso;

	@Column(name="flgSuspenso")
	private String flgSuspenso;

	@Column(name="flgVirtual")
	private String flgVirtual;

	@Column(name="numProcOrigem")
	private String numProcOrigem;

	@Column(name="seqMovimento")
	private Integer seqMovimento;

	@Column(name="seqMovimentoRelevante")
	private Integer seqMovimentoRelevante;

	@Column(name="tpOrigem")
	private Short tpOrigem;

	@Column(name="vlCausa")
	private BigDecimal vlCausa;

	@OneToMany
	@JoinColumn(name="numProcesso")
	private List<ProcessoTipoParte> processoTipoPartes;
	
	@OneToMany
	@JoinColumn(name="numProcesso")
	private List<AssuntoProcesso> assuntoProcessos;

	public Processo() {
	}

	public Long getNumProcesso() {
		return this.numProcesso;
	}

	public void setNumProcesso(long numProcesso) {
		this.numProcesso = numProcesso;
	}

	public Short getCodAcao() {
		return this.codAcao;
	}

	public void setCodAcao(short codAcao) {
		this.codAcao = codAcao;
	}

	public Short getCodCategoria() {
		return this.codCategoria;
	}

	public void setCodCategoria(short codCategoria) {
		this.codCategoria = codCategoria;
	}

	public Integer getCodClasse() {
		return this.codClasse;
	}

	public void setCodClasse(int codClasse) {
		this.codClasse = codClasse;
	}

	public Short getCodClasseCNJ() {
		return this.codClasseCNJ;
	}

	public void setCodClasseCNJ(short codClasseCNJ) {
		this.codClasseCNJ = codClasseCNJ;
	}

	public Competencia getCompetencia() {
		return this.competencia;
	}

	public void setCompetencia(Competencia competencia) {
		this.competencia = competencia;
	}

	public Integer getCodDestino() {
		return this.codDestino;
	}

	public void setCodDestino(int codDestino) {
		this.codDestino = codDestino;
	}

	public Integer getCodFase() {
		return this.codFase;
	}

	public void setCodFase(int codFase) {
		this.codFase = codFase;
	}

	public Integer getCodMovimento() {
		return this.codMovimento;
	}

	public void setCodMovimento(int codMovimento) {
		this.codMovimento = codMovimento;
	}

	public Short getCodMovimentoRelevante() {
		return this.codMovimentoRelevante;
	}

	public void setCodMovimentoRelevante(short codMovimentoRelevante) {
		this.codMovimentoRelevante = codMovimentoRelevante;
	}

	public Short getCodTipoProcesso() {
		return this.codTipoProcesso;
	}

	public void setCodTipoProcesso(short codTipoProcesso) {
		this.codTipoProcesso = codTipoProcesso;
	}

	public Long getCodUsuario() {
		return this.codUsuario;
	}

	public void setCodUsuario(Long codUsuario) {
		this.codUsuario = codUsuario;
	}

	public Date getDtBaixa() {
		return this.dtBaixa;
	}

	public void setDtBaixa(Date dtBaixa) {
		this.dtBaixa = dtBaixa;
	}

	public Date getDtDistribuicao() {
		return this.dtDistribuicao;
	}

	public void setDtDistribuicao(Date dtDistribuicao) {
		this.dtDistribuicao = dtDistribuicao;
	}

	public Date getDtJulgamento() {
		return this.dtJulgamento;
	}

	public void setDtJulgamento(Date dtJulgamento) {
		this.dtJulgamento = dtJulgamento;
	}

	public Date getDtMovimento() {
		return this.dtMovimento;
	}

	public void setDtMovimento(Date dtMovimento) {
		this.dtMovimento = dtMovimento;
	}

	public Date getDtMovimentoRelevante() {
		return this.dtMovimentoRelevante;
	}

	public void setDtMovimentoRelevante(Date dtMovimentoRelevante) {
		this.dtMovimentoRelevante = dtMovimentoRelevante;
	}

	public Date getDtTransitoJulgado() {
		return this.dtTransitoJulgado;
	}

	public void setDtTransitoJulgado(Date dtTransitoJulgado) {
		this.dtTransitoJulgado = dtTransitoJulgado;
	}

	public Date getDtVirtualizacao() {
		return this.dtVirtualizacao;
	}

	public void setDtVirtualizacao(Date dtVirtualizacao) {
		this.dtVirtualizacao = dtVirtualizacao;
	}

	public String getFlgApenso() {
		return this.flgApenso;
	}

	public void setFlgApenso(String flgApenso) {
		this.flgApenso = flgApenso;
	}

	public String getFlgJulgado() {
		return this.flgJulgado;
	}

	public void setFlgJulgado(String flgJulgado) {
		this.flgJulgado = flgJulgado;
	}

	public String getFlgSegredoJustica() {
		return this.flgSegredoJustica;
	}

	public void setFlgSegredoJustica(String flgSegredoJustica) {
		this.flgSegredoJustica = flgSegredoJustica;
	}

	public String getFlgSigiloso() {
		return this.flgSigiloso;
	}

	public void setFlgSigiloso(String flgSigiloso) {
		this.flgSigiloso = flgSigiloso;
	}

	public String getFlgSuspenso() {
		return this.flgSuspenso;
	}

	public void setFlgSuspenso(String flgSuspenso) {
		this.flgSuspenso = flgSuspenso;
	}

	public String getFlgVirtual() {
		return this.flgVirtual;
	}

	public void setFlgVirtual(String flgVirtual) {
		this.flgVirtual = flgVirtual;
	}

	public String getNumProcOrigem() {
		return this.numProcOrigem;
	}

	public void setNumProcOrigem(String numProcOrigem) {
		this.numProcOrigem = numProcOrigem;
	}

	public Integer getSeqMovimento() {
		return this.seqMovimento;
	}

	public void setSeqMovimento(int seqMovimento) {
		this.seqMovimento = seqMovimento;
	}

	public Integer getSeqMovimentoRelevante() {
		return this.seqMovimentoRelevante;
	}

	public void setSeqMovimentoRelevante(int seqMovimentoRelevante) {
		this.seqMovimentoRelevante = seqMovimentoRelevante;
	}

	public Short getTpOrigem() {
		return this.tpOrigem;
	}

	public void setTpOrigem(short tpOrigem) {
		this.tpOrigem = tpOrigem;
	}

	public BigDecimal getVlCausa() {
		return this.vlCausa;
	}

	public void setVlCausa(BigDecimal vlCausa) {
		this.vlCausa = vlCausa;
	}

	public List<ProcessoTipoParte> getProcessoTipoPartes() {
		return this.processoTipoPartes;
	}

	public void setProcessoTipoPartes(List<ProcessoTipoParte> processoTipoPartes) {
		this.processoTipoPartes = processoTipoPartes;
	}

	public List<AssuntoProcesso> getAssuntoProcessos() {
		return this.assuntoProcessos;
	}

	public void setAssuntoProcessos(List<AssuntoProcesso> assuntoProcessos) {
		this.assuntoProcessos = assuntoProcessos;
	}

}