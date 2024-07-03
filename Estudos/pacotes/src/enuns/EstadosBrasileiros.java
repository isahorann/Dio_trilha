package enuns;

public enum EstadosBrasileiros {
	RIO_GRANDE_DO_SUL("RS", "Rio Grande do Sul"),
	SANTA_CATARINA("SC", "Santa Catarina"),
	PARANA("PR", "Paraná"),
	SAO_PAULO("SP","São Paulo"),
	MINAS_GERAIS("MG","Minas Gerais"),
	RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
	ESPIRITO_SANTO("ES", "Espírito Santo"),
	MATO_GROSSO_DO_SUL("MS", "Mato Grosso do Sul"),
	GOIAS("GO","Goiás"),
	MATO_GROSSO("MT", "Mato Grosso"),
	DISTRITO_FEDERAL("DF", "Distrito Federal"),
	TOCANTINS("TO","Tocantins"),
	BAHIA("BA","Bahia"),
	SERGIPE("SE","Sergipe"),
	PERNAMBUCO("PE","Pernambuco"),
	PARAIBA("PA", "Paraíba"),
	RIO_GRANDE_DO_NORTE("RN", "Rio Grande do Norte"),
	MARANHAO("MA", "Maranhão"),
	CEARA("CE", "Ceará"),
	PIAUI("PI", "Piauí"),
	PARA("PA","Pará"),
	RORAIMA("RR", "Roraima"),
	AMAZONAS("AM","Amazonas"),
	RONDÔNIA("RO", "Rondônia"),
	ACRE("AC","Acre");
	
	private String nome;
	private String sigla;

	EstadosBrasileiros(String sigla, String nome) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}

}
