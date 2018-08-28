package br.jus.tjse.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "MovimentoProcesso" database table.
 * 
 */
@Entity
@Table(name="MovimentoProcesso", schema="Pgrau")
@NamedQuery(name="MovimentoProcesso.findAll", query="SELECT m FROM MovimentoProcesso m")
public class MovimentoProcesso implements Serializable {
	private static final Long serialVersionUID = 1L;

	@EmbeddedId
	private MovimentoProcessoPK id;

	@ManyToOne
	@JoinColumn(name="codMovimento", insertable=false, updatable=false)
	private Movimento movimento;
	
	@Column(name="codCategoria")
	private Integer codCategoria;

	@Column(name="codCompetencia")
	private Integer codCompetencia;

	@Column(name="codCompetenciaRelator")
	private Integer codCompetenciaRelator;

	@Column(name="codDestino")
	private Integer codDestino;

	@Column(name="codEdital")
	private Integer codEdital;

	@Column(name="codFinalidadeCarga")
	private Integer codFinalidadeCarga;

	@Column(name="codGrupo")
	private Integer codGrupo;

	@Column(name="codJuiz")
	private Integer codJuiz;

	@Column(name="codTipoCarga")
	private Integer codTipoCarga;

	@Column(name="codTipoDocumento")
	private Integer codTipoDocumento;

	@Column(name="codUsuario")
	private Long codUsuario;

	@Column(name="distingueMovimento")
	private String distingueMovimento;

	@Temporal(TemporalType.DATE)
	@Column(name="dtAudienciaCentral")
	private Date dtAudienciaCentral;

	@Temporal(TemporalType.DATE)
	@Column(name="dtBasePrazo")
	private Date dtBasePrazo;

	@Temporal(TemporalType.DATE)
	@Column(name="dtFimPrazo")
	private Date dtFimPrazo;

	@Temporal(TemporalType.DATE)
	@Column(name="dtGeracao")
	private Date dtGeracao;

	@Temporal(TemporalType.DATE)
	@Column(name="dtLeitura")
	private Date dtLeitura;

	@Temporal(TemporalType.DATE)
	@Column(name="dtPublicacao")
	private Date dtPublicacao;

	@Temporal(TemporalType.DATE)
	@Column(name="dtRemessaCentral")
	private Date dtRemessaCentral;

	@Temporal(TemporalType.DATE)
	@Column(name="dtSistema")
	private Date dtSistema;

	@Column(name="flgApensado")
	private String flgApensado;

	@Column(name="flgAtualizacaoPendente")
	private boolean flgAtualizacaoPendente;

	@Column(name="flgBancoSentenca")
	private String flgBancoSentenca;

	@Column(name="flgDescartado")
	private String flgDescartado;

	@Column(name="flgExcluido")
	private String flgExcluido;

	@Column(name="flgExclusao")
	private String flgExclusao;

	@Column(name="flgExpediente")
	private String flgExpediente;

	@Column(name="flgSigiloso")
	private String flgSigiloso;

	@Column(name="formaJulgamento")
	private String formaJulgamento;

	@Column(name="hrSistema")
	private String hrSistema;

	@Column(name="numMandado")
	private String numMandado;

	@Column(name="Origem")
	private short origem;

	@Column(name="qtdePrazo")
	private Integer qtdePrazo;

	@Column(name="seqAudiencia")
	private String seqAudiencia;

	@Column(name="situacaoProcesso")
	private String situacaoProcesso;

	@Column(name="tipoPrazo")
	private String tipoPrazo;

	@Column(name="txtIntegra")
	private String txtIntegra;

	@Column(name="txtMovimento")
	private String txtMovimento;
	
	@OneToMany
	@JoinColumns({
		@JoinColumn(name="numProcesso", referencedColumnName="numProcesso"),
		@JoinColumn(name="codMovimento", referencedColumnName="codMovimento"),
		@JoinColumn(name="dtMovimento", referencedColumnName="dtMovimento"),
		@JoinColumn(name="seqMovimento", referencedColumnName="seqMovimento")
	})
	List<AnexosMovimento> anexosMovimentos;

