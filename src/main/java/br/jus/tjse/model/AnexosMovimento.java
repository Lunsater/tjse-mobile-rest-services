package br.jus.tjse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "AnexosMovimento" database table.
 * 
 */
@Entity
@Table(name="AnexosMovimento", schema="Pgrau")
@NamedQuery(name="AnexosMovimento.findAll", query="SELECT a FROM AnexosMovimento a")
public class AnexosMovimento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AnexosMovimentoPK id;

	@Column(name="arquivo")
	private byte[] arquivo;

	@Column(name="codUsuario")
	private java.math.BigDecimal codUsuario;

	@Column(name="codUsuarioLeitura")
	private Long codUsuarioLeitura;

	@Column(name="dsArquivo")
	private String dsArquivo;

	@Temporal(TemporalType.DATE)
	@Column(name="dtDesentranhamento")
	private Date dtDesentranhamento;

	@Temporal(TemporalType.DATE)
	@Column(name="dtLeitura")
	private Date dtLeitura;

	@Column(name="flgDescartado")
	private String flgDescartado;

	@Column(name="flgDesentranhado")
	private String flgDesentranhado;

	@Column(name="flgLido")
	private String flgLido;

	@Column(name="idAnexo")
	private String idAnexo;

	@Column(name="idAssinatura")
	private Integer idAssinatura;

	@Column(name="nmArquivo")
	private String nmArquivo;

	@Column(name="seqAssinaturaEletronica")
	private Long seqAssinaturaEletronica;

	@Column(name="tamanhoAnexo")
	private Integer tamanhoAnexo;

	@Column(name="tipoAnexo")
	private Integer tipoAnexo;

	public AnexosMovimento() {
	}

	public AnexosMovimentoPK getId() {
		return this.id;
	}

	public void setId(AnexosMovimentoPK id) {
		this.id = id;
	}

	public byte[] getArquivo() {
		return this.arquivo;
	}

	public void setArquivo(byte[] arquivo) {
		this.arquivo = arquivo;
	}

	public java.math.BigDecimal getCodUsuario() {
		return this.codUsuario;
	}

	public void setCodUsuario(java.math.BigDecimal codUsuario) {
		this.codUsuario = codUsuario;
	}

	public Long getCodUsuarioLeitura() {
		return this.codUsuarioLeitura;
	}

	public void setCodUsuarioLeitura(Long codUsuarioLeitura) {
		this.codUsuarioLeitura = codUsuarioLeitura;
	}

	public String getDsArquivo() {
		return this.dsArquivo;
	}

	public void setDsArquivo(String dsArquivo) {
		this.dsArquivo = dsArquivo;
	}

	public Date getDtDesentranhamento() {
		return this.dtDesentranhamento;
	}

	public void setDtDesentranhamento(Date dtDesentranhamento) {
		this.dtDesentranhamento = dtDesentranhamento;
	}

	public Date getDtLeitura() {
		return this.dtLeitura;
	}

	public void setDtLeitura(Date dtLeitura) {
		this.dtLeitura = dtLeitura;
	}

	public String getFlgDescartado() {
		return this.flgDescartado;
	}

	public void setFlgDescartado(String flgDescartado) {
		this.flgDescartado = flgDescartado;
	}

	public String getFlgDesentranhado() {
		return this.flgDesentranhado;
	}

	public void setFlgDesentranhado(String flgDesentranhado) {
		this.flgDesentranhado = flgDesentranhado;
	}

	public String getFlgLido() {
		return this.flgLido;
	}

	public void setFlgLido(String flgLido) {
		this.flgLido = flgLido;
	}

	public String getIdAnexo() {
		return this.idAnexo;
	}

	public void setIdAnexo(String idAnexo) {
		this.idAnexo = idAnexo;
	}

	public Integer getIdAssinatura() {
		return this.idAssinatura;
	}

	public void setIdAssinatura(Integer idAssinatura) {
		this.idAssinatura = idAssinatura;
	}

	public String getNmArquivo() {
		return this.nmArquivo;
	}

	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}

	public Long getSeqAssinaturaEletronica() {
		return this.seqAssinaturaEletronica;
	}

	public void setSeqAssinaturaEletronica(Long seqAssinaturaEletronica) {
		this.seqAssinaturaEletronica = seqAssinaturaEletronica;
	}

	public Integer getTamanhoAnexo() {
		return this.tamanhoAnexo;
	}

	public void setTamanhoAnexo(Integer tamanhoAnexo) {
		this.tamanhoAnexo = tamanhoAnexo;
	}

	public Integer getTipoAnexo() {
		return this.tipoAnexo;
	}

	public void setTipoAnexo(Integer tipoAnexo) {
		this.tipoAnexo = tipoAnexo;
	}

}