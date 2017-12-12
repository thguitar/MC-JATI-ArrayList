package br.com.JATI.MiniCurso.MODEL;

public class Cliente {
	private Integer id;
	private String nome;
	private String endereco;
	private String observacao;
	private Double dlatitude;
	private Double dlongitude;
	private Municipio municipio;
	private UF uf;
	
	public Cliente() {
	
	}
	
	public Cliente(Integer id, String nome, String endereco, String observacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.observacao = observacao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Double getDlatitude() {
		return dlatitude;
	}

	public void setDlatitude(Double dlatitude) {
		this.dlatitude = dlatitude;
	}

	public Double getDlongitude() {
		return dlongitude;
	}

	public void setDlongitude(Double dlongitude) {
		this.dlongitude = dlongitude;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public UF getUf() {
		return uf;
	}

	public void setUf(UF uf) {
		this.uf = uf;
	}
	
}
