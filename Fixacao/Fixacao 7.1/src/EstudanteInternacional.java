package heranca;

class EstudanteInternacional extends Estudante {
	private String country;

	EstudanteInternacional(String nome, String endereco, String escola, String serie, String country) {
		super(nome, endereco, escola, serie);
		this.country = country;
	}

	void setCountry(String country) {
		this.country = country;
	}

	String getCountry() {
		return this.country;
	}
}

