package heranca;

class Estudante extends Pessoa {
	protected String escola;
	protected String serie;

	Estudante(String nome, String endereco, String escola, String serie) {
		super(nome, endereco);
		this.escola = escola;
		this.serie = serie;
	}

	void setEscola(String escola) {
		this.escola = escola;
	}

	void setSerie(String serie) {
		this.serie = serie;
	}

	String getEscola() {
		return this.escola;
	}

	String getSerie() {
		return this.serie;
	}

}