	public MovimentoProcesso() {
	}

	public MovimentoProcessoPK getId() {
		return this.id;
	}

	public void setId(MovimentoProcessoPK id) {
		this.id = id;
	}

	public Movimento getMovimento() {
		return movimento;
	}

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}

	public Integer getCodCategoria() {
		return this.codCategoria;
	}

	public void setCodCategoria(int codCategoria) {
		this.codCategoria = codCategoria;
	}

	public Integer getCodCompetencia() {
		return this.codCompetencia;
	}

	public void setCodCompetencia(int codCompetencia) {
		this.codCompetencia = codCompetencia;
	}

	public Integer getCodCompetenciaRelator() {
		return this.codCompetenciaRelator;
	}

	public void setCodCompetenciaRelator(int codCompetenciaRelator) {
		this.codCompetenciaRelator = codCompetenciaRelator;
	}

	public Integer getCodDestino() {
		return this.codDestino;
	}

	public void setCodDestino(int codDestino) {
		this.codDestino = codDestino;
	}

	public Integer getCodEdital() {
		return this.codEdital;
	}

	public void setCodEdital(int codEdital) {
		this.codEdital = codEdital;
	}

	public Integer getCodFinalidadeCarga() {
		return this.codFinalidadeCarga;
	}

	public void setCodFinalidadeCarga(int codFinalidadeCarga) {
		this.codFinalidadeCarga = codFinalidadeCarga;
	}

	public Integer getCodGrupo() {
		return this.codGrupo;
	}

	public void setCodGrupo(int codGrupo) {
		this.codGrupo = codGrupo;
	}

	public Integer getCodJuiz() {
		return this.codJuiz;
	}

	public void setCodJuiz(int codJuiz) {
		this.codJuiz = codJuiz;
	}

	public Integer getCodTipoCarga() {
		return this.codTipoCarga;
	}

	public void setCodTipoCarga(int codTipoCarga) {
		this.codTipoCarga = codTipoCarga;
	}

	public Integer getCodTipoDocumento() {
		return this.codTipoDocumento;
	}

	public void setCodTipoDocumento(int codTipoDocumento) {
		this.codTipoDocumento = codTipoDocumento;
	}

	public Long getCodUsuario() {
		return this.codUsuario;
	}

	public void setCodUsuario(long codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getDistingueMovimento() {
		return this.distingueMovimento;
	}

	public void setDistingueMovimento(String distingueMovimento) {
		this.distingueMovimento = distingueMovimento;
	}

	public Date getDtAudienciaCentral() {
		return this.dtAudienciaCentral;
	}

	public void setDtAudienciaCentral(Date dtAudienciaCentral) {
		this.dtAudienciaCentral = dtAudienciaCentral;
	}

	public Date getDtBasePrazo() {
		return this.dtBasePrazo;
	}

	public void setDtBasePrazo(Date dtBasePrazo) {
		this.dtBasePrazo = dtBasePrazo;
	}

	public Date getDtFimPrazo() {
		return this.dtFimPrazo;
	}

	public void setDtFimPrazo(Date dtFimPrazo) {
		this.dtFimPrazo = dtFimPrazo;
	}

	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	public Date getDtLeitura() {
		return this.dtLeitura;
	}

	public void setDtLeitura(Date dtLeitura) {
		this.dtLeitura = dtLeitura;
	}

	public Date getDtPublicacao() {
		return this.dtPublicacao;
	}

	public void setDtPublicacao(Date dtPublicacao) {
		this.dtPublicacao = dtPublicacao;
	}

	public Date getDtRemessaCentral() {
		return this.dtRemessaCentral;
	}

	public void setDtRemessaCentral(Date dtRemessaCentral) {
		this.dtRemessaCentral = dtRemessaCentral;
	}

	public Date getDtSistema() {
		return this.dtSistema;
	}

	public void setDtSistema(Date dtSistema) {
		this.dtSistema = dtSistema;
	}

	public String getFlgApensado() {
		return this.flgApensado;
	}

	public void setFlgApensado(String flgApensado) {
		this.flgApensado = flgApensado;
	}

	public boolean getFlgAtualizacaoPendente() {
		return this.flgAtualizacaoPendente;
	}

	public void setFlgAtualizacaoPendente(boolean flgAtualizacaoPendente) {
		this.flgAtualizacaoPendente = flgAtualizacaoPendente;
	}

	public String getFlgBancoSentenca() {
		return this.flgBancoSentenca;
	}

	public void setFlgBancoSentenca(String flgBancoSentenca) {
		this.flgBancoSentenca = flgBancoSentenca;
	}

	public String getFlgDescartado() {
		return this.flgDescartado;
	}

	public void setFlgDescartado(String flgDescartado) {
		this.flgDescartado = flgDescartado;
	}

	public String getFlgExcluido() {
		return this.flgExcluido;
	}

	public void setFlgExcluido(String flgExcluido) {
		this.flgExcluido = flgExcluido;
	}

	public String getFlgExclusao() {
		return this.flgExclusao;
	}

	public void setFlgExclusao(String flgExclusao) {
		this.flgExclusao = flgExclusao;
	}

	public String getFlgExpediente() {
		return this.flgExpediente;
	}

	public void setFlgExpediente(String flgExpediente) {
		this.flgExpediente = flgExpediente;
	}

	public String getFlgSigiloso() {
		return this.flgSigiloso;
	}

	public void setFlgSigiloso(String flgSigiloso) {
		this.flgSigiloso = flgSigiloso;
	}

	public String getFormaJulgamento() {
		return this.formaJulgamento;
	}

	public void setFormaJulgamento(String formaJulgamento) {
		this.formaJulgamento = formaJulgamento;
	}

	public String getHrSistema() {
		return this.hrSistema;
	}

	public void setHrSistema(String hrSistema) {
		this.hrSistema = hrSistema;
	}

	public String getNumMandado() {
		return this.numMandado;
	}

	public void setNumMandado(String numMandado) {
		this.numMandado = numMandado;
	}

	public short getOrigem() {
		return this.origem;
	}

	public void setOrigem(short origem) {
		this.origem = origem;
	}

	public Integer getQtdePrazo() {
		return this.qtdePrazo;
	}

	public void setQtdePrazo(int qtdePrazo) {
		this.qtdePrazo = qtdePrazo;
	}

	public String getSeqAudiencia() {
		return this.seqAudiencia;
	}

	public void setSeqAudiencia(String seqAudiencia) {
		this.seqAudiencia = seqAudiencia;
	}

	public String getSituacaoProcesso() {
		return this.situacaoProcesso;
	}

	public void setSituacaoProcesso(String situacaoProcesso) {
		this.situacaoProcesso = situacaoProcesso;
	}

	public String getTipoPrazo() {
		return this.tipoPrazo;
	}

	public void setTipoPrazo(String tipoPrazo) {
		this.tipoPrazo = tipoPrazo;
	}

	public String getTxtIntegra() {
		return this.txtIntegra;
	}

	public void setTxtIntegra(String txtIntegra) {
		this.txtIntegra = txtIntegra;
	}

	public String getTxtMovimento() {
		return this.txtMovimento;
	}

	public void setTxtMovimento(String txtMovimento) {
		this.txtMovimento = txtMovimento;
	}

	public List<AnexosMovimento> getAnexosMovimentos() {
		return anexosMovimentos;
	}

	public void setAnexosMovimentos(List<AnexosMovimento> anexosMovimentos) {
		this.anexosMovimentos = anexosMovimentos;
	}

}