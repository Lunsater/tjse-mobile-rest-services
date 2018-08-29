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
	private long codUsuarioLeitura;

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
	private int idAssinatura;

	@Column(name="nmArquivo")
	private String nmArquivo;

	@Column(name="seqAssinaturaEletronica")
	private long seqAssinaturaEletronica;

	@Column(name="tamanhoAnexo")
	private int tamanhoAnexo;

	@Column(name="tipoAnexo")
	private int tipoAnexo;

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

	public long getCodUsuarioLeitura() {
		return this.codUsuarioLeitura;
	}

	public void setCodUsuarioLeitura(long codUsuarioLeitura) {
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

	public int getIdAssinatura() {
		return this.idAssinatura;
	}

	public void setIdAssinatura(int idAssinatura) {
		this.idAssinatura = idAssinatura;
	}

	public String getNmArquivo() {
		return this.nmArquivo;
	}

	public void setNmArquivo(String nmArquivo) {
		this.nmArquivo = nmArquivo;
	}

	public long getSeqAssinaturaEletronica() {
		return this.seqAssinaturaEletronica;
	}

	public void setSeqAssinaturaEletronica(long seqAssinaturaEletronica) {
		this.seqAssinaturaEletronica = seqAssinaturaEletronica;
	}

	public int getTamanhoAnexo() {
		return this.tamanhoAnexo;
	}

	public void setTamanhoAnexo(int tamanhoAnexo) {
		this.tamanhoAnexo = tamanhoAnexo;
	}

	public int getTipoAnexo() {
		return this.tipoAnexo;
	}

	public void setTipoAnexo(int tipoAnexo) {
		this.tipoAnexo = tipoAnexo;
	}

}