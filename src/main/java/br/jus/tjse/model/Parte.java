package br.jus.tjse.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the "Parte" database table.
 * 
 */
@Entity
@Table(name="Parte", schema = "Custodial")
@NamedQuery(name="Parte.findAll", query="SELECT p FROM Parte p")
public class Parte implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="codParte")
	private int codParte;

	@Column(name="alvaraLicenca")
	private String alvaraLicenca;

	@Column(name="categoriaCNH")
	private String categoriaCNH;

	private String cnh;

	@Column(name="codEstadoCivil")
	private int codEstadoCivil;

	@Column(name="codGrauInstrucao")
	private int codGrauInstrucao;

	@Column(name="codOrigem")
	private int codOrigem;

	@Column(name="codProfissao")
	private int codProfissao;

	@Column(name="ctps")
	private String ctps;

	@Column(name="dsAlcunha")
	private String dsAlcunha;

	@Column(name="dsNacionalidade")
	private String dsNacionalidade;

	@Column(name="dsNaturalidade")
	private String dsNaturalidade;

	@Column(name="dsRazaoSocial")
	private String dsRazaoSocial;

	@Temporal(TemporalType.DATE)
	@Column(name="dtExpedicaoRg")
	private Date dtExpedicaoRg;

	@Temporal(TemporalType.DATE)
	@Column(name="dtNascimento")
	private Date dtNascimento;

	@Column(name="email")
	private String email;

	@Column(name="flgDesabilitado")
	private String flgDesabilitado;

	@Column(name="flgEstrangeiro")
	private String flgEstrangeiro;

	@Column(name="idRecursoCNJ")
	private long idRecursoCNJ;

	@Column(name="nmFonetico")
	private String nmFonetico;

	@Column(name="nmFormatado")
	private String nmFormatado;

	@Column(name="nmMae")
	private String nmMae;

	@Column(name="nmPai")
	private String nmPai;

	@Column(name="nmPaisPassaporte")
	private String nmPaisPassaporte;

	@Column(name="nmParte")
	private String nmParte;

	@Column(name="numCPFCNPJ")
	private String numCPFCNPJ;

	@Column(name="numPassaporte")
	private String numPassaporte;

	@Column(name="numRegistroCNJ")
	private long numRegistroCNJ;

	@Column(name="numReservista")
	private String numReservista;

	@Column(name="numRG")
	private String numRG;

	@Column(name="orgaoExpedidorRG")
	private String orgaoExpedidorRG;

	@Column(name="secaoTitulo")
	private int secaoTitulo;

	@Column(name="serieCTPS")
	private String serieCTPS;

	@Column(name="sexo")
	private String sexo;

	@Column(name="tituloEleitor")
	private String tituloEleitor;

	@Column(name="tpPessoa")
	private short tpPessoa;

	@Column(name="ufCTPS")
	private String ufCTPS;

	@Column(name="ufNascimento")
	private String ufNascimento;

	@Column(name="ufRG")
	private String ufRG;

	@Column(name="zonaTitulo")
	private int zonaTitulo;

	public Parte() {
	}

	public int getCodParte() {
		return this.codParte;
	}

	public void setCodParte(int codParte) {
		this.codParte = codParte;
	}

	public String getAlvaraLicenca() {
		return this.alvaraLicenca;
	}

	public void setAlvaraLicenca(String alvaraLicenca) {
		this.alvaraLicenca = alvaraLicenca;
	}

	public String getCategoriaCNH() {
		return this.categoriaCNH;
	}

	public void setCategoriaCNH(String categoriaCNH) {
		this.categoriaCNH = categoriaCNH;
	}

	public String getCnh() {
		return this.cnh;
	}

	public void setCnh(String cnh) {
		this.cnh = cnh;
	}

	public int getCodEstadoCivil() {
		return this.codEstadoCivil;
	}

	public void setCodEstadoCivil(int codEstadoCivil) {
		this.codEstadoCivil = codEstadoCivil;
	}

	public int getCodGrauInstrucao() {
		return this.codGrauInstrucao;
	}

	public void setCodGrauInstrucao(int codGrauInstrucao) {
		this.codGrauInstrucao = codGrauInstrucao;
	}

	public int getCodOrigem() {
		return this.codOrigem;
	}

	public void setCodOrigem(int codOrigem) {
		this.codOrigem = codOrigem;
	}

	public int getCodProfissao() {
		return this.codProfissao;
	}

	public void setCodProfissao(int codProfissao) {
		this.codProfissao = codProfissao;
	}

	public String getCtps() {
		return this.ctps;
	}

	public void setCtps(String ctps) {
		this.ctps = ctps;
	}

	public String getDsAlcunha() {
		return this.dsAlcunha;
	}

	public void setDsAlcunha(String dsAlcunha) {
		this.dsAlcunha = dsAlcunha;
	}

	public String getDsNacionalidade() {
		return this.dsNacionalidade;
	}

	public void setDsNacionalidade(String dsNacionalidade) {
		this.dsNacionalidade = dsNacionalidade;
	}

	public String getDsNaturalidade() {
		return this.dsNaturalidade;
	}

	public void setDsNaturalidade(String dsNaturalidade) {
		this.dsNaturalidade = dsNaturalidade;
	}

	public String getDsRazaoSocial() {
		return this.dsRazaoSocial;
	}

	public void setDsRazaoSocial(String dsRazaoSocial) {
		this.dsRazaoSocial = dsRazaoSocial;
	}

	public Date getDtExpedicaoRg() {
		return this.dtExpedicaoRg;
	}

	public void setDtExpedicaoRg(Date dtExpedicaoRg) {
		this.dtExpedicaoRg = dtExpedicaoRg;
	}

	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFlgDesabilitado() {
		return this.flgDesabilitado;
	}

	public void setFlgDesabilitado(String flgDesabilitado) {
		this.flgDesabilitado = flgDesabilitado;
	}

	public String getFlgEstrangeiro() {
		return this.flgEstrangeiro;
	}

	public void setFlgEstrangeiro(String flgEstrangeiro) {
		this.flgEstrangeiro = flgEstrangeiro;
	}

	public long getIdRecursoCNJ() {
		return this.idRecursoCNJ;
	}

	public void setIdRecursoCNJ(long idRecursoCNJ) {
		this.idRecursoCNJ = idRecursoCNJ;
	}

	public String getNmFonetico() {
		return this.nmFonetico;
	}

	public void setNmFonetico(String nmFonetico) {
		this.nmFonetico = nmFonetico;
	}

	public String getNmFormatado() {
		return this.nmFormatado;
	}

	public void setNmFormatado(String nmFormatado) {
		this.nmFormatado = nmFormatado;
	}

	public String getNmMae() {
		return this.nmMae;
	}

	public void setNmMae(String nmMae) {
		this.nmMae = nmMae;
	}

	public String getNmPai() {
		return this.nmPai;
	}

	public void setNmPai(String nmPai) {
		this.nmPai = nmPai;
	}

	public String getNmPaisPassaporte() {
		return this.nmPaisPassaporte;
	}

	public void setNmPaisPassaporte(String nmPaisPassaporte) {
		this.nmPaisPassaporte = nmPaisPassaporte;
	}

	public String getNmParte() {
		return this.nmParte;
	}

	public void setNmParte(String nmParte) {
		this.nmParte = nmParte;
	}

	public String getNumCPFCNPJ() {
		return this.numCPFCNPJ;
	}

	public void setNumCPFCNPJ(String numCPFCNPJ) {
		this.numCPFCNPJ = numCPFCNPJ;
	}

	public String getNumPassaporte() {
		return this.numPassaporte;
	}

	public void setNumPassaporte(String numPassaporte) {
		this.numPassaporte = numPassaporte;
	}

	public long getNumRegistroCNJ() {
		return this.numRegistroCNJ;
	}

	public void setNumRegistroCNJ(long numRegistroCNJ) {
		this.numRegistroCNJ = numRegistroCNJ;
	}

	public String getNumReservista() {
		return this.numReservista;
	}

	public void setNumReservista(String numReservista) {
		this.numReservista = numReservista;
	}

	public String getNumRG() {
		return this.numRG;
	}

	public void setNumRG(String numRG) {
		this.numRG = numRG;
	}

	public String getOrgaoExpedidorRG() {
		return this.orgaoExpedidorRG;
	}

	public void setOrgaoExpedidorRG(String orgaoExpedidorRG) {
		this.orgaoExpedidorRG = orgaoExpedidorRG;
	}

	public int getSecaoTitulo() {
		return this.secaoTitulo;
	}

	public void setSecaoTitulo(int secaoTitulo) {
		this.secaoTitulo = secaoTitulo;
	}

	public String getSerieCTPS() {
		return this.serieCTPS;
	}

	public void setSerieCTPS(String serieCTPS) {
		this.serieCTPS = serieCTPS;
	}

	public String getSexo() {
		return this.sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getTituloEleitor() {
		return this.tituloEleitor;
	}

	public void setTituloEleitor(String tituloEleitor) {
		this.tituloEleitor = tituloEleitor;
	}

	public short getTpPessoa() {
		return this.tpPessoa;
	}

	public void setTpPessoa(short tpPessoa) {
		this.tpPessoa = tpPessoa;
	}

	public String getUfCTPS() {
		return this.ufCTPS;
	}

	public void setUfCTPS(String ufCTPS) {
		this.ufCTPS = ufCTPS;
	}

	public String getUfNascimento() {
		return this.ufNascimento;
	}

	public void setUfNascimento(String ufNascimento) {
		this.ufNascimento = ufNascimento;
	}

	public String getUfRG() {
		return this.ufRG;
	}

	public void setUfRG(String ufRG) {
		this.ufRG = ufRG;
	}

	public int getZonaTitulo() {
		return this.zonaTitulo;
	}

	public void setZonaTitulo(int zonaTitulo) {
		this.zonaTitulo = zonaTitulo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codParte;
		result = prime * result + ((nmMae == null) ? 0 : nmMae.hashCode());
		result = prime * result + ((nmParte == null) ? 0 : nmParte.hashCode());
		result = prime * result + ((numCPFCNPJ == null) ? 0 : numCPFCNPJ.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Parte other = (Parte) obj;
		if (codParte != other.codParte)
			return false;
		if (nmMae == null) {
			if (other.nmMae != null)
				return false;
		} else if (!nmMae.equals(other.nmMae))
			return false;
		if (nmParte == null) {
			if (other.nmParte != null)
				return false;
		} else if (!nmParte.equals(other.nmParte))
			return false;
		if (numCPFCNPJ == null) {
			if (other.numCPFCNPJ != null)
				return false;
		} else if (!numCPFCNPJ.equals(other.numCPFCNPJ))
			return false;
		return true;
	}

	
}