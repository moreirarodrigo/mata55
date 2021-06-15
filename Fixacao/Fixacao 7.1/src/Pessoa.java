package heranca;

class Pessoa {
	protected String nome;
	protected String endereco;

	Pessoa(String nome, String endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	String getNome() {
		return this.nome;
	}

	String getEndereco() {
		return this.endereco;
	}
}
